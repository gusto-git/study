package com.gusto.may241.fruit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.gusto.db.manager.GustoDBManager;

public class FruitDAO {
	
	// CRUD 중 READ = SELECT
	public static void getAllFruit(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = GustoDBManager.connect("leePool");
			String sql = "select * from MAY24_FRUIT order by f_price";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			ArrayList<Fruit> fruits = new ArrayList<Fruit>();
			Fruit f = null; // 자바빈 꺼내기
			
			while (rs.next()) {
				f = new Fruit(); // 새 객체 열기
				f.setF_name(rs.getString("f_name"));
				f.setF_price(rs.getInt("f_price"));
				fruits.add(f);
			}
			// ArrayList에 다 담은 후 jsp 쪽으로 보내기
			req.setAttribute("fruits", fruits);
			// 작업을 해서 JSP 결과 처리할 때
			// 		req.setAtrtribute - 지금 현재 요청에서만 사용 가능
			// 		session.setAttribue - Server <> client의 연결 상태가 살아있기만 하면 지속적으로 결과 사용 가능
			// 		Cookie - 제한시간 내에 무조건 사용 가능 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		GustoDBManager.close(con, pstmt, rs);
	}
	
	// 빅데이터 / 인공지능 관련 사업시 사용
	// 		데이터를 판매
	// 			- DB를 직접 건들게 : 위험
	//			- 파일로 만들어서 준다 : 용량문제
	//			- 요청하면 데이터를 제공하는 시스템
	//				: 제공하는 쪽과 요청하는 쪽 사이의 약속된 형태 
	//				: 전 세계적으로 약속된 형태 (XML , JSON 등이 있다)
	
	public static String getAllFruitXML(HttpServletRequest req) { // XML 버전 
		// DB에 있는 데이터를 가지고 와야 -> CRUD -> READ 
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = GustoDBManager.connect("leePool");
			String sql = "select * from may24_fruit order by f_price";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			// String을 대량으로 붙일 때 사용 : StringBuffer
			StringBuffer sb = new StringBuffer();
			// xml.file을 webapp에 만들고 첫줄을 복사해서 append안에 넣는다.
			sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			sb.append("<may24_fruit>"); // DB 테이블명을 넣는다. 시작
			// <may24_fruit>안에 반복해서 출력하기 때문에 while문을 사용한다.
				while (rs.next()) {
					sb.append("<fruit>"); // fruit 열기
					sb.append("<f_name>" + rs.getString("f_name") + "</f_name>");
					sb.append("<f_price>" + rs.getInt("f_price") + "</f_price>");
					sb.append("</fruit>"); // fruit 닫기
				}
			sb.append("</may24_fruit>"); // /DB 테이블명을 넣는다. 종료
			// 값을 보여주기 위해서 return을 사용한다.
			return sb.toString();
			
		} catch (Exception e) {
			e.printStackTrace();
			return "망했네";
		
		// 리턴이 있으면 finally를 쓰고 닫는다
		} finally {
			GustoDBManager.close(con, pstmt, rs);
		}
		
	}
	
	public static String getAllFruitJSON(HttpServletRequest req) { // JSON 버전
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = GustoDBManager.connect("leePool");
			String sql = "select * from may24_fruit order by f_price";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			boolean isFirst = true; // 다음 데이터가 있으면 ,를 붙이는 용도로 만듬
			StringBuffer sb = new StringBuffer();
			sb.append("[");
				while (rs.next()) {
					if (isFirst) {
						isFirst = false;
					} else {
						sb.append(",");
					}
					// 오브젝트
					sb.append("{");
					// "f_name" : "사과"
					sb.append("\"f_name\":\"" + rs.getString("f_name") + "\",");
					// "f_price" : "2500"
					sb.append("\"f_price\":" + rs.getInt("f_price"));
					sb.append("}");
				}
			sb.append("]");
			return sb.toString();
			
		} catch (Exception e) {
			e.printStackTrace();
			return "망함";
			
		} finally {
			GustoDBManager.close(con, pstmt, rs);
		}
	}
}
