import java.util.Random;
import java.util.Scanner;

public class Referee {
	int pickCom;
	int pickMine;
	String[] hand = {"", "����", "����", "��  "};
	
	
	public Me callMe() {
		System.out.println("���� : ���� �ϼ���");
		System.out.println("�� : ���� �Ϸ�");
		return new Me();
	}

	public Friend callFri() {
		System.out.println("���� : ���� �ϼ���");
		System.out.println("ģ�� : ���� �Ϸ�");
		return new Friend();
	}

	public void ruleBook(String hand[]) {
		System.out.println("============================");
		for (int i = 1; i < hand.length; i++) {
			System.out.printf("%s : %d\n",hand[i],i);
		}
		System.out.println("============================");
	}
	
	// ��ǻ�Ͱ� �������� �̴� �޼ҵ�
	public int pickComNum(Friend f) {
		pickCom = f.friAns;
		return pickCom;
	}
	
	// ���� �������� �̴� �޼ҵ�
	public int pickMineNum(Me m) {
		
		pickMine = m.MyAns;
		return (pickMine >= 0 && pickMine <= 0 ) ? pickMine : pickMineNum(m);
	}
	
	// �����ϴ� �Լ�
	public int judgeGame(int pickMine , int pickCom) {
		int a = (pickMine - pickCom);
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
	
	// �� �� ������ִ� �Լ�
	public void printResult(int pickMine , int pickCom, String[] h) {
		System.out.printf("���� �� �� : %s\n", h[pickMine]);
		System.out.printf("��ǻ�Ͱ� �� �� : %s\n", h[pickCom]);
	}
	
	
	public void start() {
		Me m = callMe();
		Friend f = callFri();
		ruleBook(hand);
		int pickCom = 0;
		int pickMine = 0;
		int result = 0;
		int win = 0;
		int draw = 0;
		
		while (true) {
			pickCom = pickComNum(f);
			System.out.println(pickCom);
			pickMine = pickMineNum(m);
			////
			printResult(pickMine, pickCom, hand);
			result = judgeGame(pickMine, pickCom);
			
			if (result == 0) {
				System.out.println("���º�");
				draw += result;
				break;
			} else if (result == 1) {
				System.out.println("�¸�");
				win += result;
				break;
			}else if (result == -123456) {
				System.err.printf("%d�� %d��\n", win, draw);
				break;
			}
			
		}
		
	}
	
	
}
