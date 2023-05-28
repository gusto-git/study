package com.gusto.mar271.main;

// IMain1.java에서 쓰는 Scanner는 무조건 이것만 사용하겠다! 라는 의미
import com.gusto.mar271.machine.Scanner;

public class IMain1 {
	public static void main(String[] args) {
		// 객체를 만들 때 패키지명이 생략가능한 경우
		//		- 자바 기본 패키지(java.lang)소속, 상단에 import 안해도 되는것
		
		/* java.lang. 생략되어 있음 */ String s1 = "ㅋ"; 
		/* java.lang. 생략되어 있음 */System.out.println(s1);
		
		// 같은 패키지 소속일때도 생략가능
		/* com.gusto.mar271.main.*/Lee l = new /* com.gusto.mar271.main.*/ Lee();
		
		// 다른 패키지 소속일때 상단에 import가 생성된다.
		Scanner s = new Scanner(); 
		// 이렇게 작성해도 되지만 위 상단에 import가 있어서 생략이 가능하다.
		com.gusto.mar271.machine.Scanner s2 = new com.gusto.mar271.machine.Scanner();
	}
}
