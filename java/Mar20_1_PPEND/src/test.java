import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int selectNo = 0;
		int studentNo = 0; 
		int[] scores = null; // �迭�� �������̶� null�� �ʱ�ȭ �ؾ��Ѵ�.
		a:while (true) {
			System.out.println("---------------------------------------------------------");
			System.out.println("1. �л� �� | 2. ���� | 3. ���� ����Ʈ | 4. �м� | 5. ����");
			System.out.println("---------------------------------------------------------");
			System.out.println("���� > ");
			selectNo = k.nextInt();
			
			switch (selectNo) {
			case 5:
				System.out.println("�����մϴ�.");
				System.out.println("---------------------------------------------------------");
				break a;
			case 1:
				System.out.println("�л� �� �Է� : ");
				studentNo = k.nextInt();
				scores = new int[studentNo];
				break;
			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("%d�� �л� ���� : ", i + 1);
					scores[i] = k.nextInt(); // �� index���� ���� �ֱ�
				}
			case 3:
				int index = 1; // for - each������ �ε�������� ���� �־�����Ѵ�.
				for (int i : scores) {// scores�� �ִ� ��ҵ�(������)
					System.out.printf("%d�� �л� ���� : %d��\n", index++, i);
				}
				break;
			case 4:
				//���� ������ ���� ���� ������
				int max = 0;
				int sum = 0;
 				for (int i : scores) {
 					sum += i;
					// max�� �ִ� ���ں��� i�� ũ�� i�� ���� max �׸��� �Űܴ䤱��
					max = ( max < i) ? i : max;
				}
 				double avg = (double)sum / scores.length;
				System.out.printf("�ְ����� : %d\n,", max);
				System.out.printf("������� : %.2f��\n", avg);
				break;
				
				
				
			default:
				System.out.println("1~5���̸� �Է����� ����");
				break;

			}
		}
	}
}
