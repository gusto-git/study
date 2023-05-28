// Class : 객체를 찍어내는 틀(도장)
// function(함수) - 클래스 밖에 만드는 것 따라서 자바에서 함수는 원래 안되는 말
// method(메소드) - 클래스 속에 있는 것(class에 종속된 것)
// 결론 : 여태까지 써온 건 다 method다

public class Bus {
	// 맴버변수(member veriable, field, attribute)
	// 속성 
	// 객체의 데이터가 저장되는 공간 
	
		int busName;
		String bus;
		String busCompany;
		String busDriver;
		String startingPoint;
	
	// static 유무는 나중에 설명
	public void printInfo() {
		// this : 자기자신을 말함 (this. : 생략가능)
		System.out.println(this.busName);
		System.out.println(this.bus);
		System.out.println(this.busCompany);
		
		System.out.println(busDriver);
		System.out.println(startingPoint);
	}
	// method(멤버메소드) - 액션, 프로그램상 필요한 기능
	//					  - 객체의 동작에 해당하는 실핼 블록 
	
	public void go() {
		System.out.println("부릉부릉~~");
	}

}
