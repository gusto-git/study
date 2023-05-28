<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL-Formatting</h1>
	<fmt:formatNumber value="${a }" type="number" /><p><!-- 숫자 -->
	<fmt:formatNumber value="${a }" type="currency" currencySymbol="$"/><p><!-- 통화 -->
	<fmt:formatNumber value="${b }" type="percent"/><p><!-- 퍼센트 -->
	<fmt:formatNumber value="${c }" pattern="#.00"/>
	<fmt:formatDate value="${d }" type="both" dateStyle="long" timeStyle="short"/>
	<fmt:formatDate value="${d }" pattern="yyyy-MM-dd E a hh:mm:ss"/>
	
</body>
</html>