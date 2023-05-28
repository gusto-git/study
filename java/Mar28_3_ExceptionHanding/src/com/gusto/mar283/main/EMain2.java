package com.gusto.mar283.main;

public class EMain2 {
	public static void main(String[] args) {
		// Exception 대표 3가지 소개
		
		// 1.NullPointerException
		//		객체 참조가 없는 상황 
		//		null 값이 있는 참조 변수로 .XXX()를 사용할 때 자주 발생
//		String s = null;
//		System.out.println(s.length()); // 대표적인 사례
		
		// 2.ArrayIndexOutOfBoundsException
		//		배열에서 인덱스의 범위를 초과하게 되는 상황에서 발생
//		int[] ar = {1, 2, 3};
//		System.out.println(ar[3]);
		
		// 3.NumberFormatException
		//		문자열(String) -> 숫자(int, double)로 바꾸는 상황에서
		//		변환할 수 없는 문자가 있을 때 발생한다
//		String s = "a12345";
//		int i = Integer.parseInt(s);
//		System.out.println(i + 20);
		
	}
}
