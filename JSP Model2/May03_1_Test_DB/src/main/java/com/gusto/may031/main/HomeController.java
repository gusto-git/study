package com.gusto.may031.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gusto.may031.apple.AppleDAO;


@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	
	// HomeController 생성자 : 톰캣이 이 프로젝트를 처음 실행시킬 때 동작 
	public HomeController() {
		// 사과 데이터 총 갯수 가져오기
		AppleDAO.getAppledao().countApples();
	}
	
	// 메뉴 4개가 들어가는 공간을 만들고 , 구멍을 뚫어서 그 공간에 home.jsp 들어가게 만들기 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("cp", "home.jsp");	
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
