import java.util.Scanner;

public class KMain1 {
	public static void main(String[] args) throws InterruptedException {
		// Scanner : Java�� ����Ǿ� �ִ� ��� �� �ϳ�!
		// �ش� ����� �̿��ϸ� console�� �Է��� ������ ����.
		// �� ����� ����Ϸ��� Import��� ���� �߰� �˴ϴ�.
		// sca + crtl + space
		
		// �����ϳ� �߰�
		// new ~~ : ��ü
		// Scanner�� ȭ��(��Ŭ���� �ܼ�â)���� ���� �����͸� �Է¹޴� ��� 
		
		
		
//		Scanner keyboard = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);
		
		// ���� �̸� �Է¹ޱ�
		// 1. �Է¹��� ���� ������ֱ� >> syso
		System.out.print("�̸� : "); // print �� �ڿ� ���� , println �����ٿ� ����
		// 2. �Է¹��� ����(������) ������ ��� 
		String name = keyboard.next(); // -> string�� next()
//		System.out.println(name); // Ȯ�ο�
		// Console�� �̸��� �Է��ϰ�  enter�� ġ�� name�̶�� ������ �ֿܼ� �Է��� �̸��� ������ �ȴ�.
		//////////////////////////////////////////////////////////////////////////////////////////////
		
		//���� �Է¹ޱ�
		System.out.print("���� : ");
		int age = keyboard.nextInt(); // ->int�� nextint()
//		System.out.println(age);
	
		// Ű, ������, �Ź߻�����, ���డ����� ��, �����ϴ� ����
		// ���� �������� ����?
		
		System.out.print("Ű : ");
		double cm = keyboard.nextDouble();
//		System.out.println(cm);
		
		System.out.print("������ : ");
		int kg = keyboard.nextInt();
//		System.out.println(kg);
		
		System.out.print("�Ź߻����� : ");
		int shoose = keyboard.nextInt();
//		System.out.println(shoose);
		
		System.out.print("���డ�� ���� �� : ");
		String place = keyboard.next();
//		System.out.println(place);
		
		System.out.print("�����ϴ� ���� : ");
		int num = keyboard.nextInt();
//		System.out.println(num);
		
		System.out.print("���� ��� ������ ���� : ");
		boolean play = keyboard.nextBoolean();
//		System.out.println(play);
		
//		����� ��
		/*
	    System.out.print("Ű : ");
	    double height = keyboard.nextDouble();
	    System.out.print("������ :");
	    double weight = keyboard.nextDouble();
	    System.out.print("�Ź� ������ :");
	    int shoesSize = keyboard.nextInt();
	    System.out.print("���డ�� ���� �� : ");
	    String place1 = keyboard.next();
	    System.out.print("�����ϴ� ���� : ");
	    int num1 = keyboard.nextInt();
	    System.out.print("��� ������ ���� : ");
	    boolean wannaplay = keyboard.nextBoolean();
	    */
		
		//������� �� Ȯ�ι� 
		System.out.println("=====================");
		System.out.printf("�̸� : %s\n", name); //�ѱ��� ������ ��� font �����̴�. �̸��� name���� ����
		System.out.println("���� : " + age + "��"); // -> �̷������� �ص� �ȴ�. +�� �ƴ϶� ,�� �Ǹ� ������ 
		System.out.printf("Ű : %.1fcm\n", cm);
		System.out.printf("������ : %dkg\n", kg);
		System.out.printf("�Ź߻����� : %d cm\n", shoose);
		System.out.println("���డ�� ���� �� : " + place);
		System.out.printf("�����ϴ� ���� : %d\n", num);
//		System.out.print("�������� ? "+ play + "\n");
		System.out.println("�������� ? "+ play);
		System.out.println("=====================");
		
		// ����) bat ���� �����
		// bat(��ġ����) �ϳ� ����
		// '���� ������ �ƹ��ų� �Է��ϼ���'
		// 1�ʸ���. �� ������ 3�� �ݺ���Ű��
		// ���α׷��� �����մϴ� ��� ������ ��µǸ鼭 0.5�� �ڿ� ���α׷��� ����ǰ� �����
		
		System.out.println("���� ������ �ƹ��ų� �Է��ϼ���.");
		String quit = keyboard.next(); // Ű���� �Է��� �ޱ� ���� ��
		keyboard.close(); // consle �Է� �޴� ��� ����
		// ...
		Thread.sleep(1000);
		System.out.print("."); //> println�� ���� �ٲ��� print�� ����
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.println("."); // ���� �ٿ� ���;��ؼ� ln���� ����
		
		System.out.println("���α׷��� �����մϴ�!");
		Thread.sleep(500);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    // int -> nextInt()
	    // String -> next()
	    // double -> nextDouble()
	    // boolean -> nextBoolean()
	
		
		
		
		
		
		
	}
}
