
public class Coffee {
	
	String name;
	int price;
	
	public Coffee() { // 오버로딩 위에 기본생성자를 만들어야하고, crtl + shift 첫 번째 있는 거 ,, 습관적으로 만들어야함. 
		
	}
	
	public Coffee(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
	}


	
}
