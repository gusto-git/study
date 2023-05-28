package com.gusto.apr201.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test1")
public class Test1 extends HttpServlet {
	// GET 방식 요청(기본)
	//	주소를 알고 있으면 직접 타이핑해서 URL 접속이 가능하다.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// <h1>태그를 이용해서 text 부분에 '목요일 아침입니다!'출력
		response.setCharacterEncoding("UTF-8");
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<head><title>목요일 아침!</title></head>");
		pw.println("<body>");
			for (int i = 0; i < 5; i++) {
				pw.println("<marquee><h1>목요일아침입니다</h1></marquee>");
			}
		pw.println("</body>");
		pw.println("</html>");
	}
	// POST방식 요청 받으면 FROM접속
		//		프로그램을 통해서만 가능(회원가입, 비밀번호 입력, 이미지 전송 등..) -> 보안이 필요할 경우 사용
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
