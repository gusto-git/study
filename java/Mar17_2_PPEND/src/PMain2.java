import java.util.Scanner;

// Shift ������ 
// 3 << 1 : ���� ���ڸ� �������� �ٲ㼭 �������� ���� ���ڸ�ŭ �а�, ��ĭ�� 0���� ä�� �ֱ� : 110
//        : �������� �ٽ� �������� �ٲ� : 2^2 + 2^1 = 6

public class PMain2 {
// 24�ð� : 1 << 0 : 1
// ������ : 1 << 1 : 2
// Wifi   : 1 << 2 : 4
// ���� : 1 << 3 : 8 
// ����: 15
	
// ����
// ��ư(����)�� �ϳ� �Է� �޾Ƽ�
// ���� ������ �ǹ��ϴ��� �ľ��ϰ�
// ���� �Է��� ��ư ������ � ������ ���� �� �ִ� �� ���
// �迭��� ����
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int button = k.nextInt();
//		
//		String[] option = {"24�ð�", "������", "WIFI", "����"};
//		for (int i = option.length-1; i >= 0; i--) { //option.lenth -1 : 4-1�� �������ؼ� option(4)-1�� ������. ���� �߰� �� �� �־ option.legth�� ��
//			if (button >= (1 << i)) {
//				System.out.println(option[i]);
//				button -= (1 << i );
//			}
//		}
		
		if (button >= (1 << 3)) {
			System.out.println("����");
			button -= (1 << 3); //else if ����ϸ� �ȵȴ�. ������ ���� �Ǵ¼��� ������ ������ �������.
		}
		if (button >= (1 << 2)) {
			System.out.println("WIFI");
			button -= (1 << 2);
		}
		if (button >= (1 << 1)) {
			System.out.println("������");
		}
		if (button >= (1 << 0)) {
			System.out.println("24�ð�");
			button -= (1 << 0);
		}
		
		
	}
}
