
public class Notebook extends Product{ // extends computer로 받아야함
	double weight;
	int battery;
	Computer com;
	
	public Notebook() {
		// TODO Auto-generated constructor stub
	}

	public Notebook(String name, int price, double weight, int battery, Computer com) {
		super(name, price);
		this.weight = weight;
		this.battery = battery;
		this.com = com;
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(weight);
		System.out.println(battery);
		com.printInfo();
	}
	
}
