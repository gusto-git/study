<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/nb.css">
<script type="text/javascript" src="js/GustoValidChecker.js"></script>
<script type="text/javascript" src="js/check.js"></script>
<script type="text/javascript">
	function goHome() {
		location.href="HomeController"; // 맞췄을 때만 사용하도록
		
	}
	
</script>
</head>
<body>
<form action="HomeController" name="nbForm" onsubmit="return check();">
	<table id="nbTbl" >
		<tr>
			<th>숫자야구</th>
		</tr>
		
		<tr>
			<td align='center'>
				<input id="ip" name="userAns" maxlength="3" autocomplete="off">
			</td>
		</tr>
		<tr>
			<td align='center' class = "td2">
				<marquee behavior="alternate">숫자만 3자리, 중복숫자 x</marquee>
			</td>
		</tr>
		<tr>
			<td align='center'>
				<button>확인</button>
			</td>
		</tr>
		<tr>
			<td align='center' class="td1">${ua }</td>
		</tr>
		<tr>
			<td align='center' class="td1">${s }</td>
		</tr>
		<tr>
			<td align='center' class="td1">${b }</td>
		</tr>
		<tr>
			<td align='center' class="td1">${t }</td>
		</tr>
		<tr>
			<td align='center' class="td1">${r }</td>
		</tr>
	</table>
	</form>
	
	<table id="finalTbl">
		<tr>
			<td align="center">
				<div align="center">${btn }</div>
			</td>
		</tr>
		<tr>
			<td>
				<div align="center">${cmt }</div>
			</td>
		</tr>
		
	</table>
	
	
	
</body>
</html>