package com.gusto.may231.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gusto.may231.main.DateManager;


@WebServlet("/SignUpController")
public class SignUpController extends HttpServlet {

	// 회원가입창 이동하는 용도
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDAO.loginCheck(request);
		DateManager.getCurYear(request); // 현재 년도 뽑고나서 signup.jsp 틀기 / 순서 중요
		
		request.setAttribute("cp", "member/signup.jsp");
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	// 회원가입 하는 용도 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDAO.signUp(request);
		MemberDAO.loginCheck(request); // lp 채우기
		request.setAttribute("cp", "home.jsp"); // cp 채우기
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
		
	}

}
