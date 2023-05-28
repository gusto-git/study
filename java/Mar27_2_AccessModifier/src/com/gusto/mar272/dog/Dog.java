package com.gusto.mar272.dog;

// 접근제어자(Access Modifier)
// 멤버변수 or 클래스에서 사용
// 외부에서 (멤버변수나 클래스에) 접근하지 못하도록 제한하는 역할

public class Dog {
	// 접근 가능한 범위 
	public int a; // 접근 제한 없음
	protected int b; // 같은 패키지 안에서 혹은 다른 패키지라면 그 하위 클래스(Dog.class를 상속받아야 쓸수있다)
	/*default*/int c; // 같은 패키지 안에서 사용가능(default는 생략가능)
	private int d; // 클래스 내부에서만 o /  외부에서는 사용 x  / 가장 많이 사용한다***
}
