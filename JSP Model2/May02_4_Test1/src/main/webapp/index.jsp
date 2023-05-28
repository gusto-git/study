<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
<link rel="stylesheet" href="css/index.css">
<link rel="stylesheet" href="css/calc.css">
<script type="text/javascript" src="js/May023_Check.js"></script>
<script type="text/javascript" src="js/GustoValidChecker.js"></script>
</head>
<body>
	<table id = "siteTbl">
	<tr><th align="center" id="siteTitle">2023년 05월 02일</th></tr>
	<tr>
		<td align="center" id="siteMenu">
			<a href="HomeController" class="a">HOME</a>
			<a href="CalcController" class="a">CALC</a>
			<a href="#" class="a">JSTL-CORE</a>
			<a href="JSTLFController" class="a">JSTL-Formatting</a>
		</td>
	</tr>
	
	<tr>
		<td align="center">
			<jsp:include page="${contentPage }"></jsp:include>
		</td>
	</tr>
	
	<tr>
		<td align="center">
			<img src="css/cat1.gif" id="img1">
			<img src="css/cat1.gif" id="img2">
		</td>
	</tr>
	
	</table>
</body>
</html>