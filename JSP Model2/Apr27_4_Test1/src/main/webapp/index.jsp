<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
<link rel="stylesheet" href="css/hj.css">
</head>
<body>
	<table id="hjTbl">
		<tr>
			<th colspan="2">홀짝게임</th>
		</tr>
		<tr>
			<td align="center"><a href="HomeController?userAns=1"><img src="css/cat1.gif"></a></td>
			<td align="center"><a href="HomeController?userAns=0"><img src="css/cat1.gif"></a></td>
		</tr>
		
		<tr>
			<td class="td1" colspan="2" align="center"> ${c }</td>
		</tr>
		<tr>
			<td class="td1" colspan="2" align="center"> ${r }</td>
		</tr>
		<tr>
			<td class="td1" colspan="2" align="center"> ${t } ${w } ${l }</td>
		</tr>
	</table>

</body>
</html>