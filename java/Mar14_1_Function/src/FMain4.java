import java.util.Scanner;

public class FMain4 {
	
	// ���� 1�� �Է� �޴� �Լ� 2�� �����
	public static int getX() {
		Scanner k = new Scanner(System.in);
		System.out.print("x : ");
		int x = k.nextInt();
		return x;
	}
	
	public static int getY() {
		Scanner k = new Scanner(System.in);
		System.out.print("y : ");
		int y = k.nextInt();
		return y;
	}
	
//	�� ���� 2���� ������ �� ¦���� ����� ����, 
//	Ȧ���� ���� �ٽ� �Է��ϴ� �Լ�
	public static int getResult(int x, int y) {
		int sum = x + y;	
//		return sum % 2 == 0 ? sum : getResult(x, y); ->���� ����
		// ���ϴ� ���� ������ ������ ���ѷ��� ���ư�
		return (sum % 2 == 0) ?sum : getResult(getX(), getY());
	}

	public static void main(String[] args) {
	int x =	getX();
	int y =	getY();
	System.out.println(x + y);
	int sum = getResult(x, y);
	System.out.println(sum);
		
	}
	
}
