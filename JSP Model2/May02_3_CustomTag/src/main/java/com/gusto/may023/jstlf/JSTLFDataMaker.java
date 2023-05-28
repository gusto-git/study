package com.gusto.may023.jstlf;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

public class JSTLFDataMaker {
	public static void make(HttpServletRequest request) {
		int a = 123456789;
		request.setAttribute("a", a);
		
		double b = 10 / 24.0;
		request.setAttribute("b", b);
		
		double c = 123.456678;
		request.setAttribute("c", c);
		
		Date d = new Date();
		request.setAttribute("d", d);
		
		// arraylist에 과자 4~5개 넣기
		//	과자이름, 가격, 유통기한(현재날짜)
		// JSTLF.jsp 반복문 이용해서 과자이름 - 가격(원화/통화)- 날짜(날짜만 자세히 시간 x) 
		
		ArrayList<Snack> snacks = new ArrayList<Snack>();
		snacks.add(new Snack("초코파이", 5000, new Date()));
		snacks.add(new Snack("꼬북칩", 2000, new Date()));
		snacks.add(new Snack("몽쉘", 4600, new Date()));
		snacks.add(new Snack("빼빼로", 1200, new Date()));
		request.setAttribute("s", snacks);
		
		
	}
}
