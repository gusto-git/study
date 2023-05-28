package com.gusto.arp272.main;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

public class RSPGameEngine {
	private int t;
	private int win;
	private int draw;
	private int lose;
	
	private static final RSPGameEngine rge = new RSPGameEngine(); // 상수화 : 변수를 상수로 변환하여 그 값을 변경할 수 없도록 만드는 것
	// 인스턴스를 하나만 만들수 있도록 만드는것 
	
	//퍼블릭을 -> private로 변경
	private RSPGameEngine() {
		// TODO Auto-generated constructor stub
	}
	
	//getter 수동으로 작성
	public static RSPGameEngine getRge() {
		return rge;
	}
	
	public void doRSP(HttpServletRequest request) {
		// userHand
		// userHand=1 : 가위 - 1.png -> request.setAttribute("uh", "i.png");

		
		// parameter 만들기
		int userHand = Integer.parseInt(request.getParameter("userHand"));
		request.setAttribute("uh", "img/" + userHand + ".png"); // 1~3 바뀐다
		
		int comHand = new Random().nextInt(3) + 1;
		request.setAttribute("ch", "img/" + comHand + ".png");
		
		// 판정
		int result = userHand - comHand;
		if (result == 0) {
			request.setAttribute("r", "무");
			draw++;
		} else if (result == -1 || result == 2) {
			request.setAttribute("r", "패");
			lose++;
		} else {
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
