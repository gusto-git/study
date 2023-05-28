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
// 요청 주소 : https://openapi.naver.com/v1/search/news.xml
// https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B0%90%EC%9E%90
//																						    감자였다.

// 인터넷 주소 체계 
// https://         ->  프로토콜:// 통신방식을 의미한다.
// 컴퓨터의 주소/
// 폴더명/폴더명/.../파일명
// ? 
// 변수명=값&변수명=값&
//		요청 파라미터 / 변수명=값에 따라서 요청 주소가 달라짐
//		클라이언트가 서버에게 공개적으로 전달하는 정보를 의미
//		한글, 특수문자가 인터넷 주소에 바로 들어가면 안된다.
//		ex) ㅋ -> %2D 이런식으로 변환된다. (URL인코딩)


public class NaverNewsMain {
	public static void main(String[] args) {
		
		try {
			Scanner k = new Scanner(System.in);
			System.out.print("검색어 : ");
			String search = k.next();
//			System.out.println(search);
			// 감자 -> %EA%B0%90%EC%9E%90 이걸 URLEncoding이라고한다.
			search = URLEncoder.encode(search,"UTF-8"); 
//			System.out.println(search);
			
			// 감자 : https://openapi.naver.com/v1/search/news.xml?query=%EA%B0%90%EC%9E%90
			String addr = "https://openapi.naver.com/v1/search/news.xml";
			addr += "?query=" + search; // 주소뒤에 이어쓰기 위함
//			System.out.println(addr);
//			
//			// GustoHttpClient의 요청(헤드없는방식) download 메소드 사용하기
//			URL u = new URL(addr);
//			HttpsURLConnection huc = (HttpsURLConnection) u.openConnection();
//			
//			// 요청헤더 
//			huc.addRequestProperty("X-Naver-Client-Id", "o2MOln7rZySezhLPbNCp");
//			huc.addRequestProperty("X-Naver-Client-Secret", "sWznqn76NG");
//			InputStream is = huc.getInputStream();
//			
//			String t = GustoHttpClient.convert(is, "UTF-8");
//			System.out.println(t); // xml 자체가 받아진다.
//			
			// 요청헤드용 jar 파일로
			HashMap<String, String> headers = new HashMap<String, String>();
			headers.put("X-Naver-Client-Id","o2MOln7rZySezhLPbNCp");
			headers.put("X-Naver-Client-Secret","sWznqn76NG");
			InputStream is = GustoHttpClient.download(addr,headers);
//			String t = GustoHttpClient.convert(is, "UTF-8");
//			System.out.println(t); 
			
			//parsing , xml시작
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is,"UTF-8");
			
			int type = xpp.getEventType();
			String tagName = null;
			
			boolean data = false;
			//<b> -> [, ] 로변경
			String t = null;
			
			while (type != XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
					// item 태그만 보겠다는 의미
					if (tagName.equals("item")) {
						data = true; // <title> 태그가 두개라서 원하는 것만 뽑으려고 넣은것이다.
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
							System.out.println("제목 : " + t);
						}else if (tagName.equals("description")) {
//							System.out.println(xpp.getText());
							t = xpp.getText();
							t = t.replace("<b>", "[");
							t = t.replace("</b>", "]");
							t = t.replace("&quot;", "");
							t = t.replace("&apos;", "");
							t = t.replace("&amp;", "&");
							System.out.println("내용 : " + t);
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
