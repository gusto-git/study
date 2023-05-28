import java.util.Scanner;

// 연산자 >> stack 영역의 대상 
// 연산자 값이 도출되려면 ? >> boolean을 사용한다. boolean = 기본형 

// 연산자
//		단항연산자 : a++; !a, ...
//		이항연산자 : a + b , a < 10 , ...
//		삼항연산자 : ***
//			ㄴ조건을 따져서 값을 대입할 때 
//			ㄴif(조건문) 대신 사용 가능
//			ㄴ조건식 ? 조건이 만족하면 여기 실행 : 불만족하면 여기 실행
public class OMain3 {
	public static void main(String[] args) {

		int age = 5;
		// 예제) 삼항연산자
		// 20살 보다 적으면 아직 어리구만ㅋ
		// 많으면 성인이시네요
		
		String sayWhat = (age < 20) ? "아직어리구만" : "성인이시네요";
		System.out.println(sayWhat);
		
		// 예제 
		// 숫자를 콘솔에 입력받아서 
		// 짝수면 [짝수] , 홀수면 [홀수]가 출력 되게 
		
		Scanner k = new Scanner(System.in);
		System.out.print("숫자 입력해 : ");
		int num = k.nextInt();
		String r = num % 2 == 0 ? "짝수" : "홀수";
//		String r = num % 2 == 1 ? "홀수" : "짝수";
		System.out.println(r);
		
		// 숫자가 50 이상이면 강녕하세요?
		// 숫자가 50 미만이면 안녕하세요?
		
//		System.out.print("숫자 입력해 : ");
//		int num1 = k.nextInt();
		String r2 = num >= 50 ? "강녕하세요?" : "안녕하세요?";
//		String q = num >= 50 ? "강녕하세요?" : "안녕하세요?";
		System.out.println(r2);
		
		
		
	}

}
