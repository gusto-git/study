package com.gusto.mar273.coffee;

public class Coffee {
	private String name;
	private int price; // EMain���� c.price�� ����� �� ����.
	// ������ �� �ְ� �ϴ� ����� �����ڿ����ε� �Ʒ�
	
	
	// constructor : ctrl + space + enter
	public Coffee() {
		// TODO Auto-generated constructor stub
	}

	// ������ �����ε� : ctrl + shift + space
	public Coffee(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	// private�� �ٸ� ��Ű��, Ŭ�������� ����ϴ� ��� 
	// gtter & stter�� �����ؾ��Ѵ�.
	// ����Ű ���� : getters and stters : ctrl + shift + z 

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
