package com.gusto.apr122.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 원래 : cmd 기반 sqlplus라는 프로그램으로 OracleDB를 제어
//		  cmd 불편
// 사제품 : orange, toad, eclipse, dbeaver, sqldeveloper, ... 

// Socket 통신
// HTTP 통신
// DB서버와 통신 : (미완성상태) JAVA에 내장되어 있음
// DB메이커가 많기 때문에 .. -> 메이커별로 통신이 조금씩 다름
// 연결할 DB에 맞춰서 조금씩 터치가 필요! 

// JDBC(Java DataBase Connectivity)
//		자바에서 DB 프로그래밍을 하기 위해서 사용되는 API
// OracleDB 사용중 : 여기에 맞게 터치를 해야 함
// ojdbc8.jar <- 여기에 필요한 기능 다 있음


//연결할 DB 서버 주소(메이커별로 형식이 다름)
// Data Source Explorer - 서버 이름쪽에서 우클릭
	// -Properties - Driver Properties - Connection URL 복사
	// jdbc:oracle:thin:@58.126.147.45:1521:xe
	// jdbc:oracle:thin:@localhost:1521:xe - 유동 IP일 경우 사용 

public class ConnectionMain {
	public static void main(String[] args) {
		Connection con = null;
		try {
			String addr = "jdbc:oracle:thin:@58.126.147.45:1521:xe";
			con = DriverManager.getConnection(addr, "yt8662", "1");
			System.out.println("연결!");
			
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
