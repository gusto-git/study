
public class Tool {
	String name;
	int price;
	Menu dish;
	
	public Tool() {
		// TODO Auto-generated constructor stub
	}

	public Tool(String name, int price, Menu dish) {
		super();
		this.name = name;
		this.price = price;
		this.dish = dish;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
		dish.printInfo();
	}
}
