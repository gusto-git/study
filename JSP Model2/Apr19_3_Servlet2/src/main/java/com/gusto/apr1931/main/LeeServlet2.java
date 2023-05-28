package com.gusto.apr1931.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LeeServlet2")
public class LeeServlet2 extends HttpServlet {
	// 한글 처리방식 2가지
	//	응답객체.setContentType("text.html; charset="UTF-8");
	//	응답객체.setCharacterEndcoding("UTF-8");
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		response.setCharacterEncoding("UTF-8");
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<head><title>세번째</title></head>");
		pw.println("<body><h1>안녕굳굳<h1></body>");
		pw.println("</html>");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
	}

}
