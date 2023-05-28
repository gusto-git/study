<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>second.jsp</title>
</head>
<body>
	<h1>second.jsp</h1>
	<!-- <a>태그 이용해서 thirdV.jsp로 페이지 이동(thirdVBaby.jsp라는 페이지가 들어가게) -->
	<a href="ThirdC">ThirdC</a>
	<hr>
	
	<!-- <a>, JS, <form>+<button> 마다 요청 파라미터 값이 다름 -->
	a : ${param.a }<p>
	b : ${param.b }<p>
	c : ${c}<p> <!-- a+b한 값이 오도록, M의 setAttribute부분 -->
	d : ${dd }<p>
</body>
</html>