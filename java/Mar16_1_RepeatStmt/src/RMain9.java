import java.util.Scanner;

public class RMain9 {
	public static void main(String[] args) {
		// switch - case �� 
		Scanner k = new Scanner(System.in);
		int num = 0;
		int money = 0;
		int howMuch = 0;
		
		lee : while (true) {
			System.out.println("---------------------------");
			System.out.println("1. ���� 2. ��� 3. �ܰ� 4. ����");
			System.out.println("---------------------------");
			System.out.print("��ȣ�� �Է��ϼ��� ");
			num = k.nextInt();
			
			switch (num) {
			case 4:
				System.out.println("���α׷� ����!");
				break lee; //switch - case�ȿ� ������ switch-case ���� �����ϱ� ������ �ݺ��� �տ� �̸��� �ٿ��� ���� / if���� while���� �ٷ� ���� 
				
			case 3 :
				System.out.println("3. �ܰ�");
				System.out.printf("�ܰ�� [%d��] �Դϴ�.", money);
				break; // break�� �����ָ� �ؿ� �����Ǵ� case�� �ߺ��� �ǹ����� ������ ������ �ؾ���.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////				
			case 1 : 
				System.out.println("1. ����");
				System.out.print("�Աݾ� : ");
				howMuch = k.nextInt();
				
				while (true) 	
				if (howMuch > 0) {
					System.out.printf("%,d�� �Ա��մϴ�.\n", howMuch);
					money += howMuch; // money = money + howMuch;
					break; // while���� ���� ���� ���� ��ġ�� 
					} else {
					System.out.println("�Ա��� �� ���� �ݾ��Դϴ�.");
					}
				
			case 2:
				System.out.println("2. ���");
				System.out.println("��ݾ� : ");
				howMuch = k.nextInt();
				while (true) {
				if(howMuch > 0 && howMuch <= money) {
					System.out.printf("%,d���� ����մϴ�\n",howMuch);
					break; // while
				}else {
					System.out.println("����� �� �����ϴ�.");
				}
				System.out.printf("%,d���� ����մϴ�\n", howMuch);
				money -= howMuch; //money = money - howMuch;
				break; // switch-case�� ������
				}
				break;// switch - case ���� ���� �뵵 
				}
			}
		}
	}
