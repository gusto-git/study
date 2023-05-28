
public class Shoes extends Product{
	// 신발(이름, 가격, 사이즈)
	
	int size;
	public Shoes() {
		// TODO Auto-generated constructor stub
	}
	public Shoes(String name, int price, int size) { // 여기도 추가
		super(name, price); // 여기도 추가
		this.size = size;
	}
	
	
	// 오버라이드 하는 법 : ctrl + space를 누르면 된다.
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(size);
	}
}
