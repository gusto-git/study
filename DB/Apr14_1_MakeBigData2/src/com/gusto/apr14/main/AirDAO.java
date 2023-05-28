package com.gusto.apr14.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.gusto.db.manager.GustoDBManager;
import com.gusto.http.client.GustoHttpClient;

// M : model 역할 front 
// xml : kxml2 / gustohttpclient jar
// db연결할때 필요한 jar : gustodbmanager.jar

public class AirDAO {
//	 1. xml 파싱하는 method -> syso로 뽑아보기 getAir()
	public static ArrayList<Air> getAir() {
		try {
			String addr = "http://openapi.seoul.go.kr:8088/70646b63596a69683437716f794e49/xml/RealtimeCityAir/1/25/";
			InputStream is = GustoHttpClient.download(addr);
			
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");
			
			int type = xpp.getEventType();
			String tageName = null;
			Air a = null;
			
			
			ArrayList<Air> airs = new ArrayList<Air>();
			while (type != XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					tageName = xpp.getName();
					if (tageName.equals("row")) {
						a = new Air();
					}
				}else if (type == XmlPullParser.TEXT) {
					if (tageName.equals("MSRRGN_NM")) {
						a.setMsrrgn_nm(xpp.getText());
					} else if (tageName.equals("MSRSTE_NM")) {
						a.setMsrste_nm(xpp.getText());
					} else if (tageName.equals("PM10")) {
						a.setPm10(Integer.parseInt(xpp.getText()));
					} else if (tageName.equals("PM25")) {
						a.setPm25(Integer.parseInt(xpp.getText()));
					} else if (tageName.equals("O3")) {
						a.setO3(Double.parseDouble(xpp.getText()));
					} else if (tageName.equals("IDEX_NM")) {
						a.setIndex_nm(xpp.getText());
						airs.add(a);
					}
				} else if (type == XmlPullParser.END_TAG) {
					tageName = "";
				}
				xpp.next();
				type = xpp.getEventType();
			}
			return airs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
//	2. javabean에 있는 각각의 정보들을 db에 insert 하는 method  writeAir()
	public static String writeAir(Air a) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = GustoDBManager.connect();
			String sql = "insert into APR14_AIR values(apr14_air_seq.nextval, sysdate, "
					+ "?, ?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, a.getMsrrgn_nm());
			pstmt.setString(2, a.getMsrste_nm());
			pstmt.setInt(3, a.getPm10());
			pstmt.setInt(4, a.getPm25());
			pstmt.setDouble(5, a.getO3());
			pstmt.setString(6, a.getIndex_nm());
			
			if (pstmt.executeUpdate() == 1) {
				return "성공";
			}
			return "실패";
		} catch (Exception e) {
			e.printStackTrace();
			return "에러";
		} finally {
			GustoDBManager.close(con, pstmt, null);
		}
	}
	
//	3. DB에 담긴 모든 미세먼지 데이터 getAllAir()
//	시간순 정렬 , 안되면 측정소명 정렬  
	public static ArrayList<Air> getAllAir() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = GustoDBManager.connect();
			String sql = "select * from APR14_AIR order by aa_MSRDT";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			Air a = null;
			ArrayList<Air> airs = new ArrayList<Air>();
			while (rs.next()) {
				a = new Air();
				
				a.setNo(rs.getInt("aa_no"));
				a.setWhen(rs.getDate("aa_MSRDT"));
				a.setMsrrgn_nm(rs.getString("aa_MSRRGN_NM"));
				a.setMsrste_nm(rs.getString("aa_MSRSTE_NM"));
				a.setPm10(rs.getInt("aa_PM10"));
				a.setPm25(rs.getInt("aa_PM25"));
				a.setO3(rs.getDouble("aa_O3"));
				a.setIndex_nm(rs.getString("aa_IDEX_NM"));
				airs.add(a);
			}
			return airs;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			GustoDBManager.close(con, pstmt, rs);
		}
	}
	

//	4. ArrayList에 담긴 정보를 csv 파일에 담기  writeToFile()
	public static void writeToFile(ArrayList<Air> airs) {
		FileOutputStream fos = null;
		try {
			String path = "C:\\Users\\yt866\\Desktop\\fos\\air2_poll.csv";
			fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd,HH,mm");
			
			for (Air a : airs) {
				bw.write(a.getNo() + ","); // >> sequence준거라 순서 엉망
				// Date -> String : format  // String -> Date : parse
				bw.write(sdf.format(a.getWhen()) + ",");
				bw.write(a.getMsrrgn_nm() + ",");
				bw.write(a.getMsrste_nm() + ",");
				bw.write(a.getPm10() + ",");
				bw.write(a.getPm25() + ",");
				bw.write(a.getIndex_nm() + "\r\n");
				// BufferedWriter의 용량이 다 차지 않아도 그냥 보내도록
				bw.flush();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
