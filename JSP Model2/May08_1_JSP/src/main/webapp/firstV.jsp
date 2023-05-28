<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>firtV.jsp</title>
<script type="text/javascript">
	function gogogo() {
		location.href="SecondC?a=20&b=200";
	}
</script>
</head>
<body>
	<h1> firtV.jsp </h1>
	<%-- 
		사용자가 어떤 액션을 취했을 때 이동 : 요청
		1.<a> 태그를 써서 요청 : 클릭하면 GET방식 요청
		2.<div> & JS를 써서 : 이벤트를 추가했을 때 GET방식 요청
			(JS로 HTML 만드는게 가능 -> JS로 <FORM> 형식 만들어서 POST 요청하면 가능
		3. <form> + <button> : 버튼 클릭했을 때 GET/POST방식 요청
	 %>
	 
	<%-- <a>태그 통해서 a=10, b=100 으로 SecondC로 이동  --%>
	<a href="SecondC?a=10&b=100">SecondC</a>
	<%-- a= 20 , b= 200으로 JS--%>
	<div onclick="gogogo()">SecondC</div>
	<!-- form + button을 이용해서 Get방식 요청 -->
	<form action="SecondC">
		<input name="a"><p>
		<input name="b"><p>
		<button>SecondC</button>
	</form>
	
</body>
</html>