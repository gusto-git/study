<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome!</h1>
	<table id="welcomTbl">
		<tr class="WelcomTr1">
			<td rowspan="2" class="WelcomTd1"><img src="img/${sessionScope.loginMember.m_photo }"></td>
			<td class="WelcomTd2">${sessionScope.loginMember.m_id }</td>
		</tr>
		<tr class="WelcomTr1">
			<td align="center" colspan="2" class="WelcomTd2">${sessionScope.loginMember.m_name }님</td>
		</tr>
		<tr>
			<td align="center" colspan="2" class="WelcomTd2">어서오세요</td>
		</tr>
		<tr>
			<td align="center" colspan="2" class="WelcomTd3">
				<button onclick="memberInfoGo();">내정보</button>
				<button onclick="logout();">로그아웃</button>
			</td>
		</tr>
		
	</table>
	
	
</body>
</html>