
public class FMain4 {
	// 오버로딩(OverLoading) **
	// 함수명을 같게, 파라미터를 다르게 하는 기술
	// 함수를 호출할 때 어떤 값을 넣었느냐에 따라
	// 해당하는 함수가 다르게 불러지는 기술
	
	//	1. 같은 자료형을 써도 파라미터의 개수가 다르면 o
	//	2. 파라미터의 개수가 같아도, 다른 자료형을 쓰면 o
	
	// 정수 2개를 넣으면 그 합을 출력해주는 함수
	public static void printSum(int a , int b) {
		System.out.println(a + b);
		
	}
	// 정수 3개를 넣으면 그 합을 출력해주는 함수
	public static void printSum(int a, int b, int c) {
		System.out.println(a + b + c);
	}	
	// 실수 3개를 넣으면 그합을 출력해주는 함수
	public static void printSum(double a, double b, double c) {
		System.out.println(a + b + c);
	}
	// 예제	
	// 정수 1개를 넣으면 >> 곧! << 이라는 단어가 출력되는 함수
	public static void putin(int a) {
		System.out.println("곧!");
	}
	// 문자열 1개 넣으면 >> 수업이!! <<라는 단어가 출력되는 함수
	public static void putin(String b) {
		System.out.println("수업이!!");
	}
	/// 아무것도 넣지 않으면 >> 끝납니다!! <<라는 단어가 출력되는 함수
	public static void putin() {
		System.out.println("끝납니다!");
	}
	
	/// 오버로딩 사용
	
	public static void main(String[] args) {
//		printSum(10, 20);
//		printSum(10, 20, 30);
//		printSum(10, 10.5, 20);
		putin(1);
		putin("d");
		putin();
	}
}
