package com.gusto.mar274.main;

import com.gusto.mar274.avengers.Avengers;
import com.gusto.mar274.avengers.Ironman;

// ������(Polymorphism)
// 		����Ÿ�� ������ ����Ÿ�� ��ü ��� ���� ����! ��, ���̾���� ���� Ÿ���̶� ������� ���̾���� ���� �� �ֵ�.
//		����� ������ �ٸ� ����� ����(�������̵��� ������ ������ �ִ�)


public class AMain3 {
	public static void main(String[] args) {
		// ���̾���� ��� �׸� i�� ���̾�� �ϳ��� ����� ����
		Ironman i = new Ironman("��Ÿũ", 12, 32154);
		i.printInfo();
		
		// ������� ��� �׸� a�� ���̾�� �ϳ� ����� ����
		Avengers a = new Ironman("��Ÿũ", 21, 321654);
		a.printInfo();
	}
}
