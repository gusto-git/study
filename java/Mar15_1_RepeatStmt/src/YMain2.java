import java.util.Scanner;

public class YMain2 {
	// f1 �̸��� �Լ�
	// ���� �ϳ� �Է� ����
	// ����� "��" / 0 �̸� "0" / ������ "��" ���
	
	// f2 �̸��� �Լ�
	// ���� �ϳ� �Է� ����
	// 3�� ����� "3�� ���"
	// 4�� ����� "4�� ���"
	// �� �� �ش����� ������ "����"
	// *��Ȥ 3�� ����̸鼭 4�� ����� ��� "3�� ��� + 4�� ���" *
	// ��� �ƴϰ� ���� ���ϱ⸸ ��
	
	// f1, f2 ��� console�� ���� �ǰ�(������ ���� ���̰�)
	
	
	public static void f1() {
		Scanner k = new Scanner(System.in);
		System.out.print("���� : ");
		int num = k.nextInt();
		
		if (num > 0) {
			System.out.println("��");
		}else if (num < 0) {
			System.out.println("��");
		} else {
			System.out.println(0);
		}
		
	}
	
	public static String f2() {
		Scanner k = new Scanner(System.in);
		System.out.print("���� : ");
		int num = k.nextInt();
		
		String answer = "";
		if (num % 12 == 0) { // i % 3 == 0 && i % 4 == 0
			answer = "3�� ��� + 4�� ���";
		}else if (num % 3 == 0) {
			answer = "3�� ���";
		}else if (num % 4 == 0) {
			answer = "4�� ���";
		}else {
			answer = "����";
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		f1();
		String f = f2();
		System.out.println(f);
	}
	
	
	
	
	
	
	
	
}
