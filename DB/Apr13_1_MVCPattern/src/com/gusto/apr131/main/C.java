package com.gusto.apr131.main;
// Controller - 높은 직급의 개발자
// 	상황판단 -> M or V를 소환
//	교통정리 -> 
public class C { // 3 : 
	public static void main(String[] args) { // 메인은 c에 사용 
		// v에서 받아온 리턴값 변수에 담아주기 -> M으로 값 이동이 가능
		int x = V.getX();
		int y = V.getY();
		
		int add = M.add(x, y);
		
		V.printResult(add);
		
		
	}
}
