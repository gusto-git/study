import java.util.Scanner;

public class PMain3 {
	//���� 2�� ������ �� ���� ����ϴ� �Լ�
	// main���� �����ͼ� 

	public static void printSum(int a, int b) {
		System.out.printf("%d + %d = %d\n",a, b, a+b);
	}
	
	// ���� 3���� ������ �� ���� ����ϴ� �Լ�
	// main���� �����ͼ�
	
	// **�����ε� : �Ķ���Ͱ� �ٸ��� �Լ����� ���Ƶ� ������.
	// ������ ���ƾ��Ѵ�.(���� ���ϴ°�)
	public static void printSum(int a, int b, int c) {// �����ε� ����� ��
		System.out.printf("%d + %d + %d = %d\n" , a, b, c, a+b+c); 
	}
	
	// ���� n���� ������ �� ���� ����ϴ� �Լ�
	// main���� �����ͼ�
	
	public static void printMul(int...is) {//�ڷ���...������ -> ������ �Ķ���� 
		int mul = 1;
		for (int i = 0; i < is.length; i++) { // 0���� ~ is�� ���̸�ŭ 
			mul *= is[i];
		}
		System.out.println(mul);
	}
	
	public static void main(String[] args) {
		printSum(10, 20);
		printSum(10, 20, 30);
		printSum(10, 20, 50);
		printMul(10,2,5,6,7,9);
	}
}
