
public class FMain2 {
	//����
	public static void test(int b) { 
		// int b �� �Ķ���� ����, 
		//���ο��� �Ķ���� ������ �ҷ����� 
		//�� ������ �Լ��ȿ� �ִ� ������ ����Ǿ 
		//�׸��� b�� ����  stack�� ���̰� ��
		
		int a = 123;// ��������(local variable)
		System.out.println(b); //30
		System.out.println(a + b); //153
		
		
	}
	public static void main(String[] args) {
		int a = 10; // ��������(local variable) -> �Լ� �ȿ������� ����
		int b = 20; // ��������(local variable) -> �� �Լ� �ȿ����� ����� ����
		int c = 30; // ��������(local variable) 
		
		test(c);
		System.out.println(b); //20 
		// int a = 100; ���� ���������� ���� �̸��� ������ ����� �� ����. 
		// ������, ���� �ۿ����� ���� ���� �̸� ��� �����ϴ�. 
		
		
		
		//    ?			stack			heap
		//
		//				a	123
		//				b	30
		//				c	30
		//				b 	20
		//				a 	10
		
		
		
		
	}
	
	
	
	
}
