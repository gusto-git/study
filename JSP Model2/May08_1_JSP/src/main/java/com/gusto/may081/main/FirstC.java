package com.gusto.may081.main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Controller
//	JSP 환경에서 상황 판단을
//	GET, POST 하기에는 Servlet이 적합
//		계산이 필요한 경우 : M(Model) 필요
//		뭔가 보여줘야 한다 : V(View) 필요
//	흐름 제어 

@WebServlet("/FirstC") // FirstC를 톰캣에 등록!
public class FirstC extends HttpServlet {
	// 이 프로젝트(JSP Model2)에는 main method가 존재하지 않음
	// 톰캣으로 실행(main은 톰캣에서) 알아서 FirstC객체를 만듬
	
	// 이 프로젝트가 처음 시작할 때
	public FirstC() {
		super();
		// 처음 실행했을 때 사과 데이터 총 개수를 받아오기 위해 이용했었음!
	}

	// 웹사이트의 페이지 전환 : C로 요청 -> M에가서 작업 -> V로 포워딩 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 사이트에 처음 들어오면 or FirstC로 요청 파라미터 하나도 없이 GET방식 요청하면
		if (!request.getParameterNames().hasMoreElements()) {
		request.getRequestDispatcher("firstV.jsp").forward(request, response);
		} 
		
//		firstv.jsp로 지금 일어난 요청을 제보해주는 객체 : rd
//		RequestDispatcher rd = request.getRequestDispatcher("firstV.jsp");
//		rd.forward(request, response);
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
