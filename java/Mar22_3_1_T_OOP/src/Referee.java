
public class Referee {
	String[] hand = {"", "����", "����", "��"};
	
	
	public Me callMe() {
		System.out.println("���� : �����ּ���.");
		System.out.println("��   : ���Խ��ϴ�.");
		return new Me();
	}
	
	public Friend callFri() {
		System.out.println("���� : �����ּ���.");
		System.out.println("ģ�� : ���Խ��ϴ�.");
		return new Friend();
	}
	
	public void rulebook(String[] hand) {
		System.out.println("============");
		for (int i = 1; i < hand.length; i++) {
			System.out.printf("%s : %d\n", hand[i],i);
		}
		System.out.println("============");
	}
	// ��ǻ�Ͱ� �������� �̴� �޼ҵ�
	public int pickCom(Friend f) {
		int com = f.callFri();
		return com;
	}
	
	// ���� �������� �̴� �޼ҵ�
	public int pickMe(Me m) {
		int me = m.tellAnswer();
		return me;
	}
	
	// �����ϴ� �޼ҵ�
	public int judgeGame(int me , int com) {
		int a = me - com;
		
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
	
	//5. ���� ����ϴ� �޼ҵ�
	public void printResult(int m , int c , String[] h) {
		System.out.printf("���� �� �� : %s\n", h[m]);
		System.out.printf("��ǻ�Ͱ� �� �� : %s\n", h[c]);
	}
	
	//6. ���� ����ϴ� �޼ҵ�

	
	public void start() {
		Me m = callMe();
		Friend f = callFri();
		rulebook(hand);
		int result = 0;
		int win = 0;
		int draw = 0;
		int com = 0;
		int me = 0;
		while (true) {
			com = pickCom(f);
			System.out.println(com);
			me = pickMe(m);
			result = judgeGame(me, com);
			printResult(me, com, hand);
			
			if (result == 1) {
				System.out.printf("��\n");
				win += result;
			}else if (result == 0) {
				System.out.printf("���º�\n");
				draw += result+1;
			}else if (result == -123456) {
				System.out.printf("%d�� %d�� \n", win, draw);
				break;
			}
			
		}
		
		
		
		//���� �۵� 
	}
	
}
