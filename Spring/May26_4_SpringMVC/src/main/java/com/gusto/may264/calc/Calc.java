package com.gusto.may264.calc;

// 요청 파라미터 = 자바빈 멤버변수명 
// 그래야 자동으로 요청파라미터 값을 javabean 객체에 넣을 수 있다.

public class Calc {
	private String n;
	private int x; 
	private int y;
	
	public Calc() {
		// TODO Auto-generated constructor stub
	}

	public Calc(String n, int x, int y) {
		super();
		this.n = n;
		this.x = x;
		this.y = y;
	}

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
}
