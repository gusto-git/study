package com.apr031.main;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.gusto.http.client.GustoHttpClient;

// AJAX - JavaScript에서 XML 파싱
//	-> XML을 많이 안쓰는 추세
//	-> 좀 더 JavaScript에 진화된 형태(JSON)

// JSON(JavaScript Object Notation)
// DB에 있는 데이터를 JavaScript 형태로 표현 한 것
// XML보다 압도적으로 좋다

// JSON을 Java에서 구현하려면 2가지 JSP문법을 이해하고 있어야 한다.

// Java의 배열 : {1, 2, 3, 4};
// JS의 배열   : [ 1, 2, 3, 4] -> JsonArray이라고 말함

// Java의 객체 : Dog d = new Dog();
//					d.setName("개똥이");
//					d.setAge(4);

// JS의 객체   : {name : "개똥이", age : 4}; -> JsonObject이라고 말함
// https://api.openweathermap.org/data/2.5/weather?q=seoul&appid=8a6cd099fcff98185b8b37a3f69227b1&units=metric&lang=Kr
// 주소 분해
// https://api.openweathermap.org
// /data
// /2.5
// /weather
// ?
// q=seoul => query
// &appid=8a6cd099fcff98185b8b37a3f69227b1
// &units=metric
// &lang=Kr
public class WeartherMain1 {
	public static void main(String[] args) {
		try {
			Scanner k = new Scanner(System.in);
			System.out.println("City : ");
			String cityName = k.next();

			String addr = "https://api.openweathermap.org/data/2.5/weather";// 주소가 길어서 분할함
			addr += "?q=" + cityName; // 검색어(도시이름)넣기
			addr += "&appid=8a6cd099fcff98185b8b37a3f69227b1"; // API KEY
			addr += "&units=metric"; // 화씨 -> 섭씨로 변환
			addr += "&lang=Kr"; // 한국어 날씨로 표현(맑음, 흐림 등)
//			System.out.println(addr); 주소가 잘 나오는지 확인 용

//		외부사이트에서 프로그램으로 가져옴 : input
			InputStream is = GustoHttpClient.download(addr);
			String str = GustoHttpClient.convert(is, "UTF-8");
			System.out.println(str); // JSON으로 복사하기 위한 용도 , JSON은 에러가 많이뜬다
			// JSON 파일 만드는 법 : package -> new -> other -> file - 파일명.jason

//		JASON 파싱 시작
			JSONParser jp = new JSONParser(); // 파싱할 준비
			// [ : JS 배열 (Array)
			// { : JS 객체 (Object)
			JSONObject jo = (JSONObject) jp.parse(str);
			// str = json자체 , JSON객체로 시작하는 코드이기때문에 JSONObject를 쓴다.

//		sys 나라 이름 가져오기	
			JSONObject sys = (JSONObject) jo.get("sys");
			String country = (String) sys.get("country"); // country가 sys안에 있어서 이렇게 만들어야 함
			System.out.println(country);

//		name 지역 이름 가져오기
			String name = (String) jo.get("name");
			System.out.println(name); // 내가 입력한 도시가 나오는지 확인용

//		날씨 가져오기
			JSONArray wt = (JSONArray) jo.get("weather"); // 날씨는 배열로 만들어져있기 때문에 JSONArray를 쓴다.
			JSONObject wt2 = (JSONObject) wt.get(0); // 날씨라는 배열안에 있는 표현은 오브젝트라서 JSONObject로 가져온다.
			// 이때, 배열의 0번째라 index 0 임으로 get(0)
			String description = (String) wt2.get("description"); // 결과값이 String임으로 String 변수를 만듬
			System.out.println(description);

//      main 쪽
//			double : "temp" , "feels+like" , "temp_min", "temp_max", 
//			long : "pressure", "humidity"
			JSONObject main = (JSONObject) jo.get("main");
			double temp1 = (double) main.get("temp");
			double feelsLike1 = (double) main.get("feels_like");
			double tempMin1 = (double) main.get("temp_min");
			double tempMax1 = (double) main.get("temp_max");
			long pressure1 = (long) main.get("pressure");
			long humidity1 = (long) main.get("humidity");

			System.out.println(temp1);
			System.out.println(feelsLike1);
			System.out.println(tempMin1);
			System.out.println(tempMax1);
			System.out.println(pressure1);
			System.out.println(humidity1);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
