<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> coffee </h1>
	<c:forEach var="c" items="${coffees }">
		${c.c_no } - ${c.c_name } - ${c.c_price } - ${c.c_bean } - ${c.c_country } - ${c.c_store } - ${c.c_kcal }
 	</c:forEach>
</body>
</html>