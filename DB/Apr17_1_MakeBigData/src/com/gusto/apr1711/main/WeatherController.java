package com.gusto.apr1711.main;

public class WeatherController {
	public static void main(String[] args) {
		// Weather Javabean에 JsonParsing 한거 넣기
		Weather w = WeatherDAO.getWeather();
//		System.out.println(w.getDescription()); 확인용 잘 작동하는지
		// DB에 insert 하기
		String result = WeatherDAO.insertWeather(w);
		System.out.println(result);
		
			
		
		
		
		
	
	}
}
