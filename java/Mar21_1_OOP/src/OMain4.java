// ???
//			???
// Stack
//	������ ������ ������ �Ʒ��������� �������� ����
// 	���α׷��� ����Ǹ� �˾Ƽ� �� ����
// Heap
//	��ǻ�� �����ϴٰ� �Ǵ��ϴ� ��ġ�� �������� ����
//	�ڵ�����x (�ڵ��� �޸� �����ϴ� �������� ����)

// Garbage Collection : Heap ���� �ڵ� ���� �ý���(** ��������)
// 	����: �� ������ �� �̻� ������ ����� �������� �ߵ�!
public class OMain4 {
	public static void main(String[] args) {
		// ����ũ class
		// ����ũ �̸�, ����ũ �� ����, ����ũ ����
		// ���� �� ����ϴ� �޼ҵ� �����
		
		Mask m1 = new Mask(); //��ü����
		m1.name = "���� ����ũ";
		m1.store = "CU";
		m1.price = 2200;
		m1.printInfo();
		System.out.println(m1);
		System.out.println("===========");
		Mask m2 = m1; // m1�� m2��� ������ �ϳ� �� ����
		System.out.println(m2);
		m1 = null; // ����ũ m1�� ������ �������.
		System.out.println(m1); //�ƹ������� �Ȱ���Ű�� ������ null ó���� ��
		System.out.println(m2);
		m2 = null; // ����ũ m2�� ������ �������. // ����� �׸�����
		// GC�� �ߵ��ϴ� �����̴�. 
		System.out.println(m1); 
		System.out.println(m2);
//		m2.printInfo(); // ����� �Ұ������� - error
		
		
	}
}
// ���α׷��� ����Ǹ� Stack ������ ���ư��ϴ�.
// -> heap������ ������ �Ұ��������� -> �׷��� �Ǹ� GC�� �ߵ�