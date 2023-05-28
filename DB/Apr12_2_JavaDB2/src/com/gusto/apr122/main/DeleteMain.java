package com.gusto.apr122.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteMain {
	public static void main(String[] args) {
		// ��ǰ���� �Է��ϸ�  �Է��� ������ �����ϴ� ��ǰ���� ���� ����
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			String addr = "jdbc:oracle:thin:@58.126.147.45:1521:xe";
			con = DriverManager.getConnection(addr,"yt8662","1");
//			System.out.println("1");
			
			Scanner k = new Scanner(System.in);
			System.out.println("��ǰ�� : ");
			String name = k.next();
			
			String sql = "delete from apr12_product "
					+ "where p_name like '%'||?||'%' ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			if (pstmt.executeUpdate() >= 1) {
				System.out.println("����");
				
			}else {
				System.out.println("�׷� ��ǰ�����ϴ�");
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
