// 생성자(Constructior)
// 		객체가 만들어지면 뭔가 작업을 해야 하는데 
//		ㄴ 그때 하는 작업이 생성자 만들기 ! 
//      ㄴ 리턴이 없음, 메소드(method)명이 class명과 같다.
//		생성자 따로 안만들면
//		ㄴ 자바 컴파일러가 기본 생성자를 만들어버림(default constructor)를 만들어버림 
//		생성자를 건드리면
//		ㄴ 자바 컴파일러가 기본 생성자를 안만들어 줌 

public class Shoose {
	String name;
	int size;
	int price;
	static String brand = "나이키";
	
	// 기본 생성자 - ctrl + space + enter : 객체를 생성 할때마다 초기화 시켜주는 역할을 함
	public Shoose() {
		System.out.println("신발입고"); // -> super안에 들어가있다.
		
	}
	
	// 생성자 오버로딩 - ctrl + shift + space
	
	public Shoose(String name, int size, int price) { // 맴버변수로 만든게 그대로 들어가 있따.
		super();//위에 있는 기본 생성자를 불러온다. 
		this.name = name;
		this.size = size;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("모델명 : " + name);
		System.out.println("사이즈 : " + size);
		System.out.println("가  격 : " + price);
		System.out.println("브랜드 : " + brand);
	}

	public void test(String name) {
		// 라이브러리용 클래스의 멤버변수명과 파라미터명이 같다면?
		// 	this. 이 붙어 버리면 맴버변수로 감
		System.out.println(name); // 가장 가까운 변수로 감 
		System.out.println(this.name); // 맴버변수
		// 라이브러리용 클래스 한정으로 적용 된다. -> 색깔로 구분하면된다.
	}
	
	
}
