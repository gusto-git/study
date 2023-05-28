package com.gusto.mar273.human;

// 캡슐화(Encapsulatoion)
//  	멤버변수에 접근 할 수 있는 통로를 만들고 그 통로에 안정장치를 하는 개념
//		외부에 노출할 필요가 없는 정보들을 캡슐처럼 갑싸서 [은닉]하는 개념(기능)

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

	// setxxx : 외부의 접근이 제한된 xxx를 가공할 수 있는 메소드
	public void setAge(int age) {  // -나이(음수)를 없애기 위한 방법
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
