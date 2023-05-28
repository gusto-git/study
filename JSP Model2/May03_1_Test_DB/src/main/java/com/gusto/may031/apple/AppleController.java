package com.gusto.may031.apple;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// Controller는 기능마다 있어야 함! 

@WebServlet("/AppleController")
public class AppleController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//			AppleDAO.getAppledao().getAllApples(request);
			AppleDAO.getAppledao().getApples(1, request);
			request.setAttribute("cp", "apple/apple.jsp");
			request.getRequestDispatcher("index.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
