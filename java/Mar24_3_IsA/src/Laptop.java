
public class Laptop extends Computer{ // extends computer로 받아야함
	double weight;
	int battery;
	
	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public Laptop(String name, int price, String cpu, int ram, int hdd, double weight, int battery) {
		super(name, price, cpu, ram, hdd);
		this.weight = weight;
		this.battery = battery;
	}
	
	@Override
		public void printInfo() {
			// TODO Auto-generated method stub
			super.printInfo();
			System.out.println(weight);
			System.out.println(battery);
			
		}
	
}
