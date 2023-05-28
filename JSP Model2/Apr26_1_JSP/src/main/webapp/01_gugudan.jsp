<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>01_gugudan.jsp</title>
<style type="text/css">
	table{
		float : left;
		margin-right : 5px;
	}
</style>
</head>
<body>

<%-- 	1~10까지 숫자 웹에 출력 
	
	<%
		for(int i = 1; i <= 10; i++){
	%>
		<h1><%=i %></h1>
	<%
		}
	%> --%>

	<%-- 테이블 마다 단: 구구단 2x1 ~ 9x9--%>
	<%-- 테이블이 옆으로 붙게 --%>

	
	<% 
	for(int i = 2; i <= 9; i++ ){
	%>
	
	<table border="1">
		<tr>
			<th><%=i+"단" %></th>
		</tr>
	<%
		for(int j = 1; j <= 9; j++){
	%>	
		<tr> 
			<td><%=i %> X <%=j %> = <%=i * j %></td>
		</tr>
	<%	
		}
	%>
	</table>
	<% 
	}
	%>


</body>
</html>