package com.gusto.apr272.main;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

public class NBGameEngine {
	// 누적되어야 하는 것 -> 몇번만에 정답을 맞췄는지, 정답
	
	private int t;
	private String answer;
	
	private static final NBGameEngine NGE = new NBGameEngine();
	
	public NBGameEngine() {
		// TODO Auto-generated constructor stub
	}
	
	public static NBGameEngine getNge(){
		return NGE;
	}
	
	public void pickAns() { // 처음 접속해서 게임 시작할 때만 필요하다.
		int a = new Random().nextInt(976) + 12;
		String ans = String.format("%03d", a);
		
			if (ans.charAt(0) == ans.charAt(1)
				|| ans.charAt(1) == ans.charAt(2)
				|| ans.charAt(2) == ans.charAt(0) ) {
				
				pickAns(); // if문 안에서 다시 pickAns를 불러오는 무한 문이라서 
				return; // return을 아무것도 안쓰면 멈추게 break 역할을 대체해서 해준다. 기존에 하던 method 빠져 나와서 새로운 method 실행하기 위함 
			}
			this.answer = ans; // 정답을 맞출때까지 유지되게 만드는것, 중복이없으면 여기 실행 , 있으면 위에 실행
			System.out.println("정답 : " + ans);
		}
	
	public void doNB(HttpServletRequest request) {
		String userAns = request.getParameter("userAns"); // jsp파일에 있는 "userAns"의미
		request.setAttribute("ua", "유저의 답 : " + userAns);
		int strike = 0;
		int ball = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (userAns.charAt(i) == answer.charAt(j)) {
					if (i == j) { // 자릿수 까지 같다면
						strike++;
						
					}else {
						ball++; // 자릿수가 다르면
					}
				}
			}
		}
		 t++;
		 request.setAttribute("t", t + "번째 시도!");
		 request.setAttribute("s", "s : " + strike);
		 request.setAttribute("b", "B : " + ball);
		 
		 if (strike == 3) {
			String result = "정답!" + answer + " 이었습니다~";
			t = 0;
			request.setAttribute("r", result);
			request.setAttribute("ua", null);
			request.setAttribute("s", null);
			request.setAttribute("b", null);
			request.setAttribute("btn", "<button onclick='goHome()'>다시시작</button>");
			request.setAttribute("cmt", "<h1>좀 하는데요?</h1>");
			
		}
	}
}
