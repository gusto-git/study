package com.gusto.apr131.main;

import java.util.Scanner;

// View - �����̳�
//	���������� ����� ���� ���� -> ��/��� 
public class V { // 1 : V���� ���Ϲ��� ���� C�� ���ļ� M���� ����.
	// X�� �Է¹޴� �޼ҵ�
	public static int getX() {
		Scanner k = new Scanner(System.in);
		System.out.print("x : ");
		int x = k.nextInt();
		return x; // M������ X�� ������
	}
	
	// Y�� �Է¹޴� �޼ҵ�
	public static int getY() {
		System.out.print("y : ");
		return new Scanner(System.in).nextInt(); // M������ Y�� ���� ��
	}
	
	// Z�� ����ϴ� �޼ҵ�
	// M���� ����� �� �޾ƿͼ� �Ķ���ͷ� �� ��
	public static void printResult(int z) {
		System.out.println(z);
	}
	
}
