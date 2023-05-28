package com.gusto.mar274.main;

import com.gusto.mar274.avengers.Avengers;
import com.gusto.mar274.avengers.Ironman;

public class AMain2 {
	public static void main(String[] args) {
		
		// Avengers 패키지 -> Avengers 클래스
		// 이름, 나이 속성 -> printInfo();
		// 공격하기 기능
		
		// Avenger로 부터 상속받은 클래스명은 모르는 내부에 만들어 놓은 클래스
		 // 이것을 익명 내부 클래스라고 한다.(anonymous inner class)
		
		// 익명 내부 클래스(anonymous inner class)
		 // 단 한번만 사용하고 버릴 때
		Avengers a = new Avengers() { // 중괄호 안쪽 부분이 클래스 부분이 된다.
			
			@Override
			public void attack() {
				System.out.println("거미줄 발사"); // 하나의 기능만 삽입 가능하다.
			}
		};
		a.printInfo();
		a.attack();
		System.out.println("========================");
		// 아이언맨은 어벤져스 , 속성 : 재산 , 공격은 "빔", 흡연 o, 운전 o 
		Ironman i = new Ironman("스타크",45 , 2354861);
		i.printInfo();
		i.attack();
		i.smoke();
		i.drive();
		
	}
}
