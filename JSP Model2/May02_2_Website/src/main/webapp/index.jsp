<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
<link rel="stylesheet" href="css/index.css">
</head>
<body>
	<table id="siteTbl">
		<tr><th align='left'>2023년 5월 2일</th></tr>
		
		<tr>
			<td>
				<a href="HomeController">HOME</a>
				<a href="AController">A</a>
				<a href="#">B</a>
				<a href="#">C</a>
			</td>
		</tr>
		<tr>
			<td>
				<jsp:include page="${contentPage }"></jsp:include>
			</td>
		</tr>
		<tr>
			<td>
				<img src="css/cat1.gif" id="img1">
				<img src="css/cat1.gif" id="img2">
			</td>
		</tr>
	</table>
	
</body>
</html>