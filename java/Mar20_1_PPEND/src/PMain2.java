import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class PMain2 {
	public static void main(String[] args) {
		// 10개의 숫자를 랜덤으로 뽑아서 (1~100)
		// 배열에 담고 출력
		///////////////////////////////////////
		// 10개의 숫자를 직접 입력
		// 배열에 담고 출력
		//////////////////////////////////////
		// 랜덤으로 뽑은것 중에 최댓값, 최소값 출력
		int[] num = new int[10];
		Random r = new Random();
		int a = 0;
		for (int i = 0; i < num.length; i++) {
			a = r.nextInt(100)+1;
			num[i] = a;
		}
		
		for (int i : num) {
			System.out.print(i + " ");
		}
		System.out.println("=================");
		///////////////////////////////////
		// 최대값, 최소값을 배열의 0번째 숫자라고 가정
		
		int max = num[0]; // 배열의 0번째 요소를 최대값이라 가정
		int min = num[0]; // 배열의 0번째 요소를 최소값이라 가정
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) { //내가 가정한 숫자가 num[i]요소보다 작다면
				max = num[i]; // 더 큰  숫자를 max 그릇에 옮겨 담기
			} else if (min > num[i]) {//내가 가정한 숫자가 num[i]수 보다 크다면
				min = num[i];// min에 더 작은 숫자를 담기 
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		
		
		int[] num2 = new int[10];
		Scanner k = new Scanner(System.in);
		int b = 0;
		for (int i = 0; i < num2.length; i++) {
			System.out.printf("%d번째 숫자", i+1);
			b = k.nextInt();
			num2[i] = b;
		}
		for (int i : num2) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("================");
		///////////////////////////////////// 

		
		
		
		
	}
}
