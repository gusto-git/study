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
			con = DriverManager.getConnection(addr,"yt8662","1");
			
			Scanner k = new Scanner(System.in);
			System.out.print("����� : ");
			String name = k.next();
			
			String sql = "update apr12_product "
					+ "set p_price = p_price * 0.8 "
					+ "where p_m_no in( "
					+ "select m_no from apr12_market "
					+ "where m_name like '%'||?||'%' "
					+ ")";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			if (pstmt.executeUpdate() >= 1 ) {
				System.out.println("����");
			}else {
				System.out.println("�׷� ��������ϴ�");
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
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
