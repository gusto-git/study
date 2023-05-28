package com.gusto.apr1711.main;
// javabean

import java.math.BigDecimal;
import java.util.Date;

// Oracle 자료형 <-> Java 자료형
//  Varchar2 ->  String
//	char		 String
//	date		 Date
//	number		 BigDecimal ** 빅데이터에서 주력으로 사용할 자료형!

// BigDecimal
//	정수, 실수 모두 소화가 가능한 자료형
// 	BigDecimal bd = new BigDecimal(val);
public class Weather {
	// 속성(멤버변수)
	
	private Date when; // import java.util.Date;
	private String description;
	private BigDecimal temp;
	private BigDecimal feels_like;
	private BigDecimal temp_min;
	private BigDecimal temp_max;
	private BigDecimal pressure;
	private BigDecimal humidity;
	
	public Weather() {
		// TODO Auto-generated constructor stub
	}

	public Weather(Date when, String description, BigDecimal temp, BigDecimal feels_like, BigDecimal temp_min,
			BigDecimal temp_max, BigDecimal pressure, BigDecimal humidity) {
		super();
		this.when = when;
		this.description = description;
		this.temp = temp;
		this.feels_like = feels_like;
		this.temp_min = temp_min;
		this.temp_max = temp_max;
		this.pressure = pressure;
		this.humidity = humidity;
	}

	public Date getWhen() {
		return when;
	}

	public void setWhen(Date when) {
		this.when = when;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getTemp() {
		return temp;
	}

	public void setTemp(BigDecimal temp) {
		this.temp = temp;
	}

	public BigDecimal getFeels_like() {
		return feels_like;
	}

	public void setFeels_like(BigDecimal feels_like) {
		this.feels_like = feels_like;
	}

	public BigDecimal getTemp_min() {
		return temp_min;
	}

	public void setTemp_min(BigDecimal temp_min) {
		this.temp_min = temp_min;
	}

	public BigDecimal getTemp_max() {
		return temp_max;
	}

	public void setTemp_max(BigDecimal temp_max) {
		this.temp_max = temp_max;
	}

	public BigDecimal getPressure() {
		return pressure;
	}

	public void setPressure(BigDecimal pressure) {
		this.pressure = pressure;
	}

	public BigDecimal getHumidity() {
		return humidity;
	}

	public void setHumidity(BigDecimal humidity) {
		this.humidity = humidity;
	}
	
	

}
