package com.gusto.apr133.restaurant;

// Javabean, DTO, POJO

public class Restaurant { // ���̺� ���� ����
	// �������, �Ӽ�, �ʵ�
	// DB�� ���� �÷���
	private String location;
	private String owener;
	private int seat;
	// ������(Constructor) : Ctrl + Space + enter
	public Restaurant() {
		
	}
	// �����ڿ����ε� : Ctrl + shift + space
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
