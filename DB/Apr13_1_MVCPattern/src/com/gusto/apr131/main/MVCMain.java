package com.gusto.apr131.main;

import java.util.Scanner;

// ���α׷� ����
// 		����
//		��������

// ������Ʈ
//		��
//		PM(Project Manager)
//		PL(Project Leader)
//		������ A : Back-end
//		������ B : Front-end
//		�����̳� A
//		�����̳� B 
//		...

// MVC ����
//		������ ������ �۾�, ���� �ϳ� �� �ϳ��� ���Ҹ�
//		M - Model - ���� �����Ͻ� ����(���, DB, ...)
//		V - View  - ���� ����ڰ� ������ ���� ����(�Է�/���)
//		C - Controller - ��Ȳ�� �Ǵ��ؼ� M�� ��ȯ or V�� ��ȯ
public class MVCMain {
	public static void main(String[] args) {
		// x�� �Է¹ް�, y�� �Է¹޾Ƽ�
		// ���� �ϳ� ���� x + y �� �ְ�
		// syso�� x + y �� ���
		
		Scanner k = new Scanner(System.in);
		System.out.print("x : ");
		int x = k.nextInt();
		System.out.print("y : ");
		int y = k.nextInt();
		System.out.println(x+y);
				
	}
}
