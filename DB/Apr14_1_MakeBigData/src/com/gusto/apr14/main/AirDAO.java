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

// M : model ���� front 
// xml : kxml2 / gustohttpclient jar
// db�����Ҷ� �ʿ��� jar : gustodbmanager.jar

public class AirDAO {
//	 1. xml �Ľ��ϴ� method -> syso�� �̾ƺ���
	public static ArrayList<Air> getAir() {

		try {
//		������ ��û�ؼ� �ٿ�ޱ�	
			String address = "http://openapi.seoul.go.kr:8088/70646b63596a69683437716f794e49/xml/RealtimeCityAir/1/25/";
			InputStream is = GustoHttpClient.download(address);
			
//		xml ������ �غ�	
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");
			
//		xpp�� ���� �ִ� line
			int type = xpp.getEventType();
			
//		tag�� ã�� �� ����� �ӽú��� 	
			String tagName = null;
			
//		syso �� ����� -> Javabean Ȱ�� -> ��� ���
//		Javabean�� �� ���Ÿ� return	
			Air a = null;
			
//			 DB�� ������ �� ����ߴ� Air�� �� ArraytList ����
			ArrayList<Air> airs = new ArrayList<Air>();
			while (type != XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
					
					if (tagName.equals("row")) {
						
//				row�� ���ö����� Javabean �� ��ü ����		
						a = new Air();
					}
//				javabean�� ��������� ���缭 �ֱ�	
				}else if (type == XmlPullParser.TEXT) {
					 if (tagName.equals("MSRRGN_NM")) {
						 a.setMsrrgn_nm(xpp.getText());
					} else if (tagName.equals("MSRSTE_NM")) {
						a.setMsrste_nm(xpp.getText());
					} else if (tagName.equals("PM10")) {
						
//				���� string -> int ����ȯ
						a.setPm10(Integer.parseInt(xpp.getText()));
					} else if (tagName.equals("PM25")) {
						a.setPm25(Integer.parseInt(xpp.getText()));
					} else if (tagName.equals("O3")) {
						a.setO3(Double.parseDouble(xpp.getText()));
					} else if (tagName.equals("IDEX_NM")) {
						a.setIndex_nm(xpp.getText());
						
//				Javabean �ϳ� �ϼ� �Ǿ��� �� ���� �������� ArrayList�� �ϼ��� �ϳ� ���
						airs.add(a);
					}
			} else if (type == XmlPullParser.END_TAG) {
				tagName = "";
			}
			
			xpp.next(); // ���� row ã�ư����� ����
			type = xpp.getEventType(); // ���� row line�� ������ �մϴ�. 
		}
			// while�� ���� �� ������ ��  arrayList ��ü�� return
			return airs;
			
			}catch(Exception e){
				e.printStackTrace();
				return null;
		}
	}
	
//	2. javabean�� �ִ� ������ �������� db�� insert �ϴ� method 
	public static String writeAir(Air a) {

		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			// �� ������ db�� ����
			con = GustoDBManager.connect();
			// xml�� ������ �ڷḦ ���� sql�� 
			String sql = "insert into apr14_air values(apr14_air_seq.nextval,"
					   + " sysdate, ?, ?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);

			// �ش��ϴ� ?�� �ش��ϴ� �� �ֱ� 
			pstmt.setString(1, a.getMsrrgn_nm());
			pstmt.setString(2, a.getMsrste_nm());
			pstmt.setInt(3, a.getPm10());
			pstmt.setInt(4, a.getPm25());
			pstmt.setDouble(5, a.getO3());
			pstmt.setString(6, a.getIndex_nm());
	
			if (pstmt.executeUpdate() == 1) {
				return "����";
			}
			return "����";
		} catch (Exception e) {
			e.printStackTrace();
			return "����";
		} finally {
			GustoDBManager.close(con, pstmt, null);
		}
	}
	
//	3. DB�� ��� ��� �̼����� ������
//	�ð��� ���� , �ȵǸ� �����Ҹ� ���� 
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

//	4. ArrayList�� ��� ������ csv ���Ͽ� ��� 
//		���ϸ�.Ȯ����
//		.Ȯ���� - MicroSoft�� �ִ� ����
//			������� ���� ���ϰ� �ϱ� ����
//		������ >> 'Ȯ����'�� ����
//		

// 	air.txt
//		�ؽ�Ʈ����(����)
//		�޸����̶�� ���α׷����� '��'������ ���� / ȣȯ�� �ߵǴ� ����

// 	CSV(Comma Separatefd Value)
//	������ ������, Comma�� ���е� ����
//	�������� �� ������ ����  >> ������ UTF-8�� ��ȭ ����
	public static void writeToFile(ArrayList<Air> airs) {
//		FileWriter fw = null; -> ������ ����ϳ� ���ڵ���� ������ �ȵǼ� �ٸ��ɷ� ��ü
		// �� ��Ŭ�������� ������ ����� �Ἥ ������ ������ ��
		FileOutputStream fos = null;
		try {
			// ������ ����� ��ġ�� ����, �������� ���� ������(���� : true , ���� : X)
			String path = "C:\\Users\\yt866\\Desktop\\fos\\air_poll.csv";
			fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			// ��¥ �ٲ��ֱ� Date - �������� -> String : 2023,04,17,09,27
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd,HH,mm");
			
			// parameter�� �޾ƿ� Arraylist �ϳ��ϳ� �� csv���Ϸ� �ű��
			for (Air a : airs) {
				bw.write(a.getNo() + ","); // >> sequence�ذŶ� ���� ����
				// Date -> String : format  // String -> Date : parse
				bw.write(sdf.format(a.getWhen()) + ",");
				bw.write(a.getMsrrgn_nm() + ",");
				bw.write(a.getMsrste_nm() + ",");
				bw.write(a.getPm10() + ",");
				bw.write(a.getPm25() + ",");
				bw.write(a.getIndex_nm() + "\r\n");
				// BufferedWriter�� �뷮�� �� ���� �ʾƵ� �׳� ��������
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
