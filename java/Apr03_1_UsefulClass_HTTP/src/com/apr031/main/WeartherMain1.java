package com.apr031.main;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.gusto.http.client.GustoHttpClient;

// AJAX - JavaScript���� XML �Ľ�
//	-> XML�� ���� �Ⱦ��� �߼�
//	-> �� �� JavaScript�� ��ȭ�� ����(JSON)

// JSON(JavaScript Object Notation)
// DB�� �ִ� �����͸� JavaScript ���·� ǥ�� �� ��
// XML���� �е������� ����

// JSON�� Java���� �����Ϸ��� 2���� JSP������ �����ϰ� �־�� �Ѵ�.

// Java�� �迭 : {1, 2, 3, 4};
// JS�� �迭   : [ 1, 2, 3, 4] -> JsonArray�̶�� ����

// Java�� ��ü : Dog d = new Dog();
//					d.setName("������");
//					d.setAge(4);

// JS�� ��ü   : {name : "������", age : 4}; -> JsonObject�̶�� ����
// https://api.openweathermap.org/data/2.5/weather?q=seoul&appid=8a6cd099fcff98185b8b37a3f69227b1&units=metric&lang=Kr
// �ּ� ����
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

			String addr = "https://api.openweathermap.org/data/2.5/weather";// �ּҰ� �� ������
			addr += "?q=" + cityName; // �˻���(�����̸�)�ֱ�
			addr += "&appid=8a6cd099fcff98185b8b37a3f69227b1"; // API KEY
			addr += "&units=metric"; // ȭ�� -> ������ ��ȯ
			addr += "&lang=Kr"; // �ѱ��� ������ ǥ��(����, �帲 ��)
//			System.out.println(addr); �ּҰ� �� �������� Ȯ�� ��

//		�ܺλ���Ʈ���� ���α׷����� ������ : input
			InputStream is = GustoHttpClient.download(addr);
			String str = GustoHttpClient.convert(is, "UTF-8");
			System.out.println(str); // JSON���� �����ϱ� ���� �뵵 , JSON�� ������ ���̶��
			// JSON ���� ����� �� : package -> new -> other -> file - ���ϸ�.jason

//		JASON �Ľ� ����
			JSONParser jp = new JSONParser(); // �Ľ��� �غ�
			// [ : JS �迭 (Array)
			// { : JS ��ü (Object)
			JSONObject jo = (JSONObject) jp.parse(str);
			// str = json��ü , JSON��ü�� �����ϴ� �ڵ��̱⶧���� JSONObject�� ����.

//		sys ���� �̸� ��������	
			JSONObject sys = (JSONObject) jo.get("sys");
			String country = (String) sys.get("country"); // country�� sys�ȿ� �־ �̷��� ������ ��
			System.out.println(country);

//		name ���� �̸� ��������
			String name = (String) jo.get("name");
			System.out.println(name); // ���� �Է��� ���ð� �������� Ȯ�ο�

//		���� ��������
			JSONArray wt = (JSONArray) jo.get("weather"); // ������ �迭�� ��������ֱ� ������ JSONArray�� ����.
			JSONObject wt2 = (JSONObject) wt.get(0); // ������� �迭�ȿ� �ִ� ǥ���� ������Ʈ�� JSONObject�� �����´�.
			// �̶�, �迭�� 0��°�� index 0 ������ get(0)
			String description = (String) wt2.get("description"); // ������� String������ String ������ ����
			System.out.println(description);

//      main ��
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
