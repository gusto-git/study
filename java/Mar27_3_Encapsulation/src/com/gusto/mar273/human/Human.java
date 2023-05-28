package com.gusto.mar273.human;

// ĸ��ȭ(Encapsulatoion)
//  	��������� ���� �� �� �ִ� ��θ� ����� �� ��ο� ������ġ�� �ϴ� ����
//		�ܺο� ������ �ʿ䰡 ���� �������� ĸ��ó�� ���μ� [����]�ϴ� ����(���)

public class Human {
	private String name;
	private int age;
	private double weight;
	
	public Human() {
	}

	public Human(String name, int age, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	// setxxx : �ܺ��� ������ ���ѵ� xxx�� ������ �� �ִ� �޼ҵ�
	public void setAge(int age) {  // -����(����)�� ���ֱ� ���� ���
		if (age < 0) {
			age *= -1;
		}
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
}
