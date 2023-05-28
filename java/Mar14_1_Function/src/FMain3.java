import java.util.Scanner;

public class FMain3 {
	
	// 3보다 작은 정수 하나를 입력 받는 함수
	// 3보다 크거나 같을 때 -> 다시 입력 받도록
	public static int getNum() {
		Scanner k = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = k.nextInt();
		return (num <3) ? num : getNum();
	}
	
	// 홀수만 입력받을 수 있는 함수
	// 짝수 입력하면 다시 입력 받도록
	
	public static int getNum2() {
		Scanner k = new Scanner(System.in);
		System.out.print("홀수 만 : ");
		int num = k.nextInt();
		return (num % 2 == 0) ? getNum2() : num;
		
	}
	
	// 0 ~ 100사이의 정수를 입력 받는 함수
	// 범위 안의 숫자가 아니면 다시 입력받도록
	
	
	public static int getNum3() {
		Scanner k = new Scanner(System.in);
		System.out.print("0 ~ 100 : ");
		int num = k.nextInt();
		return (num >= 0) && (num <= 100) ?  num : getNum3();
		
	}
	
	
	
	public static void main(String[] args) {
		int num = getNum();
		System.out.println(num);
		
		int num1 = getNum2();
		System.out.println(num);
		
		int num2 = getNum3();
		System.out.println(num);
		
	}
}
