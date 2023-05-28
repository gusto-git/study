// ���� ���� �ʱ��ؾ���
// ������
// 1. Ŭ������ �����ڰ� �ϳ��� ������ �ڹ� �����Ϸ��� �����ڸ� ���巷��
// 2. ����Ŭ���� ��ü�� �����(pen) ����Ŭ���� �⺻������(product2)�� �ڵ����� ȣ�� ��


public class Pen extends Product2{
	String color;
	
	public Pen() {
		// TODO Auto-generated constructor stub
	}
	
	public Pen(String color) {
		super();  // 2���� ����� ���� �� super(�Ķ����x) -> �� super�� pen�� ��
		this.color = color;
	}

	public Pen(String name, int price, String color) {
		super(name, price); // 2�� �ߵ����� ���� -> �� super�� product2�� super
							// Product2(name, price)�� ���� super(�Ķ����o)�� ���� �����ڸ� ����� 
		//                     �⺻�����ڰ� ������ �ʱ⶧���� �⺻ �����ڸ� ����� �� ����.
		this.color = color;
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(color);
	}
	
	
	
}
