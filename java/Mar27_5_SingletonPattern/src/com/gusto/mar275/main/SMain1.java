package com.gusto.mar275.main;

import java.util.Calendar;


import com.gusto.mar275.human.Human;

//패턴프로그래밍(Pattern Programming)
// 		 singleton Pattern(싱글턴패턴)
//	: 클래스가 최초 한번만 메모리 할당 하고(static), 그 메모리에 객체를 만들어 사용하는 디자인, 생성자를 여러번 호출해도 실제 생성된 객체는 하나

// 한번의 객체 생성으로 재사용이 가능 >> 메모리 아낄 수 있다. 

// Database Connection Pool
// Spring : Singleton pattern 하기 편하게 만든 프로그램



public class SMain1 {
	// 원하는 객체 하나 생성(자유)
	//		이름, 나이, 별명
	//		출력
	
	public static void main(String[] args) {
		// main에서 객체 못 만들게 private으로 lock
		// Human h = new Hunman();
		Human h = Human.getHuman();
		h.printInfo();
		System.out.println(h);
		System.out.println("==============");
		
		Human h1 = Human.getHuman();
		h1.printInfo();
		System.out.println(h1);
		System.out.println("==============");
		
		Calendar cal = Calendar.getInstance(); 
		System.out.println(cal.getTimeZone());
		
		
		
		
		
		
		
		
		
//		같은 값을 저장해도 주소값은 다르다.		
//		Human h = new Human("에릭센", 31, "maestro");
//		h.printInfo();
//		System.out.println(h);
//		System.out.println("==============");
//		Human h1 = new Human("에릭센", 31, "maestro");
//		h1.printInfo();
//		System.out.println(h1);
//		System.out.println("==============");

	}
}
