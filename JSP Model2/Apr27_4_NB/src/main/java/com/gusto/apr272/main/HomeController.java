package com.gusto.apr272.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HomeController")
public class HomeController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		if (!request.getParameterNames().hasMoreElements()) {
			NBGameEngine.getNge().pickAns();
		} else {
			NBGameEngine.getNge().doNB(request);
		}
		request.getRequestDispatcher("nb.jsp").forward(request, response); // jsp 첫 연결 이후 if문 사용 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
