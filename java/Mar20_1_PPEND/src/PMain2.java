import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class PMain2 {
	public static void main(String[] args) {
		// 10���� ���ڸ� �������� �̾Ƽ� (1~100)
		// �迭�� ��� ���
		///////////////////////////////////////
		// 10���� ���ڸ� ���� �Է�
		// �迭�� ��� ���
		//////////////////////////////////////
		// �������� ������ �߿� �ִ�, �ּҰ� ���
		int[] num = new int[10];
		Random r = new Random();
		int a = 0;
		for (int i = 0; i < num.length; i++) {
			a = r.nextInt(100)+1;
			num[i] = a;
		}
		
		for (int i : num) {
			System.out.print(i + " ");
		}
		System.out.println("=================");
		///////////////////////////////////
		// �ִ밪, �ּҰ��� �迭�� 0��° ���ڶ�� ����
		
		int max = num[0]; // �迭�� 0��° ��Ҹ� �ִ밪�̶� ����
		int min = num[0]; // �迭�� 0��° ��Ҹ� �ּҰ��̶� ����
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) { //���� ������ ���ڰ� num[i]��Һ��� �۴ٸ�
				max = num[i]; // �� ū  ���ڸ� max �׸��� �Ű� ���
			} else if (min > num[i]) {//���� ������ ���ڰ� num[i]�� ���� ũ�ٸ�
				min = num[i];// min�� �� ���� ���ڸ� ��� 
			}
		}
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		
		
		
		int[] num2 = new int[10];
		Scanner k = new Scanner(System.in);
		int b = 0;
		for (int i = 0; i < num2.length; i++) {
			System.out.printf("%d��° ����", i+1);
			b = k.nextInt();
			num2[i] = b;
		}
		for (int i : num2) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("================");
		///////////////////////////////////// 

		
		
		
		
	}
}
