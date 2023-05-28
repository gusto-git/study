
public class Merchant {

	String name;
	Market like;
	
	public Merchant() {
	// TODO Auto-generated constructor stub
	}

	public Merchant(String name,  Market like) {
		super();
		this.name = name;
		this.like = like;
	}
	
	
	public void printInfo() {
		System.out.println(name);
//		like.printInfo();
	}
	
	
}
