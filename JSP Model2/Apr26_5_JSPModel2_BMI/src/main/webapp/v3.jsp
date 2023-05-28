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
		String name = (String) request.getAttribute("name");
		double height = (Double) request.getAttribute("height");
		double weight = (Double) request.getAttribute("weight");
		double bmi = (Double) request.getAttribute("bmi");
		String result = (String) request.getAttribute("result");
	%>

	<table>
		<tr>
			<th colspan="2">BMI</th>
		</tr>
		
		<tr>
			<td>이름</td>
			<td><%=name %></td>
		</tr>
		
		<tr>
			<td>키</td>
			<td><%=height %></td>
		</tr>
		
		<tr>
			<td>몸무게</td>
			<td><%=weight %></td>
		</tr>
		
		<tr>
			<td>bmi</td>
			<td><%=bmi %></td>
		</tr>
		
		<tr>
			<td>결과</td>
			<td><%=result %></td>
		</tr>
		
	</table>
	
	
</body>
</html>