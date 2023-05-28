package com.gusto.apr122.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertMain1 {
	// SQL���� ����ؼ�
	// DB ������ ����
	// DB �������� �����ؼ�
	// �� ����� �޾� �� �� �־����
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			// DB����
			String addr = "jdbc:oracle:thin:@58.126.147.45:1521:xe";
			con = DriverManager.getConnection(addr, "yt8662","1");
			System.out.println("����!");
			
			// SQL�� �ۼ�(insert)
			// insert ap
			String sql = "insert into apr12_product " // ���� ����!
					// ���� ���ϸ� apr12_productvalues�� �� 
					+ "values(apr12_product_seq.nextval, "
					+ "'����������', 600, 10000, 3)"; // sql�� �������� ; ��������
			// ������ ����/����/��� �޾ƿ��� �۾��� �ϴ� �Ѱ� �Ŵ���
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate(); // ������ ����/����/��� �ޱ� 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ������ �� ���� �������� �ݱ� 
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
