// 위의 내용 필기해야함
// 생성자
// 1. 클래스에 생성자가 하나도 없으면 자바 컬파일러가 생성자를 만드렁줌
// 2. 하위클래스 객체를 만들면(pen) 상위클래스 기본생성자(product2)를 자동으로 호출 함


public class Pen extends Product2{
	String color;
	
	public Pen() {
		// TODO Auto-generated constructor stub
	}
	
	public Pen(String color) {
		super();  // 2번을 명시해 놓은 것 super(파라미터x) -> 이 super는 pen의 것
		this.color = color;
	}

	public Pen(String name, int price, String color) {
		super(name, price); // 2번 발동하지 않음 -> 이 super는 product2의 super
							// Product2(name, price)을 가진 super(파라미터o)를 가진 생성자를 만들면 
		//                     기본생성자가 생기지 않기때문에 기본 생성자를 사용할 수 없다.
		this.color = color;
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(color);
	}
	
	
	
}
