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
	<table id="indexTbl">
		<tr>
		<th id="siteTitleArea"><a href="HomeController">Title</a></th>
		</tr>
		<tr>
			<td id="siteContentArea" align="center"><jsp:include page="${cp }"/></td>
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