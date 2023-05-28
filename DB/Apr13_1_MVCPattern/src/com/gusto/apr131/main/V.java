package com.gusto.apr131.main;

import java.util.Scanner;

// View - 디자이너
//	직접적으로 사용자 눈에 보임 -> 입/출력 
public class V { // 1 : V에서 리턴받은 값은 C를 거쳐서 M으로 간다.
	// X값 입력받는 메소드
	public static int getX() {
		Scanner k = new Scanner(System.in);
		System.out.print("x : ");
		int x = k.nextInt();
		return x; // M쪽으로 X값 보낼것
	}
	
	// Y값 입력받는 메소드
	public static int getY() {
		System.out.print("y : ");
		return new Scanner(System.in).nextInt(); // M쪽으로 Y값 보낼 것
	}
	
	// Z값 출력하는 메소드
	// M에서 계산한 값 받아와서 파라미터로 쓸 것
	public static void printResult(int z) {
		System.out.println(z);
	}
	
}
