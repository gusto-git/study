
public class Solder extends Person{
	String rank;
	
	public Solder() {
		// TODO Auto-generated constructor stub
	}

	public Solder(String name, int age, String affiliation, String rank) {
		super(name, age, affiliation);
		this.rank = rank;
	}
	
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(rank);
	}
	
	

}
