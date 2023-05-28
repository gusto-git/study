package com.gusto.may082.member;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Model

public class MemberDAO {
	// 로그인 기능(간략한 버전)
	
	public static void login(HttpServletRequest req, HttpServletResponse res) { // 쿠키쓰려면 response 필요
		try {
			req.setCharacterEncoding("UTF-8");
			
			// 파라미터 값 받아오기
			String id = req.getParameter("id");
			String pw = req.getParameter("pw");
			
			// 로그인이 성공한 유저 정보를
			//		사이트 어디에서든지 사용 가능(*로그인 정보를 Member 자바빈에 담았음)
			//		내가 설정한 시간이 지나면 로그인 상태 풀리도록(10초로 제한)
			
			if (id.equals("헬프") && pw.equals("me")) {
				Member m  = new Member(id, pw);
				req.getSession().setAttribute("m", m); // session 소속 attribute
				req.getSession().setMaxInactiveInterval(10);
			}
			
			// 한번 로그인에 성공했다면, 다음에 이 사이트에 들어왔을 때
			// <input>에 id는 남아 있었으면 -> pw만 입력하면되게
			// 접속을 끊어도 재부팅을 해도 지정 시간 안에 포함이 된다면 남아있도록 -> cookie
			Cookie c = new Cookie("lastLoginId", id);
			c.setMaxAge(60);
			res.addCookie(c);
			
		} catch (Exception e) {
			
		}
	}
	
	// 페이지를 여기저기 다닐텐데 => 로그인이 되어있는지 확인해야겠다.
	public static boolean loginCheck(HttpServletRequest req) {
		Member m = (Member) req.getSession().getAttribute("m");
		// 로그인이 유지 중이거나, 로그인이 성공했으면 41번 줄이 존재할것!
		return (m != null);
	}
	
}
