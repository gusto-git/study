package com.gusto.apr032.main;

import java.util.HashMap;
import java.util.Set;

// Map 계열(Python : dict / Object-C : NSDictionary)
//	가변 사이즈
//	<Key, Value>
//	Key값도 지정해줘야함
//	순서 개념 x
//	HashMap, HashTable.. 

public class MapMain {
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("아메리카노", 3200);
		hm.put("카페라떼", 3800);
		hm.put("레몬에이드", 7700);
		hm.put("녹차라떼", 3900);
		hm.put("카페라떼", 4200);
		// 카페라떼는 key값이 같지만, HashMap은 값 수정이 가능해서 제일 마지막에 저장된 Value값으로 '수정'됨
		
		//Key값을 넣으면 value값을 출력
		System.out.println(hm.get("카페라떼"));  
		
//	key값만 추출하는 방법
		Set<String> k = hm.keySet(); // set은 단순 저장용도, hashset은 저장후 사용하겠다.
		for (String s : k) {
			System.out.println(s); // key값만 추출
			System.out.println(hm.get(s)); // 해당 key에 맞는 value
			System.out.println("=================================");
		}
		
		
	}
}
