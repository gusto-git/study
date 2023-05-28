package com.gusto.apr122.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//��ǰ �̸��� ������������ �����ؼ� ��ǰ ��ü ���� ��ȸ
public class SelectMain {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
				String addr = "jdbc:oracle:thin:@58.126.147.45:1521:xe";
				con = DriverManager.getConnection(addr,"yt8662","1");
//				System.out.println("����!");
				String sql = "select * from apr12_product order by p_name";
				pstmt = con.prepareStatement(sql);
				
				// pstmt.executeUpdate() : ��� ������ �޾Ҵ°�? (C,U,D)���� �ش�
				// pstmt.executeQuery()  : ������ (R)
				
				// select���� ������ ����� ���� �׸��� �ʿ�
				// select���� ������ ��� : ResultSet (List�� ����� ����)
				
				rs = pstmt.executeQuery();
				// rs.next() : ���� �����ͷ� �Ѿ, xml ����
				// ���� �����Ͱ� �ִ� ��� : true
				// ���� �����Ͱ� ���� ��� : false�� ����
				while (rs.next()) { // �����Ͱ� �ִ� �� ��� ���ƶ�
//					rs.getXXX("�÷���") : ���� ��ġ�� �÷� �б�
//					rs.getXXX(�ε���) 	: ���� �������� �ε����� �ش��ϴ� �÷� �б�(����)
//					System.out.println(rs.getString(2)); ����
					System.out.println(rs.getInt("p_no"));
					System.out.println(rs.getString("p_name"));
					System.out.println(rs.getInt("p_weight"));
					System.out.println(rs.getInt("p_price"));
					System.out.println("-------------");
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
