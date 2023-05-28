<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First.jsp</title>
</head>
<body>
<%--
	JSP Model2
	V(.jsp)
		값 받기 : EL ${XXX }
	페이지 이동
		redirect, forward, include
	조건문, 반복문, 출력형식(소수점, 날짜형식, ...)
	
		Custom Tag
		- 생김새 : HTML DOM 객체 같음
		- .jsp : servlet으로 바뀔 때 Java 코드로 변환 시켜준다.
		- Custom Tag : .jsp에서만 가능하다.	
		
		<접두어:태그명>내용</접두어:태그명>
		<접두어:태그명 /> -> 열고 닫기 사이에 내용이 없을 경우 /를 안에 넣어서 사용가능
		
			// JSP 표준 액션 태그
				- JSP 환경에서 기본적으로 사용이 가능
				- 접두어 부분이 jsp
				- include 사용이 대표적
			// Custom Tag
				- 외부 .jar파일을 넣고 사용한다(jstl.jar)
				- 접두어가 마음대로 사용 가능 
				- 반복문, 조건문, 출력형식, .... 
				
 --%>
	<h1>First</h1>
	<%-- Secon.jsp의 소스가 아래에 포함 --%>
	<%-- 내가 원하는 자리에 넣어서 표현할 수 있다는 장점! --%>
	<jsp:include page="Second.jsp"></jsp:include>
	<h1>First</h1>
</body>
</html>