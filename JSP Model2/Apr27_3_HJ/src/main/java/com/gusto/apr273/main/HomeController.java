package com.gusto.apr273.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 숫자야구
//		3자리 숫자(백의자리 0이 가능), 중복숫자 x
// 입력하는 부분 - 
//		1. 숫자가 아닌 다른 문자는 입력하지 못하게 (값이 애초에 안넘어가도록)
//		2. 중복숫자 입력 -> 다시 입력하게
//		3. 무조건 3자리 숫자가 되도록!
//	시도 횟수, S , B
//	3S -> 정답 

// 컴퓨터가 세자리 숫자를 랜덤으로 뽑아서
// 사용자가 세자리 숫자를 맞추는 게임
// 숫자와 자릿수까지 맞으면 : 1S
// 숫자는 맞고 자릿수가 틀리면 : 1B

// 컴퓨터 : 012
// 사용자 : 012 -> 정답
// 사용자 : 120 -> 3B
// 사용자 : 032 -> 2S
// 사용자 : 031 -> 1S 1B 
// 팁 : 컴퓨터는 012가 되면 앞의 0을 인식하지 못한다 . 


@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (!request.getParameterNames().hasMoreElements()) {
			request.setAttribute("c", "동전의 갯수가 나올 자리입니다");
			request.setAttribute("r", "결과가 나올 자리입니다");
			request.setAttribute("t", "게임의 견적이  나올 자리입니다");
		} else {
			HJGameEngine.getHge().doHJ(request);
		}
		request.getRequestDispatcher("hj.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
