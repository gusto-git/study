package com.gusto.may023.jstlc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JSTLCController")
public class JSTLCController extends HttpServlet {

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// 기본적으로 보여주는 페이지는 index.jsp
			// ${contentPage} 부분이 첫 접속일 땐 jstlc/input.jsp
			// 요청 파라미터가 있을땐 jstlc/output.jsp
		
		if (request.getParameterNames().hasMoreElements()) { // !가 없으면 요청파라미터가 있다는 듯 
			JSTLCDataMaker.make(request);
			request.setAttribute("contentPage","jstlc/output.jsp");
			
		} else {
			request.setAttribute("contentPage","jstlc/input.jsp");
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
