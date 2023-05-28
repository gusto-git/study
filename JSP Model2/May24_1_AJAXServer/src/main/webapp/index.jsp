<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jstl 사용 하기 전 jstl 1.2를 넣어주고 작성한다. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>오랜만에 공부하니 신나는 구만</h1>
	<c:forEach var="f" items="${fruits }">
		${f.f_name } - ${f.f_price } <br>
	</c:forEach>
</body>
</html>