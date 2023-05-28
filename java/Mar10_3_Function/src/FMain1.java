// Function(함수)
// 관련있는 기능(작업)들을 묶어놓고
// 필요할 때마다 불러서(호출해서) 사용이 가능!

// JDK(자바 개발 키트) 안에 JRE(자바 실행 환경)이 있다.
// 프로그램 실행시 JRE가  OS(운영체제)에 맞춰서 > JVM(자바 가상머신)을 불러준다.
// WORA(Write Once Run  Anywhere) -> 한번 써놓으면 어디서든 실행이 가능하다.
// OS별로 프로그램을 만들지 않아도 된다.

public class FMain1 {
	//Public static 리턴타입 함수명(파라미터, 파라미터){
	//내용
	//return
	//}
	
	// 리턴타입 : 리턴(반환) 될 값의 자료형
	// 함수 안에서 식이 완성되고, main으로 반환할 결과값에 대한 자료형 
	// 함수명 : 말 그대로 함수의 이름
	// 	1. 숫자로 시작하면 에러
	// 	2. 특수문자, 띄어쓰기 에러
	// 	3. 자바문법(예약어) 사용하면 에러
	// Java문화)
	// 	4. 함수명을 봐도 어떤 기능을 가지고 있는지 알도록 작성
	// 	5. 소문자로 시작 -> 대문자로 시작해도 되나 , 문화가 소문자시작
	// 	6. 가독성을 위해 뱀체, 낙타체를 권유
	// 	7. 한글은 권장하지 않음
	// 	8. 변수명(명사위주) vs 함수명(동사위주) 
	
	// 파라미터(Parameter, 인자(값)) : 함수를 실행하는데 필요한 재료
	// 	갯수 제한 없음, 다만 자료형에 맞춰서 사용 
	// 	(자료형 변수명)
	
	public static void printMyThink() {
		System.out.println("오늘 마치고 헬스장 가야지");
		System.out.println("오늘은 등조진다");
		System.out.println("진짜다");
	}
	//예제 본인소개 함수(이름, 핸드폰번호, 사는 곳 출력) -> 콘솔에 나오게 
	
	public static void a() { 
		System.out.println("이름 : 이현석 ");
		System.out.println("핸드폰번호 : 01096302766 ");
		System.out.println("사는곳 : 김해 ");
	}
	
	// 정수 두개를 넣으면 사칙연산 결과를 출력 해주는 함수
	// 파라미터(함수를 실행하는데 필요한 재료)가 필요해
	public static void calculate(int a, int  b) {
		int plus = a + b;
		int minus = a - b;
		int multi = a * b;
		int divide = a / b;
		System.out.println(plus + ", " + minus + ", " + multi + ", " + divide);
	}
	
	public static void main(String[] args){
		printMyThink();
		a();
		calculate(10,2);
		
		
	}	
}

