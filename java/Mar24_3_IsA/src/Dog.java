// A is a B : ��Ӱ���
// ���� ���� '�̴�'
public class Dog extends Animal { // Animal�� ����� �޾ƿ�
	// Animal �ȿ� Dog�� '���'�Ǿ� �ִ�.
	// ��� : inheritance
	// Ȯ�� : extends
	
	// ��� : �ܼ��� �� ��ɸ� �������� ���� �ǹ�
	// Ȯ�� : ��ӹ��� ��� + �������� ��ɵ� Ȯ�� 
	
	String inhabit;
	
	// ������ ����
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	// ������ �����ε�
	public Dog(String sort, int age, String inhabit) {
		super(sort, age);
		this.inhabit = inhabit;
	}
	// ��ӹ޾ұ� ������ �����ϴ�. (��� ���� �޼ҵ忡 ����� ���ϴ� ��)
	// @XXX : Annotation -> � ����� �ڵ����� �������ش�.
	@Override  // ��ӹ��� method�� ����� �ٲٴ°�(�߰��ϴ� ��)
		public void printInfo() {
			// override�� ����Ϸ���...
			// 	��ӹ��� Class������ method��� ��ġ�ؾ��մϴ�.
			super.printInfo(); // ����Ŭ����.printInfo(); super : ctrl + Ŭ���� ������ � Ŭ������ ��ӹ޾Ҵ��� ���´�.
			System.out.println(inhabit);
		}
	// vs
	// Overloading
	//  �޼ҵ� ���� �� �� ��� ��ü�� ���ٸ� �޼ҵ� �� ���� ����
	//  ���, �Ķ���� �ڷ����� �ٸ��ų�, �Ķ���� ������ �޶�� ��
}
