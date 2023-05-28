// Constructor
public class CMain1 {

	public static void main(String[] args) {
		// 신발
		// 나이키 홈페이지
		// 이름 : ???
		// 사이즈 : 250
		// 가격 : 110,000
		// 브랜드 : 나이키
		// 정보 출력
		///////////////////////
		// 이름 : !!!
		// 사이즈 : 260
		// 가격 : 120,000
		// 브랜드 : 나이키
		// 정보 출력 
		
		System.out.println("---------------");
		System.out.println("신발 입고"); 
		System.out.println(Shoose.brand); 
		System.out.println("---------------");
		
		Shoose s1 = new Shoose(); // 객체가 만들어지면 무조건 한번 거치고 가게 된다.  shoose.java 안에 있음 
		s1.name = "나이키 페가수스 트레일 4 GORE-TEX";
		s1.size = 250;
		s1.price = 189000;
		s1.printInfo();
		System.out.println("---------------");
		
		Shoose s2 = new Shoose();
		s2.name = "나이키 리액트 인피니티 3 프리미엄";
		s2.size = 260;
		s2.price = 188100;
		s2.printInfo();
		System.out.println("---------------");
				
		Shoose s3 = new Shoose("신발", 250, 3000); // 오버로딩에서는 신발입고가 안나온다.. 이유는 모르겠다.. -> oop문법 중 상속이라는 것에서 설명한다. 
		s3.printInfo();
		
		
	}
}
