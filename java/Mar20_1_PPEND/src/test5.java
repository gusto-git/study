import java.util.Scanner;

// ver.�Լ�
public class test5 {
	
	public static void start() {
		System.out.println("---------------------------------------------------------");
		System.out.println("1. �л� �� | 2. ���� | 3. ���� ����Ʈ | 4. �м� | 5. ����");
		System.out.println("---------------------------------------------------------");
	}
	
	// �����ϴ� �޴��� �޾� ���� �Լ�
	public static int getSelectNo() {
		Scanner k = new Scanner(System.in);
		System.out.print("���� > ");
		int selectNo = k.nextInt();
		return selectNo;
	}
	// �л� �� �޾ƿ��� �Լ�
	public static int getStudentNum() {
		Scanner k = new Scanner(System.in);
		System.out.print("�л� �� : ");
		int studentNum = k.nextInt();
		return studentNum;		
	}
	// �л� �������� ���� �޾ƿ��� �Լ�
			// ���� ������ (0~100)
	public static int getScore() {
		Scanner k = new Scanner(System.in);
		int score = k.nextInt();
		if (score > 100) {
			System.out.println("������ 100���� ���� �� �����ϴ�.");
			System.out.println("�ٽ� �Է� : ");
		}else if (score < 0) {
			System.out.println("������ 0���� ���� �� �����ϴ�.");
			System.out.println("�ٽ� �Է� : ");
		}
		return (score <= 100 && score >= 0 ) ? score : getScore();
	}
	// �л��� ���� �Է��ϴ� �Լ�
	public static void getScore(int[] score) { // �����ε� ���
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d�� �л� ���� �Է� : ", i+1);
			score[i] = getScore();
		}
	}
	// �л� ���� ����ϴ� �Լ�
	public static void printScore(int[] score) {
		int index = 1;
		for (int i : score) {
			System.out.printf("%d�� �л� ���� : %d\n", index++, i);
		}
	}
	
	// �ְ� ����, ������� ����ϴ� �Լ�
	public static void printState(int[] score) {
		int sum = 0;
		int max = 0;
		for (int i : score) {
			sum += i;
			max = (max < i )? i : max;
		}
		double avg = (double)sum / score.length;
		System.out.printf("������� : %.1f\n", avg);
		System.out.printf("�ְ����� : %d\n", max);
	}
	// �����ϴ� �Լ�
		public static void end() {
			System.out.println("�����մϴ�");
			System.out.println("---------------------------------------------------------");
		}
		public static void activate() {
			int selectNo = 0;
			int studentNum = 0;
			int[] score = null;
			while (true) {
				start();
				selectNo = getSelectNo();
				if (selectNo == 5) {
					end();
					break;
				}else if (selectNo == 1) {
					studentNum =getStudentNum();
					score = new int[studentNum];
				}else if (selectNo == 2) {
					getScore(score);
				}else if (selectNo == 3) {
					printScore(score);
				}else if (selectNo == 4) {
					printState(score);
				}else {
					System.out.println("�Է��� �߸��Ǿ����ϴ�.");
					System.out.println("�ٽ� �Է��ϼ���");
				}
			}
		}
		
	
	
	public static void main(String[] args) {
		activate();
	}
}
