package com.gusto.mar274.animal;

public abstract class Animal { // abstract �޼ҵ带 ������ public �ڿ� abstract�� �پ���Ѵ�.
	private String sort;
	private int age;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String sort, int age) {
		super();
		this.sort = sort;
		this.age = age;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println(sort);
		System.out.println(age);
	}
	
	// abstract �޼ҵ� : �̿ϼ��� �޼ҵ�(������ ���� �޼ҵ�)
	// ���� Ŭ�������� �ݵ�� �������̵��� �ؾ��Ѵ�.
	
	// ***  abstract�� �ϳ��� ������ , abstract Ŭ���� or interface �����Ѵ�. ***
	// jsp���� ���� ����Ѵ�. 
	public abstract void roar(); // abstract �߻� �޼ҵ�, �̿ϼ� �޼ҵ��� �Ҹ�  -> Ŭ������ abstract �ٿ����Ѵ�.
	
	
}
