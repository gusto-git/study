import java.util.Scanner;

// main�Լ����� ����
// 1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����
//		1�� �Է��ϸ� �л� ���� ���� �Է¹��� �� �ְ�
//		2�� �Է��ϸ� �� �л����� ������ �Է¹��� �� �ְ� (���� ������ ��� X)
//	 	3�� �Է��ϸ� �� �л����� ���� ����Ʈ (1���л� : 50�� / 2���л� :80�� / ...)
//		4�� �Է��ϸ� �ְ����� �� ������� �м��ؼ� ���
//	 	5�� �Է��ϸ� ���α׷� ����
// ���� ��Ȳ�� ���� ���ǹ�, �ݺ��� ��� �� ������ �����ؼ� ����~

public class test4 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int selectNo = 0;
		int studentNo = 0;
		int index = 0;
		int[] score = null; // �迭�� �⺻���� null;�� �ʱ�ȭ
		
		a:while (true) {
			System.out.println("=================================================================");
			System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
			System.out.println("=================================================================");
			System.out.print("���� > ");
			selectNo = k.nextInt(); // ������ int selectNo�� �����߱� ������ �� int�� ���� �ʿ䰡 ����.
			switch (selectNo) {
			case 5:
				System.out.println("���α׷��� �����մϴ�.");
				break a;
			case 1:
				System.out.print("�л��� �Է� :");
				studentNo = k.nextInt();
				score = new int[studentNo];
				break;
			case 2:
				for (int i = 0; i < studentNo; i++) {
					System.out.print("���� �Է� :");
					score[i] = k.nextInt();
				}
				break;
			case 3:
				index = 1;
				for (int i : score) {
					System.out.printf("%d�� �л� ���� : %d��\n", index++, i);
				}
				break;
			case 4:
				int max = 0;
				int sum = 0;
				for (int i : score) {
					sum += i;
					max = (max < i) ? i : max;
				}
				double avg = (double) sum / score.length;
				System.out.printf("�ְ����� : %d\n", max);
				System.out.printf("������� : %.2f��\n", avg);
				break;
			default:
				System.out.println("1���� 5���̸� �Է����ּ���");
				break;
			}
		}
	}
}
