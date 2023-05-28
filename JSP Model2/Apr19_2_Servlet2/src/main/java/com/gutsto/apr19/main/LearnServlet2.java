package com.gutsto.apr19.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet = Server + Applcation
// 자바 서블릿(Servlet)은 자바를 사용하여 웹페이지를 동적으로 생성하는 서버측 프로그램을 의미
// 자바코드안에 HTML을 포함하고 있는 것 


//@ XXX: Annotation은 본래 직접 사용자가 구현해야 하나, 자동처리가 가능하도록 함
@WebServlet("/LearnServlet2")
// HttpServlet클래스에 있는 기능으로(요청받으면 응답하는기능)을 상속 받음 : extends
// 필요에 따라 기능을 추가 할 수 있다.
public class LearnServlet2 extends HttpServlet { // 클래스명을 변경하게 되면 에러가 발생하며, 반드시 @WebServlet의 이름도 변경해야함
	// 작업 시 버전을 표시하기 위한 구문으로 생략 및 삭제해도 무방하다.
	private static final long serialVersionUID = 1L;
    // 기본생성자로 사용할 일이 많지 않아 생략 및 삭제해도 무방하다.
	// LearnServlet의 객체를 만드는 것은 Tomcat의 역할이기 때문에 굳이 사용자가 만들지 않아도 된다.
    public LearnServlet2() {
        super();
    }
	// event-driven-programming(이벤트 기반 프로그래밍)
    // 		Tomcat 실행 -> LearnServlet 실행 -> Tomcat LearnServlet 객체를 생성 및 무한루프
    //		-> 이벤트 발생 시 처리 후 루프로 복귀
    
    //	*** 핵심부분 2가지(doGet / doPost)
    // 		루프를 돌다가 클라이언트가 Servlet으로 GET방식 요청시  Tomcat이 doGet 메소드 호출
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				response.getWriter().append("Served at: ").append(request.getContextPath()); // 생략해도 무관
	}

	// 		루프를 돌가가 클라이언트가 Servlet으로 POST방식 요청시 Tomcat이 메소드를 자동으로 호출
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);// 생략해도 무관
	}

}
