<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	Servlet : Java 안에서 html를 구현
	jsp : html에서 Java 구현
 -->
<%
response.setCharacterEncoding("UTF-8");
	String path = request.getServletContext().getRealPath("img");
	System.out.println(path);

MultipartRequest mr = new MultipartRequest(request, path, 30 * 1024 * 1024, "UTF-8",
		new DefaultFileRenamePolicy());
	String name = mr.getParameter("name");
	double height = Double.parseDouble(mr.getParameter("height"));
	double weight = Double.parseDouble(mr.getParameter("weight"));
	height /= 100;
	double bmi = weight / (height * height);

	String result = "저체중";
	if (bmi >= 40) {
		result = "고도비만";
	} else if (bmi >= 35) {
		result = "중등도비만";
	} else if (bmi >= 30) {
		result = "경도비만";
	} else if (bmi >= 25) {
		result = "과체중";
	} else if (bmi >= 18.5) {
		result = "정상";
	}
	
	// BMI 수치 -> 소주점 첫째 자리까지만 하고 싶을 때 (html로는 무리가 자바코드 쓰는 부분에서 해결)
	String bmi2 = String.format("%.1f", bmi);
	
	String image = mr.getFilesystemName("photo");
	image = URLEncoder.encode(image, "UTF-8");
	image = image.replace("+", " ");
%>
	<h1>BMI결과</h1>
	<h2>이름 : <%=name %></h2>
	<h2>키 : <%=height * 100 %></h2>
	<h2>몸무게 : <%=weight %></h2>
	<h2>BMI : <%=bmi2 %></h2>
	<h1>결과 : 당신은 <%=result %> 입니다.</h1>
	<img src="img/<%=image %>">
</body>
</html>











