import java.util.Scanner;

public class CMain6 {
	// 1�� = 12��
	// �� �޸��� ��ĥ�� �ִ��� 
	// ���� �Է¹޾Ƽ�
	// 31�� ���� �ֽ��ϴ�. 30�� ���� �ֽ��ϴ�. 28�ϱ��� �ֽ��ϴ�.
	// 14> ���´��Դϴ�.
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("�� :");
		int month = k.nextInt();
		int day = 0; // ���� ������ ���ǹ� �ۿ��� ����� �� Ȱ���� �� ���� ����
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			System.out.printf("%d���� %d�� ���� �ֽ��ϴ�.\n", month, day);
			break;
			
		case 4: case 6: case 9: case 11:
			day = 30;
			System.out.printf("%d���� %d�� ���� �ֽ��ϴ�.\n", month, day);
			break;
		case 2:
			day = 28;
			System.out.printf("%d���� %d�� ���� �ֽ��ϴ�.\n", month, day);
			break;	
			
		default:
			System.out.printf("%d���� ���� ���Դϴ�.", month);
			break;
		}
		
		
		
		
	}
}
