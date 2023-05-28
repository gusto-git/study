package com.gusto.mar311.main;

import java.io.InputStream;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.gusto.http.client.GustoHttpClient;

// 웹서버(client가 웹사이트에 요청 -> 사이트가 응답)
// 실시간 데이터를 xml Parsing(client가 데이터를 요청 -> XML / JSON 응답)
// 나중에 그 데이터를 가지고 웹에서 이미지화 시켜서 구현
// data.go.kr
// data.seoul.go.kr
// dev.naver.com
// dev.kakao.com

// 서울 열린데이터광장 DB - 미세먼지 데이터를 가지고 와서 Parsing

// DB에 있는 데이터를 사람들에게 보여줘야하는 경우
// 대부분의 사람들은 SQL을 할 줄 모른다
// 웹사이트 : 보통 사람들이 DB를 편하게 쓰도록 하는 것 

// 개발자가 특정 데이터만 가지고 오고 싶음
// 데이터를 특정한 형식으로 표현해줘야 하는데
// DB에 있는 데이터를 표현하는 형식 : XML, JSON

// Parsing : 필요없는 데이터는 걷어내고, 원하는 형태로 가공하는 작업

// XML(eXtensilbe Mark-up Language)
// 		DB에 있는 데이터를 HTML 형식으로 표현한 것 
// <xxx> : 시작태그 (xxx : 태그명)
// yyy   : 텍스트
// </xxx> : 종료태그

// START_DOCUMENT : 문서의 시작 
// END_DOCUMENT   : 문서의 끝
// START_TAG	  : 시작태그
// END_TAG		  : 종료태그
// TEXT           : 텍스트

// XML Parsing : kxm12.jar 라는 파일이 꼭 필요하다. -> MVNREPOSITOY
// http 통신   : GutstoHttpClient.jar

public class AirPollutionMain1 {
	public static void main(String[] args) {
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("서울시 권역별 실시간 대기환경 현황");
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		try {
			String address = "http://openapi.seoul.go.kr:8088/70646b63596a69683437716f794e49/xml/RealtimeCityAir/1/25/";
			// 외부에 있는거 지금 현재 이클립스(프로젝트)에 가져오기
			InputStream is = GustoHttpClient.download(address);
			
			// xml하기위한 공장 세우기
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance(); // newInstance까지 써야한다.
			// xml공장에서 일을하는 parser
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is,"UTF-8");
			// 태그명을 분석하는 친구(태그명 마다 고유번호가 있어서 int를 쓴다)
			int type = xpp.getEventType();
			String tagName = null; // 일치하는 태그명을 임시적으로 담을 변수 
			
			// 가장 큰 틀임 기본베이스//
			// xml 파일의 제일 마지막이 되기 전까지 계속 읽어라 : 제일 밑에까지 내려가기 위한 구문
			while (type != XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					// type이 start_tag<xxx>
					tagName = xpp.getName(); // 태그명을 tagName에 담아라
					
				}else if (type == XmlPullParser.TEXT) {
					// 위 조건일때 실제로 행할 일을 말함
					if (tagName.equals("MSRSTE_NM")) {
						System.out.printf("측정구 : %s\n", xpp.getText()); // msrste_nm에 해당하는 텍트를 가져올 수 있음
					}else if (tagName.equals("PM10")) {
						System.out.printf("미세먼지 : %s㎍/㎥\n", xpp.getText());
					}else if (tagName.equals("PM25")) {
						System.out.printf("초미세먼지 : %s㎍/㎥\n", xpp.getText());
					}else if (tagName.equals("O3")) {
						System.out.printf("오존 : %sppm\n", xpp.getText());
					}else if (tagName.equals("NO2")) {
						System.out.printf("이산화질소농도 : %sppm\n", xpp.getText());
					}else if (tagName.equals("CO")) {
						System.out.printf("일산화탄소농도 : %sppm\n", xpp.getText());
					}else if (tagName.equals("IDEX_NM")) {
						System.out.printf("통합대기환경등급 : %s\n", xpp.getText());
					}else if (tagName.equals("IDEX_MVL")) {
						System.out.printf("통합대기환경지수 : %s\n", xpp.getText());
						System.out.println("++++++++++++++++++++++++++++++++++");
					}
					
				}else if (type == XmlPullParser.END_TAG) {
					// Xml에서는 띄어쓰기를 text로 인식하는 경우가 있어 ""를 써서 비워 버린다.
					tagName = "";
				}
				xpp.next(); // 다음걸로 넘어가라
				type = xpp.getEventType(); // 다음 태그 값을 가질 수 있도록 
			} // 가장 큰 틀임 기본베이스//
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
	
}
