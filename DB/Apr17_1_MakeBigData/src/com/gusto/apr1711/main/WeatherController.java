package com.gusto.apr1711.main;

public class WeatherController {
	public static void main(String[] args) {
		// Weather Javabean�� JsonParsing �Ѱ� �ֱ�
		Weather w = WeatherDAO.getWeather();
//		System.out.println(w.getDescription()); Ȯ�ο� �� �۵��ϴ���
		// DB�� insert �ϱ�
		String result = WeatherDAO.insertWeather(w);
		System.out.println(result);
		
			
		
		
		
		
	
	}
}
