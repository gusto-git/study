import java.util.Scanner;

// ATM ����� �ϴ� ���α׷�(MAIN)
// 1. �Ա�, 2. ���, 3. �ܰ�Ȯ��, 4. ���α׷� ����
// �Ա�, ��� >> �Է��� ���� �� 

// �ܼ� ���� - 1�� �Է� - �� �Ա� - 10000��
// �޴����� - 3���Է� - �ܰ� 10000
// �޴����� - 4�� �Է� - ���α׷����� 
public class RMain7 {
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		int bank = 0;
		int money = 0;

		a: while (true) {
			
			System.out.println("");
			System.out.println("------------------------------------------------------");
			System.out.println("1.�Ա� | 2. ��� | 3. �ܰ�Ȯ�� | 4. ���α׷� ����");
			System.out.println("------------------------------------------------------");
			System.out.println("");
			System.out.print("���� : ");

			bank = k.nextInt();
			
			
		switch (bank) {
		case 1:
			System.out.print("�Ա� �Ͻ� �ݾ� : ");
			bank = k.nextInt();
			money += bank;
			System.out.printf("%d�ݾ��� �Ա��մϴ�.", bank);
			break;
			
		case 2:
			System.out.print("��� �Ͻ� �ݾ� : ");
			bank = k.nextInt();
			money -= bank;
			System.out.printf("%d�ݾ��� �Ա��մϴ�.", bank);
			break;
			
		case 3:
			System.out.printf("�����ܰ� : %d\n", money);
			break;
			
		case 4:
			System.out.print("���α׷� ����");

			break a;
			}
		
		}
	}
}
