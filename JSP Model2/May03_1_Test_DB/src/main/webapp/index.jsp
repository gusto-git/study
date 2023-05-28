<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
<link rel="stylesheet" href="css/index.css">
<link rel="stylesheet" href="css/apple.css">
<script type="text/javascript" src="js/GustoValidChecker.js"></script>
<script type="text/javascript" src="js/may03_Check.js"></script>
<script type="text/javascript" src="js/go.js"></script>

</head>
<body>
	<table id="siteTitle">
		<tr>
			<th id="siteTitleArea"><a href="HomeController">Title</a></th>
		</tr>
		<tr>
			<td id="siteContentArea" align="center"><jsp:include page="${cp }"></jsp:include></td> <!-- 구멍을 뚫어서 원하는 내용을 LE를 통해서 쉽게 넣기 -->
		</tr>
	</table>
	
	<table id="siteMenuTbl">
		<tr>
			<td align="center"><a href="AppleController">Apple</a></td>
			<td align="center"><a href="#">Banana</a></td>
			<td align="center"><a href="#">Coconut</a></td>
			<td align="center"><a href="DBCController">DB</a></td>
		</tr>
	
	</table>
	
	
</body>
</html>