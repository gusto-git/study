
public class FMain4 {
	// �����ε�(OverLoading) **
	// �Լ����� ����, �Ķ���͸� �ٸ��� �ϴ� ���
	// �Լ��� ȣ���� �� � ���� �־����Ŀ� ����
	// �ش��ϴ� �Լ��� �ٸ��� �ҷ����� ���
	
	//	1. ���� �ڷ����� �ᵵ �Ķ������ ������ �ٸ��� o
	//	2. �Ķ������ ������ ���Ƶ�, �ٸ� �ڷ����� ���� o
	
	// ���� 2���� ������ �� ���� ������ִ� �Լ�
	public static void printSum(int a , int b) {
		System.out.println(a + b);
		
	}
	// ���� 3���� ������ �� ���� ������ִ� �Լ�
	public static void printSum(int a, int b, int c) {
		System.out.println(a + b + c);
	}	
	// �Ǽ� 3���� ������ ������ ������ִ� �Լ�
	public static void printSum(double a, double b, double c) {
		System.out.println(a + b + c);
	}
	// ����	
	// ���� 1���� ������ >> ��! << �̶�� �ܾ ��µǴ� �Լ�
	public static void putin(int a) {
		System.out.println("��!");
	}
	// ���ڿ� 1�� ������ >> ������!! <<��� �ܾ ��µǴ� �Լ�
	public static void putin(String b) {
		System.out.println("������!!");
	}
	/// �ƹ��͵� ���� ������ >> �����ϴ�!! <<��� �ܾ ��µǴ� �Լ�
	public static void putin() {
		System.out.println("�����ϴ�!");
	}
	
	/// �����ε� ���
	
	public static void main(String[] args) {
//		printSum(10, 20);
//		printSum(10, 20, 30);
//		printSum(10, 10.5, 20);
		putin(1);
		putin("d");
		putin();
	}
}
