<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberInfo.jsp</title>
</head>
<body>
	<table>
		<form action="MemberInfoController" method="post" enctype="multipart/form=data"
			name="updateForm" onsubmit="return updateCheck();">
			<tr>
				<td>
					<input value="${sessionScope.loginMember.m_id }" name="m_id" readonly="readonly">
				</td>
			</tr>
			<tr>
				<td>
					<input value="${sessionScope.loginMember.m_pw }" name="m_pw" placeholder="PW" maxlength="10" type="password" autocomplete="off">
				</td>
	 		</tr>
			<tr>
				<td>
					<input value="${sessionScope.loginMember.m_pw }" name="m_pwChk" placeholder="PW확인" maxlength="10" type="password" autocomplete="off">
				</td>
	 		</tr>
			<tr>
				<td>
					<input value="${sessionScope.loginMember.m_name }" name="m_name" placeholder="이름" maxlength="10" autocomplete="off">
				</td>
	 		</tr>
			<tr>
				<td>
					<input value="${sessionScope.loginMember.m_phone }" name="m_phone" placeholder="전화번호" maxlength="13" autocomplete="off">
				</td>
	 		</tr>
	 		
	 		<tr>
				<td> 생년월일<br> <!-- el 활용 -->
					<select name="m_y">
						<option>
							<fmt:formatDate value="${sessionScope.loginMember.m_birthday }" pattern="yyyy"/>
						</option>
						<c:forEach var="y" begin="${cy - 100 }" end="${cy }"> <!-- cy 현재 연도의미 -->
							<option>${y }</option>
						</c:forEach>
					</select> &nbsp;년&nbsp;&nbsp;
						
					<select name="m_m">
						<option>
							<fmt:formatDate value="${sessionScope.loginMember.m_birthday }" pattern="MM"/>
						</option>
						<c:forEach var="m" begin="1" end="12">
							<option>${m }</option>
						</c:forEach>
					</select> &nbsp;월&nbsp;&nbsp;
						
					<select name="m_d">
						<option>
							<fmt:formatDate value="${sessionScope.loginMember.m_birthday }" pattern="dd"/>
						</option>
						<c:forEach var="d" begin="1" end="31">
							<option>${d }</option>
						</c:forEach>
					</select> &nbsp;일&nbsp;&nbsp;
				</td>
			</tr>
			
			<tr>
				<td> 사진<br>
					<img src="img/${sessionScope.loginMember.m_photo }">
					<input name="m_photo" type="file">
				</td>
			</tr>
			<tr>
				<td align="center"><button>Sign Up</button></td>
			</tr>
			<tr>
				<td align="center"><button>정보수정</button></td>
		</form>
			<td align="center"><button onclick="bye();">회원탈퇴</button></td>
		</tr>
	</table>
	
</body>
</html>