<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
</head>
<body>
	<H1>xml</H1>
	<c:forEach var="f" items="${fruits }"> <!--  dao의 stattribute("")안에 들어있는걸 넣어야함 -->
		${f.f_name } - ${f.f_price }<br>
	</c:forEach>
	
	<h1>json</h1>
	<c:forEach var="f" items="${fruits1 }">
		${f.f_name } - ${f.f_price }<br>
	</c:forEach>
	
</body>
</html>