package com.gusto.apr14.main;

import java.util.Date;

// DB 테이블 생성과 같은 JavaBean 하나 생성

public class Air {
	// 멤버변수(member variable)은 DB 컬럼과 같아야함
	private int no;
	private Date when;
	private String msrrgn_nm;
	private String msrste_nm;
	private int pm10;
	private int pm25;
	private double o3;
	private String index_nm;
//	생성자(Constructor) : Ctrl + space
	public Air() {
		// TODO Auto-generated constructor stub
	}
// 생성자 오버로딩 : Ctrl + shift + space
	public Air(int no, Date when, String msrrgn_nm, String msrste_nm, int pm10, int pm25, double o3, String index_nm) {
		super();
		this.no = no;
		this.when = when;
		this.msrrgn_nm = msrrgn_nm;
		this.msrste_nm = msrste_nm;
		this.pm10 = pm10;
		this.pm25 = pm25;
		this.o3 = o3;
		this.index_nm = index_nm;
	}
// getters and setters : ctrl + shift + z 
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Date getWhen() {
		return when;
	}

	public void setWhen(Date when) {
		this.when = when;
	}

	public String getMsrrgn_nm() {
		return msrrgn_nm;
	}

	public void setMsrrgn_nm(String msrrgn_nm) {
		this.msrrgn_nm = msrrgn_nm;
	}

	public String getMsrste_nm() {
		return msrste_nm;
	}

	public void setMsrste_nm(String msrste_nm) {
		this.msrste_nm = msrste_nm;
	}

	public int getPm10() {
		return pm10;
	}

	public void setPm10(int pm10) {
		this.pm10 = pm10;
	}

	public int getPm25() {
		return pm25;
	}

	public void setPm25(int pm25) {
		this.pm25 = pm25;
	}

	public double getO3() {
		return o3;
	}

	public void setO3(double o3) {
		this.o3 = o3;
	}

	public String getIndex_nm() {
		return index_nm;
	}

	public void setIndex_nm(String index_nm) {
		this.index_nm = index_nm;
	}
	
	
	
	
}
