import java.util.Random;

public class FMain1 {
//	puiblic static A B (C) {
//		����
//		Return
//	}
	// B : �Լ��� / ����� �����̶� ���̰�, ���罺����, ��Ÿ OR ��ü
	// C : �Ķ����(PARAMETER) / �ش� �Լ����� ���� ���� �� 
	//     �Լ��� ȣ���ϴ� ��(main �Լ�)���� �ش� �Լ��� �����͸� ���� �� ���
	//		���� : (�ڷ��� ������, �ڷ��� ������, ...)
	// A : return type /
	//     �ش� �Լ����� �۾��� ����� �Լ� ȣ���ϴ� ��(main �Լ�)���� ���� �� 
	
	
	// ������ ������ �ϳ� ���ؼ� ������ ������ �Լ� - 3�� �Լ�
	public static int randomNum() {
		Random r = new Random();
		int num = r.nextInt();
		return num;
		// return new Random().nextInt();
	}
	
	// ���� ������ �� ������ ���� ���� ������ִ� �Լ� - 2�� �Լ�
	public static void printNum(int a , int b) {
		int printN = a + b;
		System.out.println(printN);
		// System.out.println( a + b);
		
	
	}
	
	public static void main(String[] args) { //�Լ��� ȣ���ϴ� �� 
		//������ ���� �ΰ�
		int x = randomNum();
		int y = randomNum();
		System.out.println(x);
		System.out.println(y);
		printNum(x, y); // �ڸ��� �ٲ��� �������
		
	}
	
	
	
}