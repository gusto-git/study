<%@page import="java.util.StringTokenizer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function getRandomColor() {
		// rgb(r255,g255,b255)
		// Math.random() -> 0.0~0.9999999
		// Math.random() * 255 -> 0.0 ~ 254.99999
		// Math.round(Math.random( ) * 255) -> 0 ~ 255
		
		let r = Math.round(Math.random( ) * 255);
		let g = Math.round(Math.random( ) * 255);
		let b = Math.round(Math.random( ) * 255);
		return "rgb("+ r +","+ g +","+ b +")";
	}
	
	function init(){
// 		alert(getRandomColor());
		let cv = document.getElementById("cv");
		let pen = cv.getContext("2d");
		// 다양한 색을 위해
		let x = null; 
		let y = null;
		
		setInterval(() => {
			pen.save();
			pen.fillStyle = "rgba(0,0,0,0.2)";
			pen.fillRect(0,0,500,500);
			
			pen.shadowOffsetX = 0;
			pen.shadowOffsetY = 0;
			pen.shadowBlur = 0;
			pen.shadowColor = "White";
			
			x = Math.random() * 500;
			y = Math.random() * 500;
			pen.fillStyle = getRandomColor();
			pen.fillRect(x, y, 20, 20);
			
			pen.restore();
		}, 200);
		
	}
</script>
</head>
<body onload="init();">
	<canvas id="cv" width="500px" height="500px"></canvas>
	<hr>
	<%
// 		response.sendRedirect("test.jsp"); // 점검이 끝나면 지우면 주석처리
		request.setCharacterEncoding("UTF-8");
		String num = request.getParameter("number");
		
		// split
		String[] numData = num.split(",");
		
		// 배열에 들어간 요소 하나하나 숫자로 형변환 -> 합
		int sum1 = 0;
		for(String n : numData){
			try {
				sum1 += Integer.parseInt(n);
			} catch(Exception e){
			}
		}
		
		// StringTokenizer
		StringTokenizer st = new StringTokenizer(num, ",");
		int sum2 = 0;
		while(st.hasMoreTokens())
			try {
				sum2 += Integer.parseInt(st.nextToken());
			} catch (Exception e){
				
			}
		
	%>
	<h3>합(Split) : <%=sum1 %></h3>
	<h3>합(StringTokenizer) : <%=sum2 %></h3>
	
	
</body>
</html>