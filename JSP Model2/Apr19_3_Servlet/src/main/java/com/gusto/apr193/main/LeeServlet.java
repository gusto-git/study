package com.gusto.apr193.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LeeServlet")
public class LeeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 한글처리 방식
		// 		응답객체.setContentType("text.html; charset=UTF-8");
		//		응답객체.setCharacterEncoding("UTF-8"); << 더 자주쓴다.
		response.setCharacterEncoding("UTF-8");
		//	랜선에 붙어있는 응답용 빨대(PrintWriter)
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<head><title>첫번째Servlet</title></head>");
		pw.println("<body>");
		pw.println("<h1>안녕 디지몬!</h1>");
		pw.println("</body>");
		pw.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
