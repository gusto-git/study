package com.gusto.arp272.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// JSP Model2 활용
// 가위바위보 게임 웹페이지에서 가능하도록
// 디자인 (알아서)

// 		+ tomcat(WAS) 종료 전까지 전적 쌓이게 하기 -> 매판 진행할때마다 전적 보이도록 
//		

//현재 요청에 대한 매개변수가 존재하는지 확인하고, 존재하면 true 없다면 false 반환
		// 실행시 주소창에 매개변수가 있는지 없는지 파악하는 것 
		// 앞에 !를 붙여서 없다면 true , 있다면 false로 반환시켜 첫 접속시 매개변수가 없기 때문
		// 에 !를 붙여 없을시 true문장이 실행되도록 만들었다.

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		if (!request.getParameterNames().hasMoreElements()) {
			request.setAttribute("uh", "img/cat1.gif");
			request.setAttribute("ch", "img/cat1.gif");
		} else {
//			static이 아닐 떄 문제 :
//			get 방식 요청할때마다 새로운 엔진을 생성하고 있어서 숫자 누적이 불가능하다.
			//	해결책: 엔진을 하나로 통일! -> singleton pattern!
			// ** JSP Model 2할 때 M이 싱글톤 패턴인 경우가 매우 잦음!
//			RSPGameEngine rge = new RSPGameEngine(); static이 아닌걸 포기 할수없어서 이걸 바꿀예정
			RSPGameEngine rge = RSPGameEngine.getRge(); // singleton pattern 불러오기
			rge.doRSP(request);
		}
		request.getRequestDispatcher("rsp.jsp").forward(request, response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
