import java.util.Scanner;

public class test2 {
// Bubble Sort : ������ �� �׸��� ���� ���ؼ� ������ �����ϸ� ������ ���� ��ȯ�ϴ� ���� ���
	
	// 1.���ڸ� 5�� �Է� �޾Ƽ� �迭�� ��� �Լ�
	public static int[] getNum() {
		Scanner k = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d��° ���� : ", i + 1);
			num[i] = k.nextInt();
		}
		System.out.println();
		System.out.println("---------------");
		return num;
	}
	// 2.���ĵǱ� �� �迭�� ���
	public static void printNum(int[] num) {
		System.out.println("<<���� ��>>");
		for (int i : num) {
			System.out.println(i + "");
		}
		System.out.println();
		System.out.println("---------------");	
	}
	// 3. ����(bubble sort)
	// �հ� �� ��Ҹ� ���ؼ� ���� ũ�� �հ� ���� ���� ���� ��ȯ
	public static int[] getResult(int[] num) {
		int t = 0; 
		for (int turn = 1; turn < num.length; turn++) { //turn�� �ǹ��ϰ�
			for (int i = 0; i < num.length-1; i++) { // ��Ҹ� �ǹ�
				if (num[i] > num[i + 1]) { // num[i]�� ���� num[i+1]���� Ŭ��,
					t = num[i]; // t�� num[i]��° ���� �ִ´�.
					num[i] = num[i+1]; // ����ִ� num[i]�� num[i+1]�� ���� �ִ´�.
					num[i+1] = t; // ����ִ� num[i+1]�� t�� �ִ´�.
				}
				System.out.println(num[i] + " ");
			}
			System.out.println("���ĵ� �� : " + t);
		}
		return num;
	}
	// 4. ���� ���� �迭 ���
	public static void printResult(int[] num) {
		System.out.println("<<���� ��>>");
		for (int i : num) {
			System.out.println(i + " ");
		}
		System.out.println();
		System.out.println("---------");
	}
	
	public static void main(String[] args) {
		int[] num = getNum();
		System.out.println(num);
		printNum(num);
		int[] result = getResult(num);
		printResult(result);
	}
}
