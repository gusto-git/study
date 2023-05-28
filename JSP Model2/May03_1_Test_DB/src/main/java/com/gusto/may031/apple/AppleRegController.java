package com.gusto.may031.apple;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AppleRegController")
public class AppleRegController extends HttpServlet {
	// get 방식 : 등록할 수 있는 form이 있는 페이지로 넘어가는 기능 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("cp", "apple/reg.jsp");
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	// post 방식 : db에 사과 데이터 등록하는 기능 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// db등록
		AppleDAO.getAppledao().reg(request);
		
		// 게시판에 등록한 데이터도 나와야함
//		AppleDAO.getAppledao().getAllApples(request);
		AppleDAO.getAppledao().getApples(1, request);
		
		//등록이 완료된 후에 보여줄 페이지 결정
		// setAttribue("cp", "뭐가 나오게 할지")
		// 1. 등록한 후에 게시판이 보였으면 한다. -> apple/apple.jsp
		// 2. 등록한 후에 또 등록하게 하고싶다 -> apple/reg.jsp
		
		request.setAttribute("cp", "apple/apple.jsp");
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
		
		
		
		
	}

}
