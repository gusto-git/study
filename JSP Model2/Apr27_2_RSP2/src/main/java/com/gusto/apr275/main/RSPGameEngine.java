package com.gusto.apr275.main;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

public class RSPGameEngine {
	private int t; // 턴
	private int win; // 승리
	private int draw; // 무승부
	private int lose; // 패배 
	
	// 싱글턴 패턴(Singleton pattern)을 따르는 클래스는, 생성자가 여러 차례 호출되더라도 실제로 생성되는 객체는 하나이고
	// 최초 생성 이후에 생성자는 최초의 생성자가 생성한 객체를 리턴한다.
	
	// 상수화
	private static final RSPGameEngine rge = new RSPGameEngine(); 
	
	private RSPGameEngine() {
	}
	// getRge를 통해서만 생성이 가능하도록 만듬
	public static RSPGameEngine getRge() {
		return rge;
	}
	
	
	public void doRsp(HttpServletRequest request) {
		// 유저가 가위, 바위, 보 중 뽑기
		// "userHand"는 html에서 사용자의 요청(가위,바위,보)중에 고른것을 int userHand로 옮겨줌
		// userHand라는 변수에 담은 값을 다시 HomeController로 보낸다.
		// "uh"라는 이름으로 
		int userHand = Integer.parseInt(request.getParameter("userHand"));
		request.setAttribute("uh", "img/" + userHand + ".png");
		
		int comHand = new Random().nextInt(3) + 1;
		request.setAttribute("ch", "img/" + comHand + ".png");
		
		// 판정
		int result = userHand - comHand;
		if (result==0) {
			request.setAttribute("r", "무");
			draw++;
		}else if (result==-1 || result == 2) {
			request.setAttribute("l", "패");
			lose++;
		}else {
			request.setAttribute("r", "승");
			win++;
		}
		t++;
		
		request.setAttribute("t", t);
		request.setAttribute("w", win);
		request.setAttribute("d", draw);
		request.setAttribute("l", lose);
		
		
	}
}
