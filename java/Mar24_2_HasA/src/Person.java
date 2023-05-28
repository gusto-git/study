
public class Person {
	String name;
	String gender;
	String handy;
	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Person(String name, String gender, String handy) {
		super();
		this.name = name;
		this.gender = gender;
		this.handy = handy;
	}



	public void printInfo() {
		System.out.println(name);
		System.out.println(gender);
		System.out.println(handy);
	}
}
