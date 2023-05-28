
public class Referee {

	
	// ME �θ��� -> �ν��Ͻ�(��ü)�� �������. 
	public Me2 callMe() { // �� ��ü�� ���� ��, method�� ���� ����!
		System.out.println("���� : �� ����!");
		System.out.println("�� : ���� ��");
		return new Me2(); // �Ʊ����� ���� Me Ŭ���� �ȿ� �ִ� �޼ҵ尡 ������ �ҷ��ü��ְԵȴ�.
	}
	
	// ģ������ ��䱸
	public int askFriAns(Friend2 f) {
		int friAns = f.writeFriAns();
		return friAns; // �� ��ȯ 
	}
	
	// ������ �� �䱸
	public int askMeAns(Me2 mm) {
		int myAns = mm.tellAnswer();
		if (myAns < 1 || myAns > 100) {
			System.out.println("��.. �׷��� �ϴ°� �ƴѵ�..");
		}
		return (myAns >= 1 && myAns <= 100) ? myAns : askMeAns(mm);
	}
	
	
	// ����(���⶧ ����)
	public boolean judge(int answer, int myAnswer) {
		if (answer == myAnswer) {
			System.out.println("....!!");
		}else if (answer > myAnswer) {
			System.out.println("UP");
		}else {
			System.out.println("DOWN!");
		}
		return answer == myAnswer;
	}
	
	//  �õ� Ƚ��
	public void countTry(int turn) {
		System.out.println("========================");
		System.out.printf("%d��° �õ����� ����!\n",turn);
		System.out.println("========================");
	}
	
	// ���������� ������ ����Ǵ� ��
	public void start(Friend2 f) { // start(Fridend2 f, Me2 mm)ó�� �Ķ���ͷ� Me�� ����ص� �ǰ�, �Ʒ� ó�� new Me2();�� ����ؼ� �ٷ� ��ü�� �ҷ��ȴ�.
		Me2 mm = callMe(); // new Me(); :����(���ο� ��ü �θ���), ���ο� ��ü�� �ҷ��� ������ �Ķ���Ϳ� ���� �ʴ´�. 
		int answer = askFriAns(f);
//		System.out.println("ģ�� ���� : " + answer);
		int myAns = 0;
		boolean endGame = false; // �⺻���� false�̱� ������
		for (int turn = 1; true; turn++) {
			myAns = askMeAns(mm);
			endGame = judge(answer, myAns); // true , flase �Ǵ�
			if (endGame) { // true�� ���� �����ض�
				countTry(turn);
				break;// for���� �������
			
				
			}
		}
	}
}
