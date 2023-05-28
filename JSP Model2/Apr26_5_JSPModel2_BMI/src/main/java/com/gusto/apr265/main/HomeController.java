package com.gusto.apr265.main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// project : Apr26_5_JSPModel2_BMI

// MVC패턴을 사용한 JSP Model2로 BMI 프로그램만들기
// 0. servlet에서 실행(ctrl + f11) _> get방식 접속
// 1. table + form을 활용해서 BMI 검사(이름/키/몸무게/사진 -> 유효성검사 & CSS까지)
// 2. M에서 계산 BMI계산 -> JSP에서 표현이 가능하게  (객체 하나 만들어서 한번에 보내는 것도 가능)
// 3. POST방식으로 BMI 결과 페이지 .JSP 페이지 나오도록 

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("v1.html").forward(request, response); 
		// getRequestDispatcher로 url(주소값)으로 넘기고, request,response도 넘김
		// request : 요청 / response : 응답
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		M.calculate(request);
		request.getRequestDispatcher("BMIOutput.jsp").forward(request, response);
		
	}
}
