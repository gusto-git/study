package com.gutso.mar281.person;

import com.chung.mar281.avengers.Avengers;

public class Person {
	
	private String name;
	private Avengers hero; // jar ���Ͽ� �ִ� Avengers �������̽����� ������
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println(name);
	}
	
	public void pick(Avengers a) {
		hero = a; //����� ���� �Ƶ� �����ɷ� ������
		System.out.println("����Ϸ�!!");
	}
	public void heppp() {
		hero.attack();
	}
	
}
