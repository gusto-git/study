import java.util.Scanner;

// ������ >> stack ������ ��� 
// ������ ���� ����Ƿ��� ? >> boolean�� ����Ѵ�. boolean = �⺻�� 

// ������
//		���׿����� : a++; !a, ...
//		���׿����� : a + b , a < 10 , ...
//		���׿����� : ***
//			�������� ������ ���� ������ �� 
//			��if(���ǹ�) ��� ��� ����
//			�����ǽ� ? ������ �����ϸ� ���� ���� : �Ҹ����ϸ� ���� ����
public class OMain3 {
	public static void main(String[] args) {

		int age = 5;
		// ����) ���׿�����
		// 20�� ���� ������ ���� �������
		// ������ �����̽ó׿�
		
		String sayWhat = (age < 20) ? "���������" : "�����̽ó׿�";
		System.out.println(sayWhat);
		
		// ���� 
		// ���ڸ� �ֿܼ� �Է¹޾Ƽ� 
		// ¦���� [¦��] , Ȧ���� [Ȧ��]�� ��� �ǰ� 
		
		Scanner k = new Scanner(System.in);
		System.out.print("���� �Է��� : ");
		int num = k.nextInt();
		String r = num % 2 == 0 ? "¦��" : "Ȧ��";
//		String r = num % 2 == 1 ? "Ȧ��" : "¦��";
		System.out.println(r);
		
		// ���ڰ� 50 �̻��̸� �����ϼ���?
		// ���ڰ� 50 �̸��̸� �ȳ��ϼ���?
		
//		System.out.print("���� �Է��� : ");
//		int num1 = k.nextInt();
		String r2 = num >= 50 ? "�����ϼ���?" : "�ȳ��ϼ���?";
//		String q = num >= 50 ? "�����ϼ���?" : "�ȳ��ϼ���?";
		System.out.println(r2);
		
		
		
	}

}
