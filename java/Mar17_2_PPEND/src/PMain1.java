import java.util.Iterator;
import java.util.Scanner;

public class PMain1 {
// main�ȿ� �����ھ� �ִ´�.
// � ���ڸ� �ܼ�â�� �Է�
// �� ������ ����� ���ؼ� ������ִ� ���α׷�
// ���� ���� ����
// ex) 12 > 12�� ����� 1,2,3,4,5,6,12
// ��� �ݺ��ϰ� (���ڸ� �Է��ϸ� �ش��ϴ� ������ ����� ��� ������)
// �׷��ٰ� �ܼ�â�� ���� 0�� �Է��ϸ� ���α׷� ����
// 0 ������ �������� ���ѹݺ�
// �迭��� xxxxxx
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int num = 0;
		while (true) {
			System.out.print("���� �Է�(0 �Է��ϸ� ����) :");
			num = k.nextInt();
			if (num == 0) {
				System.out.println("�����մϴ�.");
				break; // while ���� 
			}
			System.out.printf("%d�� ����� : ", num);
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
//					System.out.printf("%d�� ����� %d\n", num,i);
					System.out.printf("%d ",i);
				}
			}
			System.out.println();
		}
		
	}
}

