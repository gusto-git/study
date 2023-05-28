<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>input.jsp</title>
</head>
<body>
	<form action="CalcController" name="CalcForm" onsubmit="return calcCheck();">
	<table id="calcTbl">
			<tr>
				<td align="center">
					<label>X : </label>
					<input placeholder="x" autofocus="autofocus" autocomplete="off" name="x">
				</td>
			</tr>
			<tr>
				<td align="center">
					<label>Y : </label>
					<input placeholder="y" autocomplete="off" name="y">
				</td>
			</tr>
			<tr>
				<td>
				<button>입력</button>
				</td>
			</tr>
		</table>
	
	</form>
</body>
</html>