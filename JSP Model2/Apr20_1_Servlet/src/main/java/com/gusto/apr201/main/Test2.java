package com.gusto.apr201.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class test2
 */
@WebServlet("/test2")
public class Test2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		
		String language = request.getParameter("lang");
		PrintWriter pw = response.getWriter();
		
		pw.println("<html>");
		pw.println("<head><title>sayYes</title></head>");
		pw.println("<body>");
		pw.println("<h1>");
			if (language.equals("korean")) {
				pw.println("네");
			} else if (language.equals("english")) {
				pw.println("yes");
			} else {
				pw.println("몰라");
			}
		pw.println("</h1>");
		pw.println("</body>");
		pw.println("</html>");
	}

//	값이 korean이면 한국어로 네 라는 말이 뜨게
//       값이 english면 영어로 yes라는 말이 뜨게 
//  네와 yes는 h1태그 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}
}
