// ������(Constructior)
// 		��ü�� ��������� ���� �۾��� �ؾ� �ϴµ� 
//		�� �׶� �ϴ� �۾��� ������ ����� ! 
//      �� ������ ����, �޼ҵ�(method)���� class��� ����.
//		������ ���� �ȸ����
//		�� �ڹ� �����Ϸ��� �⺻ �����ڸ� ��������(default constructor)�� �������� 
//		�����ڸ� �ǵ帮��
//		�� �ڹ� �����Ϸ��� �⺻ �����ڸ� �ȸ���� �� 

public class Shoose {
	String name;
	int size;
	int price;
	static String brand = "����Ű";
	
	// �⺻ ������ - ctrl + space + enter : ��ü�� ���� �Ҷ����� �ʱ�ȭ �����ִ� ������ ��
	public Shoose() {
		System.out.println("�Ź��԰�"); // -> super�ȿ� ���ִ�.
		
	}
	
	// ������ �����ε� - ctrl + shift + space
	
	public Shoose(String name, int size, int price) { // �ɹ������� ����� �״�� �� �ֵ�.
		super();//���� �ִ� �⺻ �����ڸ� �ҷ��´�. 
		this.name = name;
		this.size = size;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("�𵨸� : " + name);
		System.out.println("������ : " + size);
		System.out.println("��  �� : " + price);
		System.out.println("�귣�� : " + brand);
	}

	public void test(String name) {
		// ���̺귯���� Ŭ������ ���������� �Ķ���͸��� ���ٸ�?
		// 	this. �� �پ� ������ �ɹ������� ��
		System.out.println(name); // ���� ����� ������ �� 
		System.out.println(this.name); // �ɹ�����
		// ���̺귯���� Ŭ���� �������� ���� �ȴ�. -> ����� �����ϸ�ȴ�.
	}
	
	
}
