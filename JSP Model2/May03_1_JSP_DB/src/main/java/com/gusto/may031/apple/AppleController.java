package com.gusto.may031.apple;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AppleController")
public class AppleController extends HttpServlet {
// apple.jsp로 넘어가게 하는 controller
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AppleDAO.getAppledao().getAllApples(request); // 다쓰고 나서 마지막한줄 
		request.setAttribute("cp", "apple/apple.jsp");
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
