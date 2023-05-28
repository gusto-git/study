package com.gusto.apr271.main;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

public class HJGameEngine {
	private int t;
	private int win;
	private int lose;
	
	private static final HJGameEngine hge = new HJGameEngine();
	
	private HJGameEngine() {
		// TODO Auto-generated constructor stub
	}
	
	public static HJGameEngine getHge() {
		return hge;
	}
	
	public void doHJ(HttpServletRequest request) {
		int userAns = Integer.parseInt(request.getParameter("userAns"));
		
		int coin = new Random().nextInt(Integer.MAX_VALUE)+1;
		request.setAttribute("c","동전: " + coin + " 개");
		
		String gameAns = (coin % 2== 0) ? "짝" : "홀";
		request.setAttribute("r", "결과 : " + gameAns);
		
		if ((userAns) == (coin % 2)) {
			t++;
			win++;
		} else {
			t++;
			lose++;
		}
		request.setAttribute("t", t + " 전");
		request.setAttribute("w", win + " 승");
		request.setAttribute("l", lose + " 패");
		
		
	}
	
}
