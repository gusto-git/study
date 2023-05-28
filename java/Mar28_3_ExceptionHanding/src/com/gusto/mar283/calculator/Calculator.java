package com.gusto.mar283.calculator;

public class Calculator {
// 		1. ���⼭ �����ϴ� ��� : try - catch - finally
// 		�����۵� : 7-8-9-14-15-16-10
//  	0:  7-8-9(Arith)-11-12-[14-15-16]-13 
	
	public static int divide(int price , int weight) {
		try {
			int d = price / weight;
			return d;
		} catch (Exception e) {
			System.out.println("����");
			return -999;
		} finally {
			System.out.println("�����������Ⱑ finally");
		} 
	}
	
// 		2. �̷�� : throws -> try catch���� �ַ��̴�.
//		divide2��� �޼ҵ带 �����ϴٰ� ArithmeticException�� ������
//		divide2�� ȣ���� �ʿ��� �ذ��϶� 
	
	public static int divide2(int price , int weight) throws /*Arithmetic*/ Exception{
		int d = price / weight;
		return d; 
	}
}
