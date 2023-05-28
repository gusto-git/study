package com.gusto.apr133.restaurant;

// Javabean, DTO, POJO

public class Restaurant { // 테이블 명을 따서
	// 멤버변수, 속성, 필드
	// DB에 만든 컬럼명
	private String location;
	private String owener;
	private int seat;
	// 생성자(Constructor) : Ctrl + Space + enter
	public Restaurant() {
		
	}
	// 생성자오버로딩 : Ctrl + shift + space
	public Restaurant(String location, String owener, int seat) {
		super();
		this.location = location;
		this.owener = owener;
		this.seat = seat;
	}
	
	// getters and setters
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOwener() {
		return owener;
	}
	public void setOwener(String owener) {
		this.owener = owener;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	
	
}
