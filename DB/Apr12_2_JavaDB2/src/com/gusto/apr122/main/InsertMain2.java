package com.gusto.apr122.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMain2 {
	public static void main(String[] args) {
		// ���� Ȯ��
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			String addr = "jdbc:oracle:thin:@58.126.147.45:1521:xe";
			con = DriverManager.getConnection(addr,"yt8662","1");
			System.out.println("����!");
			
// ����Ǹ� �� �÷����� ���� �����͸� �Է¹ޱ�
			Scanner k = new Scanner(System.in);
			System.out.print("��Ʈ�̸� : ");
			String name = k.next();
			System.out.print("������ : ");
			String location = k.next();
			System.out.print("�� �� : ");
			int land = k.nextInt();
			System.out.print("���� ���� ��� : ");
			int parking = k.nextInt();

			// SQL(�̿ϼ�����)
			// Java ������ �ִ� ���� �� �ڸ��� ?��
			String sql = "insert into apr12_market "
					+ "values(apr12_market_seq.nextval, "
					+ "?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			
			// ?�� ���� ä���ֱ� : pstmt.setxxx(����ǥ��ȣ, ��);
			// xxx : �ڷ��� �ǹ� 
			// ? : 1������ ����
			
			pstmt.setString(1, name);
			pstmt.setString(2, location);
			pstmt.setInt(3, land);
			pstmt.setInt(4, parking);
			
			// ���� / ���� / ��� �ޱ�
			// �� �۾����� ���� �޴� ������ �� 
			if (pstmt.executeUpdate()==1) {
				System.out.println("����!");
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