package com.gusto.may031.apple;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AppleDetailController")
public class AppleDetailController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 상세정보 받는 method true가 리턴되면 -> detail.jsp
		// 그렇지 않다면(false)라면 apple.jsp
		
		if (AppleDAO.getAppledao().getAppleDetail(request)) { // true가 리턴되면
			request.setAttribute("cp", "apple/detail.jsp");
		} else {
			AppleDAO.getAppledao().getApples(1, request);
			request.setAttribute("cp", "apple/apple.jsp");
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 만약에 true가 return되면 게시판 첫페이지
		// flase가 return 되면 home.jsp
		if (AppleDAO.getAppledao().update(request)) {
			AppleDAO.getAppledao().getApples(1, request);
			request.setAttribute("cp", "apple/apple.jsp");
			
		} else {
			request.setAttribute("cp", "home.jsp");
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

}
