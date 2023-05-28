package com.gutso.mar281.planet;

import com.gutso.mar281.person.Person;

public class Planet {
	private String name;
	private int size;
	private boolean	visible;
	
	public Planet() {
		// TODO Auto-generated constructor stub
	}

	public Planet(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(size);
		System.out.println(visible);
	}
	
	public void add(Person p) {
		System.out.printf("%s에 %s 이/가 입주! \n" , name, p.getName());
	}
	
}
