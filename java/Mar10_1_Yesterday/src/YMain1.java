import java.util.Scanner;

public class YMain1 {
	public static void main(String[] args) {
		
		// ���� (console �Է�)
		// ���(����, ���ڴ�), ����� ����(/100), ���߱��� ��� ���� ������, ���� �㿡 ǫ ����� (true / false)
		// ��ħ �ð�
		// syso�� ����ϴµ� > println, printf 
		
		Scanner k = new Scanner(System.in); // Scanner k = new Scanner(System.in)
		System.out.print("���� ��� : ");	// System.out.print("���� ��� : ");
		String feel = k.next();				// String feelings = k.next();
		
		System.out.print("����� ���� : "); // System.out.print("��Ƽ�� ���� : ");
		int condition = k.nextInt();		// int conditionScore = k.nextInt();
		
		System.out.print("ȯ�� Ƚ�� : ");   // System.out.print("���߱��� ���? : ");
		int transfer = k.nextInt();			// int transfer = k.nextInt();
		
		System.out.print("���� ���� : ");	// System.out.print("���� : ");
		boolean sleep = k.nextBoolean();	// boolean deepSleep = k.nextBoolean();
		
		System.out.print("���� �ð� : ");	// System.out.print("���� �ð� : ");
		int sleeptime = k.nextInt();		// double sleepHour = k.nextDouble();
		
		System.out.println("=========================");
		System.out.printf("����� %s\n", feel);
		System.out.printf("����� ������ %3d���̴�\n", condition);
		System.out.printf("ȯ�� Ƚ���� %1d�̴�\n", transfer);
		System.out.printf("%b\n", sleep);
		System.out.printf("���� �ð��� %2d\n", sleeptime);
		System.out.println("=========================");
		
//		����Դ�
//		System.out.println("=-=-=-=-=-=-=-==-=-=-=-=-");
//		System.out.printf("���� ��� :" + feelings);
//		System.out.printf("����� ���� : %d��\n", conditionScore);
//		System.out.printf("���߱�����" + transfer + "�� ����Ž");
//		System.out.printf("���� : %b\n", deepSleep);
//		System.out.printf("���� �ð� : " + sleepHour);
//		System.out.println("=-=-=-=-=-=-=-==-=-=-=-=-");
		
		
		
	}
}
