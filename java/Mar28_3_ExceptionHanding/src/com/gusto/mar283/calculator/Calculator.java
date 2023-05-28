package com.gusto.mar283.calculator;

public class Calculator {
// 		1. 여기서 정리하는 방법 : try - catch - finally
// 		정상작동 : 7-8-9-14-15-16-10
//  	0:  7-8-9(Arith)-11-12-[14-15-16]-13 
	
	public static int divide(int price , int weight) {
		try {
			int d = price / weight;
			return d;
		} catch (Exception e) {
			System.out.println("으엑");
			return -999;
		} finally {
			System.out.println("ㅋㅋㅋㅋ여기가 finally");
		} 
	}
	
// 		2. 미루기 : throws -> try catch보다 주력이다.
//		divide2라는 메소드를 실행하다가 ArithmeticException이 터지면
//		divide2를 호출한 쪽에서 해결하라 
	
	public static int divide2(int price , int weight) throws /*Arithmetic*/ Exception{
		int d = price / weight;
		return d; 
	}
}
