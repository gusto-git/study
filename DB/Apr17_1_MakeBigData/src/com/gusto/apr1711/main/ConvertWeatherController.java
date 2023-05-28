package com.gusto.apr1711.main;

import java.util.ArrayList;

public class ConvertWeatherController {
	public static void main(String[] args) {
		
		ArrayList<Weather> weathers = WeatherDAO.getMyWeather();
		WeatherDAO.writeWeatherToFile(weathers);
		System.out.println("¿Ï");
	}
}
