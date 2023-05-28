package com.gusto.mar283.main;
import java.io.FileReader;
import java.util.Scanner;

import com.gusto.mar283.calculator.Calculator;

public class EMain3 {
	public static void main(String[] args) {
		// txt파일을 받아와서 뭔가 할건데...
		// 이 텍스트 파일을 지워버렸거나, 없는 파일이라면?
		try {
			FileReader fr = new FileReader("C:\\Users\\yt866\\Desktop\\test.txt"); //  / or \\ 쓰면된다.
			System.out.println(fr.read());
		} catch (Exception e) {
//			e.printStackTrace();
		}
		
		// 가격, 무게(g)를 입력받아서(정수)
		// g당 가격이 얼마인지 main에 출력
		
		Scanner k = new Scanner(System.in);
		System.out.print("가격(원) : ");
		int price = k.nextInt();
		System.out.print("무게(g) : ");
		int weight = k.nextInt();
		
//		System.out.printf("g당 가격은 : %d원\n", price / weight);
		int z1 = Calculator.divide(price, weight);
		System.out.printf("g당 가격은 : %d원\n", z1);
		
		try {
			int z2 = Calculator.divide(price, weight);
			System.out.printf("g당 가격은 : %d원\n", z2);
		} catch (Exception e) {
			System.out.println("이건뭐지");
			e.printStackTrace();
		} 
// 		main method가 아닌 다른 method에서 try - catch를 사용하는 것은 월권 행위다 
// 		다른 method에서는 throws를 더 많이 사용한다
		
	}
}
