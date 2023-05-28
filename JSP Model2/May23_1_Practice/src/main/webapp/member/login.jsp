<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member/login</title>
</head>
<body>
	<table id="loginTbl">
		<form action="LoginController" method="post" name="loginForm" onsubmit="return loginCheck();">
			<tr>
				<th>Login</th>
			</tr>
			<tr>
				<td align="center"><input name="m_id" placeholder="id" value="${cookie.lastLoginId.value }"></td>
			</tr>
			
			<tr>
				<td align="center"><input name="m_pw" placeholder="pw" type="password"></td>
			</tr>
			
			<tr>
				<td>
					<button >로그인</button>
		</form>
				<button onclick="signupGo();">회원가입</button>
			</td>
		</tr>
		
	</table>
</body>
</html>