package com.gusto.mar304.main;
import java.io.InputStream;
import com.gusto.http.client.GustoHttpClient;

// �������� ���ϴ� ����Ʈ ���� �ܼ�â�� �߰� 
// http�� �ϴ°� �̰� �� + �����ϴ°� �ִ�.
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
