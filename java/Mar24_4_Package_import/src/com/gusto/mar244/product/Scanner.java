package com.gusto.mar244.product;

public class Scanner extends Product{
	
	public Scanner() {
		
	}
	
	public Scanner(String name, int price) { //오버로딩 자동완성이 안된다. 직접 입력해야한다.
		super(name, price);
	}
		
	@Override
	public void printInfo() {
		
		super.printInfo();
	}

}
