package com.gusto.mar274.main;

import com.gusto.mar274.animal.Bird;

public class AMain1 {
	public static void main(String[] args) {
		// 추상화(Abstraction) : 공통의 속성이나 기능을 묶어서 이름을 붙이는 것 / 추상적인 부분이라 이해가 힘들 수 도 있다.
		// Animal 클래스 : sort , age
		// Bird 클래스 : sort, age, leg
		
		Bird b = new Bird("새", 97, 2);
		b.printInfo();
		b.roar();
		b.bite();
		
		
		
		
	}
}
