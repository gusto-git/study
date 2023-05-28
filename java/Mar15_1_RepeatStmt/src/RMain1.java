import java.util.Iterator;
import java.util.Random;

// 반복문(Repeat Statement)
		// "ㅋ" 5번 출력 -> 54번 출력할때 필요한게 반복문 
		// System.out.println("ㅋ");
		
		// 어떤 작업을 50번 반복
//		for (int i = 0; i < args.length; i++) { // for 자동완성 2번째 
//		for (변수 초기화; 조건식 ; 값의 증감){
//			내용
//			}
//		}
//		
//		1. 변수 초기화 -> 2. 조건식 체크(참,true) -> 3. 내용을 출력 
//		4. 값의 증감 -> 5. 조건식 체크(참,true) -> 6. 내용 출력
//		7. 값의 증감 -> 8. 조건식 체크(거짓,false) -> 9. 반복문 종료 
		
		
public class RMain1 {
	public static void main(String[] args) {

		// "ㅋ" 출력 하기 3번 출력
		
		for (int i = 0; i < 3; i++) { // 변수 초기화해라, i가 3번까지 작동하라(0,1,2), i++(i+i) : i에 i를 계속 더해라 
			System.out.println(i +"ㅋ");	
		}
		System.out.println("-=-=-=-=-=-=-1=--=-=-=-=-");
		// 1부터 5까지 차례로 출력
		for (int i = 1; i < 6; i++) {
			System.out.println(i); // 변수 초기 값이 1일 때 
		}
		// 강사님 //
		for (int i = 0; i < 5; i++) {
			System.out.println(i+1); //변수 초기 값이 0일 때 
		}
		System.out.println("-=-=-=-=-=-=-2=--=-=-=-=-");
		
		// 5부터 1까지 차례로 출력 //
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("-=-=-=-=-=-=-3=--=-=-=-=-");
		// 1부터 21까지 홀수만 출력 //
		for (int i = 1; i < 22 ; i+=2) {
			System.out.println(i);
		}
		System.out.println("-=-=-=-=-=-=-4=--=-=-=-=-");
		// 반복문 5번 도는 동안에 1~10사이의 숫자를 랜덤하게 뽑고 싶을 때
		Random r = new Random();
		int x = r.nextInt(10)+1;
		for (int i = 0; i < 5; i++) {
			System.out.println(x);// 반복문 밖에서 뽑은 숫자가 5번 반복 되기 때문에 틀린 것
		}
		System.out.println("-=-=-=-=-=-=-5=--=-=-=-=-");
		// 반복문 안에서 변수 생성은 별로다.
		for (int i = 0; i < 5; i++) {
			int x2 = r.nextInt(10)+1;
			System.out.println(x2);
		}
		System.out.println("-=-=-=-=-=-=-6=--=-=-=-=-");
		// 반복문 밖에서 변수 생성하기.
		int x3 = 0;
		for (int i = 0; i < 5; i++) { // int i = 0 도 밖에 생성 할 순 있다. 
			x3 = r.nextInt(10)+1; // 변수 '생성' x -> 변수 값 '변경'
			System.out.println(x3);
		}
		// 반복문 안에서 만든 변수는 반복문 밖에서 활용이 불가능하다.
		// 반복문 밖에서 만든 변수는 반복문 밖에서 활요이 가능해 효율적이다.
		
		
		System.out.println("-=-=-=-=-=-=-7=--=-=-=-=-");
		for (int i = 0; i < 5; i++) {
			System.out.println(r.nextInt(10)+1); //변수 생성 안하고 하기 
		}
		
		System.out.println("-=-=-=-=-=-=-8=--=-=-=-=-");
		// 1부터 10까지 숫자 모두 더한 값 출력
		int sum = 0; // 다 더한 값을 담을 변수 하나 생성(반복문 밖에)
		for (int i = 1; i < 11; i++) {
			//System.out.println(i);
			sum += i; //sum = sum + i;
			System.out.println(sum); // 반목문 안에서 출력하면 순서가 모두 출력 
		}
		System.out.println("-=-=-=-=-=-=-9=--=-=-=-=-");
		// 7!(팩토리얼) 
		int fac = 1; // 팩토리얼의 값을 담을 변수 만듬 * /는 초기값 1로 지정해하ㅣㅁ
		for (int i = 1; i < 8; i++) {
			fac *= i;
			System.out.println(i);
			System.out.println(fac);
		}
		System.out.println("-=-=-=-=-=-=-10=--=-=-=-=-");
		
		
		// 1 ~ 50 까지 숫자 중에 
		// 3의 배수이거나 5의 배수인 숫자만 다 더한 값을 출력
		// 반복문 + 조건문 합치는 것 
		int sum2 = 0;
		for (int i = 1; i < 51; i++) {
			if (i % 3 == 0) {
				sum2 += i;
			}else if (i % 5 ==0) {
				sum2 += i;
			}
		}
		System.out.println(sum2);
		
		
		//System.out.println(sum); // 반복문 밖에서 출력하면 최종 값만 출력
	
		
	}
}
