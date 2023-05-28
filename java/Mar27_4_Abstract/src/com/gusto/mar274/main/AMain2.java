package com.gusto.mar274.main;

import com.gusto.mar274.avengers.Avengers;
import com.gusto.mar274.avengers.Ironman;

public class AMain2 {
	public static void main(String[] args) {
		
		// Avengers ��Ű�� -> Avengers Ŭ����
		// �̸�, ���� �Ӽ� -> printInfo();
		// �����ϱ� ���
		
		// Avenger�� ���� ��ӹ��� Ŭ�������� �𸣴� ���ο� ����� ���� Ŭ����
		 // �̰��� �͸� ���� Ŭ������� �Ѵ�.(anonymous inner class)
		
		// �͸� ���� Ŭ����(anonymous inner class)
		 // �� �ѹ��� ����ϰ� ���� ��
		Avengers a = new Avengers() { // �߰�ȣ ���� �κ��� Ŭ���� �κ��� �ȴ�.
			
			@Override
			public void attack() {
				System.out.println("�Ź��� �߻�"); // �ϳ��� ��ɸ� ���� �����ϴ�.
			}
		};
		a.printInfo();
		a.attack();
		System.out.println("========================");
		// ���̾���� ����� , �Ӽ� : ��� , ������ "��", �� o, ���� o 
		Ironman i = new Ironman("��Ÿũ",45 , 2354861);
		i.printInfo();
		i.attack();
		i.smoke();
		i.drive();
		
	}
}
