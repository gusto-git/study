import java.util.Scanner;
public class PMain3_1 {
	

	// main�Լ����� ����
	// 1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����
//		1�� �Է��ϸ� �л� ���� ���� �Է¹��� �� �ְ�
//		2�� �Է��ϸ� �� �л����� ������ �Է¹��� �� �ְ� (���� ������ ��� X)
//	 	3�� �Է��ϸ� �� �л����� ���� ����Ʈ (1���л� : 50�� / 2���л� :80�� / ...)
//		4�� �Է��ϸ� �ְ����� �� ������� �м��ؼ� ���
//	 	5�� �Է��ϸ� ���α׷� ����
	// ���� ��Ȳ�� ���� ���ǹ�, �ݺ��� ��� �� ������ �����ؼ� ����~

		public static void main(String[] args) {
			Scanner k = new Scanner(System.in);
			int selectNo = 0;
			int studentNo = 0;
			int[] scores = null; // �迭�� �⺻���� null!
			int index = 0;
			a:while (true) {
				System.out.println("=================================================================");
				System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
				System.out.println("=================================================================");
				System.out.print("���� > ");
				selectNo = k.nextInt();
				switch (selectNo) {
				case 5:
					System.out.println("�����մϴ�");
					System.out.println("=================================================================");
					break a;
				case 1:
					System.out.print("�л� �� �Է� : ");
					studentNo = k.nextInt();
					scores = new int[studentNo];
					break;
				case 2:
					for (int i = 0; i < scores.length; i++) {
						System.out.printf("%d�� �л� ���� : ", i + 1);
						scores[i] = k.nextInt(); // �� index ���� ���� �ֱ�
					}
					break;
				case 3:
					index = 1; // foreach������ index�� �����Ƿ� ���Ƿ� ��������
					for (int i : scores) { // scores�� �ִ� ��ҵ�(������)
						System.out.printf("%d�� �л� ���� : %d��\n",  index++, i);
					}
					break;
				case 4:
					// ���� �ݺ��� ������ ���� ���� ����!
					int max = 0;
					int sum = 0;
					for (int i : scores) {
						sum += i;
						// max�� �ִ� ���ں��� i�� ũ�� i�� ���� max�׸��� �Űܴ��
						max = (max < i) ? i : max;
					}
					double avg = (double) sum / scores.length;
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

