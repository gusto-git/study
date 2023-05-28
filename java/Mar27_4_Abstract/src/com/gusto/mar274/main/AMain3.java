package com.gusto.mar274.main;

import com.gusto.mar274.avengers.Avengers;
import com.gusto.mar274.avengers.Ironman;

// 다형성(Polymorphism)
// 		상위타입 변수에 하위타입 객체 담는 것이 가능! 즉, 아이언맨이 하위 타입이라 어벤져스가 아이언맨을 담을 수 있따.
//		모양은 같지만 다른 기능이 가능(오버라이딩과 밀접한 관련이 있다)


public class AMain3 {
	public static void main(String[] args) {
		// 아이언맨을 담는 그릇 i에 아이언맨 하나를 만들어 넣음
		Ironman i = new Ironman("스타크", 12, 32154);
		i.printInfo();
		
		// 어벤져스를 담는 그릇 a에 아이언맨 하나 만들어 넣음
		Avengers a = new Ironman("스타크", 21, 321654);
		a.printInfo();
	}
}
