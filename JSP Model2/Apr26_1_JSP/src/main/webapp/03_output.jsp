<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// GET , POST
		// 원래) 요청 파라미터 -> 한글처리
		// 	GET : 안해도됨
		// 	POST : 해야함
		//  할지 말지 고민 될때는 해야한다
		
		request.setCharacterEncoding("UTF-8");
		// 원래 ) 응답 한글 처리 안해도 됨 위에서 하고있기 때문
		// 1~2, 6 번줄에서 해주고 있기 때문에 안해도 된다.
// 		response.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
		int z = x + y;
	%>
	<h2>이름 : <%=name %></h2>
	<h1><%=x   %> + <%=y %> = <%=x + y %></h1>
	<h1><%=x   %> + <%=y %> = <%=z %></h1>
</body>
</html>