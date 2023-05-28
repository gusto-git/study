package com.gusto.apr032.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

// Set계열
//	가변사이즈
//	중복데이터 자동 삭제
//		같은 객체가 여러번 들어가면 하나만 남김
//	순서가 랜덤
//	HashSet, TreeSet, ... .
//		-> 실전에서 그닥 유용하지 않음

public class SetMain {
	public static void main(String[] args) {
//	HashSet 자동 중복제거 확인
		HashSet<String> hs = new HashSet<String>();
		hs.add("ㅁㅁ");
		hs.add("ㅁㅁ");
		hs.add("ㅇㅇ");
		hs.add("ㅎㅎ");
		hs.add("ㅁㅁ");
		hs.add("ㅁㅁ");
		System.out.println(hs.size()); // 결과 : 3 / 중복 제거가 됨
		System.out.println("---------");
		for (String s : hs) { 
		// 남은 요소가 뭐가 있는지는 알 수 있으나, 중복 요소 중 어디가 삭제된지는 알지 못함
			System.out.println(s);
			System.out.println("---------");
		}
//	ArrayList로 데이터를 받아오자 -> 정수 10개(중복값이 있도록)
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(101);
		al.add(102);
		al.add(101);
		al.add(101);
		al.add(103);
		al.add(104);
		al.add(105);
		al.add(100);
		al.add(101);
		al.add(104);
		System.out.println(al);
		
//	중복제거 : set에 list를 담아서 중복 제거!
		HashSet<Integer> hs2 = new HashSet<Integer>(al);
		al = new ArrayList<Integer>(hs2); // 중복제거 후 다시 list로 넣기
//	중복제거 후 내림차순
		Comparator<Integer> c = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1.compareTo(o2);
			}
		};	
		al.sort(c);
		for (Integer integer : hs2) {
			System.out.println(integer);
		}
	}
}
