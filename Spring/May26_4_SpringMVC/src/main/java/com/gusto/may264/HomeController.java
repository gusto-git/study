package com.gusto.may264;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// JSP Model 2 ----------
//		http://IP:PORT/프로젝트명/컨트롤러파일명
//		C : Servlet
//			상황판단 -> 흐름제어 담당
//			doGet(), doPost()를 활용
//			주소에 컨트롤러 파일명, 컨트롤러 파일 하나당 GET하나, POST하나 사용 가능 
//				-> 컨트롤러의 수가 점점 많아짐 

//	Spring MVC ----------
//		http://IP:PORT/top-level package 마지막자리/ 임의로 지정한 값/
//		C : 일반 클래스
//			일반 메소드
//			컨트롤러 하나에 여러개 요청 처리가 가능
//				-> 컨트롤러의 수가 많이 필요 없음! (패키지 나누는대로 하나씩만 만듬) : 패키지 별 1개 사용
@Controller
public class HomeController {

	// 사이트 첫 접속시 method : GET 방식 -> method = RequestMethod.GET
	// value = "/" : 첫 접속용 주소(http://IP:PORT/top-level package 마지막자리/ 의미)
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() { // return type = String 자료형이 기본 
		
		return "index"; // index.jsp로 포워딩해라~
	}
	
	// gusto.test라는 주소로 GET방식 요청이 들어오면
	// CONSOLE창에 ㄹㄹㄹ가 출력되도록 하는 메소드 
	@RequestMapping(value = "/gusto.test", method = RequestMethod.GET)
	public void testLalala() {
		System.out.println("ㄹㄹㄹ");
	}
	
	@RequestMapping(value = "/hahaha.test", method = RequestMethod.GET)
	public String testhahaha() {
		System.out.println("ㅎㅎㅎ");
		return "index";
	}
}
