
public class Coffee {
	
	String name;
	int price;
	
	public Coffee() { // �����ε� ���� �⺻�����ڸ� �������ϰ�, crtl + shift ù ��° �ִ� �� ,, ���������� ��������. 
		
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
