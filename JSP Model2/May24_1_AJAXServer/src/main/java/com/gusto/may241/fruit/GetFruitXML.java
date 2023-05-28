package com.gusto.may241.fruit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GetFruitXML")
public class GetFruitXML extends HttpServlet { // 여기서 실행

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		String s = FruitDAO.getAllFruitXML(request);
		System.out.println(s);
		// web 상 syso 역할
		PrintWriter pw = response.getWriter();
		pw.print(s);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
