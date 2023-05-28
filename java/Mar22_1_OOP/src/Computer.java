import java.util.Random;
import java.util.Scanner;

public class Computer {

	Random cpu = new Random();
	int coin = 20;
	
	// ��� ���� ������� ��
	public int askHowManyCoin(User u) {
		System.out.print("�� ���� �ϰڽ��ϱ�? (2�� �̻� 20�� ����)");
		int startCoin = u.answerHowManyCoin(); //��� ���� startCoin�� ��´�.
		if (startCoin < 2 || startCoin > 21 ) {
			System.out.println("�ٽ� �Է��� �ּ���");
		}
		return (startCoin >= 2 && startCoin <= 20) ? startCoin : askHowManyCoin(u);
	}
	
	// ��ǻ�Ͱ� ������ ����� ���� ���� �ȿ��� �������� ���� �̵���
		public int shakeCoin(int userCoin) {
			return cpu.nextInt(userCoin);
		}
	
	// Ȧ���� ¦���� �ֿܼ� ���� �޼ҵ�
		public String askHJ(User u) {
			System.out.print("Ȧ or ¦ : ");
			String userAnswer = u.answerHJ();
			return (userAnswer.equals("Ȧ") || userAnswer.equals("¦"))? userAnswer : askHJ(u);
		}
	
	// ��ǻ�Ͱ� �������� ����  ���ڰ� Ȧ���� ¦���� �Ǵ��ϴ� �޼ҵ�
		public String judgeCoin(int shakeCoin) {
			return (shakeCoin % 2 == 0) ? "¦" : "Ȧ";
		}
		
	// ���� �Է��� �� vs ��ǻ���� �� => ���俩��
		public String getResult(String userAnswer , String comAnswer) {
			return userAnswer.equals(comAnswer) ? "����" : "Ʋ��";
		}
	
	// ������ �˷��ִ� method
		public void printResult(int shakeCoin , String result) {
			System.out.printf("��ǻ�ʹ� %d�� �̾Ұ�, %s\n", shakeCoin, result);
		}
		
	// �����ϴ� �޼ҵ�
	public void start(User u) {
		int userCoin = askHowManyCoin(u);
//		System.out.println("���� �� ���� ���� : " + userCoin); // Ȯ�ο�
		int shakeCoin = shakeCoin(userCoin);
//		System.out.println("��ǻ�Ͱ� ���� ���� ���� : " + shakeCoin); // Ȯ�ο�
		String userAnswer = askHJ(u);
//		System.out.println("���� �Է��� �� : "+ userAnswer);// Ȯ�ο�
		String comAnswer = judgeCoin(shakeCoin);
//		System.out.println("��ǻ���� �� : " + comAnswer);// Ȯ�ο�
		String result = getResult(userAnswer, comAnswer);
//		System.out.println("����Ȯ�� : " + result);// Ȯ�ο�
		printResult(shakeCoin, result);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	



//
//int coin;
//int answer;
//int randomCoin;
//String answer1;
//Scanner mouth = new Scanner(System.in);
//Random coin1 = new Random();
//
//
//public void printComputer() {
//	System.out.printf("��ǻ�Ͱ� ������ �ִ� ������ �� : %d\n", coin);
//	
//}
//
//public void getUserAnswer(User u) {
//	System.out.print("���� ��� ����� ���? ");
//	answer = u.UserAnser();
//}
//
//public void shakeCoin() {
//	randomCoin = coin1.nextInt(answer)+1;
//	System.out.printf("��ǻ�Ͱ� ���� ������ �� : %d\n",randomCoin);
//
//}
//public void checkCoin() {
//	
//	if (randomCoin % 2 == 0) {
//		System.out.println("¦");
//	}else if (randomCoin % 2 == 1) {
//	    System.out.println("Ȧ");
//	}
//	return 
//}
//
//public void askUser(User u) {
//	System.out.print("Ȧ or ¦ : ");
//	answer1 = u.UserAnser1();	
//}
//
//public void checkAnswer() {
//	if (check) {
//		
//	}
//}
//
//
//

