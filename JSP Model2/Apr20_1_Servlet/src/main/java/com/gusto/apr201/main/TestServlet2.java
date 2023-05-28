package com.gusto.apr201.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet2
 */
@WebServlet("/TestServlet2")
public class TestServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       // Internet 주소체계
	   // http, https://         		- 프로토콜(통신방식)
	   // IP주소 or Domain 주소  		- 컴퓨터 주소
	   // :port번호				 		- 80이면 생략이 가능
       //  /폴더명/폴더명/..../파일명   - 이쪽에다가 Client가 request
	   //  ? 							- 파라미터 넣기 위한 연결고리
	   // 변수명=값&변수명=값&...       - 요청 parameter(Client가 sserver에 request하는 것)
		
	
	   // Client -> internet의 원하는 곳으로 갈때
	   //  		1. 주소를 알고 있어서 직접 타이핑 하는 경우
	   //       2. 포털사이트에서 검색
	   //       3. 사이트 내부에서 클릭
	
	   //  변수명=값 > 
	   //  		값이 korean이면 한국어로 네 라는 말이 뜨게
	   //       값이 english면 영어로 yes라는 말이 뜨게 
	   //  네와 yes는 h1태그 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8"); // 서버가 어떤 인코딩 방식을 쓰는지
		// 변수명을 만드는 작업
		String language = request.getParameter("lang");
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<head><title>sayyes</title></head>");
		pw.println("<body>");
		pw.println("<h1>");
		if (language.equals("korean")) {
			pw.println("네");
		
		}else if (language.equals("english")) {
			pw.println("YES");
		}else {
			pw.println("몰라");
		}
		pw.println("</h1>");
		pw.println("</body>");
		pw.println("</html>");
		// 이렇게하면 끝나는게 아니라 주소창에 ?lang=korean 이런식으로 입력해야한다 	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	}
}
