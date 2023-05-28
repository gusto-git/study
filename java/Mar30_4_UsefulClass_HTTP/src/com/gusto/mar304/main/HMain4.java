package com.gusto.mar304.main;
import java.io.InputStream;
import com.gusto.http.client.GustoHttpClient;

// 여러분이 원하는 사이트 내용 콘솔창에 뜨게 
// http로 하는건 이게 끝 + 응용하는게 있다.
public class HMain4 {
	public static void main(String[] args) {
		try {
			String address = "https://www.google.com";
			InputStream is = GustoHttpClient.download(address);
			String result = GustoHttpClient.convert(is, "UTF-8");
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
