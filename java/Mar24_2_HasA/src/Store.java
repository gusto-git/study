// Owner has a Restaurant?
// Restaurant has a Owner(v) �̰� �´�. ~�� �Ĵ��̱� ����


public class Store {

	String name;
	String station;
	String callNumber;
	Person owner;

	
	public Store() {
		// TODO Auto-generated constructor stub
	}

	public Store(String name, String station, String callNumber, Person owner) {
		super();
		this.name = name;
		this.station = station;
		this.callNumber = callNumber;
		this.owner = owner;
	}
	
//	public Store(String name, String station, String callNumber, Person owner, Menu food) {
//		super();
//		this.name = name;
//		this.station = station;
//		this.callNumber = callNumber;
//		this.owner = owner;
//		this.food = food;
//	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(station);
		System.out.println(callNumber);
		owner.printInfo();
	}
	
}
