package com.gusto.apr122.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteMain {
	public static void main(String[] args) {
		// 상품명을 입력하면  입력한 내용을 포함하는 상품명의 정보 삭제
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			String addr = "jdbc:oracle:thin:@58.126.147.45:1521:xe";
			con = DriverManager.getConnection(addr,"yt8662","1");
//			System.out.println("1");
			
			Scanner k = new Scanner(System.in);
			System.out.println("상품명 : ");
			String name = k.next();
			
			String sql = "delete from apr12_product "
					+ "where p_name like '%'||?||'%' ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			if (pstmt.executeUpdate() >= 1) {
				System.out.println("성공");
				
			}else {
				System.out.println("그런 상품없습니다");
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
