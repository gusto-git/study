
public class Product2{
	String name;
	int price;

	public Product2() {
		System.out.println("Product!");
		
	}

	public Product2(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
		
	}
	
	
}
