package com.gusto.mar273.coffee;

public class Coffee {
	private String name;
	private int price; // EMain에서 c.price를 사용할 수 없다.
	// 가져올 수 있게 하는 방법은 생성자오버로딩 아래
	
	
	// constructor : ctrl + space + enter
	public Coffee() {
		// TODO Auto-generated constructor stub
	}

	// 생성자 오버로딩 : ctrl + shift + space
	public Coffee(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	// private를 다른 패키지, 클래스에서 사용하는 방법 
	// gtter & stter를 실행해야한다.
	// 단축키 설정 : getters and stters : ctrl + shift + z 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
	}
	
	
}
