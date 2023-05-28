package com.gusto.apr133.restaurant;

// Javabean, DTO, POJO

public class Restaurant { // ���̺� ���� ����
	// �������, �Ӽ�, �ʵ�
	// DB�� ���� �÷���
	private String location;
	private String owner;
	private int seat;
	// ������(Constructor) : Ctrl + Space + enter
	public Restaurant() {
		
	}
	// �����ڿ����ε� : Ctrl + shift + space
	public Restaurant(String location, String owner, int seat) {
		super();
		this.location = location;
		this.owner = owner;
		this.seat = seat;
	}
	
	// getters and setters
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
