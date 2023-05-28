import java.util.Random;

public class FMain1 {
//	puiblic static A B (C) {
//		내용
//		Return
//	}
	// B : 함수명 / 기능이 대충이라도 보이게, 동사스럽게, 낙타 OR 뱀체
	// C : 파라미터(PARAMETER) / 해당 함수에서 재료로 쓰일 때 
	//     함수를 호출하는 쪽(main 함수)에서 해당 함수로 데이터를 보낼 때 사용
	//		구조 : (자료형 변수명, 자료형 변수명, ...)
	// A : return type /
	//     해당 함수에서 작업한 결과를 함수 호출하는 쪽(main 함수)으로 보낼 때 
	
	
	// 랜덤한 정수를 하나 구해서 밖으로 보내는 함수 - 3번 함수
	public static int randomNum() {
		Random r = new Random();
		int num = r.nextInt();
		return num;
		// return new Random().nextInt();
	}
	
	// 재료로 가져온 두 정수를 더한 값을 출력해주는 함수 - 2번 함수
	public static void printNum(int a , int b) {
		int printN = a + b;
		System.out.println(printN);
		// System.out.println( a + b);
		
	
	}
	
	public static void main(String[] args) { //함수를 호출하는 쪽 
		//랜덤한 숫자 두개
		int x = randomNum();
		int y = randomNum();
		System.out.println(x);
		System.out.println(y);
		printNum(x, y); // 자리가 바껴도 상관없다
		
	}
	
	
	
}