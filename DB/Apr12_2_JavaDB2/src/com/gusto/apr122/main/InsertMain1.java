package com.gusto.apr122.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertMain1 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
//		DB ����
			String addr = "jdbc:oracle:thin:@58.126.147.45:1521:xe";
			con = DriverManager.getConnection(addr,"yt8662","1");
//		SQL �ۼ�
			String sql = "insert into apr12_product "
					+ "values(apr12_product_seq.nextval, "
					+ "'����������', 600, 13000, 3)";
//		����� ������ ����/����/����� �޾ƿ��� �Ŵ��� �ۼ�
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
//		�������� �ݱ�
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
