package com.gusto.may263.coffee;

// 객체를 여러개 등록해서 사용할때
//		src/main/resources에 XXXbeans.xml을 만들어서 사용

// Singleton을 더 많이 사용한다.
//		servlet-context.xml에 객체하나 등록해 놓고 쓸 수 있음
//		root-ccontext.xml << 톰캣 전체[프로젝트]에 영향을 미치기 때문에 수정하지 않는다.

public class Coffee {
	private String name;
	private int price;
	
	public Coffee() {
		// TODO Auto-generated constructor stub
	}

	public Coffee(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

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
	
	
}
