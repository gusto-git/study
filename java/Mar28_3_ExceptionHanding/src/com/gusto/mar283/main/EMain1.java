package com.gusto.mar283.main;
import java.util.Scanner;

public class EMain1 {
	
		// ���α׷� ���� -> �ܼ�â�� ���� �۾��� ~~~ �����°� -> ���� / ���� / �����˸� / ��� ??
		
		// error
		// 		�ѱ���  - ���� - ����
		//  	���             apple
		// 		�ٳ���            banana
		// 		����              ?? 
		// 		Java ������ ���� �ʰ� �Ἥ Compile�� �Ұ����� ����
		//      �������� �߸�!
		
		// warning
		//		������ Ʋ�� �� �ƴϳ�, �ڵ尡 �������ϴ�
		//		�����ڰ� �߸�!
		//  	�������� ���� , �ϼ���(���)�� �������� -> ������ �����ϴ�.
		//  	IDE(��Ŭ����)�� �ܼҸ��� �� �� 
		//  	EX) Scanner ��ü�� ����� ���� -> ����� �ݾƾ���(k.close();) -> ����ٷ� ǥ����
		
		// exception
		// 		���α׷� ��ü�� 100% �ϼ�
		// 		������ �� ���� �ܺ����� ���ο� ���ؼ� �۵��� ����� ���� �ʴ� ��Ȳ
		//      ������ �߸��� �ƴ�
		//		������ ���� -> �����ڰ� ��Ȳ�� �����ؼ� ��å�� ��������...
	
	
	public static void main(String[] args) {
		// x��, y�� �Է¹޾Ƽ�
		// ��Ģ����(�����θ�) ���� ���
		
		Scanner k = new Scanner(System.in);
		System.out.print("x : ");
		int x = k.nextInt();
		
		System.out.print("y : ");
		int y = k.nextInt();
		
		System.out.println(x+y);
		System.out.println(x-y); 
		System.out.println(x*y);
//		System.out.println(x/y); /0 �� ���� exception�� ǥ�� �ȴ�.
		
		
		// ���࿡ �ΰ��� ������ ���ÿ� �������..? -> ���� ���� catch���븸 ����� �ȴ�.
		// 	java ���� : ù��° ���ܰ� ������ ��, ��� ���� ���� �� �ش� ����ó�� �κ����� �Ѿ�� ����
		
		// x: 10 , y: 0 => 56�� try -> 57�� x/y -> 61�� -> 62�� syso -> 
		// x: 10 , y: 1 => 56�� try -> 57�� x/y -> 59�� -> 63�� -> 64�� syso ->
		// x: 2 , y : 1 => 56�� try -> 57�� x/y -> 59�� -> 60�� syso -> 
		
		
//		try {
//			int d = x / y;
////			System.out.println(d); 
//			int[] ar = {1,2,3};
//			System.out.println(ar[d]);
//		} catch (ArithmeticException ae) { ���࿡ y�� 0�� ������ ..? ArithmeticException : ���� ������ ���� �س��� �� 
//			System.out.println("0���� ��� ����!!");
//		} catch (IndexOutOfBoundsException e) { IndexOutOfBoundsException : �迭�� ��� ���� 
//			System.out.println("�� �迭�� �ش��ϴ� index�� ���ٰ�");
//		}
		
		try {
			int d = x / y;
			int[] ar = {1,2,3};
			System.out.println(ar[d]);
		} catch (Exception e) { // ��~�� exception�� �� ����� , ��� �������� �� �� ����. , ������  �̰� ���� 
			System.out.println("�ȵǴ�?");
			e.printStackTrace(); // ��Ȳ��� (�����ڿ�)
		} finally {
			System.out.println("���� ������ ����ȴ� ������ ");
		}
	}
}

// Exception ó����� :  try catch �ڵ��ϼ�
//try {
//		// �ϴ� �� �κ��� ���� - (����)
//	} catch (���������� ������) {
//		try ���� �����ϴٰ� �ش� ������ ���ܰ� �߻��ϸ� �� �κ� ����
//		���࿡ try�� ���������� ������ �ƴٸ�, catch�κ��� �׳� ����ġ�� ���� �ҽ��� �����Ѵ�.
//	} catch (Exception e) {
//		// TODO: handle exception
//	} finally {
//		���������� ���α׷��� ���� �ƴ���, ���ܰ� �������� ������� �����Ѵ�. -> return���� �켱������ �����Ѵ�.
//	}
	
	