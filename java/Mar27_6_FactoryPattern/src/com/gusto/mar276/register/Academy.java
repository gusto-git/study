package com.gusto.mar276.register;

//���� ������ �� Ŭ����

public class Academy {
	private int studentCount;
	
	//��ü�� ���鶧 ����ϴ� �޼ҵ�
	public Student consult(String name, int age) {
		studentCount++;
		Student s = new Student(studentCount, name, age);
		return s;
	}
}
