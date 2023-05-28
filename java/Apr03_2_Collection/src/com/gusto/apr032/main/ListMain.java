package com.gusto.apr032.main;

import java.util.ArrayList;
import java.util.Comparator;

// ArrayList
//		요소를 인덱스로 사용, 배열과 유사 
//		배열 : 사이즈가 고정 ->  data 수가 배열 크기보다 커지면 저장이 불가능!
//		ArrayList : 저장되는 데이터 수에 따라서 크기가 자동적으로 변경이 된다.
//		요소가 가득차면, ArrayList크기를 동적으로 증가 시키고, 반대도 가능하다.
//		자료형을 섞어서 데이터를 넣는 것이 가능! -> 좋다? -> 글쎄....

//		자료형을 통일하고 싶다?
//		< > - generic
//			자료형을 고정하는 역할
//			클래스명<자료형의 객체형> 값을 넣으면
//			

public class ListMain {
	public static void main(String[] args) {
		ArrayList test = new ArrayList();
		test.add("점심시간지남");
		test.add(315);
		test.add(true);
		test.add(4.3);
		for (Object o : test) { // 자료형이 통일되지 않아 Object 나옴
			System.out.println(o);
		}
		System.out.println("-----------------------------------");
		ArrayList<String> al = new ArrayList<String>();
		al.add("초콜릿");
//		al.add(100); // String으로 고정되어 다른 형태를 넣으면 오류가생긴다.
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(new Integer(100));
		al2.add(50); // auto-boxing으로 그냥 써도 된다.
		System.out.println(al2.size()); // al2의 요소 개수 출력
		System.out.println(al2.get(0));
		System.out.println("-----------------------------------");
		for (int i = 0; i < al2.size(); i++) {
			System.out.println(al2.get(i));
		}
	
		al2.add(30);
		al2.add(1, 90); // 1번 자리에 90을 넣기
		al2.set(0,0); // 0번 자리를 0으로 바꿔라
		al2.remove(0); // 0번 자리를 삭제하라
		for (Integer ii : al2) {
			System.out.println(ii); // 교체가 아니라 원래 1번의 자리에 있던게 2번으로 밀림 
		}
		System.out.println("-----------------------------------");
		al.add("사탕");
		al.add("붕어빵");
		al.add("젤리");
		al.add("아이스크림");
		al.add("껌");
		
		al2.add(132);
		al2.add(152);
		al2.add(387);
		al2.add(1234);
		al2.add(21574);
		al2.add(1);
		System.out.println("-----------------------------------");
//	정렬 기능
		Comparator<String> c = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
			
				return o1.compareTo(o2); // 가나다 순으로 정렬(오름차순)
			}
		};
		al.sort(c);
		for (String ss : al) {
			System.out.println(ss); 
		}
		System.out.println("-----------------------------------");
//	al2 내림차순
		
		Comparator<Integer> c2 = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1); // 내림차순 정렬
			}
		};
		al2.sort(c2);
		for (Integer i : al2) {
			System.out.println(i);
		}
		
	}
}
