<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>j1_basic.jsp</title>
</head>
<body>
	HTML : 웹사이트 제작이 가능
	--------------------------- 디자인 / 이벤트 부족 : 못생기고, 정적인 것들만 사용가능
	HTML : 뼈대를 만들고
	CSS  : 디자인
	JavaScript : 이벤트 처리  
	--------------------------- 파라미터 읽기, 계산, 조건문, 반목문 : 프로그래밍언어쪽의 기능 부재
	Servlet : 클라이언트가 요청을 하면 
		-> HTML + CSS + JavaScript를 만들어서 응답해주는 Java 프로그램
	--------------------------- 어렵고, 작업이 불편하다
	JSP(Java Servlet/Server Page)
		-> 작업형태 : HTML + CSS + JavaScript에 필요한 부분마다 Java코드를 살짝 추가 
			실제정체 : Tomcat(Server)이 자동으로 Servlet으로 바꿔서 실행
			
	- Servlet : Java 코드 안에서 HTML을 구현
	- JSP : HTML 안에서 Java 코드를 추가 
	<!-- 둘다 사용 가능 --> 
	<%-- JSP 전용 주석 --%>
	<%-- 
		1. 스크립트릿(Scriptlet)
		JSP에서 Java코드를 실행할 때 사용하는 블록
		<% Java코드를 여기에 입력! %>
		
		2. 지시자
		특별한 지시를 내릴 수 있도록 하는 블록
		<%@ page/ include / taglib / ... %>
		
		3. 표현식
		어떤 값을 웹페이지에 출력 결과로 포함하고 싶을 때 사용하는 블록
		<%= 값/변수/계산식/... %>
		숫자, 문자열, 변수, ... 등의 값을 표현할 때
		Servlet의 pw.print()와 같은 기능
		
		4. 선언문
		표현식에서 사용할 수 있는 Java의 method를 작성할 때 사용하는 블록
		<%! 멤버변수 / method %>
		java의 method와 동일(이름 규칙도 동일)
		
		5. 주석(이 설명 감싼 형태가 주석)
	 --%>
	
</body>
</html>