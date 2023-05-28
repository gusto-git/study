<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>apple/detail.jsp</title>
</head>
<body>
	<%-- 상세보기 페이지에서 -> 수정 / 삭제 --%>
	<h1>Apple Information</h1>
	
	<!-- dao에서 쓴거와 같은 이름으로 name을 설정해줘야 값을 받을 수 있다. -->
	<form action="AppleDetailController" method="post" >
	지역 : <input readonly="readonly" value="${apple.a_location }" name="a_location"><p>
	색	: <input value="${apple.a_color }" name="a_color"><p>
	맛 : <input value="${apple.a_flavor }" name="a_flavor"><p>
	가격 : <input value="${apple.a_price }" name="a_price"><p>
	설명 : <textarea name="a_introduce">${apple.a_introduce }</textarea><p>	
	<button>수정</button>
	</form>
	<button onclick="deleteApple('${apple.a_location}');">삭제</button> <!-- go.js에서 추가작업 -->
</body>
</html>