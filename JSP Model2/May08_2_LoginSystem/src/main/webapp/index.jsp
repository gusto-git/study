<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
</head>
<body>
	<h1>index.jsp</h1>
	<%-- ID와 PW입력하는 칸 있고 버튼 클릭하면 나오게 --%>
	<%-- button을 클릭하면 LoginController로 넘어가서 거기서 index.jsp가 뜨게--%>
	
	<form action="LoginController" method="post">
		ID: <input name="id" value="${cookie.lastLoginId.value }"><p>
		PW: <input name="pw"><p>
		<button>입력</button><p>
	</form>
	
</body>
</html>