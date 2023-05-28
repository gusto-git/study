// 라이브러리 용 클래스

// 멤버변수(member variable) : 객체의 속성(객체.속성)
//								ㄴ this : 해당하는 객체(생략 가능)

// 이 세상의 모든 커피를 내가 만든다고 가정한다면?
// 	ㄴ 이때 사용 가능한 것이 static 멤버변수 
//	ㄴ 객체가 없어도 사용 가능한 정보 
//  ㄴ 클래스명.xxx로 사용가능 함 (예 : c.name , c.weight)


public class Coffee {
	// 속성(필드) 만들기
	// 커피 이름, 중량, 가격
	String name;
	double weight;
	int price;
	
	// static 맴버변수 만들기
	// static final 멤버변수로 만들기
	// ㄴ 수정이 불가능 함  -> 상수화 (값을 변경하지 않겠다 라는 암묵적인 의미)
	//	ㄴ static final 자료형 변수명(전부 대문자) = 내용;
	static final String MANUFACTURER = "lee";
	
	// 커피 정보를 출력하는 method
	public void printInfo() {
		
		System.out.println("이름 : " + this.name );
		System.out.println("중량 : " + weight );
		System.out.println("가격 : " + this.price );
		System.out.println("제조자 : " + MANUFACTURER );
	}
	
	// static method
	// 메모리 절약
	// 객체 없이도 사용가능
	// static이 아닌 멤버는 접근이 불가능
	
//	public static void printTest() {
//		System.out.println("이름 : " + this.name ); // this 에러
//		System.out.println("중량 : " + weight ); // static 아닌 멤버변수는 에러
//		System.out.println("가격 : " + this.price ); // this 에러
//		System.out.println("제조자 : " + MANUFACTURER ); // 스테틱 변수라 오류가 나지 않음
//		
//	}
//	
	
	
	
	
}
