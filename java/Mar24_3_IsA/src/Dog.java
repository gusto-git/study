// A is a B : 상속관계
// 개는 동물 '이다'
public class Dog extends Animal { // Animal의 기능을 받아옴
	// Animal 안에 Dog가 '상속'되어 있다.
	// 상속 : inheritance
	// 확장 : extends
	
	// 상속 : 단순히 그 기능만 가져오는 것을 의미
	// 확장 : 상속받은 기능 + 강아지의 기능도 확장 
	
	String inhabit;
	
	// 생성자 생성
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	// 생성자 오버로딩
	public Dog(String sort, int age, String inhabit) {
		super(sort, age);
		this.inhabit = inhabit;
	}
	// 상속받았기 때문에 가능하다. (상속 받은 메소드에 기능을 더하는 것)
	// @XXX : Annotation -> 어떤 기능을 자동으로 연결해준다.
	@Override  // 상속받은 method의 기능을 바꾸는것(추가하는 것)
		public void printInfo() {
			// override를 사용하려면...
			// 	상속받은 Class에서의 method명과 일치해야합니다.
			super.printInfo(); // 상위클래스.printInfo(); super : ctrl + 클릭을 누르면 어떤 클래스를 상속받았는지 나온다.
			System.out.println(inhabit);
		}
	// vs
	// Overloading
	//  메소드 만들 때 그 기능 자체가 같다면 메소드 명도 같게 만듬
	//  대신, 파라미터 자료형이 다르거나, 파라미터 개수가 달라야 함
}
