package com.gusto.mar275.main;

import java.util.Calendar;


import com.gusto.mar275.human.Human;

//�������α׷���(Pattern Programming)
// 		 singleton Pattern(�̱�������)
//	: Ŭ������ ���� �ѹ��� �޸� �Ҵ� �ϰ�(static), �� �޸𸮿� ��ü�� ����� ����ϴ� ������, �����ڸ� ������ ȣ���ص� ���� ������ ��ü�� �ϳ�

// �ѹ��� ��ü �������� ������ ���� >> �޸� �Ƴ� �� �ִ�. 

// Database Connection Pool
// Spring : Singleton pattern �ϱ� ���ϰ� ���� ���α׷�



public class SMain1 {
	// ���ϴ� ��ü �ϳ� ����(����)
	//		�̸�, ����, ����
	//		���
	
	public static void main(String[] args) {
		// main���� ��ü �� ����� private���� lock
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
		
		
		
		
		
		
		
		
		
//		���� ���� �����ص� �ּҰ��� �ٸ���.		
//		Human h = new Human("������", 31, "maestro");
//		h.printInfo();
//		System.out.println(h);
//		System.out.println("==============");
//		Human h1 = new Human("������", 31, "maestro");
//		h1.printInfo();
//		System.out.println(h1);
//		System.out.println("==============");

	}
}
