<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--  core, fmt 둘다 일단 넣어두고 사용하는게 문화/관례 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL-Formatting</h1>
	<%-- fmt : 문자열 / 날짜/ 소수점 형태 등을 포맷팅 --%>
	<fmt:formatNumber value="${a }" type="number" /><p><!-- 숫자 -->
	<fmt:formatNumber value="${a }" type="currency" currencySymbol="$"/><p><!-- 통화 -->
	<fmt:formatNumber value="${b }" type="percent"/><p><!-- 퍼센트 -->
	<fmt:formatNumber value="${c }" pattern="#.00"/>
	<%--
		Date 속성
		: type="date/time/both" 
		1.date 
			dateStyle="short/long"
		2.time
			timeStyle="short/long"
		3.both
			dateStyle="short/long"
			timeStyle="short/long"
	 --%>
	<fmt:formatDate value="${d }" type="both" dateStyle="long" timeStyle="short"/>
	<fmt:formatDate value="${d }" pattern="yyyy-MM-dd E a hh:mm:ss"/>
	<hr>
	
	<c:forEach var="s" items="${s }">
		${s.name } - <fmt:formatNumber value="${s.price }" type="currency"/> - <fmt:formatDate value="${s.exp }" type="date" dateStyle="long"/><p>
	</c:forEach>
	
	
	
	
</body>
</html>