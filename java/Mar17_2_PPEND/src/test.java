import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

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
public class test {
	// ���� �Է��ϴ� �Լ� (1~45)���� �Է°���
	public static int getNum() {
		Scanner k = new Scanner(System.in);
											// ���� syso("");���� ���ڸ� ���� �׸��� ������ �ϳ�, ���� �Լ����� �Լ� ��ü�� �޾Ƽ� ���Ŷ� ���� 
		int num = k.nextInt();
		if (num < 0 || num > 45) { // num�� ���ڰ� 0���� �۰ų� 45���� ũ�� �Ʒ��� ������ �����϶�
			System.out.println("�ٽ� �Է��ϼ���");
		}
		return (num >= 0 && num <= 45) ? num : getNum(); // if���� ���� �� return�϶�, 
													    //num�� 0���� ũ�ų� ���� 45���� �۰ų� ������ num ��� �ƴϸ� getNum(); �ٽ� ����
	}
	// �迭 -> �ߺ� ���ھ���
	public static int[] getNums() {
		int[] myAns = new int[6]; // myAns��� ������ �޴� �迭�� �����԰� 6���� ��Ҹ� ���� �迭���� ������.
		for (int i = 0; i < myAns.length; i++) { // i�� myAns�� []���� �۾ƾ� ���� ������ ������ �ȴ�.
			System.out.printf("%d��° �����Է� : ",i+1); // getNum���� ������ syso�� ���⼭ ���
			myAns[i] = getNum(); // getNum���� �Է��� ���ڸ� myAns �迭�� i ��°�� �־��(6�� �ݺ�)
			for (int j = 0; j < i; j++) { 
				if (myAns[i] == myAns[j]) { // [i]�� ���� [j]�� ���� ������ i�� ���� 1����.
					i--; // ���� ��� i--�� �����ϰ� �ٽ� for i ������ �Ѿ�µ� i-1�� �ǹǷ� �ٽ� ������ i�� ������ ���ư���.
				}
			}
		}
		return myAns;
	}
	
	// ���� �Է��� ���� ����ϴ� �Լ�
	public static void printMyAns(int[] myAns){
		System.out.println("������ �Է��� ����");
		for (int i : myAns) { // �ܼ� ����� ���������� for-each���� Ȱ���ؼ� �����ϰ� ����Ѵ�. int i : myAns�� �ǹ̴� myAns�� ��Ҹ� i�� �ӽ������Ѵ�.
			System.out.printf("[" + i + "]"); // i�� �ӽ������ myAns�� ��Ұ��� ����϶� 
		}
		System.out.println("");
		System.out.println("================");
	}
	
	// ��ǻ�Ͱ� �������� ���� �̴� �Լ� -> �ߺ�����
	public static int[] getLotto() {
		Random	r = new Random();
		int[] lottoNum = new int[6]; // lottoNum �̶�� �����迭�� �����ϰ� 6���� ��Ҹ� ���� �迭���� ������
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = r.nextInt(45)+1; // lottoNum �迭�� ����� ���� 1~45���� ����
			for (int j = 0; j < i; j++) {
				if (lottoNum[i] == lottoNum[j]) {
					i--;
				}
			}
		}
		return lottoNum;
	}
	
	// ��ǻ�Ͱ� �Է��� ���� print �Լ�
	public static void printLottoint(int[] lottoNum) {
		System.out.println("�ζǹ�ȣ");
		for (int i : lottoNum) {
			System.out.println("[" + i + "]");
		}
		System.out.println();
		System.out.println("================");
	}
	
	// ���� �Է��Ѱ� = ��ǻ�� ���� ������ ��(ī����)
	public static int chekNum(int[] myAns, int[] lottoNum ) {
		int count = 0; // ���� ���ڸ� ī�����ϱ����� ���� ����
		for (int i = 0; i <  myAns.length; i++) {
			for (int j = 0; j < lottoNum.length; j++) {
				if (myAns[i] == lottoNum[j]) {
					count ++; // ���� ���ڰ� ���� ��� count + 1
				}
			}
			
		}
		return count;
	}
	// ī���ÿ� ���߾ 1�� ~ ��
	public static void printResult(int count) {
		System.out.printf("%d�� ���缭..", count);
		if (count == 6) {
			System.out.println("1��");
		}else if (count == 5) {
			System.out.println("2��");
		}else if (count == 4) {
			System.out.println("3��");
		}else {
			System.out.println("��");
		}
	}
	
	
	public static void main(String[] args) {
		int[] myAns = getNums();
		printMyAns(myAns);
		int[] lotto = getLotto();
		printLottoint(lotto);
		int count = chekNum(myAns, lotto);
		printResult(count);
	}
}