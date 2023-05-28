package com.gusto.may081.main;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// Model(M)

// 값
//		parameter(a,b)
//		atrribute(c)
//		값 이동시 사용 가능
//			ㄴ 새로운 요청이 또 일어나는 상황에서는 값 사용이 불가능
//		third까지 살아서 갈 수 있는 방법이 필요(현재 : Third쪽으로는 위의 요청들이 닿지 않음)
//			session 


//		- parameter
//			GET 	: 주소에 표시(컨트롤명?파라미터명=값&파라미터명=값&...)
//			POST	: 내부적으로 전달(컨트롤러명?파라미터명=값 << 안보임)

//			request 소속 : (M의 method에서 요청 parameter부를 때 파라미터에 req 추가)
//			값 읽기
//				Java : request.getParameter("파라미터명");
//				JSP(EL) : ${param.파라미터명 }

//		request 소속 attribute
//			Model에서 만든 값
//			Object 
//			request 소속

//			M에서 V로 값 보낼 때
//				request.setAttribute("어트리뷰트명", Java의 변수명);
//			값 읽기
//				Java : request.getAttribute("어트리뷰트명")
//				JSP(EL) : ${어트리뷰트명 }
/////////////////////////////////////////////////////////////////////////

// HTTP 프로토콜 특성이자 약점
//	1. Connectionless
//		client가 요청을 한 후에 응답을 받으면 연결이 끊김(한번 요청받고, 한번 응답받으면 끝남)
//	2. Stateless
//		통신이 끝나면 상태를 끊어버림

// 이 약점을 보완하기 위해서 쿠기/ 세션을 사용
// 쿠키(Cookie)
//		사용자가 상태 정보를 컴퓨터에 저장해뒀다가 나중에 참조
//		컴퓨터에 저장되어있는 정보를 자동으로 서버에 전송해줌
//		한번 시간을 설정해두면 브라우저의 종료 여부와는 상관없이 유지가 가능
//			-> ID/PW 저장하기, 쇼핑몰 장바구니, 팝업창(오늘 하루 보지 않기), ... 이럴때 쿠키를 많이 사용

//		Model에서 만든 값
//		String
//		기본 유지시간 - 24시간
//		사용자 컴퓨터에 저장 -> 요즘은 암호화해서 저장한다고는 함
//		보안상 위험한 편 -> 노출되면 위험해지는 정보는 쿠키에 저장하지 않는 것이 좋음

//		값 읽기
//			Java : 현재 사용자 컴퓨터에 만들어져있는 쿠키들 중에 해당 프로젝트꺼 찾아서 
//			JSP(EL) : ${cookie.이름.value } 

//	세션(Session)
//		쿠키를  기반으로 동작 BUT 사용자의 정보를 Server에서 관리
//		접속 시간을 설정 -> 일정시간 동안 응답이 없으면 정보를 삭제
//		쿠키보다는 보안성에서 더 좋음, 메모리 사용량이 크다는 단점 존재
//		동접자 수가 많으면 -> 서버 과부하 -> 성능 저하

//		session 소속 attribute
//		Model에서 만든 값
//		Object 
//		연결만 되어 있다면 어디에서든지 사용 가능!
//		유지시간 : 기본 30분, 설정가능
//			해당 시간동안 아무런 요청도 하지 않으면 자동으로 끊김

//		쿠키 : 정해놓은 시간이 만료되거나, 쿠키를 삭제하기 전까지는 유지
//		세션 : 만료되는 시간은 지정할 수 있으나, 브라우저가 종료되면 바로 삭제


public class M {
	public static void makeSecondDate(HttpServletRequest req, HttpServletResponse res) {
		// attribute
		int d = 3000;
		req.setAttribute("dd", d);
		
		// 세션
		int e = 40000;
		HttpSession hs = req.getSession(); // 사용자(client)와 서버간의 연결 상태 의미
		hs.setMaxInactiveInterval(15);// session의 유지시간을 15초로 설정 
		hs.setAttribute("e", e); // session 소속의 attribute 
		
		// 쿠키
		String f = "500000";
		Cookie ck = new Cookie("f", f);
		ck.setMaxAge(15); // 15초 동안 사용자 컴퓨터에 파일로 저장
		res.addCookie(ck); // 응답 객체에 쿠키를 추가 
	}
	
		
	
	public static void printSecondData(HttpServletRequest req) {
		int a = Integer.parseInt(req.getParameter("a"));
		int b = Integer.parseInt(req.getParameter("b"));
		int c = a+b; // parameter로 가져온 값을 계산
		req.setAttribute("c", c); // model에서 만든 값을 view에서 표현할 때 
								  // setAttribute를 사용
								  // view쪽에 "c"라는 el이 있느 곳(${c } )에 int c 값을 넣어라
								  // Controller에 M에서 만든 메소드 보내서 -> view에서 표현 가능
		
	}
}
