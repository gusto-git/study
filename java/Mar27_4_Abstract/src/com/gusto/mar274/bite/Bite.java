package com.gusto.mar274.bite;

// 클래스 : 멤버변수 + 메소드 가능  -> 객체 생성이 가능하다.
// 추상 클래스 : 멤버변수 + 메소드 + 추상메소드 가능 -> 객체 생성이 불가능하다.
// 인터페이스 : 추상메소드 + 멤버상수 가능 -> 객체 생성이 불가능하다.



public interface Bite {

// private String a; 멤버변수 선언 불가능
	public static final int b = 0; // 멤버상수는 가능
// public void c () {
//     System.out.println("c");
//	} 불가능하다.
	
	public abstract void bite(); // 가능하다.
	
	
	
}
