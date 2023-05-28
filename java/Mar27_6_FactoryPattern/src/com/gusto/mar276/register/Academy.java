package com.gusto.mar276.register;

//공장 역할을 할 클래스

public class Academy {
	private int studentCount;
	
	//객체를 만들때 사용하는 메소드
	public Student consult(String name, int age) {
		studentCount++;
		Student s = new Student(studentCount, name, age);
		return s;
	}
}
