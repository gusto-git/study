<%@page import="com.gusto.db.manager.GustoDBManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dbc/dbc.jsp</title>
</head>
<body>
	<h1>DB연결상태확인</h1>
	<%
/*	Class.forName("oracle.jdbc.driver.OracleDriver");
	String addr = "jdbc:oracle:thin:@58.126.147.45:1521:xe"; // 서버주소 오라클버전은 이렇다.
	con = DriverManager.getConnection(addr, "yt8662","1"); */
/*	
	javax.naming.Context - IntitialContext
	Context ctx = new InitialContext();
	javax.sql.datasource
	DataSource ds = (DataSource) ctx.lookup("java:comp/env/leePool");
	con = ds.getConnection(); */
	
		String result = "실패";
		Connection con = null;
		try{
			con = GustoDBManager.connect("leePool");
			result="성공";
		}catch(Exception e){
			e.printStackTrace();
		}
	%>
	<h1><%=result %></h1>
</body>
</html>

