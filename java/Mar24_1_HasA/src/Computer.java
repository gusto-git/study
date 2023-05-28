
public class Computer {
	
	//멤버변수는 소문자로 작성해야한다.
	String cpu;
	int	ram;
	int hdd;
	Company brand;
	
	public Computer() {
		// TODO Auto-generated constructor stub
	}

	public Computer(String cpu, int ram, int hdd, Company brand) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
		this.brand = brand;
	}
	
	public void printinfo() {
		System.out.println(cpu);
		System.out.println(ram);
		System.out.println(hdd);
		brand.printInfo(); // method 자체를 가져와도 된다.
//		아래도 가능 
//		System.out.println(brand.name);
//		System.out.println(brand.location);
//		System.out.println(brand.employee);
	}
	
}
