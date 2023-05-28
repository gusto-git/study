// ���̺귯�� �� Ŭ����

// �������(member variable) : ��ü�� �Ӽ�(��ü.�Ӽ�)
//								�� this : �ش��ϴ� ��ü(���� ����)

// �� ������ ��� Ŀ�Ǹ� ���� ����ٰ� �����Ѵٸ�?
// 	�� �̶� ��� ������ ���� static ������� 
//	�� ��ü�� ��� ��� ������ ���� 
//  �� Ŭ������.xxx�� ��밡�� �� (�� : c.name , c.weight)


public class Coffee {
	// �Ӽ�(�ʵ�) �����
	// Ŀ�� �̸�, �߷�, ����
	String name;
	double weight;
	int price;
	
	// static �ɹ����� �����
	// static final ��������� �����
	// �� ������ �Ұ��� ��  -> ���ȭ (���� �������� �ʰڴ� ��� �Ϲ����� �ǹ�)
	//	�� static final �ڷ��� ������(���� �빮��) = ����;
	static final String MANUFACTURER = "lee";
	
	// Ŀ�� ������ ����ϴ� method
	public void printInfo() {
		
		System.out.println("�̸� : " + this.name );
		System.out.println("�߷� : " + weight );
		System.out.println("���� : " + this.price );
		System.out.println("������ : " + MANUFACTURER );
	}
	
	// static method
	// �޸� ����
	// ��ü ���̵� ��밡��
	// static�� �ƴ� ����� ������ �Ұ���
	
//	public static void printTest() {
//		System.out.println("�̸� : " + this.name ); // this ����
//		System.out.println("�߷� : " + weight ); // static �ƴ� ��������� ����
//		System.out.println("���� : " + this.price ); // this ����
//		System.out.println("������ : " + MANUFACTURER ); // ����ƽ ������ ������ ���� ����
//		
//	}
//	
	
	
	
	
}
