<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>apple/apple.jsp</title>
</head>
<body>
	<table id="appleTbl">
		<tr>
			<td><h1>사과 게시판</h1></td>
		</tr>
		<tr>
			<td align="right">${r }<a href="AppleRegController">등록</a></td>
		</tr>
		
		<tr>
			<td align="center">
				<table id="appleContext" border="1">
					<tr>
						<td>지역</td>
						<td>가격</td>
					</tr>
					<c:forEach var="apple" items="${apples }">
					<tr onclick="goAppleDetail('${apple.a_location}');">
						<td align="center">${apple.a_location }</td>
						<td align="center">
							<fmt:formatNumber value="${apple.a_price }" type="currency"/>
						</td>
					</tr>					
					</c:forEach>
					
				</table>
			</td>
		</tr>
		<tr>
			<td align="center">
				<c:forEach var="p" begin="1" end="${pageCount }">
					<a href="ApplePageController?p=${p }">[ ${p } ]</a>
				</c:forEach>
				
			</td>
		</tr>
	</table>
</body>
</html>