package com.gusto.apr271.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public HomeController() {
        super();
       
    }
    // 어떤 사이트에 첫 접속 : GET방식
    // 만약에 v1.html에서 버튼을 눌렀을 때 get방식을 써야한다면
    
    // 첫 접속 vs 버튼 눌렀을 때 : 요청 파라미터의 유무!(?x=10&y=20)
    // url: https://host주소/파일명?x=10&y=20
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청 파라미터가 없으면 -> 이 사이트의 첫 접속
		if (!request.getParameterNames().hasMoreElements()) {
			request.getRequestDispatcher("v1.html").forward(request, response); // 첫접속 home -> v1
		} else { // 요청 파라미터가 있으면 -> 이 사이트의 기능 활용을 GET방식으로 !
			Model.multiply(request); // MODEL.METHOD
			request.getRequestDispatcher("v2.jsp").forward(request, response);
		} 
		 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
