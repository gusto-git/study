
public class WhatIsValue {
	// 알고 싶은 자료형의 기본값을 멤버 변수로

	
	// 기본형 - 정수
	byte byteFiled;
	short shortField;
	int intFiled;
	long longFiled;
	
	// 기본형 - 실수
	float  floatField;
	double doubleField;
	
	// 기본형 - 논리, 문자
	boolean booleanField;
	char charField;
	
	// 참조형 - 문자열, 배열
	String stringField;
	int[] arrayField;
	
	// 출력하는 메소드
	public void printInfo() {
		System.out.println("byte : " + byteFiled);
		System.out.println("short : " + shortField);
		System.out.println("int : " + intFiled);
		System.out.println("long : " + longFiled);
		
		System.out.println("float : " + floatField);
		System.out.println("double : " + doubleField);
		
		System.out.println("boolean : " + booleanField);
		System.out.println("char : " + charField);
		
		System.out.println("string : " + stringField);
		System.out.println("int[] : " + arrayField);
	}
}
