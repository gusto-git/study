// ???
//			???
// Stack
//	변수를 생성할 때마다 아래에서부터 차곡차곡 쌓임
// 	프로그램이 종료되면 알아서 다 정리
// Heap
//	컴퓨가 적당하다고 판단하는 위치에 랜덤으로 만듬
//	자동정리x (핸드폰 메모리 정리하는 느낌을로 정리)

// Garbage Collection : Heap 영역 자동 정리 시스템(** 면접문제)
// 	언제: 그 번지에 더 이상 접근할 방법이 없어지면 발동!
public class OMain4 {
	public static void main(String[] args) {
		// 마스크 class
		// 마스크 이름, 마스크 산 가게, 마스크 가격
		// 전부 다 출력하는 메소드 만들기
		
		Mask m1 = new Mask(); //객체생성
		m1.name = "조은 마스크";
		m1.store = "CU";
		m1.price = 2200;
		m1.printInfo();
		System.out.println(m1);
		System.out.println("===========");
		Mask m2 = m1; // m1은 m2라는 별명이 하나 더 생김
		System.out.println(m2);
		m1 = null; // 마스크 m1의 정보가 사라진다.
		System.out.println(m1); //아무번지도 안가르키기 때문에 null 처리가 됨
		System.out.println(m2);
		m2 = null; // 마스크 m2의 정보가 사라진다. // 강사님 그림참고
		// GC가 발동하는 시점이다. 
		System.out.println(m1); 
		System.out.println(m2);
//		m2.printInfo(); // 출력이 불가능해짐 - error
		
		
	}
}
// 프로그램이 종료되면 Stack 영역이 날아갑니다.
// -> heap영역에 접근이 불가능해지고 -> 그렇게 되면 GC가 발동