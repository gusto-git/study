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
			rs.close(); // e.printStackTrace() = C,U,D 때는 필요없음, R일때만 필요
//			C,U,D 때 하게 되면 NullPointerException이 발생
		} catch (Exception e) { // 모든 Exception이 잡히도록 됨
//			e.printStackTrace(); // 오류메세지는 안보려고
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
