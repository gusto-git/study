<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board/board.jsp</title>
</head>
<body>
	<%-- 검색어 입력하는 부분 --%> 
	<table id="searchTbl">
		<tr>
			<td><input autocomplete="off" name="search" id="searchInput"></td>
			<td><button id="searchBtn">검색</button></td>
		</tr>
	</table>
	<%-- 게시글 출력 부분 --%>
	<c:forEach var="board" items="${boards }">
	<table id="boardContentTbl">
		<tr>
			<td valign="top" align="center" rowspan="3" class="boardPhoto"><img src="img/${board.m_photo }"></td> <!--  m_photo 자바빈 이름 -->
			<td class="boardWriter">-${board.b_writer }-</td>
		</tr>
		
		<tr>
			<td align="right" class="boardWhen">
				<fmt:formatDate value="${board.b_when }" type="both"
				dateStyle="long" timeStyle="short"/>
		</tr>
		
		<tr>
			<td>${board.b_text }</td>
		</tr>
	</table>
	</c:forEach>
</body>
</html>