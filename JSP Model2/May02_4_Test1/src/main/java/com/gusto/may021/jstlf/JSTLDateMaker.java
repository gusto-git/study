package com.gusto.may021.jstlf;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

public class JSTLDateMaker {
	public static void make(HttpServletRequest request) {
		int a = 123456789;
		request.setAttribute("a", a);
		
		double b = 10 / 24.0;
		request.setAttribute("b", b);
		
		double c = 123.1234;
		request.setAttribute("c", c);
		
		Date d = new Date();
		request.setAttribute("d", d);
	}
}
