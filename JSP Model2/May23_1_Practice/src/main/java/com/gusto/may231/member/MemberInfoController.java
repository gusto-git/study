package com.gusto.may231.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gusto.may231.main.DateManager;


@WebServlet("/MemberInfoController")
public class MemberInfoController extends HttpServlet {

	// memberInfo.jsp로 이동하는 용도
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (MemberDAO.loginCheck(request)) { // 이게 true라면 로그인이 되어있다는 뜻
			DateManager.getCurYear(request); // cy채우는 부분 먼저 해줘야함
			request.setAttribute("cp", "member/memberInfo.jsp");
			
		}else {
			request.setAttribute("cp", "home.jsp");
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}
	
	// 정보 수정하는 용도
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (MemberDAO.loginCheck(request)) {
			MemberDAO.update(request);
			DateManager.getCurYear(request);
//			request.setAttribute("cp", "member/memberInfo.jsp");
			request.setAttribute("cp", "home.jsp");
			
		}else {
			request.setAttribute("cp", "home.jsp");
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
