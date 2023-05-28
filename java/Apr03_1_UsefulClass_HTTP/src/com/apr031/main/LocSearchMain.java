package com.apr031.main;

import java.io.InputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.gusto.http.client.GustoHttpClient;

// REST API Ű	99ab9d2254d531ebe5ac0b5aaedd820f
// JavaScript Ű	28d5f3c7845eabe50d1ac58383d320c8

// ���� ���ϴ� ���(�츮��) �ݰ� 5km���� �˻��� Ű���尡 ���Ե�
// ���Ե��� �Ÿ� �������� ����
// 15���� ���������� 

// ����(Latitude)�� �浵(Longitude)
// ���� : ������ �߽ɿ��� �� �� 360���� ����
//  ������ ����(0��)�� �������� ���� or �������� ������
// 	������ �������� �󸶳� ������ �ִ��� ��Ÿ���� ��ġ 
// 	������ �������� ���� ����(N) , �Ʒ��� ����(S)�� ǥ��
//	�ϱ����� 90��N(����90��), ������ 90��S(���� 90��)

// �浵 : ������ �� �׸���ġ õ���븦 �������� ���� ���� (���η�) ǥ���� ��
//	�׸���ġ õ���븦 �������� ������ ����, �������� ����
// 	����� ������ ������ 180�� ������ ��¥�� ����Ǵ� ��(��¥���漱)
//	����(E), ����(W)
//	180��E(���� 180��), 180��W(���� 180��)
// �浵(x) : x=128.8832573 
// ����(y) :y=35.2250721
// radius=5000
// sort=distance 

public class LocSearchMain {
	public static void main(String[] args) {
		
		try {
			// �˻� - �ѱ��� - URLEncoding
			Scanner k = new Scanner(System.in);
			System.out.println("�� �԰� �;�?");
			String what = k.next();
//			System.out.println(what);
			what = URLEncoder.encode(what, "UTF-8");
//			System.out.println(what);
//		�ּ� �����
			String addr = "https://dapi.kakao.com/v2/local/search/keyword.JSON";
			addr += "?query=" + what; // �˻���
			addr += "&x=128.8832573&y=35.2250721"; // ��ǥ�ּ�(������)
			addr += "&radius=5000"; // �ݰ�
			addr += "&sort=distance"; // ���Ĺ�ļ���
			
//		��� ó�� : ������ �����ϴ� �ʿ��� ���ϴ� ������� ���¸� �����ؼ� ������� ���ϴ� ������ ���� �� �ִ�.
			
			HashMap<String, String> headers = new HashMap<String, String>();
			headers.put("Authorization", "KakaoAK 99ab9d2254d531ebe5ac0b5aaedd820f");
			
			InputStream is = GustoHttpClient.download(addr, headers);
			String str = GustoHttpClient.convert(is, "UTF-8");
			System.out.println(str);
			
//			json
			JSONParser jp = new JSONParser();
			JSONObject jo = (JSONObject) jp.parse(str); // json�� ó���� parse�� get�� �ƴ�
			
//			meta
			JSONObject jo2 = (JSONObject) jo.get("meta");
			System.out.println("�� ��� �� : " + jo2.get("total_count"));
			System.out.println("���� ���� ���� �� : " + jo2.get("pageable_count"));
			
			// �ݺ��� ���
			// place_name, phone, address_name,distance
			
			JSONArray ja = (JSONArray) jo.get("documents"); // �״������� get�� ����.
			JSONObject jo3 = null;
			for (int i = 0; i < ja.size(); i++) {
				jo3 = (JSONObject) ja.get(i);
				System.out.println("["+(i+1)+"]");
				System.out.println("��Ҹ� : " + jo3.get("place_name"));
				System.out.println("��ȭ��ȣ : " + jo3.get("phone"));
				System.out.println("��ü ���� �ּ� : " + jo3.get("address_name"));
				System.out.println("�Ÿ� : " + jo3.get("distance"));
				System.out.println("====================================");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
