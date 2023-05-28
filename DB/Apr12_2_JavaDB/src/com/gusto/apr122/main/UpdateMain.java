package com.gusto.apr122.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateMain {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			String addr = "jdbc:oracle:thin:@58.126.147.45:1521:xe";
			con = DriverManager.getConnection(addr, "yt8662","1");
//			System.out.println("연결");
			
			// 매장명(p_location)입력 -> 그 단어를 포함하는 모든 매장의 상품을 20% 할인된 가격으로 바꾸기
			Scanner k = new Scanner(System.in);
			System.out.print("매장명 : ");
			String name = k.next();
			// 지금 이 공간은 java의 영역 -> %에 주의!
			String sql = "update apr12_product "
					+ "set p_price = p_price * 0.8 "
					+ "where p_m_no in( " // 1개 이상이 있을 수 있어서 in으로 써야한다.
					+ "select m_no "
					+ "from apr12_market "
					+ "where m_name like '%'||?||'%' " // % 하나당 '%' 해줘야하고 문자를 합치는 || 추가
					+ ")";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			if (pstmt.executeUpdate() >= 1) {
				System.out.println("성공");
				
			}else {
				System.out.println("그런 매장없습니다");
			}
			
		} catch (Exception e) {
		}
		try {
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
