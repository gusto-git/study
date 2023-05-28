package com.gutsto.apr19.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet = Server + Application
/**
 * Servlet implementation class LearnServlet
 */


// @xxx : Annotation
//		원래는 직접 다 구현했어야 했는데 -> 자동처리가 됨
@WebServlet("/LearnServlet") // LearnServlet을 Tomcat에 등록해라(지우면 실행 x , 클래스명과 동일 해야함)
public class LearnServlet extends HttpServlet { // 클래스명을 변경하면 실행이 안된다, @WebServlet의 이름도 같이 변경해야한다.
		// HttpServlet 클래스에 있는 기능(요청받으면 응답하기)을 상속받음 : extends
		// 뭔가 필요하면 추가를 할 수 있음!
	private static final long serialVersionUID = 1L;
		// 작업하면서 버전표시하라고 표현한 것 (지워도, 생략해도 무방)
    public LearnServlet() {
    	// 생성자 - 별로 쓸일이 많지는 않음(지워도 무방)
    	//		  - 이 LearnServlet 객체를 만드는 건  Tomcat의 역할이기 때문 
        super();
    }
    // event-driven-programming(이벤트 기반 프로그래밍)
    //	Tomcat이 실행중 -> LearnServlet을 실행
    //		-> Tomcat이 LearnServlet객체를 만들어서 무한루프
    //		-> 어떤 이벤트가 발생하면 그것을 처리하고 루프로 복귀
    
    // ** 핵심부분!!
    // 		루프를 돌다가 클라이언트가 이 Servlet으로 GET방식 요청하면
    //		Tomcat이 doGet 메소드를 자동으로 호출
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	//		루프를 돌다가 클라이언트가 이 Servlet으로 POST방식 요청하면
	//		Tomcat이 doPOST 메소드를 자동으로 호출
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
