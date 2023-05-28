package com.gusto.may031.apple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.gusto.db.manager.GustoDBManager;

// method method 명 기준  알파벳 순으로 놓는게 문화 
//	다만 공부를 위해 우리는 순차적으로 한다.
public class AppleDAO {
	private int allAppleCount; //사과를 등록했을 때 카운팅되는 것
	
	private static final AppleDAO APPLEDAO = new AppleDAO();
	
	private AppleDAO() {
		
	}
	
	// AppleController에서는 getAppledao로 AppleDAO에 접근이 가능하다.
	public static AppleDAO getAppledao() {
		return APPLEDAO;
	}
	
	// 모든 사과 데이터 다 가져오기 - 멤버 변수가 있기 때문에 static을 쓰지 않는다. :R(read) - Select 
	public void getAllApples(HttpServletRequest request) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// db 연결
			con = GustoDBManager.connect("leePool"); // poolName 대소문자 구분
			
			// sql문 작성
			String sql = "select * from may03_apple order by a_price";
			
			// db연결하는 총괄 객체
			pstmt = con.prepareStatement(sql);
			
			// C/U/D : pstmt.executeUpdate()로 실행 - > 데이터가 몇개 영향 받았는지
			// R : pstmt.executeQuery()로 실행 ->  select의 결과가 ResultSet으로 보내짐
			rs=pstmt.executeQuery();
			
			// rs에 있는 것을 담을 ArrayList로 작성
			ArrayList<Apple> apples = new ArrayList<Apple>();
			// apple 데이터 한줄 완성하기 위한 빈 자바빈
			Apple apple = null;
			
			while (rs.next()) {
				apple = new Apple(); // 새 객체 꺼내기
				apple.setA_location(rs.getString("a_location")); // "db필드명"
				apple.setA_color(rs.getString("a_color"));
				apple.setA_flavor(rs.getString("a_flavor"));
				apple.setA_price(rs.getInt("a_price"));
				apple.setA_introduce(rs.getString("a_introduce"));
				apples.add(apple); // 자바빈 하나 완성되면 ArrayList에 담기 
			}
			// ArrayList를 jsp파일에 풀어야한다. -> setAttribute
			request.setAttribute("apples", apples);
		} catch (Exception e) {
			e.printStackTrace();
		}
		GustoDBManager.close(con, pstmt, rs); 
		// DAO <- controller -> JSP파일이랑 소통하기 위해서 
	}
}
