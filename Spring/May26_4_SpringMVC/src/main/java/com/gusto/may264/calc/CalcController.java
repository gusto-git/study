package com.gusto.may264.calc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// 이게 있어야 컨트롤러 역할을 한다.
@Controller
public class CalcController {
	
	// 1. JSP 스타일 - 파일업로드, 날짜, ... -> Spring 한다고 거르기 없기
//	@RequestMapping(value = "/calculate.do", method = RequestMethod.GET)
//	public String calcXY(HttpServletRequest req) { 
//			int x = Integer.parseInt(req.getParameter("x"));
//			int y = Integer.parseInt(req.getParameter("y"));
//			
//			System.out.println(x);
//			System.out.println(y);
//			
//			return "index";
//		}
	
	// GET방식 요청파라미터(주소) 한글처리
	// : tomcat설정(server.xml)
	// 자동으로 인코딩 할 때 적용할 방법을 server.xml 63번 줄에
	//	URIEncoding="UTF-8"
	
	// POST방식 요청파라미터(서버내부에)한글처리
	//	:프로젝트마다 설정
	//	JSP: 파라미터 값 읽기전에 req.setCharacterEncoding("UTF-8");
	
	// 2. Spring스타일(old .. 잘안씀)
	@RequestMapping(value = "/calculate.do", method = RequestMethod.GET)
	public String calcXY(
			@RequestParam(value="n") String name,
			@RequestParam(value="x") int x,
			@RequestParam(value="y") int y) { 
			
		System.out.println(name);
		System.out.println(x);
		System.out.println(y);
			
			return "index";
		}
}
