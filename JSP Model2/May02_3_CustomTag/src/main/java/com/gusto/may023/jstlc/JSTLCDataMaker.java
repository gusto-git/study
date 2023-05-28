package com.gusto.may023.jstlc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class JSTLCDataMaker {
	public static void make(HttpServletRequest request) {
		int[] ar = {123, 456, 78, 90, 2345};
		request.setAttribute("ar", ar);
	
	
	// ArrayList 이용해서
	// 사람, 이름, 나이, 키, 몸무게를 4~5개를 넣어두고
	// jstl 반복문 사용해서 정보 모두 뽑아보기
	
	ArrayList<Person> al = new ArrayList<Person>();
	al.add(new Person("lee",3,50.56,12.2));
	al.add(new Person("kim",4,53.56,15.7));
	al.add(new Person("park",6,56.56,17.9));
	al.add(new Person("hwang",5,84.32,13.7));
	al.add(new Person("choi",9,67.21,12.5));
	request.setAttribute("al", al);
	
	
	
	}
}
