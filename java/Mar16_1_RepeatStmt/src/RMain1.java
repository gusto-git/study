import java.util.Random;
import java.util.Scanner;

public class RMain1 {
	public static void main(String[] args) {
	// up % down ����(main)
	// 1~100������ ����(����)
	// ��ǻ�� vs �� -> ���� ���ڸ� ���� �ݺ����� ���� -> break;�� ������ ����, 
	// ��ǻ�Ͱ� ���ڸ� �������� �̰�
	// ������ ���ߴµ�, ���亸�� ���� ���ڸ� �������� up
	// ���亸�� ���� ���ڸ� �������� down�� �ߵ���
	// + �� �ϸ��� ������ ã�Ҵ��� ���
		Random r = new Random();
		int num = r.nextInt(100)+1;
		System.out.println("��ǻ�Ͱ� ���� ���� : " + num); // Ȯ�ο�
		Scanner k = new Scanner(System.in);
		
		int myNum = 0; // myNum �ʱ�ȭ 
		for (int turn = 1; true; turn++) { // �ݺ�Ƚ���� ������ ���� �ʾƼ� true(��ĭ)�� �������ָ�ȴ�. 
			System.out.print("���� : ");
			myNum = k.nextInt(); //���� �����ϴ� �뵵�� ���� ���
			if (num == myNum) {
				System.out.println("����");
				System.out.printf("%d�� ���� ������ ������ϴ�!\n", turn);
				break; // if���� ���� ��Ű�°� �ƴ϶� for �ݺ����� ���� ��Ű�� ����̴�.
			}else if (num < myNum) {
				System.out.println("down!");
			}else {
				System.out.println("up!");
			}
			System.out.println("*****************");
		}
	}
}

