<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>this is</h1>
	View(V) - <br>
		JSP : .html or .jsp<br>
		Spring : .jsp<br> 만 사용
		Spring Boot: .html<br> 만 사용
		
		Spring 안에서 쓰는 자원파일(CSS, JS, img, ... )<br>
		webapp - resources 파일 안에 css, js, img 폴더를 넣고 자료를 넣는다.
		
		<hr>
		input 3개 -> 이름 , x, y<p>
		button 하나 만들고 form안에 담기<p><hr>
		
		<form action="calculate.do">
			이름 : <input name="n"></td><p>
			x : <input name="x"></td><p>
			y : <input name="y"></td><p>
			<button>입력</button>
		</form>
</body>
</html>