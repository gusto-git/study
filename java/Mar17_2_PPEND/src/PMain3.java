import java.util.Scanner;

public class PMain3 {
	//정수 2개 넣으면 그 합을 출력하는 함수
	// main으로 가져와서 

	public static void printSum(int a, int b) {
		System.out.printf("%d + %d = %d\n",a, b, a+b);
	}
	
	// 정수 3개를 넣으면 그 합을 출력하는 함수
	// main으로 가져와서
	
	// **오버로딩 : 파라미터가 다르면 함수명이 같아도 괜찮다.
	// 본질이 같아야한다.(합을 구하는것)
	public static void printSum(int a, int b, int c) {// 오버로딩 사용한 것
		System.out.printf("%d + %d + %d = %d\n" , a, b, c, a+b+c); 
	}
	
	// 정수 n개를 넣으면 그 곱을 출력하는 함수
	// main으로 가져와서
	
	public static void printMul(int...is) {//자료형...변수명 -> 무제한 파라미터 
		int mul = 1;
		for (int i = 0; i < is.length; i++) { // 0부터 ~ is의 길이만큼 
			mul *= is[i];
		}
		System.out.println(mul);
	}
	
	public static void main(String[] args) {
		printSum(10, 20);
		printSum(10, 20, 30);
		printSum(10, 20, 50);
		printMul(10,2,5,6,7,9);
	}
}
