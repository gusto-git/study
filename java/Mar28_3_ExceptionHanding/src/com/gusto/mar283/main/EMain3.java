package com.gusto.mar283.main;
import java.io.FileReader;
import java.util.Scanner;

import com.gusto.mar283.calculator.Calculator;

public class EMain3 {
	public static void main(String[] args) {
		// txt������ �޾ƿͼ� ���� �Ұǵ�...
		// �� �ؽ�Ʈ ������ �������Ȱų�, ���� �����̶��?
		try {
			FileReader fr = new FileReader("C:\\Users\\yt866\\Desktop\\test.txt"); //  / or \\ ����ȴ�.
			System.out.println(fr.read());
		} catch (Exception e) {
//			e.printStackTrace();
		}
		
		// ����, ����(g)�� �Է¹޾Ƽ�(����)
		// g�� ������ ������ main�� ���
		
		Scanner k = new Scanner(System.in);
		System.out.print("����(��) : ");
		int price = k.nextInt();
		System.out.print("����(g) : ");
		int weight = k.nextInt();
		
//		System.out.printf("g�� ������ : %d��\n", price / weight);
		int z1 = Calculator.divide(price, weight);
		System.out.printf("g�� ������ : %d��\n", z1);
		
		try {
			int z2 = Calculator.divide(price, weight);
			System.out.printf("g�� ������ : %d��\n", z2);
		} catch (Exception e) {
			System.out.println("�̰ǹ���");
			e.printStackTrace();
		} 
// 		main method�� �ƴ� �ٸ� method���� try - catch�� ����ϴ� ���� ���� ������ 
// 		�ٸ� method������ throws�� �� ���� ����Ѵ�
		
	}
}
