package com.gusto.db.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// "jdbc:oracle:thin:@58.126.147.45:1521:xe";

public class GustoDBManager {
	public static Connection connect() throws SQLException {
		String addr = "jdbc:oracle:thin:@58.126.147.45:1521:xe";
		return DriverManager.getConnection(addr, "yt8662","1");
	}
	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		
		try {
			rs.close(); // e.printStackTrace() = C,U,D ���� �ʿ����, R�϶��� �ʿ�
//			C,U,D �� �ϰ� �Ǹ� NullPointerException�� �߻�
		} catch (Exception e) { // ��� Exception�� �������� ��
//			e.printStackTrace(); // �����޼����� �Ⱥ�����
		}
		
		try {
			pstmt.close();
		} catch (Exception e) {
		}
		
		try {
		} catch (Exception e) {
		}
		
	}
}
