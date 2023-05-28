package com.gusto.mar274.avengers;

import com.gusto.mar274.driver.Driver;
import com.gusto.mar274.smoker.Smoker;

public class Ironman extends Avengers implements Smoker, Driver{
	private int property;

	public Ironman() {
		// TODO Auto-generated constructor stub
	}

	public Ironman(String name, int age, int property) {
		super(name, age);
		this.property = property;
	}

	public int getProperty() {
		return property;
	}

	public void setProperty(int property) {
		this.property = property;
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(property);
	}
	
	@Override
	public void attack() {
		System.out.println("ºö");
	}
	
	@Override
	public void smoke() {
		System.out.println("»µ²û»µ²û");
	}
	
	@Override
	public void drive() {
		System.out.println("ºÎ¸ª");
	}
	
	
	
	
}
