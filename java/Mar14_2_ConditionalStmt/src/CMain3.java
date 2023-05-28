import java.util.Scanner;

public class CMain3 {
	public static void main(String[] args) {
		// 정수 하나 입력 받게
		Scanner k = new Scanner(System.in);
		System.out.println("x : ");
		int x = k.nextInt();
		
		// 조건문 : if, switch
		// switch-case 
		// 비교 조건이 특정 값이나 문자열일 경우
		// break;를 이용해서 각 조건이 만족하면 swtich문이 깨지도록 만들어짐
		
		
//		switch (key) { // key안에 변수  or 식
//		case value: // 값 B
//			//변수 or 식의 값이 A일 때 이 부분 실행
//			break;
//		case value: // 값 B
//			// 변수 or 식의 값이 B일 때 이 부분 실행
//		default:
//			// A값도 아니고, B값도 아니면 이 부분 실행
//			break;
//		}
		
		// x가 1일 때 "ㅋ"를 출력 / 2일 때 "ㅎ" / 3일 때 "ㅜㅜ" 출력
		// 위 세 조건이 아니면 " 졸려..." 출력
		
		switch (x) {
		case 1:
			System.out.println("ㅋ");
			break; // 브레이크가 없으면 계속 이어짐 답이 2개 나옴
		case 2:
			System.out.println("ㅎ");
			break;
		case 3:
			System.out.println("ㅜㅜ");
			break;
		default:
			System.out.println("졸려...");
			break;
		}
	}
}
