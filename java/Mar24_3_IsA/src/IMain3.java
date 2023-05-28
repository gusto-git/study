
public class IMain3 {
	public static void main(String[] args) {
		// 홍길동, 17살, 솔데고등학교, 1학년 -> 출력
		Student g = new Student("홍길동", 17, "솔데고등학교", 1);
		g.printInfo();
		System.out.println("===========");
		// 김길동, 21살, 솔데대학교, 3학년 -> 출력
		Student g1 = new Student("김길동", 21, "솔데대학교", 3);
		g1.printInfo();
		System.out.println("===========");
		// 고길동, 22살, 육군, 상병 -> 출력
		Solder r = new Solder("고길동", 22, "육군", "상병");
		r.printInfo();
		System.out.println("===========");
		
		
		// Product2 클래스 만들어서 속성은 이름, 가격! 
		Pen p = new Pen();
		p.printInfo();
		System.out.println("===========");
		Pen p2 = new Pen("빨강");
		p2.printInfo();
		System.out.println("===========");
		Pen p3 = new Pen("모나미", 300, "검정");
		p3.printInfo();
		System.out.println("===========");
		
		// 이름이 패션마스크 , 가격이 1000원인 마스크
		Mask m = new Mask("패션마스크", 1000);
		
		
		
		
		
		
		
	}
}
