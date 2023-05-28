<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
		<th colspan="3">가위바위보</th>
		</tr>
		<tr>
			<td><a href="HomeController?userHand=1"><img src="img/1.png"></td>
			<td><a href="HomeController?userHand=2"><img src="img/2.png"></td>
			<td><a href="HomeController?userHand=3"><img src="img/3.png"></td>
		</tr>
		<tr>
			<td align='center'>나(↓)</td>
			<td align='center'>vs</td>
			<td align='center'>너(↓)</td>
		</tr>
		
		<tr>
			<td align='center'><img src="${uh }" style="max-width : 200px;"></td>
			<td align='center'>vs</td>
			<td align='center'><img src="${ch }" style="max-width : 200px;"></td>
		</tr>
		<tr><td colspan="3" align='center'>판정 :${r } </td></tr>
		<tr><td colspan="3" align='center'>${t }전${w }승${d }무${l }패</td></tr>
	
	</table>

</body>
</html>