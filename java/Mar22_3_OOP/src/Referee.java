import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Referee {
	
	String[] rulebook = new String[] {"", "����", "����","��"};
	// ���� ���� �� �Ұ�
	public void readRuleBook() {
		System.out.println("---------------------------");
		for (int i = 1; i < rulebook.length; i++) {
		System.out.printf("%d. %s\n",i, rulebook[i]);
		}
		System.out.println("---------------------------");
	} 
	
	// Me ������
	public int askAns(Me m) {
		System.out.print("������? : ");
		int myAns = m.fire();
		return (myAns >= 1 && myAns <= 3 )? myAns : askAns(m);
	}
	
	// Friend ������(���� �����̶� �����ε�)
	public int askAns(Friend f) {
		int friAns = f.fire();
		return friAns; // ���׿����� �Ⱦ������� ������ �����س���
	}
	
	// ���� �� �´���
	public void printHand(int m , int f) {
		System.out.printf("���� %s\n", rulebook[m]);
		System.out.printf("ģ���� %s\n", rulebook[f]);
	}
	
	//����
	private boolean judgeWin(int m, int f, Me mm) {
		int result = m - f;
		if (result == 0) {
			System.out.println("���!!");
			mm.draw++;
		}else if (result == -1 || result == 2) {
			System.out.println("��!!");
		
		}else {
			System.out.println("�̱�!");
			mm.win++;
		}
		// ���� ��쿡�� ���ϵǵ��� -> ������ true�� �ǵ����� �ǹ��� , ���� �� true�� �Ǽ� �Ʒ� while if���� Ʈ���϶� ���� ��Ű�� ����
		return (result == -1 || result == 2); // �� false�� �ϴ��� 
	}
		
		public void sayHowManyWin(Me m) {
			System.out.printf("%d�� %d��!\n", m.win, m.draw);
		}
	
	public void start(Me m, Friend f) {
		readRuleBook();
		int myHand ;
		int friHand ;
		
		while (true) {
			myHand = askAns(m);
			friHand = askAns(f);
			printHand(myHand, friHand);
			System.out.println("========================");
			if (judgeWin(myHand, friHand, m)) { // true�϶� > ������ �ǹ� 
				sayHowManyWin(m);
				break; // ���� �ݺ����� ���� 
			}
			System.out.println("========================");
		}
	}
}
