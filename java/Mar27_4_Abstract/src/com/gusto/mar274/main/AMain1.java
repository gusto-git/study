package com.gusto.mar274.main;

import com.gusto.mar274.animal.Bird;

public class AMain1 {
	public static void main(String[] args) {
		// �߻�ȭ(Abstraction) : ������ �Ӽ��̳� ����� ��� �̸��� ���̴� �� / �߻����� �κ��̶� ���ذ� ���� �� �� �ִ�.
		// Animal Ŭ���� : sort , age
		// Bird Ŭ���� : sort, age, leg
		
		Bird b = new Bird("��", 97, 2);
		b.printInfo();
		b.roar();
		b.bite();
		
		
		
		
	}
}
