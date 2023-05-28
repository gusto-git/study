package com.gusto.apr202.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 제목 : 사칙연산
	// 주소 : 파라미터로 x, y 값 받아서
	// 가장 큰 글씨를 만드는 태그를 이용해서 [사칙연산]
	// 주소에서 받은 x,y값을 가지고 덧셈, 뺄셈, 곱셈, 나눗셈을 테이블로 만들기
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		String x = request.getParameter("x");
		int xx = Integer.parseInt(x);
		
		String y = request.getParameter("y");
		int yy = Integer.parseInt(y);
		
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<head><title>사칙연산</title></head>");
		pw.println("<body>");
		pw.println("<h1>사칙연산<h1>");
		pw.println("<table border='1'>");
		pw.printf("<tr><td align='center'> %d + %d = %d </td></tr>", xx, yy, xx+yy);
		pw.printf("<tr><td align='center'> %d - %d = %d </td></tr>", xx, yy, xx-yy);
		pw.printf("<tr><td align='center'> %d * %d = %d </td></tr>", xx, yy, xx*yy);
		pw.printf("<tr><td align='center'> %d / %d = %.2f </td></tr>", xx, yy, xx/(double)yy);
		pw.println("</body>");
		pw.println("</html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
