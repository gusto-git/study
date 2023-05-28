package com.gusto.apr122.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMain2 {
	public static void main(String[] args) {
		// 연결 확인
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			String addr = "jdbc:oracle:thin:@58.126.147.45:1521:xe";
			con = DriverManager.getConnection(addr,"yt8662","1");
			System.out.println("성공!");
			
// 연결되면 각 컬럼별로 넣을 데이터를 입력받기
			Scanner k = new Scanner(System.in);
			System.out.print("마트이름 : ");
			String name = k.next();
			System.out.print("지점명 : ");
			String location = k.next();
			System.out.print("몇 평 : ");
			int land = k.nextInt();
			System.out.print("주차 가능 대수 : ");
			int parking = k.nextInt();

			// SQL(미완성상태)
			// Java 변수에 있는 값이 들어갈 자리는 ?로
			String sql = "insert into apr12_market "
					+ "values(apr12_market_seq.nextval, "
					+ "?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			
			// ?에 값을 채워주기 : pstmt.setxxx(물음표변호, 값);
			// xxx : 자료형 의미 
			// ? : 1번부터 시작
			
			pstmt.setString(1, name);
			pstmt.setString(2, location);
			pstmt.setInt(3, land);
			pstmt.setInt(4, parking);
			
			// 전송 / 실행 / 결과 받기
			// 이 작업으로 영향 받는 데이터 수 
			if (pstmt.executeUpdate()==1) {
				System.out.println("성공!");
			}	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
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