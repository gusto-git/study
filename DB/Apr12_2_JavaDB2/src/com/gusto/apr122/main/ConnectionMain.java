package com.gusto.apr122.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// ���� : cmd ��� sqlplus��� ���α׷����� OracleDB�� ����
//		  cmd ����
// ����ǰ : orange, toad, eclipse, dbeaver, sqldeveloper, ... 

// Socket ���
// HTTP ���
// DB������ ��� : (�̿ϼ�����) JAVA�� ����Ǿ� ����
// DB����Ŀ�� ���� ������ .. -> ����Ŀ���� ����� ���ݾ� �ٸ�
// ������ DB�� ���缭 ���ݾ� ��ġ�� �ʿ�! 

// JDBC(Java DataBase Connectivity)
//		�ڹٿ��� DB ���α׷����� �ϱ� ���ؼ� ���Ǵ� API
// OracleDB ����� : ���⿡ �°� ��ġ�� �ؾ� ��
// ojdbc8.jar <- ���⿡ �ʿ��� ��� �� ����


//������ DB ���� �ּ�(����Ŀ���� ������ �ٸ�)
// Data Source Explorer - ���� �̸��ʿ��� ��Ŭ��
	// -Properties - Driver Properties - Connection URL ����
	// jdbc:oracle:thin:@58.126.147.45:1521:xe
	// jdbc:oracle:thin:@localhost:1521:xe - ���� IP�� ��� ��� 

public class ConnectionMain {
	public static void main(String[] args) {
		Connection con = null;
		try {
			String addr = "jdbc:oracle:thin:@58.126.147.45:1521:xe";
			con = DriverManager.getConnection(addr, "yt8662", "1");
			System.out.println("����!");
			
		} catch (Exception e) {
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
