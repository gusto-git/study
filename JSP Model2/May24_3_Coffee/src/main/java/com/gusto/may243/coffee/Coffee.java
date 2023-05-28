package com.gusto.may243.coffee;

public class Coffee {
	private int c_no;
	private String c_name;
	private int c_price;
	private String c_bean;
	private String c_country;
	private String c_store;
	private int c_kcal;
	
	public Coffee() {
		// TODO Auto-generated constructor stub
	}

	public Coffee(int c_no, String c_name, int c_price, String c_bean, String c_country, String c_store, int c_kcal) {
		super();
		this.c_no = c_no;
		this.c_name = c_name;
		this.c_price = c_price;
		this.c_bean = c_bean;
		this.c_country = c_country;
		this.c_store = c_store;
		this.c_kcal = c_kcal;
	}

	public int getC_no() {
		return c_no;
	}

	public void setC_no(int c_no) {
		this.c_no = c_no;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public int getC_price() {
		return c_price;
	}

	public void setC_price(int c_price) {
		this.c_price = c_price;
	}

	public String getC_bean() {
		return c_bean;
	}

	public void setC_bean(String c_bean) {
		this.c_bean = c_bean;
	}

	public String getC_country() {
		return c_country;
	}

	public void setC_country(String c_country) {
		this.c_country = c_country;
	}

	public String getC_store() {
		return c_store;
	}

	public void setC_store(String c_store) {
		this.c_store = c_store;
	}

	public int getC_kcal() {
		return c_kcal;
	}

	public void setC_kcal(int c_kcal) {
		this.c_kcal = c_kcal;
	}
	
	
	
}
