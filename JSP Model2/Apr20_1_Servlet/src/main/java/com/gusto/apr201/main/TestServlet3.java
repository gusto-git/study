package com.gusto.apr201.main;

import java.awt.PrintGraphics;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet3
 */
@WebServlet("/TestServlet3")
public class TestServlet3 extends HttpServlet {
	// 주소창에 몇단의 몇번째까지를 입력하면 -> 구구단을 테이블로
	// ?dan=3&to=10
	// 3 x 1 = 3
	// ...
	// 3 x 10 = 30 

	// 주소창을 건드려야할때 get
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Client에게 server가 어떤 방식으로 인코딩할지
		response.setCharacterEncoding("UTF-8");
		// 인터넷 주소창에 들어갈 변수명 만들기(큰따옴표 안에 들어가는 것이 주소에 사용되는 변수명)
		String d = request.getParameter("dan");
		// 글자 > 숫자
		int dd = Integer.parseInt(d);
		String t = request.getParameter("to");
		int tt = Integer.parseInt(t);
//		int ttt = Integer.parseInt(request.getParameter("to"));
		
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<head><title>구구단</title></head>");
		pw.println("<body>");
		pw.println("<table border='1' width='100px'>");
		pw.printf("<tr><th>%d단</th></tr>",dd);
		for (int i = 1; i <=tt; i++) {
			pw.printf("<tr><td align='center'>%d x %d = %d </td></tr>", dd, i, dd*i);
		}
		pw.println("</table>");
		pw.println("</body>");
		pw.println("</html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
