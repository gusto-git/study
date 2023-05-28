package com.gusto.may242.fruit;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.gusto.http.client.GustoHttpClient;


// jar파일 : GustoHttpClient.jar / kxml2.jar /

public class FruitDAO {
	
	// XML 정보 가져오기
	// http://localhost/May24_1_AJAXServer/GetFruitXML
	public static void getFruitXML(HttpServletRequest req) {
		try {
			String addr = "http://localhost/May24_1_AJAXServer/GetFruitXML";
			InputStream is = GustoHttpClient.download(addr);
			
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is,"UTF-8");
			
			int type = xpp.getEventType();
			String tagName = null;
			
			// 우리가 필요한 정보들  javabean에 맞추어서 넣고 -> arrayList에 보관
			Fruit f = null; // 빈 자바빈
			ArrayList<Fruit> fruits = new ArrayList<Fruit>();
			
			while (type != XmlPullParser.END_DOCUMENT) { // 문서의 끝까지 반복하라
				if (type == XmlPullParser.START_TAG) { 
					tagName = xpp.getName();
					if (tagName.equals("fruit")) {
						f = new Fruit(); // <fruit>태그 만나면 Fruit 객체 하나 생성 
					}
				} else if (type == XmlPullParser.TEXT) {
					if (tagName.equals("f_name")) {
						System.out.println(xpp.getText());//console 확인
						// javabean(dto)에 담아야함
						f.setF_name(xpp.getText());
					}else if (tagName.equals("f_price")) {
						System.out.println(xpp.getText());
						f.setF_price(Integer.parseInt(xpp.getText()));
					}			
				} else if (type == XmlPullParser.END_TAG) {
					if (xpp.getName().equals("fruit")) {
						fruits.add(f); // javabean 하나 완성되면 arrayList에 넣기 
					}
				}
				xpp.next();
				type = xpp.getEventType();
			}
			req.setAttribute("fruits", fruits);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getFruitJSON(HttpServletRequest req) {
		
		try {
			InputStream is = GustoHttpClient.download("http://localhost/May24_1_AJAXServer/GetFruitJSON");
			String s = GustoHttpClient.convert(is, "UTF-8");
			
			// JSON 파싱을 하기 위해서는 JSON-SIMPLE.JAR파일 필요
			JSONParser jp = new JSONParser();
			JSONArray ja = (JSONArray) jp.parse(s); // 형변환 자동완성 사용
			JSONObject jo = null;
			Fruit f = null;
			
			ArrayList<Fruit> fruits = new ArrayList<Fruit>();
			for (int i = 0; i < ja.size(); i++) {
				jo = (JSONObject) ja.get(i); // 오브젝트로 형변환
				f = new Fruit();
				f.setF_name(jo.get("f_name").toString());
				f.setF_price(Integer.parseInt(jo.get("f_price").toString()));
				fruits.add(f);
			}
			req.setAttribute("fruits1", fruits);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
