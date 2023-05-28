package com.gusto.mar311.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.gusto.http.client.GustoHttpClient;

// 미세먼지 -> 파싱 -> 받아온 값들을 -> .txt(메모장이 아니다)파일에 담기 
// .xlsx(엑셀에서 잘 열리는 확장자이다)
// (프로그램실행시)날짜,측정구,미세먼지,초미세먼지,오존,통합대기환경등급
// 날짜,MSRSTE_NM,PM10,PM25,IDEX_NM
// 날짜형식은 : 연-월-일-오후-시 
public class AirPollutionMain2 {
	public static void main(String[] args) {
		FileOutputStream fos = null; // 나중에 꺼줘야해서 넣는다고함
		
		try {
			// 프로그램 내 -> 파일로 : output
			fos = new FileOutputStream("C:\\Users\\yt866\\Desktop\\fos/air.txt", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
			BufferedWriter bw = new BufferedWriter(osw); // buffer를 통해 한번에 많은 양을 cpu로 보낼 수있게 만든다.
			
			// 현재시간 구하기
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-aa-hh-E");
			// Date -> String : format
			String nowStr = sdf.format(now);
			
			// parsing
			String addr = "http://openapi.seoul.go.kr:8088/70646b63596a69683437716f794e49/xml/RealtimeCityAir/1/25/";
			InputStream is = GustoHttpClient.download(addr);
			
			//공장
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8"); // 소문자 utf도 가능
			
			int type = xpp.getEventType();
			String tagName = null;
			
			while (type != XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				} else if (type == XmlPullParser.TEXT) {
					// 날짜,MSRSTE_NM,PM10,PM25,IDEX_NM
					if (tagName.equals("MSRSTE_NM")) {
						bw.write(nowStr + ",");
						bw.write(xpp.getText() + ",");
					}else if (tagName.equals("PM10")) {
						bw.write(xpp.getText() + ",");
					}else if (tagName.equals("PM25")) {
						bw.write(xpp.getText() + ",");
					}else if (tagName.equals("IDEX_NM")) {
						bw.write(xpp.getText() + "\r\n"); // 마지막줄
						bw.flush();
					}
					
				} else if (type == XmlPullParser.END_TAG) {
					tagName = "";
				}
				xpp.next();
				type = xpp.getEventType();
			}			
			// 반복문이 끝나면 파일 생성완료!
			System.out.println("파일 생성 완료!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
