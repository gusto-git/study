package com.gusto.mar244.product; // ��Ű������ �ٸ���. -> ���̺귯���� Ŭ������ ������ ���, �ҹ��ڷθ� �ۼ� ��Ź

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
