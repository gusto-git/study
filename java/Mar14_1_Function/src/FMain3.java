import java.util.Scanner;

public class FMain3 {
	
	// 3���� ���� ���� �ϳ��� �Է� �޴� �Լ�
	// 3���� ũ�ų� ���� �� -> �ٽ� �Է� �޵���
	public static int getNum() {
		Scanner k = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = k.nextInt();
		return (num <3) ? num : getNum();
	}
	
	// Ȧ���� �Է¹��� �� �ִ� �Լ�
	// ¦�� �Է��ϸ� �ٽ� �Է� �޵���
	
	public static int getNum2() {
		Scanner k = new Scanner(System.in);
		System.out.print("Ȧ�� �� : ");
		int num = k.nextInt();
		return (num % 2 == 0) ? getNum2() : num;
		
	}
	
	// 0 ~ 100������ ������ �Է� �޴� �Լ�
	// ���� ���� ���ڰ� �ƴϸ� �ٽ� �Է¹޵���
	
	
	public static int getNum3() {
		Scanner k = new Scanner(System.in);
		System.out.print("0 ~ 100 : ");
		int num = k.nextInt();
		return (num >= 0) && (num <= 100) ?  num : getNum3();
		
	}
	
	
	
	public static void main(String[] args) {
		int num = getNum();
		System.out.println(num);
		
		int num1 = getNum2();
		System.out.println(num);
		
		int num2 = getNum3();
		System.out.println(num);
		
	}
}
