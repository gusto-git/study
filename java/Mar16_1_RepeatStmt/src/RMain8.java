import java.util.Scanner;

public class RMain8 {
	public static void main(String[] args) {
		// ATM ����� Ǯ��
		Scanner k = new Scanner(System.in);
		int num = 0; // ��ȣ ������ ����
		int howMuch = 0 ; // �Ա�, ��ݿ� 
		int money = 0; // ���� �ܰ�� 
		// while �� Ǯ��
		while (true) {
			System.out.println("---------------------------");
			System.out.println("1. ���� 2. ��� 3. �ܰ� 4. ����");
			System.out.println("---------------------------");
			System.out.print("��ȣ�� �Է��ϼ��� ");
			num = k.nextInt();
			if (num == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				break; // �ݸ� ���� -> ���� �������̶� �̸� �����ư�� �����. 
			}else if(num ==1){
				System.out.println("1.����");
				while (true) {
					System.out.print("�Ա��� �ݾ� : ");
					howMuch = k.nextInt();
					if (howMuch >0) {
						System.out.printf("%d���� �����մϴ�\n",howMuch);
						money += howMuch; // money = money + howMuch; 
						break; // ���� ����� ���� ���� : ���� ����� �ݺ���(while)
					} else { // howMuch�� �ݾ��� 0���� �۰ų� ������
						System.out.println("�Ա��� �� ���� �ݾ��Դϴ�.");
					}
					
				}
				
			}else if (num == 2) {
				System.out.println("2.���");
				while (true) {
					System.out.println("����� �ݾ� : ");
					howMuch = k.nextInt();
					if (howMuch > 0 && howMuch <= money) { // 0 < howMuch <- �����ܰ� 
						System.out.printf("%d���� ����մϴ�.\n",howMuch);
						money -= howMuch; // money = money - howMuch;
						break; // ���� ����� �ݺ���(while) ����;
					}else {
						System.out.println("����� �� �����ϴ�.");
					}
					
				}
			}else if (num ==3) {
				System.out.println("3. �ܰ�");
				System.out.printf("�ܰ�� [%d��] �Դϴ�. \n", money);
			}
			
		}
		
	}
}
