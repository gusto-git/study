package com.gusto.mar271.main;

// IMain1.java���� ���� Scanner�� ������ �̰͸� ����ϰڴ�! ��� �ǹ�
import com.gusto.mar271.machine.Scanner;

public class IMain1 {
	public static void main(String[] args) {
		// ��ü�� ���� �� ��Ű������ ���������� ���
		//		- �ڹ� �⺻ ��Ű��(java.lang)�Ҽ�, ��ܿ� import ���ص� �Ǵ°�
		
		/* java.lang. �����Ǿ� ���� */ String s1 = "��"; 
		/* java.lang. �����Ǿ� ���� */System.out.println(s1);
		
		// ���� ��Ű�� �Ҽ��϶��� ��������
		/* com.gusto.mar271.main.*/Lee l = new /* com.gusto.mar271.main.*/ Lee();
		
		// �ٸ� ��Ű�� �Ҽ��϶� ��ܿ� import�� �����ȴ�.
		Scanner s = new Scanner(); 
		// �̷��� �ۼ��ص� ������ �� ��ܿ� import�� �־ ������ �����ϴ�.
		com.gusto.mar271.machine.Scanner s2 = new com.gusto.mar271.machine.Scanner();
	}
}
