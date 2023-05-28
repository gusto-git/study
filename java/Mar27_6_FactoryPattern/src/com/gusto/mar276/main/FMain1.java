package com.gusto.mar276.main;

import com.gusto.mar276.register.Academy;
import com.gusto.mar276.register.Student;

// �п����� �л��� ����� �Ŀ� �ش� Ŀ��ŧ�� ����ڷ� ����Ϸ��� �� 
// �л��� ������ �̸�/����
// ��� ������� ��ȣ�� �ο��ϰ� �ʹٸ� ��� �ؾ��ұ�? �ڵ�ȭ

// ��ü�� �ʿ���� : static �޼ҵ� ���
// ��ü�� �ֱ�� �ؾ��Ѵ�.	
// 		�ϳ� : Singleton Patten(��ü����)
//		������ : 
//		�뷮����, �ڵ�ȭ : Factory Patten // �������� ����
//		������ : ������ �츮�� �ߴ����


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
