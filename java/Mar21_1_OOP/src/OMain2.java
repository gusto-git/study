// Java : 언어의 구조가 완벽하다(Perfect) -> 객체지향 언어를 쓰기에 
// c++ , Python : Hybrid한 객체 지향 언어

// 실생활을 묘사하자 > 보기가 쉬워질 것 > 유지보수에 용이!


// main함수가 있는 클래스 : xxxMain에서 필요한 클래스를 ctrl + 클릭하면 필요한 class로 넘어가진다.
public class OMain2 {
	public static void main(String[] args) {
		// 버스를 자바로 표현 -> 표현하고 싶을 때 항상 클래스를 새로 만들자
		// 노선번호 / 차종 / 버스회사 / 기사님 성함 / 시작점 -> 출력
		// 클래스 파일에 main을 쓰면안된다.
		
		
	Bus b = new Bus();
	b.busName = 128;
	b.bus = "bus";
	b.busCompany = "가야버스";
	b.busDriver = "김용득";
	b.startingPoint = "김해 구산동 차고지";
	
	System.out.println(b.busName);
	System.out.println(b.bus);
	System.out.println(b.busCompany);
	System.out.println(b.busDriver);
	System.out.println(b.startingPoint);
	b.printInfo(); // 이 메소드의 this는 b를 의미 (Bus 클래스에서 불러와서 출력)
	b.go();
	// 핸드폰
	// 모델명 / 제조사 / 가격 / 정보출력 / 전화왔을때 "띠리링~"
	System.out.println("====phone=====");
	Phone p = new Phone();
	System.out.println(p); // 기본형이 아닌 것들은 전부 참조형이라 주소값나옴
	p.info();// 각 자료의 기본형이 출력된다. 선언하기전이라
	p.model = "z플립3"; 
	p.brand = "SAMSUNG";
	p.price = 1200000;
	
	p.info();// 각 자료형들의 기본형 
	p.call();
	System.out.println("---------------");
	Phone p1 = p;
	//p와 같은 속성값을 가진 p1생성
	// * 무조건 new로 생성해야지 주소값/번지값이 달라진다.
	System.out.println(p1); // p와 주소값/번지값이 같다. / 별명하나를 더 추가한 셈
	// 핸드폰 하나를 두명이 공유하고 있는 상황이다.
	p1.price = 1110000;
	p1.info();
	p.info();// p1값을 바꾸면 p에도 영향이 있다.
	System.out.println("---------------");
	WhatIsValue value = new WhatIsValue();
	value.printInfo();
	}	
}
