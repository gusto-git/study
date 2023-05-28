package com.gusto.mar291.main;

// Wrapper Class : (자료형) 기본형들의 객체화 
//		Integer, Long, Double, Boolean, Void..
//		기본 자료형들을 객체로 다루기 위해서 만들어진 Class
//		기본형 밖을 포장하는 방식

// Boxing : 기본형을 wrapper class로 바꾸는 것
// unBoxing : wrapper class를 기본형으로 바꾸는 것

// 사용 시기
// 1. 객체나 클래스가 제공하는 Method 사용할 때
// 2. 클래스가 제공하는 상수를 사용(MIN_VALUE, MAX_VALUE, ...)
// 3. 숫자, 문자들을 서로 형변환할 때 *** 


public class WMain {
	public static void main(String[] args) {
		int a = 10;
		String a1 = "100";
		
		Integer b = new Integer(a1); // int로 바꾸기 위해 integer 사용
		b.intValue(); // Integer 객체에서 int형 값을 뽑아내는 메소드 
		System.out.println(b);
		System.out.println(b.TYPE);
		
		// 기본형 > 객체형
		double c = 123.456;
		Double d = new Double(c);
		System.out.println(d.TYPE);
		
		// 객체형 > 기본형
		Boolean e = new Boolean(true);
		boolean f = e.booleanValue();
		
		// 객체형 > 기본형 : 위의 과정을 자동으로 해주는 기능 : Auto-Unboxing
		Integer g = 10;
		
		// 기본형 > 객체형 : 위의 과정을 자동으로 해주는 기능 : Auto-boxing
		int h =g;
		
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		int min = Integer.MIN_VALUE;  // 같다 System.out.println(Integer.MIN_VALUE);
		System.out.println(min);
		
		// int 자료형 값을 String(문자열)로 바꾸는 방법
		String num1 = Integer.toString(321); // 321이 문자열인 321로 변경된다.
		// int 자료형 값을 Binary(2진수)로 바꾸는 방법 
		String num2 = Integer.toBinaryString(5);
		System.out.println(num2);
		
		// 문자열 - 기본형으로 형변환(다이렉트는 힘득들고, 객체형을 거쳐야)
		String ss = "345.67";
		Double ss1 = Double.parseDouble(ss); // 여기까지만 해도 충분히 double로 받아들인다 , Warrper 클래스
		Double ss2 = ss1.doubleValue(); // 생략가능하다. / 기본형이다.
		System.out.println(ss1);
		System.out.println(ss2);
		
		// 가장 많이 쓴다. 
		String sss = "123";
		int sss1 = Integer.parseInt(sss); // parse는 문자열을 parse 뒤에 붙는걸로 바꿔주는역할
		System.out.println(sss1);
	}
	
	
}
