package com.gusto.apr14.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
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
//	 1. xml 파싱하는 method -> syso로 뽑아보기
	public static ArrayList<Air> getAir() {

		try {
//		서버에 요청해서 다운받기	
			String address = "http://openapi.seoul.go.kr:8088/70646b63596a69683437716f794e49/xml/RealtimeCityAir/1/25/";
			InputStream is = GustoHttpClient.download(address);
			
//		xml 시작할 준비	
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");
			
//		xpp가 보고 있는 line
			int type = xpp.getEventType();
			
//		tag명 찾을 때 사용할 임시변수 	
			String tagName = null;
			
//		syso 다 지우고 -> Javabean 활용 -> 담고 담고
//		Javabean들 다 담긴거를 return	
			Air a = null;
			
//			 DB와 소통할 때 사용했던 Air용 빈 ArraytList 생성
			ArrayList<Air> airs = new ArrayList<Air>();
			while (type != XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
					
					if (tagName.equals("row")) {
						
//				row가 나올때마다 Javabean 새 객체 생성		
						a = new Air();
					}
//				javabean의 멤버변수에 맞춰서 넣기	
				}else if (type == XmlPullParser.TEXT) {
					 if (tagName.equals("MSRRGN_NM")) {
						 a.setMsrrgn_nm(xpp.getText());
					} else if (tagName.equals("MSRSTE_NM")) {
						a.setMsrste_nm(xpp.getText());
					} else if (tagName.equals("PM10")) {
						
//				값이 string -> int 형변환
						a.setPm10(Integer.parseInt(xpp.getText()));
					} else if (tagName.equals("PM25")) {
						a.setPm25(Integer.parseInt(xpp.getText()));
					} else if (tagName.equals("O3")) {
						a.setO3(Double.parseDouble(xpp.getText()));
					} else if (tagName.equals("IDEX_NM")) {
						a.setIndex_nm(xpp.getText());
						
//				Javabean 하나 완성 되었을 때 마다 마무리로 ArrayList에 완성본 하나 담기
						airs.add(a);
					}
			} else if (type == XmlPullParser.END_TAG) {
				tagName = "";
			}
			
			xpp.next(); // 다음 row 찾아가도록 만듬
			type = xpp.getEventType(); // 다음 row line을 보도록 합니다. 
		}
			// while문 전부 다 돌았을 때  arrayList 자체를 return
			return airs;
			
			}catch(Exception e){
				e.printStackTrace();
				return null;
		}
	}
	
//	2. javabean에 있는 각각의 정보들을 db에 insert 하는 method 
	public static String writeAir(Air a) {

		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			// 내 서버와 db와 연결
			con = GustoDBManager.connect();
			// xml로 수집한 자료를 넣을 sql문 
			String sql = "insert into apr14_air values(apr14_air_seq.nextval,"
					   + " sysdate, ?, ?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);

			// 해당하는 ?에 해당하는 것 넣기 
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
	
//	3. DB에 담긴 모든 미세먼지 데이터
//	시간순 정렬 , 안되면 측정소명 정렬 
	public static ArrayList<Air> getAllAir() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try {
			con = GustoDBManager.connect();
			
			String sql = "select * from apr14_air order by aa_MSRDT ";
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

//	4. ArrayList에 담긴 정보를 csv 파일에 담기 
//		파일명.확장자
//		.확장자 - MicroSoft에 있는 개념
//			사람들이 보기 편하게 하기 위함
//		리눅스 >> '확장자'가 없음
//		

// 	air.txt
//		텍스트파일(문서)
//		메모장이라는 프로그램에서 '잘'열리는 파일 / 호환이 잘되는 파일

// 	CSV(Comma Separatefd Value)
//	각각의 값들이, Comma로 구분된 파일
//	엑셀에서 잘 열리는 파일  >> 엑셀은 UTF-8을 소화 못함
	public static void writeToFile(ArrayList<Air> airs) {
//		FileWriter fw = null; -> 원래는 써야하나 인코딩방식 지정이 안되서 다른걸로 대체
		// 이 이클립스에서 파일을 만들고 써서 밖으로 빼내야 함
		FileOutputStream fos = null;
		try {
			// 파일이 저장될 위치를 지정, 누적으로 할지 안할지(누적 : true , 리셋 : X)
			String path = "C:\\Users\\yt866\\Desktop\\fos\\air_poll.csv";
			fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			// 날짜 바꿔주기 Date - 형식지정 -> String : 2023,04,17,09,27
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd,HH,mm");
			
			// parameter로 받아온 Arraylist 하나하나 뜯어서 csv파일로 옮기기
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
