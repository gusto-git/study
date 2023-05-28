package com.gusto.mar274.animal;

public abstract class Animal { // abstract 메소드를 쓰려면 public 뒤에 abstract가 붙어야한다.
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
	
	// abstract 메소드 : 미완성된 메소드(내용이 없는 메소드)
	// 하위 클래스에서 반드시 오버라이딩을 해야한다.
	
	// ***  abstract가 하나라도 있으면 , abstract 클래스 or interface 여야한다. ***
	// jsp에서 많이 사용한다. 
	public abstract void roar(); // abstract 추상 메소드, 미완성 메소드라고 불림  -> 클래스도 abstract 붙여야한다.
	
	
}
