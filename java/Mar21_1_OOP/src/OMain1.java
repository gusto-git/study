// 알고리즘 시대 x -> 유지보수의 시대 o
// 유지보수의 핵심 : 객체지향 프로그래밍 
// 깊게 들어갈려고 하지마라

// 3월 20일까지 : 절차지향 프로그래밍[PP](Procedural Programming)
//	-> 순서대로 잘 프로그래밍 해서 결과를 내자
//  -> 변수하나 덜 쓰고, 효율적으로 코드를 짜자
//	-> 조건문, 반복문 ... 
//  장점 : 처리 속도, 실행속도가 빠르다.

// 3월 21일 부터 ~ 3월 말 : 객체지향 프로그래밍[OOP](Object-Oriented Programming)
// -> 가장 큰 목적은 실생활을 표현, 모사 하자! (우리가 살고 있는 이 현실을 모델링)
// -> 소스보기가 편해진다.
// -> 유지보수에 용이하다. 
// 장점 : 코드의 재사용성, 유지보수에 용이, 대규모 프로젝트에 적합


public class OMain1 {
	public static void main(String[] args) {
		// 언덕 위에 건물 1층 투썸 플레이스
		// 이 카페의 정보를 표현
		
		// PP로 투썸 표현
		
		// 카페 이름 : 투썸플레이스
		String name = "투썸플레이스";
		// 카페 위치 : 건물 1층
		String location = "건물1층";
		// 카페 거리 : 25.9m
		double distance = 25.9;
		
		System.out.println(name);
		System.out.println(location);
		System.out.println(distance);
		System.out.println("=====지금까지=======");
		
		// OOP로 투썸 표현
		// 객체 (Object) : 실생활에 존재하는 모~든 것(= 인스턴스(Instance))
		// 예시 : 붕어빵 만들려면 붕어빵 틀이 필요
		// 		  객체를 만들려면 'Class'라는 것이 필요
		// 객체를 사용해서 하나의 완성품을 만들어내는 프로그래밍 기법
		//	-> 객체지향 프로그래밍
		//	-> 앞으로 class 파일을 많이 만들 것 !!
		
		// 1. 새 CLASS 파일
		// 2. 자료형 변수명 작성
		// 3. class 불러오기
		
		Cafe c = new Cafe(); // 새로운 카페 하나 생성 만든것! , 새 객체를 불러온것
		c.name = "투썸플레이스";
		c.location = "건물1층";
		c.distance = 25.9;
		System.out.println(c.name); // c.name으로 불러야함
		System.out.println(c.location);
		System.out.println(c.distance);
		
	}
}
