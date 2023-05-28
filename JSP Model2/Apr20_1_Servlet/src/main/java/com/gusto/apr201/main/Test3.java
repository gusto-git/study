package com.gusto.apr201.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Test3")
public class Test3 extends HttpServlet {
	// 주소창에 몇단의 몇번째까지를 입력하면 -> 구구단을 테이블로
		// ?dan=3&to=10
		// 3 x 1 = 3
		// ...
		// 3 x 10 = 30 

		// 주소창을 건드려야할때 get
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
