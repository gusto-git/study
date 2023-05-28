package com.gusto.mar311.main;

import java.io.InputStream;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.gusto.http.client.GustoHttpClient;

public class EarthQuakeMain {
	public static void main(String[] args) {
		// http://openapi.seoul.go.kr:8088/70646b63596a69683437716f794e49/xml/TlEtqkP/1/999/
		// SGG_NM,EQUP_NM,LOC_SFPR_A,XCORD,YCORD
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("서울시 지진 옥외 대피소 현황");
		System.out.println("++++++++++++++++++++++++++++++++++");
		try {
			String address = "http://openapi.seoul.go.kr:8088/70646b63596a69683437716f794e49/xml/TlEtqkP/1/999/";
			InputStream is = GustoHttpClient.download(address);

			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");

			int type = xpp.getEventType();
			String tagName = null;

			while (type != XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				} else if (type == XmlPullParser.TEXT) {
					if (tagName.equals("SGG_NM")) {
						System.out.printf("시군구명 : %s\n", xpp.getText());
					}
					if (tagName.equals("EQUP_NM")) {
						System.out.printf("수용시설명 : %s\n", xpp.getText());
					}
					if (tagName.equals("LOC_SFPR_A")) {
						System.out.printf("상세주소 : %s\n", xpp.getText());
					}
					if (tagName.equals("XCORD")) {
						System.out.printf("경도 : %s\n", xpp.getText());
					}
					if (tagName.equals("YCORD")) {
						System.out.printf("위도 : %s\n", xpp.getText());
						System.out.println("==========================");
					}
				} else if (type == XmlPullParser.END_TAG) {
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
