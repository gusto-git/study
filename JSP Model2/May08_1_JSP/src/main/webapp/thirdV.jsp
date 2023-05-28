<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>thirdV.jsp</h1>
	<hr>
	<%-- firstC에서 받았던 parmeter a랑 b값 받아오기 --%>
	
	
	<!-- 값이 받아지지 않는다. -->
	a: ${param.a }<p>
	b: ${param.b }<p>
	c: ${c }<p>
	d: ${dd }<p>
	e: ${sessionScope.e } <!--  15초동안 아무것도 하지 않으면 값이 사라짐 -->

	
	<hr>
	<jsp:include page="${baby }"/>
	<%-- jsp:include 기능을 사용하고 있는데 무한 루프가 돈다?
		 원인 : include가 잘못된 페이지를 가져오거나, 없는 페이지를 include했을 때	
	--%>

</body>
</html>