<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<table>
		<tr>
			<th colspan="2">BMI</th>
		</tr>
		
		<tr>
			<td>이름</td>
			<td>${g.name }</td>
		</tr>
		
		<tr>
			<td>키</td>
			<td>${g.height }</td>
		</tr>
		
		<tr>
			<td>몸무게</td>
			<td>${g.weight }</td>
		</tr>
		
		<tr>
			<td>bmi</td>
			<td>${g.bmi }</td>
		</tr>
		
		<tr>
			<td>결과</td>
			<td>${g.result }</td>
		</tr>
		
		<tr>
			<td><img src="img/${g.image }" style="max-width: 150px"></td>
		</tr>
		
	</table>
</body>
</html>