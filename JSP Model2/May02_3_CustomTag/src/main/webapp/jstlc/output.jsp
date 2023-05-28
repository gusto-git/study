<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlc/output.jsp</title>
</head>
<body>
	<h1>${param.n }</h1>
	
	<%-- 조건문 --%>
	<c:if test="${param.n % 2 == 0 }">
		<h3>짝수</h3>
	</c:if>
	
	<%-- if-else + switch-case 느낌 --%>
	<c:choose>
		<c:when test="${param.n > 10 }">
			<h3>10보다 크다</h3>
		</c:when>
		<c:when test="${param.n > 5 }">
			<h3>5~10사이</h3>
		</c:when>
		<c:otherwise>
			<h3>나머지</h3>
		</c:otherwise>
	</c:choose>
	<hr>
	<c:forEach var="v" begin="1" end="${param.n }" step="2">
		<marquee>${v }</marquee>
	</c:forEach>	
	<hr>
	<c:forEach var="a" items="${ar }">
		<h1>${a }</h1>
	</c:forEach>
	
	이름-나이<br>
	<c:forEach var="person" items="${al }">
		${person.name } - ${person.age }<br>
	</c:forEach>
	
	<%-- try-catch --%>
	<c:catch var="myExcept">
		<% int result = 100 / 2; %>
		계산결과 : <%=result %>
	</c:catch><br>
	
	<c:catch var="myExcept">
		<% int result = 100 / 0; %>
		계산결과 : <%=result %>
	</c:catch>
	<hr>
	<c:if test="${myExcept != null }">
		에러발생 : ${myExcept.message}<p>
	</c:if>
	<hr>
	<!--  java로 치면 syso같은 느낌  -->
	<c:out value="%{param.n} - ${myExcept.message }"></c:out>
	
</body>
</html>