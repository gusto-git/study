package com.gusto.mar311.main;

import java.io.InputStream;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.gusto.http.client.GustoHttpClient;

// ������(client�� ������Ʈ�� ��û -> ����Ʈ�� ����)
// �ǽð� �����͸� xml Parsing(client�� �����͸� ��û -> XML / JSON ����)
// ���߿� �� �����͸� ������ ������ �̹���ȭ ���Ѽ� ����
// data.go.kr
// data.seoul.go.kr
// dev.naver.com
// dev.kakao.com

// ���� ���������ͱ��� DB - �̼����� �����͸� ������ �ͼ� Parsing

// DB�� �ִ� �����͸� ����鿡�� ��������ϴ� ���
// ��κ��� ������� SQL�� �� �� �𸥴�
// ������Ʈ : ���� ������� DB�� ���ϰ� ������ �ϴ� �� 

// �����ڰ� Ư�� �����͸� ������ ���� ����
// �����͸� Ư���� �������� ǥ������� �ϴµ�
// DB�� �ִ� �����͸� ǥ���ϴ� ���� : XML, JSON

// Parsing : �ʿ���� �����ʹ� �Ⱦ��, ���ϴ� ���·� �����ϴ� �۾�

// XML(eXtensilbe Mark-up Language)
// 		DB�� �ִ� �����͸� HTML �������� ǥ���� �� 
// <xxx> : �����±� (xxx : �±׸�)
// yyy   : �ؽ�Ʈ
// </xxx> : �����±�

// START_DOCUMENT : ������ ���� 
// END_DOCUMENT   : ������ ��
// START_TAG	  : �����±�
// END_TAG		  : �����±�
// TEXT           : �ؽ�Ʈ

// XML Parsing : kxm12.jar ��� ������ �� �ʿ��ϴ�. -> MVNREPOSITOY
// http ���   : GutstoHttpClient.jar

public class AirPollutionMain1 {
	public static void main(String[] args) {
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("����� �ǿ��� �ǽð� ���ȯ�� ��Ȳ");
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		try {
			String address = "http://openapi.seoul.go.kr:8088/70646b63596a69683437716f794e49/xml/RealtimeCityAir/1/25/";
			// �ܺο� �ִ°� ���� ���� ��Ŭ����(������Ʈ)�� ��������
			InputStream is = GustoHttpClient.download(address);
			
			// xml�ϱ����� ���� �����
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance(); // newInstance���� ����Ѵ�.
			// xml���忡�� �����ϴ� parser
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is,"UTF-8");
			// �±׸��� �м��ϴ� ģ��(�±׸� ���� ������ȣ�� �־ int�� ����)
			int type = xpp.getEventType();
			String tagName = null; // ��ġ�ϴ� �±׸��� �ӽ������� ���� ���� 
			
			// ���� ū Ʋ�� �⺻���̽�//
			// xml ������ ���� �������� �Ǳ� ������ ��� �о�� : ���� �ؿ����� �������� ���� ����
			while (type != XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					// type�� start_tag<xxx>
					tagName = xpp.getName(); // �±׸��� tagName�� ��ƶ�
					
				}else if (type == XmlPullParser.TEXT) {
					// �� �����϶� ������ ���� ���� ����
					if (tagName.equals("MSRSTE_NM")) {
						System.out.printf("������ : %s\n", xpp.getText()); // msrste_nm�� �ش��ϴ� ��Ʈ�� ������ �� ����
					}else if (tagName.equals("PM10")) {
						System.out.printf("�̼����� : %s��/��\n", xpp.getText());
					}else if (tagName.equals("PM25")) {
						System.out.printf("�ʹ̼����� : %s��/��\n", xpp.getText());
					}else if (tagName.equals("O3")) {
						System.out.printf("���� : %sppm\n", xpp.getText());
					}else if (tagName.equals("NO2")) {
						System.out.printf("�̻�ȭ���ҳ� : %sppm\n", xpp.getText());
					}else if (tagName.equals("CO")) {
						System.out.printf("�ϻ�ȭź�ҳ� : %sppm\n", xpp.getText());
					}else if (tagName.equals("IDEX_NM")) {
						System.out.printf("���մ��ȯ���� : %s\n", xpp.getText());
					}else if (tagName.equals("IDEX_MVL")) {
						System.out.printf("���մ��ȯ������ : %s\n", xpp.getText());
						System.out.println("++++++++++++++++++++++++++++++++++");
					}
					
				}else if (type == XmlPullParser.END_TAG) {
					// Xml������ ���⸦ text�� �ν��ϴ� ��찡 �־� ""�� �Ἥ ��� ������.
					tagName = "";
				}
				xpp.next(); // �����ɷ� �Ѿ��
				type = xpp.getEventType(); // ���� �±� ���� ���� �� �ֵ��� 
			} // ���� ū Ʋ�� �⺻���̽�//
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
	
}
