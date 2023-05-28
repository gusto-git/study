package com.gusto.apr264.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Controller : Servlet
//		ㄴ 상황판단해서 M/V 소환
//		이 사이트의 진입점!!(실행은 여기서!) -> CTRL+F11은 여기서

// Back-end 웹개발자 A-PL(Project Leader)
// 

@WebServlet("/C")
public class C extends HttpServlet {
	// 어떤 사이트를 접속
	//	1. 주소 직접입력
	//	2. 검색 -> <a> 눌러서
	//  	-> 둘 다 GET 방식 요청(어떤 사이트의 첫 진입은 무조건 GET방식)
	//			사이트에 POST로 첫 접속은 불가능!
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		RequestDispatcher rd = request.getRequestDispatcher("v1.html")
//		rd.forward(request, response);
		
		request.getRequestDispatcher("v1.html").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		M.add(request); // 계산을 해야 결과가 나옴
		request.getRequestDispatcher("v3.jsp").forward(request, response);
		
	}

}
