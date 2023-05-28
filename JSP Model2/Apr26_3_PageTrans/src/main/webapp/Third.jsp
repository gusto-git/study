<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Third.jsp</title>
</head>
<body>
	<%
		// Parameter 읽기
		int a = Integer.parseInt(request.getParameter("a"));
		
		String bbb = request.getParameter("b"); // String
		Integer bb = Integer.parseInt(bbb); // String -> Integer
		int b = bb.intValue(); // Integer -> int
		
		// Attribute 읽기
		Object ccc = request.getAttribute("c"); // Object
		Integer cc = (Integer) ccc;
		int c = cc.intValue();
		
		String d = (String) request.getAttribute("d");
		Random e = (Random) request.getAttribute("e");
		
	%>
	<h1>Third</h1>
	a: <%=a %> <p>
	b: <%=b %> <p>
	c: <%=c %> <p>
	d: <%=d %> <p>
	e: <%=e.nextInt(100) + 1 %> <p>
	
</body>
</html>