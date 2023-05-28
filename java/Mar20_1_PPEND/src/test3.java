import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class test3 {
	// 10개의 숫자를 랜덤으로 뽑아서 (1~100)
	// 배열에 담고 출력
			
	// 10개의 숫자를 직접 입력
	// 배열에 담고 출력
			
	// 랜덤으로 뽑은것 중에 최댓값, 최소값 출력
	// main에 바로 활용
	
	
	
	public static void main(String[] args) {
	// ⓐ : 1~100 사이의 정수 중 10개를 무작위로 뽑기 
	Random r = new Random();
	int[] num = new int[10];
	int randomNum = 0;
	
	for (int i = 0; i < num.length; i++) {
		num[i] = r.nextInt(100)+1;
	}
	
	for (int i : num) {
		System.out.printf(i + " ");
	}
	System.out.println("=================");

	}
}
