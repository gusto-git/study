package com.gusto.mar304.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

// 통신
//		Socket 통신 - server가 요청하면 client가 응답하는 것 
//		HTTP 통신 - client가 요청을 하면  server가 그 요청에 맞게 응답 (예 : 네이버)

// Java에 HTTP 통신을 위한 HTTPClient 기능이 '없었음' -> Java로 하기 위해서는 개발 했어야 했다.
// 다른 개발자가 개발을 해서 공개를 해놨음!! - jar파일로 -> 코드는 볼 수는 없지만, 기능 사용은 가능하다 

// apache.org -> 홈페이지 상단  -> release -> http compnents -> 4.5.13(2020.10.6) -> HttpComponents Client
// binary - 4.5.13-bin.zip
public class HMain1 {
	public static void main(String[] args) {
		
		
		try {
			DefaultHttpClient dhc = new DefaultHttpClient();
			
			// 요청 - GET(기본) or POST
			HttpGet hg = new HttpGet("https://www.naver.com");
			
			// 응답
			HttpResponse hr = dhc.execute(hg);
			
			// 응답 내용
			HttpEntity he = hr.getEntity();
			
			// 응답 내용을 가져갈 수 있는 빨대(스트림)
			InputStream is = he.getContent();
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
