<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>calc/output.jsp</title>
</head>
<body>
	<h1 align="center">결과 확인</h1>
	<table id="outputTbl">
		<tr>
			<td align="center" class="resultTd">${param.x } + ${param.y } = ${a }</td>
		</tr>
		<tr>
			<td align="center" class="resultTd">${param.x } - ${param.y } = ${s }</td>
		</tr>
		<tr>
			<td align="center" class="resultTd">${param.x } x ${param.y } = ${m }</td>
		</tr>
		<tr>
			<td align="center" class="resultTd">${param.x } / ${param.y } = ${d }</td>
		</tr>
	</table>
</body>
</html>