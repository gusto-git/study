// �ƹ����� ��ӹ��� ������ extends Object�� �����Ǿ� �ִٰ� �����ϸ��
// Product is a Object(Java ��ü)
public class Product /*extend Object*/ {
	String name;
	int price;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String name, int price) {
		super(); // ctrl + Ŭ�� : Object��� class�� ��� �޴� �� 
		this.name = name;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
	}
	
	
}
