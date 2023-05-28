package com.gusto.mar304.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

// ���
//		Socket ��� - server�� ��û�ϸ� client�� �����ϴ� �� 
//		HTTP ��� - client�� ��û�� �ϸ�  server�� �� ��û�� �°� ���� (�� : ���̹�)

// Java�� HTTP ����� ���� HTTPClient ����� '������' -> Java�� �ϱ� ���ؼ��� ���� �߾�� �ߴ�.
// �ٸ� �����ڰ� ������ �ؼ� ������ �س���!! - jar���Ϸ� -> �ڵ�� �� ���� ������, ��� ����� �����ϴ� 

// apache.org -> Ȩ������ ���  -> release -> http compnents -> 4.5.13(2020.10.6) -> HttpComponents Client
// binary - 4.5.13-bin.zip
public class HMain1 {
	public static void main(String[] args) {
		
		
		try {
			DefaultHttpClient dhc = new DefaultHttpClient();
			
			// ��û - GET(�⺻) or POST
			HttpGet hg = new HttpGet("https://www.naver.com");
			
			// ����
			HttpResponse hr = dhc.execute(hg);
			
			// ���� ����
			HttpEntity he = hr.getEntity();
			
			// ���� ������ ������ �� �ִ� ����(��Ʈ��)
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
