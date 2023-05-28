
public class Mask extends Product2{

	
	public Mask() {
		// TODO Auto-generated constructor stub
	}
	
	// 생성자 오버로딩이 안된다. -> 속성 / 멤버변수가 없어서
	// 메인으로가서 Mask m = new Mask(); 입력
	// Product2(name, price)와 같은 생성자를 갖고 싶을때
	// 단축키로는 생성할 수 없으나, 직접 작성하면 가능하다.
	public Mask(String name, int price) {
		super(name, price);
	}
	
	
	
}
