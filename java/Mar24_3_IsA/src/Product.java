// 아무데도 상속받지 않으면 extends Object가 생략되어 있다고 생각하면됨
// Product is a Object(Java 객체)
public class Product /*extend Object*/ {
	String name;
	int price;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String name, int price) {
		super(); // ctrl + 클릭 : Object라는 class를 상속 받는 중 
		this.name = name;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
	}
	
	
}
