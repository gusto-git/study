import java.util.Scanner;

public class OMain4 {
	public static void main(String[] args) {
		// �̸��� console���� �Է¹��� ��
		// �� �̸��� 'ȫ�浿'�� ������ ���� (true / false)
		/*	
		Scanner k = new Scanner(System.in);
		System.out.print("�̸� :");
		String name = k.next();
		
		String r = name == "ȫ�浿" ? "true" : "false";
		System.out.println(r);
		*/
		
		Scanner k = new Scanner(System.in);
		System.out.print("�̸� : ");		
		String name = k.next();
//		boolean a = (name == "ȫ�浿");
//		// 'ȫ�浿'�� name�� �ּҰ��� ���ϴ°Ŷ� console�� ȫ�浿�� �Է��ص� false �����´�
//		System.out.println(b);
//		
//		//String ������ �� **
//		// ����� �� ��ü�� ���ϱ� ���ؼ��� .equals()�� ���
//		boolean nameCompare = (name.equals("ȫ�浿")); // String ��
//		System.out.println(b2);//true
//		
		
		//���� ���׿����� �̿�!
		// �̸��� ȫ�浿 : [1������]
		// ���̰� ¦���� : [1������]
		// �׿� ������   : [4������]
		System.out.print("���� : ");;
		int age = k.nextInt();
		
		String classNo = ((age % 2 == 0)) || name.equals("ȫ�浿") ? "1������" : "4������";
		System.out.println(classNo);
		
		// ���� ���� ���� ���ϱ�
		// ���� �ϳ��� �߱����� 6�� �� �� ����
		// ���� ������ �Է¹޾Ƽ� 
		// �� ������ ��� ���� ������ ������ � ����?
		
		
//		System.out.print("���� ���� :");
//		int ball = k.nextInt();
//		
//		int box = (ball % 6 == 0 ) ? ball / 6 : (ball / 6) + 1; 
//		System.out.printf("�ʿ��� ������ ���� : %d��" , box);
		
//		System.out.println("���� ���� : ");
//		int ball = k.nextInt();
//		double box1 = (ball / 6);
//		int box2 = (box1 % 0 !=0) ? 1 : 0;
//		System.out.println(box1+box2);

		
		
	}
}
