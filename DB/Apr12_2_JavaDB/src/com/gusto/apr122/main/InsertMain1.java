package com.gusto.apr122.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertMain1 {
	// SQL문을 사용해서
	// DB 서버로 전송
	// DB 서버에서 실행해서
	// 그 결과를 받아 올 수 있어야함
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			// DB연결
			String addr = "jdbc:oracle:thin:@58.126.147.45:1521:xe";
			con = DriverManager.getConnection(addr, "yt8662","1");
			System.out.println("성공!");
			
			// SQL문 작성(insert)
			// insert ap
			String sql = "insert into apr12_product " // 띄어쓰기 주의!
					// 띄어쓰기 안하면 apr12_productvalues가 됨 
					+ "values(apr12_product_seq.nextval, "
					+ "'샤브샤브용고기', 600, 10000, 3)"; // sql문 마지막에 ; 쓰지말것
			// 서버에 전송/실행/결과 받아오는 작업을 하는 총괄 매니저
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate(); // 서버에 전송/실행/결과 받기 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 위에서 연 순서 역순으로 닫기 
		try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
}
