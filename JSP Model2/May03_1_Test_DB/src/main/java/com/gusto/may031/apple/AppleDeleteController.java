package com.gusto.may031.apple;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AppleDeleteController")
public class AppleDeleteController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 데이터 삭제
		AppleDAO.getAppledao().delet(request);
		// 페이지 1페이지로 가게 
		AppleDAO.getAppledao().getApples(1, request);
		// cp에는 apple.jsp
		request.setAttribute("cp", "apple/apple.jsp");
		// 전체 배경은 index.jsp
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
