import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class test3 {
	// 10���� ���ڸ� �������� �̾Ƽ� (1~100)
	// �迭�� ��� ���
			
	// 10���� ���ڸ� ���� �Է�
	// �迭�� ��� ���
			
	// �������� ������ �߿� �ִ�, �ּҰ� ���
	// main�� �ٷ� Ȱ��
	
	
	
	public static void main(String[] args) {
	// �� : 1~100 ������ ���� �� 10���� �������� �̱� 
	Random r = new Random();
	int[] num = new int[10];
	int randomNum = 0;
	
	for (int i = 0; i < num.length; i++) {
		num[i] = r.nextInt(100)+1;
	}
	
	for (int i : num) {
		System.out.printf(i + " ");
	}
	System.out.println("=================");

	}
}
