import java.util.Scanner;

public class YMain2 {
	// f1 이름의 함수
	// 정수 하나 입력 받음
	// 양수면 "양" / 0 이면 "0" / 음수면 "음" 출력
	
	// f2 이름의 함수
	// 정수 하나 입력 받음
	// 3의 배수면 "3의 배수"
	// 4의 배수면 "4의 배수"
	// 둘 다 해당하지 않으면 "몰라"
	// *간혹 3의 배수이면서 4의 배수인 경우 "3의 배수 + 4의 배수" *
	// 출력 아니고 값을 구하기만 함
	
	// f1, f2 모두 console에 실행 되게(각각의 답이 보이게)
	
	
	public static void f1() {
		Scanner k = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = k.nextInt();
		
		if (num > 0) {
			System.out.println("양");
		}else if (num < 0) {
			System.out.println("음");
		} else {
			System.out.println(0);
		}
		
	}
	
	public static String f2() {
		Scanner k = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = k.nextInt();
		
		String answer = "";
		if (num % 12 == 0) { // i % 3 == 0 && i % 4 == 0
			answer = "3의 배수 + 4의 배수";
		}else if (num % 3 == 0) {
			answer = "3의 배수";
		}else if (num % 4 == 0) {
			answer = "4의 배수";
		}else {
			answer = "몰라";
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		f1();
		String f = f2();
		System.out.println(f);
	}
	
	
	
	
	
	
	
	
}
