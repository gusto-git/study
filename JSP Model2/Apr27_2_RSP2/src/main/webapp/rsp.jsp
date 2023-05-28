<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>rsp game</title>
</head>
<body>
	<table>
		<tr>
			<th colspan="3">가위바위보게임</th>
		</tr>
		<tr>
			<td align='center'><a href="HomeContorller2?userHand=1"><img src="img/1.png"></td>
			<td align='center' ><a href="HomeContorller2?userHand=2"><img src="img/2.png"></td>
			<td align='center'><a href="HomeContorller2?userHand=3"><img src="img/3.png"></td>
		</tr>
		<tr>
			<td align='center'>나(↓)</td>
			<td align='center'></td>
			<td align='center'>컴퓨터(↓)</td>
		</tr>
		<tr>
			<td align='center'><img src="${uh }" style="max-width : 200px;"></td>
			<td align='center'>VS</td>
			<td align='center'><img src="${ch }" style="max-width : 200px;"></td>
		</tr>
		<tr><td align='center' colspan="3">판정:${r }</td></tr>
		<tr><td align='center' colspan="3">${t }전${w }승${d }무${l }패</td></tr>
	
	</table>
</body>
</html>