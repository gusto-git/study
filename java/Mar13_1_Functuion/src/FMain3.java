import java.util.Random;
import java.util.Scanner;

public class FMain3 {
	// ������ ����(�Լ� �ȿ��� ����)�� ����ϴ� �Լ�
	// 1�� �Լ�
	
	public static void red() { // ������ ���� �ƴ϶� red()�ȿ� �ƹ��͵� �ȵ�
		Random r = new Random();
		int i = r.nextInt(10)+1;
		System.out.println(i);
	}
	
	// ������ ������  '����'�ϴ� �Լ� -> ������ ������ ���� ��ǥ 
	// 3���Լ� 
	
	public static int blue() {
		Random r = new Random();
		int i = r.nextInt(10)+1;
		return i; // i�� �ִ� ���� ���� ����� ����
		
	}
	
	// ������ �ϳ� �Լ��� ������ Ȧ���� ¦���� ����ϴ� �Լ�
	// 2���Լ�
	
	public static void green(int a) {
		String result = a % 2 == 0 ? "¦" : "Ȧ";
		System.out.printf("%d�� %s!\n",a,result);
		
	}
	
	// ������ �ΰ� �־��� ��
	// ���� ������ ũ�� ��, �ڿ� ������ ũ�� �ڸ� �����ִ� �Լ� 
	// �ٸ����� �� ����
	// 4���Լ�
	public static String purple(int a, int b) {
		String result = a > b ? "��" : "��";
//		System.out.println(result);
		return result;
		
	}
	
	public static void main(String[] args) {
		red();
		int i = blue(); //int i�� blue() ��������, blue()�Լ��� ���ؼ� ������ ���ڸ�  i��� int �׸��� ���  �ֿܼ� ���
		System.out.println(i);
		System.out.println("======================");
		green(i);
		String ss = purple(10,20);
		System.out.println(ss);
		
		// ���� �޴� ����ִ� (2���� �� �ϳ�)
		// ���� �ִ� �Լ� �̿�
		// ������ ���� 2�� �̾Ƽ�
		// ���� ������ ũ��'�ʹ�', �ƴϸ� '¥���'
		// blue , purple Ȱ��
		
		int b1 =blue();
//		System.out.println(b1);
		int b2 =blue();
//		System.out.println(b2);
		String sss = purple(b1, b2);
		System.out.println(sss);
		String menu =(sss.equals("��")) ? "�ʹ�" : "¥���";
		System.out.println(menu);
		String menu2 = (b1 > b2) ? "�ʹ�" : "¥���";
		System.out.println(menu2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
