import java.util.Scanner;

public class CMain3 {
	public static void main(String[] args) {
		// ���� �ϳ� �Է� �ް�
		Scanner k = new Scanner(System.in);
		System.out.println("x : ");
		int x = k.nextInt();
		
		// ���ǹ� : if, switch
		// switch-case 
		// �� ������ Ư�� ���̳� ���ڿ��� ���
		// break;�� �̿��ؼ� �� ������ �����ϸ� swtich���� �������� �������
		
		
//		switch (key) { // key�ȿ� ����  or ��
//		case value: // �� B
//			//���� or ���� ���� A�� �� �� �κ� ����
//			break;
//		case value: // �� B
//			// ���� or ���� ���� B�� �� �� �κ� ����
//		default:
//			// A���� �ƴϰ�, B���� �ƴϸ� �� �κ� ����
//			break;
//		}
		
		// x�� 1�� �� "��"�� ��� / 2�� �� "��" / 3�� �� "�̤�" ���
		// �� �� ������ �ƴϸ� " ����..." ���
		
		switch (x) {
		case 1:
			System.out.println("��");
			break; // �극��ũ�� ������ ��� �̾��� ���� 2�� ����
		case 2:
			System.out.println("��");
			break;
		case 3:
			System.out.println("�̤�");
			break;
		default:
			System.out.println("����...");
			break;
		}
	}
}
