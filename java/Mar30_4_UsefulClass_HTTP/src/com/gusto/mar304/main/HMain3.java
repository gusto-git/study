package com.gusto.mar304.main;

import java.io.InputStream;

import com.gusto.http.client.GustoHttpClient;

public class HMain3 {
	public static void main(String[] args) {
		try {
			String address = "https://www.naver.com";
			InputStream is = GustoHttpClient.download(address);
			
			String result = GustoHttpClient.convert(is, "UTF-8");
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
