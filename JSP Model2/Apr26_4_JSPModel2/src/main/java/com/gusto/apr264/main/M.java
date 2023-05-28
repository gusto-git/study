package com.gusto.apr264.main;

import javax.servlet.http.HttpServletRequest;

public class M {
	// Model : 일반 java class
	//	실제 업무(계산 , db작업)
	
	// back-end 개발자 B
	public static void add(HttpServletRequest request) { // 요청객체
		// html에서 받은 값을 가지고 와서 Java 변수에 넣은 것
		int x = Integer.parseInt(request.getParameter("x"));
		request.setAttribute("xx", x); // 앞이 jsp에서 쓸것, 뒤는 내가 java에서 만든 변수
		int y = Integer.parseInt(request.getParameter("y"));
		request.setAttribute("yy", y); // setattribute는 java에서 만든걸 jsp로 보낼때 
		int z = x+y; // java에서 만든것 -> jsp로 보내려면
		request.setAttribute("zz", z); // attribute로 "z"라는 자리에 변수 z값을 넣어라
	}
}
