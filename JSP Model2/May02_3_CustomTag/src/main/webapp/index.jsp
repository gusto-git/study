<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
<!--  가장 기본으로 만들어 놓은 jsp 파일에 링크 몰아넣기  -->
<!--  id 먹일 때 중복되면 안된다. / 여러개 동시에 같은 효과를 주고 싶으면 class -->
<link rel="stylesheet" href="css/index.css">
<link rel="stylesheet" href="css/calc.css">
<script type="text/javascript" src="js/May023_Check.js"></script>
<script type="text/javascript" src="js/GustoValidChecker.js"></script>
</head>
<body>
	<table id="siteTbl">
		<tr><th  align="center" id="siteTitle">2023년 5월 2일</th></tr>
		<tr>
			<td align="center" id="siteMenu">
				<a href="HomeController" class="a">Home</a>
				<a href="CalcController" class="a">사칙연산</a>
				<a href="JSTLCController" class="a">JSTL-CORE</a>
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