
public class FMain2 {
	//예제
	public static void test(int b) { 
		// int b 는 파라미터 변수, 
		//메인에서 파라미터 값으로 불러오고 
		//그 다음에 함수안에 있는 내용이 진행되어서 
		//그림상 b가 먼저  stack에 쌓이게 됨
		
		int a = 123;// 지역변수(local variable)
		System.out.println(b); //30
		System.out.println(a + b); //153
		
		
	}
	public static void main(String[] args) {
		int a = 10; // 지역변수(local variable) -> 함수 안에서만든 변수
		int b = 20; // 지역변수(local variable) -> 그 함수 안에서만 사용이 가능
		int c = 30; // 지역변수(local variable) 
		
		test(c);
		System.out.println(b); //20 
		// int a = 100; 같은 공간에서는 같은 이름의 변수를 사용할 수 없다. 
		// 하지만, 메인 밖에서는 같은 변수 이름 사용 가능하다. 
		
		
		
		//    ?			stack			heap
		//
		//				a	123
		//				b	30
		//				c	30
		//				b 	20
		//				a 	10
		
		
		
		
	}
	
	
	
	
}
