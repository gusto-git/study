package com.gusto.mar274.animal;

import com.gusto.mar274.bite.Bite;

// Bite class�� ��ӽ�Ű�� ������ : Ŭ���� ������ ���߻���� �Ұ����ϴ�. Ŭ���� : Ŭ���� / 1:1 ��Ӹ� �����ϴ�.
// ������ ����� �ִ�. implements class ������ �����ϴ�. ó�� ����ϸ� �� Ŭ������ ������(������ ���)
// Ŭ���� + �������̽��� ���߻���� �����ϴ�.
// 

public class Bird extends Animal implements Bite/*, fly, eat, .... ���߻�� ����*/{ 

	private int leg;
	
	public Bird() {
	}

	public Bird(String sort, int age, int leg) {
		super(sort, age);
		this.leg = leg;
	}

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(leg);
	}
	
	@Override  // �߻�޼ҵ带 ���� �� ����Ŭ�������� �������̵��� ������Ѵ�. ***
	public void roar() {
		System.out.println("±±");
	}
	
	@Override
	public void bite() {
		System.out.println("���� �θ��� ����� ����");
		
//		�� ������ �� bite �ʿ� abstract void ������� Bird�ʿ��� bite �������̵� �Ѱǰ���
		
	}
	
}
