package com.gutso.mar281.person;

import com.chung.mar281.avengers.Avengers;

public class Person {
	
	private String name;
	private Avengers hero; // jar 파일에 있는 Avengers 인터페이스에서 가져옴
	
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
		hero = a; //어벤져스 누가 됐든 넣은걸로 만들자
		System.out.println("등장완료!!");
	}
	public void heppp() {
		hero.attack();
	}
	
}
