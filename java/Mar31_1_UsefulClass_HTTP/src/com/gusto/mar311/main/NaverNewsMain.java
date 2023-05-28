package com.gusto.mar311.main;

import java.io.InputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Scanner;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.gusto.http.client.GustoHttpClient;

// o2MOln7rZySezhLPbNCp
// sWznqn76NG
// ��û �ּ� : https://openapi.naver.com/v1/search/news.xml
// https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B0%90%EC%9E%90
//																						    ���ڿ���.

// ���ͳ� �ּ� ü�� 
// https://         ->  ��������:// ��Ź���� �ǹ��Ѵ�.
// ��ǻ���� �ּ�/
// ������/������/.../���ϸ�
// ? 
// ������=��&������=��&
//		��û �Ķ���� / ������=���� ���� ��û �ּҰ� �޶���
//		Ŭ���̾�Ʈ�� �������� ���������� �����ϴ� ������ �ǹ�
//		�ѱ�, Ư�����ڰ� ���ͳ� �ּҿ� �ٷ� ���� �ȵȴ�.
//		ex) �� -> %2D �̷������� ��ȯ�ȴ�. (URL���ڵ�)


public class NaverNewsMain {
	public static void main(String[] args) {
		
		try {
			Scanner k = new Scanner(System.in);
			System.out.print("�˻��� : ");
			String search = k.next();
//			System.out.println(search);
			// ���� -> %EA%B0%90%EC%9E%90 �̰� URLEncoding�̶���Ѵ�.
			search = URLEncoder.encode(search,"UTF-8"); 
//			System.out.println(search);
			
			// ���� : https://openapi.naver.com/v1/search/news.xml?query=%EA%B0%90%EC%9E%90
			String addr = "https://openapi.naver.com/v1/search/news.xml";
			addr += "?query=" + search; // �ּҵڿ� �̾�� ����
//			System.out.println(addr);
//			
//			// GustoHttpClient�� ��û(�����¹��) download �޼ҵ� ����ϱ�
//			URL u = new URL(addr);
//			HttpsURLConnection huc = (HttpsURLConnection) u.openConnection();
//			
//			// ��û��� 
//			huc.addRequestProperty("X-Naver-Client-Id", "o2MOln7rZySezhLPbNCp");
//			huc.addRequestProperty("X-Naver-Client-Secret", "sWznqn76NG");
//			InputStream is = huc.getInputStream();
//			
//			String t = GustoHttpClient.convert(is, "UTF-8");
//			System.out.println(t); // xml ��ü�� �޾�����.
//			
			// ��û���� jar ���Ϸ�
			HashMap<String, String> headers = new HashMap<String, String>();
			headers.put("X-Naver-Client-Id","o2MOln7rZySezhLPbNCp");
			headers.put("X-Naver-Client-Secret","sWznqn76NG");
			InputStream is = GustoHttpClient.download(addr,headers);
//			String t = GustoHttpClient.convert(is, "UTF-8");
//			System.out.println(t); 
			
			//parsing , xml����
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is,"UTF-8");
			
			int type = xpp.getEventType();
			String tagName = null;
			
			boolean data = false;
			//<b> -> [, ] �κ���
			String t = null;
			
			while (type != XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
					// item �±׸� ���ڴٴ� �ǹ�
					if (tagName.equals("item")) {
						data = true; // <title> �±װ� �ΰ��� ���ϴ� �͸� �������� �������̴�.
					}
					
				}else if (type == XmlPullParser.TEXT) {
					if (data) {
						if (tagName.equals("title")) {
//							System.out.println(xpp.getText());
							t = xpp.getText();
							t = t.replace("<b>", "[");
							t = t.replace("</b>", "]");
							t = t.replace("&quot;", "");
							t = t.replace("&apos;", "");
							t = t.replace("&amp;", "&");
							System.out.println("���� : " + t);
						}else if (tagName.equals("description")) {
//							System.out.println(xpp.getText());
							t = xpp.getText();
							t = t.replace("<b>", "[");
							t = t.replace("</b>", "]");
							t = t.replace("&quot;", "");
							t = t.replace("&apos;", "");
							t = t.replace("&amp;", "&");
							System.out.println("���� : " + t);
							System.out.println("================");
						}
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
