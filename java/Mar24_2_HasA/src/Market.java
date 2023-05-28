
public class Market {

	String name;
	String location;
	Tool buy; 
	
	public Market() {
		// TODO Auto-generated constructor stub
	}

	public Market(String name, String location, Tool buy) {
		super();
		this.name = name;
		this.location = location;
		this.buy = buy;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(location);
//		buy.printInfo();
	}
	
}
