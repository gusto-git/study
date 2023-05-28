package com.gusto.apr133.restaurant;

// Javabean, DTO, POJO

public class Restaurant { // 테이블 명을 따서
	// 멤버변수, 속성, 필드
	// DB에 만든 컬럼명
	private String location;
	private String owner;
	private int seat;
	
	public Restaurant() {
		// TODO Auto-generated constructor stub
	}

	public Restaurant(String location, String owner, int seat) {
		super();
		this.location = location;
		this.owner = owner;
		this.seat = seat;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	
}

