// 변수를 만드는 이유 : data를 저장하려고 만듬 > Memory 상 공간에 저장
// ㄴ 변수 : 데이터를 저장하는 공간(그릇)

// 객체를 만드는 이유 : 실생활스러운 변수(속성)를 만들어서 알아보기 편하게 하려고 만듬
//	ㄴ static이 없는 method를 가지고 오려고 


public class Calculator {
	// 맴버 변수 따로 안만듬 - > 저장할게 없음
	// ㄴ 계산기 객체를 따로 만들 필요가 없다.
	// ㄴ 이럴때 쓰는게 static method 기반!
	
	public static void sum(int a, int b) {
		System.out.println(a + b);
	}
	
	
	public void sum(int a, int b , int c) {
		System.out.println(a + b + c);
	}
}
