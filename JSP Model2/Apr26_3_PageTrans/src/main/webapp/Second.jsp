<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
		값
			Parameter
				html에서 만들어낸 값(a ,b)
				request에 저장
				String or String[] 값으로 받음
			attribute 
				java에서 만들어낸 값(c, d, e)
				request에 저장
				Object로 값을 받음
				
		이동
			first -> second : 사용자가 뭔가 액션을 취해서 넘어옴
				-> request(요청) 사용
				
			second -> third : 그냥 넘어가짐
				- redirect : 단순 자동이동(점검중) : 데이터 처리가 안된다
				response.sendRedirect("Third.jsp");
				
				- forward : 자동이동(값이 전달되는)
				RequestDispatcher rd = request.getRequestDispatcher("Third.jsp");
				rd.forward(request, response);
				
				- include : 포함(Sencond.jsp 속에 Third.jsp가 포함)
					위치조절이 안됨(Third가 무조건 상단에 들어옴) -> 비추!
					조만간! 위치조절이되는 include  알아볼 것
				RequestDispatcher rd = request.getRequestDispatcher("Third.jsp");
				rd.include(request, response);
	 --%>
	
	<%
		request.setCharacterEncoding("UTF-8");
		int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));
		
		// RequestDispatcher : 
		//	client(이용자)로 부터 들어온 요청을 원하는 쪽으로 넘기는 기능
		//	호출된 페이지에서는 request.setAttribute(key, value)
		//	넘겨받은 데이터 처리가 가능!
		//		-> redirect와는 다르게 (데이터 처리를 못하는 Redirect)
		//		 request, response 객체를 가지고 넘어가기 때문에 가능해진다.
		RequestDispatcher rd = request.getRequestDispatcher("Third.jsp");
		
		int c = a+b;
		request.setAttribute("c", c);
		
		String d = "ㅋ";
		request.setAttribute("d", d);
		
		Random e = new Random();
		request.setAttribute("e", e);
		
// 		rd.forward(request, response); third만 나온다
		rd.include(request, response); // third + second가 나온다.
		
		
	%>
	<h1>Second</h1>
	<hr>
	a : <%=a %><p>
	b : <%=b %><p>
	
</body>
</html>