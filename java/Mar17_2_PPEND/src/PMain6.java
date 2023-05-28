import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

// ���� x
// �����Ͽ� Ǯ�� ! 
// ����
// 	�ζ� 1,2,3�� ���߱�
//  �ζ� ��ȣ�� �� 6�� ����(1 ~ 45) : �ֿܼ� ����
//  6�� ��ġ : 1��
//  5�� ��ġ : 2��
//  4�� ��ġ : 3��
//  �׿�     : ��
//  Random ��ü ����ؼ� ���� ������ ����(1 ~ 45���� ���� ����)
//  for�� �̿��ؼ� �� �迭�� ��ġ �� ���� Ȯ���ϰ� ��� ���� 

// main�� ���� �ʰ� �Լ� �̿�

public class PMain6 {
	// ���� �Է��ϴ� �Լ� (1~45)���� �Է°���
	public static int getNum() {
		Scanner k = new Scanner(System.in);
		// syso�� ���� �ʴ°� �Ʒ� getNums���� getNum�� ������ �� �Ŷ� �׷�
		int num = k.nextInt();
		if (num < 0 || num > 45) { // �Է��� ����(num)�� 0���� �۰ų�, 45���� Ŭ ���
			System.out.println("�ٽ� �Է� : "); // "�ٽ� �Է��� ����ض�"
		}
		return (num >= 1 && num <= 45) ? num : getNum();
	}
	
	// �迭 -> �ߺ� ���ھ���
	public static int[] getNums() {
		int[] myAns = new int[6];
		for (int i = 0; i < myAns.length; i++) {
			System.out.printf("%d��° ���� �Է� : ", i + 1);
			myAns[i] = getNum(); // ������ ���� �Լ� ��� 
	        for (int j = 0; j < i; j++) {
				if (myAns[i] == myAns[j]) {
					i--; 
				}
			}
		}
	    return myAns;
	}
	// ���� �Է��� ���� ����ϴ� �Լ�
	public static void printMyAns(int[] myAns) {
		System.out.println("���� ��!");
		for (int i : myAns) { // �迭�ȿ� �ִ� ������ ��Ҹ� i�� �ӽ÷� �־ ����ϴ� ��
			System.out.print("["+i+"]");
		}
		System.out.println();
		System.out.println("***************");
	}
	// ��ǻ�Ͱ� �������� ���� �̴� �Լ� -> �ߺ�����
	public static int[] getLotto() {
		int[] lottoNum = new int[6];
		Random r = new Random();
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = r.nextInt(45)+1;
			// ���� �� ��ҿ� ���� �迭 ����� ���� �� �����ϱ� ���ؼ� �ݺ��� �ϳ� �߰� 
			for (int j = 0; j < i; j++) {// �ε��� �����ϳ� �� ���;� �� ���� 
				//������ ���� �Ͱ� ���� ���� ���� �� 
				if (lottoNum[i] == lottoNum[j]) {
					i--; // �ߺ����� ������ ���� �� ù��° for������ ���ư���.
				}
			}
		}
		return lottoNum;
	}
	// ��ǻ�Ͱ� �Է��� ���� print �Լ�
	public static void printLottoint(int[] lottoNum) {
		System.out.println("�ζǹ�ȣ!");
		for (int i : lottoNum) {
			System.out.print("["+i+"]");
		}
		System.out.println();
		System.out.println("*****************");
	}
	// ���� �Է��Ѱ� = ��ǻ�� ���� ������ ��(ī����)
	public static int checkNum(int[] myAns, int[] lotto) {
		int count = 0; // ī���� �� ���� ����
		for (int i = 0; i < myAns.length; i++) {
			for (int j = 0; j < lotto.length; j++) {
				if (myAns[i] == lotto[j]) {
					count++;
				}
			}
		}
		return count;
	}
	// ī���ÿ� ���߾ 1�� ~ ��
	public static void printResult(int count) {
		System.out.printf("%d�� ���缭..", count);
		if (count == 6) {
			System.out.println("1��!");
		}else if (count == 5) {
			System.out.println("2��!");
		}else if (count == 4) {
			System.out.println("3��!");
		}else  {
			System.out.println("��");
		}
	}
	
	public static void main(String[] args) {
		int[] myAns = getNums();
		printMyAns(myAns);
		int[] looto = getLotto();
		printLottoint(looto);
		int count = checkNum(myAns, looto);
		printResult(count);
	}
}


















