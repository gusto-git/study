package com.gusto.apr271.main;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class Model {
	public static void multiply(HttpServletRequest request) {
		int x  = Integer.parseInt(request.getParameter("x")); // html에서 받아옴
		int y  = Integer.parseInt(request.getParameter("y"));
		int z = x * y;
		request.setAttribute("z", z);
		
		////
		Lee l = new Lee("hyeon", 100, 120, 50);
		request.setAttribute("ll", l);  // jsp로 보내기 위함
		
		ArrayList<Lee> lees = new ArrayList<Lee>();
		lees.add(l);
		lees.add(new Lee("이현석", 10, 132, 35));
		lees.add(new Lee("김길동", 16, 163, 26));
		lees.add(new Lee("박길동", 17, 116, 194));
		lees.add(new Lee("홍길동", 23, 177, 56));
		lees.add(new Lee("임현석", 25, 186, 87));
		request.setAttribute("ls", lees);
		
		
	}
}
