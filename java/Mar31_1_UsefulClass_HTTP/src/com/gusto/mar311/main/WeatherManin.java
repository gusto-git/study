package com.gusto.mar311.main;

import java.io.InputStream;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.gusto.http.client.GustoHttpClient;

// https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2671025000
// hour : 시간
// temp : 온도
// wfKor : 날씨 (맑음, 흐림 ) 
// wdKor : 풍향
// console 출력

public class WeatherManin {
	public static void main(String[] args) {
		System.out.println("+++++++++++++++++++++++++++++++");
		System.out.println("부산시 기장군 기장읍 날씨 현황");
		System.out.println("+++++++++++++++++++++++++++++++");
		
		try {
			String address = "https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2671025000";
			InputStream is = GustoHttpClient.download(address);
			
			// xml 공장 세우기
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			
			// xml 공장에서 일하는 parser 
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is,"UTF-8");
			
			// 태그명을 분석하는 메소드
			int type = xpp.getEventType();
			String tagName = null;
			
			// xml 파일을 계속 읽도록 반복시키기
			while (type != XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				}else if (type == XmlPullParser.TEXT) {
					if (tagName.equals("hour")) {
						System.out.printf("시간 : %s시\n", xpp.getText());
					}if (tagName.equals("temp")) {
						System.out.printf("온도 : %s℃\n", xpp.getText());
					}if (tagName.equals("wfKor")) {
						System.out.printf("날씨 : %s\n", xpp.getText());
					}if (tagName.equals("wdKor")) {
						System.out.printf("풍향 : %s\n", xpp.getText());
						System.out.println("++++++++++++++++++++++++");
					}
				}else if (type == XmlPullParser.END_TAG) {
					tagName = "";
				}
				xpp.next();
				type = xpp.getEventType();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

