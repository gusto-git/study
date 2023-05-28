<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--  아래 두 줄 쓰기 위해서 jstl.jar파일 필수 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>apple/apple.jsp</title>
</head>
<body>
	<h1>사과 게시판</h1>
	<table id="appleTbl">
		<tr>
			<td align="right">${r }<a href="#">등록</a></td>
		</tr>
		
		<tr>
			<td align="center">
				<table id="appleContext" border="1"> <!-- 데이터가 나오는 부분 -->
					<tr>
						<th>지역</th>
						<th>가격</th>
					</tr>
					<c:forEach var="apple" items="${apples }">
					<tr>
						<td align="center">${apple.a_location }</td>
						<td align="center">
							<fmt:formatNumber value="${apple.a_price }" type="currency"/>
						</td>
					</tr>
					</c:forEach>
					
				</table>
			</td>
		</tr>
	</table>
</body>
</html>