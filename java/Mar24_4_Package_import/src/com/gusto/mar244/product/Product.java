package com.gusto.mar244.product; // 패키지명이 다르다. -> 라이브러리용 클래스를 모으는 방법, 소문자로만 작성 부탁

public class Product {
	
	String name;
	int price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
	}
	
}
