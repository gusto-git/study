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

// �̼����� -> �Ľ� -> �޾ƿ� ������ -> .txt(�޸����� �ƴϴ�)���Ͽ� ��� 
// .xlsx(�������� �� ������ Ȯ�����̴�)
// (���α׷������)��¥,������,�̼�����,�ʹ̼�����,����,���մ��ȯ����
// ��¥,MSRSTE_NM,PM10,PM25,IDEX_NM
// ��¥������ : ��-��-��-����-�� 
public class AirPollutionMain2 {
	public static void main(String[] args) {
		FileOutputStream fos = null; // ���߿� ������ؼ� �ִ´ٰ���
		
		try {
			// ���α׷� �� -> ���Ϸ� : output
			fos = new FileOutputStream("C:\\Users\\yt866\\Desktop\\fos/air.txt", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
			BufferedWriter bw = new BufferedWriter(osw); // buffer�� ���� �ѹ��� ���� ���� cpu�� ���� ���ְ� �����.
			
			// ����ð� ���ϱ�
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-aa-hh-E");
			// Date -> String : format
			String nowStr = sdf.format(now);
			
			// parsing
			String addr = "http://openapi.seoul.go.kr:8088/70646b63596a69683437716f794e49/xml/RealtimeCityAir/1/25/";
			InputStream is = GustoHttpClient.download(addr);
			
			//����
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8"); // �ҹ��� utf�� ����
			
			int type = xpp.getEventType();
			String tagName = null;
			
			while (type != XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				} else if (type == XmlPullParser.TEXT) {
					// ��¥,MSRSTE_NM,PM10,PM25,IDEX_NM
					if (tagName.equals("MSRSTE_NM")) {
						bw.write(nowStr + ",");
						bw.write(xpp.getText() + ",");
					}else if (tagName.equals("PM10")) {
						bw.write(xpp.getText() + ",");
					}else if (tagName.equals("PM25")) {
						bw.write(xpp.getText() + ",");
					}else if (tagName.equals("IDEX_NM")) {
						bw.write(xpp.getText() + "\r\n"); // ��������
						bw.flush();
					}
					
				} else if (type == XmlPullParser.END_TAG) {
					tagName = "";
				}
				xpp.next();
				type = xpp.getEventType();
			}			
			// �ݺ����� ������ ���� �����Ϸ�!
			System.out.println("���� ���� �Ϸ�!");
			
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
