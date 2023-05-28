package com.gusto.apr203.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.print.DocFlavor.STRING;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.IntrospectionUtils;


@WebServlet("/Output")
public class Output extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String id = request.getParameter("ID");
		String pw = request.getParameter("PW");
		String gender = request.getParameter("GD");
		String location = request.getParameter("LC");
		String[] hobby = request.getParameterValues("HB"); // []는 벨류스
		String introduce = request.getParameter("IND");
//		System.out.println(introduce);
		// Web page에서 엔터 : <br>
		// textarea에서 엔터 : \r\n
		introduce = introduce.replace("\r\n", "<br>");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>회원가입 결과</title></head>");
		out.println("<body>");
		out.println("<h1>회원가입 결과</h1>");
		out.printf("<h2>ID: %s</h2>", id);
		out.printf("<h2>PW: %s</h2>", pw);
		out.printf("<h2>성별: %s</h2>", gender);
		out.printf("<h2>지역: %s</h2>", location);
		if (hobby != null) {
			out.print("<h2>취미: ");
			for (String s : hobby) {
				out.print(s + "  ");
			}
			out.print("</h2>");
		} else {
			out.print("<h2>취미 : 선택안함</h2>");
		}
		out.printf("<h2>자기소개 : %s<h2>", introduce);
		
		out.println("</body>");
		out.println("</html>");
	}

}
