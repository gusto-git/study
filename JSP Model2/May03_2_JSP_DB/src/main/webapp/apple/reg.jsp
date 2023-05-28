<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>apple/reg.jsp</title>
</head>
<body>
	<h1>사과 등록 게시판</h1>
	
	<form action="AppleRegController" method="post" name="appleRegForm" onsubmit="return appleRegCheck()">
		<table>
		 <tr>
		 <td>지역 : </td>
		 	<td>
		 		<input name="a_location" autofocus="autofocus" placeholder="지역 입력">
			 </td>
		 </tr>
		 <tr>
		 	<td>색 : </td>
		 	<td>
		 		<select name="a_color">
		 			<option>빨간색</option>
		 			<option>노란색</option>
		 			<option>연두색</option>
		 			<option>초록색</option>
		 			<option>황금색</option>
		 		</select>
		 	</td>
		 </tr>
		
		 <tr>
		 	<td>맛 : </td>
		 	<td>
		 		<select name="a_flavor">
		 			<option>단맛</option>
		 			<option>신맛</option>
		 			<option>떫은맛</option>
		 			<option>쓴맛</option>
		 			<option>무맛</option>
		 		</select>
		 	</td>
		 </tr>

		 <tr>
		 	<td> 가격: </td>
		 	<td><input name="a_price" autocomplete="off" placeholder="숫자만 입력">
		 </tr>
		 <tr>
		 	<td>설명 : </td>
		 	<td>
		 		<textarea name="a_introduce" maxlength="200" placeholder="5자 이상 100자 이하"></textarea>
		 	</td>
		 </tr>
		 <tr>
	 		<td colspan="2" align="center"><button>등록</button></td>
		 </tr>
		
		</table>
	</form>
</body>
</html>