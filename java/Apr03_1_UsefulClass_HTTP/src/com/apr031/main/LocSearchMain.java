package com.apr031.main;

import java.io.InputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.gusto.http.client.GustoHttpClient;

// REST API 키	99ab9d2254d531ebe5ac0b5aaedd820f
// JavaScript 키	28d5f3c7845eabe50d1ac58383d320c8

// 내가 원하는 장소(우리집) 반경 5km내에 검색한 키워드가 포함된
// 가게들을 거리 기준으로 정렬
// 15개만 보여지도록 

// 위도(Latitude)와 경도(Longitude)
// 위도 : 지구의 중심에서 볼 때 360도의 각도
//  위도는 적도(0도)를 기준으로 북쪽 or 남쪽으로 구분함
// 	적도를 기준으로 얼마나 떨어져 있는지 나타내는 위치 
// 	적도를 기준으로 북쪽 북위(N) , 아래쪽 남위(S)로 표시
//	북극점은 90도N(북위90도), 남극점 90도S(남위 90도)

// 경도 : 영국의 옛 그리니치 천문대를 기준으로 동과 서를 (세로로) 표시한 선
//	그리니치 천문대를 기준으로 왼쪽이 서경, 오른쪽이 동경
// 	동경과 서경이 만나는 180도 지점이 날짜가 변경되는 선(날짜변경선)
//	동경(E), 서경(W)
//	180도E(동경 180도), 180도W(서경 180도)
// 경도(x) : x=128.8832573 
// 위도(y) :y=35.2250721
// radius=5000
// sort=distance 

public class LocSearchMain {
	public static void main(String[] args) {
		
		try {
			// 검색 - 한국어 - URLEncoding
			Scanner k = new Scanner(System.in);
			System.out.println("뭐 먹고 싶어?");
			String what = k.next();
//			System.out.println(what);
			what = URLEncoder.encode(what, "UTF-8");
//			System.out.println(what);
//		주소 만들기
			String addr = "https://dapi.kakao.com/v2/local/search/keyword.JSON";
			addr += "?query=" + what; // 검색어
			addr += "&x=128.8832573&y=35.2250721"; // 좌표주소(기준점)
			addr += "&radius=5000"; // 반경
			addr += "&sort=distance"; // 정렬방식설정
			
//		헤더 처리 : 정보를 제공하는 쪽에서 원하는 방식으로 형태를 지정해서 보내줘야 원하는 정보를 얻을 수 있다.
			
			HashMap<String, String> headers = new HashMap<String, String>();
			headers.put("Authorization", "KakaoAK 99ab9d2254d531ebe5ac0b5aaedd820f");
			
			InputStream is = GustoHttpClient.download(addr, headers);
			String str = GustoHttpClient.convert(is, "UTF-8");
			System.out.println(str);
			
//			json
			JSONParser jp = new JSONParser();
			JSONObject jo = (JSONObject) jp.parse(str); // json의 처음은 parse다 get이 아님
			
//			meta
			JSONObject jo2 = (JSONObject) jo.get("meta");
			System.out.println("총 결과 수 : " + jo2.get("total_count"));
			System.out.println("현재 노출 가능 수 : " + jo2.get("pageable_count"));
			
			// 반복문 사용
			// place_name, phone, address_name,distance
			
			JSONArray ja = (JSONArray) jo.get("documents"); // 그다음부턴 get을 쓴다.
			JSONObject jo3 = null;
			for (int i = 0; i < ja.size(); i++) {
				jo3 = (JSONObject) ja.get(i);
				System.out.println("["+(i+1)+"]");
				System.out.println("장소명 : " + jo3.get("place_name"));
				System.out.println("전화번호 : " + jo3.get("phone"));
				System.out.println("전체 지번 주소 : " + jo3.get("address_name"));
				System.out.println("거리 : " + jo3.get("distance"));
				System.out.println("====================================");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
