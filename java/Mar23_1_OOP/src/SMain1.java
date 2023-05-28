// Static(정적, 고정된)
//  ㄴ 정적 맴버 : static 변수(정적 필드), static 메소드(정적 메소드) 
//  ㄴ 프로그램 종료할때까지 남아있다. 
//  ㄴ class는 스테틱 영역에 남아있다. -> static 영역은 gc의 영향을 받지 않는다. 
//  RAM 메모리에 할당이 되면 프로그램이 종료될 때 까지 없어지지 않는다.
//		ㄴ Class는 Static영역에 저장
//		ㄴ 객체(new ~)는 heap영역에 저장이된다.
//		ㄴ heap은 Garbage Collection이 계속 접근해서 정리
//		ㄴ static은 GC 권한 밖에 있어서 따로 지우지 않는 한 프로그램 종료까지 남아 있다.
//		ㄴ static은 모든 객체가 공유한다.

public class SMain1 {
	// 커피 객체
	// 커피 이름, 중량, 가격 : 라이브러리 용 class 하나 만들기
	public static void main(String[] args) {
		// main에 Coffee 객체가 없는 상태
		// ㄴ 이름, 중량, 가격은 모르는 상태 (Coffee 클래스에서 못가져오는 상태)
		// ㄴ 하지만, 제조자는 알수있음
		
		System.out.println(Coffee.MANUFACTURER); // static은 가능하다.
//		System.out.println(Coffee.name); // 안나옴
		
		//객체 하나 생성
		Coffee c = new Coffee();
		c.name = "아메리카노";
		c.weight = 300.6;
		c.price = 2500;
		c.printInfo();
		System.out.println("=====================");
		
		//객체 하나 더 생성
		Coffee c1 = new Coffee();
		c1.name = "카페라떼";
		c1.weight = 320.1;
		c1.price = 3200;
//		c1.MANUFACTURER = "HYEON"; // 제조자가 변경된다. -> 내용 바꾼 부분은 오류가 뜬다.  이유 : FINAL 멤버변수는 상수화라서 값을 변경할 수 없다.
		c1.printInfo(); 
	}
}

// STAIC     STACK      HEAP
//	LEE					#2 아메 , 300.6 , 2500
//						#3 카페라떼, 320.1 , 3200
//		
//       C1   #3
//		 C	  #2