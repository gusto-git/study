package com.gusto.may231.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gusto.may231.board.BoardDAO;
import com.gusto.may231.member.MemberDAO;


@WebServlet("/HomeController")
public class HomeController extends HttpServlet {

	public HomeController() {
		BoardDAO.getBdao().countAllBoardMsg();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDAO.loginCheck(request); // 로그인 부분 불러오는것 
		request.setAttribute("cp", "home.jsp");
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
