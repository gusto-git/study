import java.util.Random;
import java.util.Scanner;

public class OMain2 {
	
	// 1. 1 = ���� , 2 = ����, 3 = ��
	public static void printRule(String[] hand) {
		System.out.println("==============");
		for (int i = 1; i < hand.length; i++) {
			System.out.printf("%s : %d\n", hand[i], i);
		}
		System.out.println("==============");
	}
	
	// 2. ��ǻ�Ͱ� ���������� �������� ���� �� �ֵ��� �ϴ� �޼ҵ�
	public static int pickCom() {
		Random r = new Random();
		int com = r.nextInt(3)+1;
		return com;
	}
	
	// 3. ���� ����, ����, ���� �Է��ϴ� �޼ҵ�
	public static int pickMine() {
		Scanner k = new Scanner(System.in);
		System.out.print("������? :");
		int my = k.nextInt(3)+1;
		return (my > 0 && my < 4) ? my : pickMine();
	}
	
	// 4. �����ϴ� �Լ�
	public static int judgeGame(int m , int c) {
		int a =  m - c;
		// return �޾ƾ� �ϴ� ���� ��Ȳ�� ���� �ٸ��Ƿ�
		// retrun a�� �ƴ϶� ���� ���ڷ� ������ �ش�.
		if (a == 0) {
			System.out.println("���º�");
			return 0;
		}else if (a == -1 || a == 2) {
			System.out.println("�й�");
			return -123456;
		}else {
			System.out.println("�¸�");
			return 1;
		}
	}
	// 5. ���� ������ִ� �Լ�
	public static void printResult(int m , int c , String[] h) {
		System.out.printf("���� �� �� : %s\n", h[m]);
		System.out.printf("��ǻ�Ͱ� �� �� : %s\n", h[c]);
		
	}
	
	
	
	public static void main(String[] args) {
		// ���� ���� �� ( 1, 2 ,3)
		// �迭�� ��Ҵ� 0���� �����ؼ� 0�� ���� ����
		String[] hand = {"", "����", "����", "��  "};
		printRule(hand);
		int com = 0;
		int me = 0;
		int result = 0;
		int win = 0;
		while (true) {
			com = pickCom();
			me = pickMine();
			printResult(me, com, hand);
			result = judgeGame(me, com);
			
			if (result == -123456) {
				System.out.printf("%d����\n", win);
				break;
			}
			win += result;
		}
		
	}
}
