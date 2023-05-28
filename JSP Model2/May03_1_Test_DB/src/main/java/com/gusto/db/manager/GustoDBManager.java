package com.gusto.db.manager;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

// 기존 JDBC 프로그램 구현 -> DBMS와 연동 작업
// 클라이언트의 요청이 있을 때마다 DB서버와 연결하기 위해서
// Connect 객체를 얻어내야 했음

// 단점 : 
//		1. Connection 과정은 일정 시간이 소요되는 작업
//		2. 불필요한 연결에 의한 서버자원 낭비 

// 단점을 보완 : DBCP(DataBase Connection Pool)
// 		여러개의 DBConnection을 하나의 Pool에 모아두고 관리
// 		필요할 때마다 Pool을 꺼내다가 사용하면 됨
// 		만약, 빌려올 수 있는 Connection이 없다면, Connection 객체가 반환될 때까지 클라이언트는 대기상태로 전환
// 		사용이 끝난 Connection 객체가 다시 Pool로 반환

// 스프링할때도 사용을 한다.
public class GustoDBManager {
	public static Connection connect(String poolName) throws Exception {
		Context ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup("java:comp/env/"+poolName);
		return ds.getConnection();
	}
	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
		} catch (Exception e) {
			// 에러메세지 안보고 싶으면 꼭 지우기
		}
		try {
			pstmt.close();
		} catch (Exception e) {
		}
		try {
			con.close();
		} catch (Exception e) {
		}
		
	}
}
