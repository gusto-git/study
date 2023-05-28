<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
<link rel="stylesheet" href="css/Site.css">
<script type="text/javascript" src="js/GustoValidChecker.js"></script>
<script type="text/javascript" src="js/may07_Check.js"></script>
</head>
<body>
	<table id="siteTitle">
		<tr>
			<th id="siteTitleaArea"><a href="HomeController">Title</a></th>
		</tr>
		<tr>
			<td id="siteContentArea" align="center"><jsp:include page="${cp }"/></td> <!-- 모든 내용을 LE을 통해서 삽입할 예정 -->
		</tr>
	</table>
	<table id="siteMenuTbl">
		<tr>
			<td align="center"><a href="AppleController"/>Apple</td>
			<td align="center"><a href="#"/>Banana</td>
			<td align="center"><a href="#"/>Coconut</td>
			<td align="center"><a href="#"/>DB</td>
		</tr>
		
	</table>
</body>
</html>