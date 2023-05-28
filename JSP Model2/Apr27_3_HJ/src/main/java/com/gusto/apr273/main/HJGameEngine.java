package com.gusto.apr273.main;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

// M
// 		멤버변수 없으면(안만들어도 되면 ) : static 기반
//		멤버변수 필요하면 : singleton 패턴으로 작성

public class HJGameEngine {
	private int t;
	private int win;
	private int lose;
	
	private static final HJGameEngine hge = new HJGameEngine();
	
	private HJGameEngine() {
		// TODO Auto-generated constructor stub
	}
	
	public static HJGameEngine getHge() { //여기서 쓴거만 건드릴수있음
		return hge;
	}
	
	public void doHJ(HttpServletRequest request) {
		// 홀, 짝 클릭할 때 사용하는 parameter 받아오기 > userAns=1, userAnser=0
		
		int userAns = Integer.parseInt(request.getParameter("userAns"));
		
		// 동전 몇개를 가지고 할건지 
		int coin = new Random().nextInt(Integer.MAX_VALUE)+1;
		request.setAttribute("c", "동전: " + coin + " 개");
	
		// 홀짝 여부 판단하기
		String gameAns = (coin % 2 == 0) ? "짝" : "홀";
		request.setAttribute("r", "결과 : " + gameAns);
		
		// int 끼리 비교
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
