package com.gusto.apr202.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Output")
public class Output extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		PrintWriter pw = response.getWriter();
		
		pw.println("<html>");
		pw.println("<head><title>이름</title></head>");
		pw.println("<body>");
		pw.println("<h1>OUTPUT - GET</h1>");
		pw.printf("<h1>%s</h1>",name);
		pw.println("</body>");
		pw.println("</html>");
	}

	// GET방식요청 VS POST방식요청
	// 	GET : 요청 파라미터가 주소에 있어서 우리가 눈으로 볼 수 있음
	// 	POST : 요청 파라미터가 주소에 없음, 내부적으로 정보를 전달 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); // 이거안하면 한글 깨짐
		response.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		PrintWriter pw = response.getWriter();
		
		pw.println("<html>");
		pw.println("<head><title>이름</title></head>");
		pw.println("<body>");
		pw.println("<h1>OUTPUT - POST</h1>");
		pw.printf("<h1>%s</h1>",name);
		pw.println("</body>");
		pw.println("</html>");
	}

}
