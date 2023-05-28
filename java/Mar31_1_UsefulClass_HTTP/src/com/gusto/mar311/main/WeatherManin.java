package com.gusto.mar311.main;

import java.io.InputStream;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.gusto.http.client.GustoHttpClient;

// https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2671025000
// hour : �ð�
// temp : �µ�
// wfKor : ���� (����, �帲 ) 
// wdKor : ǳ��
// console ���

public class WeatherManin {
	public static void main(String[] args) {
		System.out.println("+++++++++++++++++++++++++++++++");
		System.out.println("�λ�� ���屺 ������ ���� ��Ȳ");
		System.out.println("+++++++++++++++++++++++++++++++");
		
		try {
			String address = "https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2671025000";
			InputStream is = GustoHttpClient.download(address);
			
			// xml ���� �����
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			
			// xml ���忡�� ���ϴ� parser 
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is,"UTF-8");
			
			// �±׸��� �м��ϴ� �޼ҵ�
			int type = xpp.getEventType();
			String tagName = null;
			
			// xml ������ ��� �е��� �ݺ���Ű��
			while (type != XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				}else if (type == XmlPullParser.TEXT) {
					if (tagName.equals("hour")) {
						System.out.printf("�ð� : %s��\n", xpp.getText());
					}if (tagName.equals("temp")) {
						System.out.printf("�µ� : %s��\n", xpp.getText());
					}if (tagName.equals("wfKor")) {
						System.out.printf("���� : %s\n", xpp.getText());
					}if (tagName.equals("wdKor")) {
						System.out.printf("ǳ�� : %s\n", xpp.getText());
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

