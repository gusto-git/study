<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index.css">
<link rel="stylesheet" href="css/board.css">
<link rel="stylesheet" href="css/login.css">
<link rel="stylesheet" href="css/welcome.css">
<link rel="stylesheet" href="css/memberInfo.css">
<link rel="stylesheet" href="css/signup.css">
<link rel="stylesheet" href="board/board.css">
<script type="text/javascript" src="js/go.js"></script>
<script type="text/javascript" src="js/GustoValidChecker.js"></script>
<script type="text/javascript" src="js/may23_memberCheck.js"></script>

</head>
<body>
	<table id="siteTitleTbl">
		<tr>
			<td id="siteTitle" align="center"><a href="HomeConrtroller">SNS Mode</a></td>
			
		</tr>
		<tr>
			<td id="siteMenu" align="center"><a href="BoardController">Board</a></td>
		</tr>
	</table>
	<table id="siteContentTbl">
		<tr><td id="siteContent" align="center"><jsp:include page="${cp }"/></td></tr>
	</table>
	<table id="siteLoginTbl">
		<tr>
			<td><jsp:include page="${lp }"/><span${r }></span></td>
		</tr>
	</table>
	


</body>
</html>