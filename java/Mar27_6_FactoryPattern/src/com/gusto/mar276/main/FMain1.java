package com.gusto.mar276.main;

import com.gusto.mar276.register.Academy;
import com.gusto.mar276.register.Student;

// 학원에서 학생을 상담한 후에 해당 커리큘럼 대기자로 등록하려고 함 
// 학생의 정보는 이름/나이
// 등록 순서대로 번호를 부여하고 싶다면 어떻게 해야할까? 자동화

// 객체가 필용벗다 : static 메소드 기반
// 객체가 있기는 해야한다.	
// 		하나 : Singleton Patten(객체기준)
//		여러개 : 
//		대량생산, 자동화 : Factory Patten // 자주하지 않음
//		나머지 : 여지껏 우리가 했던대로


public class FMain1 {
	public static void main(String[] args) {
		Academy ac = new Academy();
		Student s1 = ac.consult("aa", 20);
		s1.printInfo();
		System.out.println("============");
		Student s2 = ac.consult("bb", 21);
		s2.printInfo();
		System.out.println("============");
		Student	s3 = ac.consult("cc", 33);
		s3.printInfo();
		
		
	}
}
