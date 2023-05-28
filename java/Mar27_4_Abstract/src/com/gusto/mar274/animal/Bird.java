package com.gusto.mar274.animal;

import com.gusto.mar274.bite.Bite;

// Bite class도 상속시키고 싶을때 : 클래스 끼리는 다중상속이 불가능하다. 클래스 : 클래스 / 1:1 상속만 가능하다.
// 하지만 방법이 있다. implements class 명으로 가능하다. 처음 사용하면 본 클래스에 빨간줄(에러가 뜬다)
// 클래스 + 인터페이스는 다중상속이 가능하다.
// 

public class Bird extends Animal implements Bite/*, fly, eat, .... 다중상속 가능*/{ 

	private int leg;
	
	public Bird() {
	}

	public Bird(String sort, int age, int leg) {
		super(sort, age);
		this.leg = leg;
	}

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(leg);
	}
	
	@Override  // 추상메소드를 쓰면 꼭 하위클래스에서 오버라이딩을 해줘야한다. ***
	public void roar() {
		System.out.println("짹짹");
	}
	
	@Override
	public void bite() {
		System.out.println("새는 부리로 사람을 찢어");
		
//		저 좀전에 그 bite 쪽에 abstract void 만들어놨어서 Bird쪽에도 bite 오버라이드 한건가요
		
	}
	
}
