import java.util.Scanner;

//Bubble Sort : ������ �� �׸��� ���� ���ؼ� ������ �����ϸ� ������ ���� ��ȯ�ϴ� ���� ���
public class PMain1 {
	
	// 1.���� 5���� �Է� �޾Ƽ� �迭�� ��� �޼ҵ�
	public static int[] getNum() {
		Scanner k = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d��° ���� �Է� : ", i+1);
			num[i] = k.nextInt();
		}
		System.out.println();
		System.out.println("-----------");
		return num;
	}
	// 2.���ĵǱ� �� �迭�� ���
	public static void printNum(int[] num) {
		System.out.println("<<���� �� ��>>");
		for (int i : num) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("--------");
	}

	// ���� < bubble sort
		// �հ� �� ��Ҹ� ���ؼ� ���� ũ�� �հ� ���� ���� ���� ��ȯ
	public static int[] getResult(int[] num) {
		//�ӽú���
		int t = 0 ;
		for (int turn1 = 1; turn1 < num.length; turn1++) {
			for (int i = 0; i < num.length-1; i++) { // num.length-1 �ϴ� ���� : 
				if (num[i] > num[i + 1]) {
					t = num[i]; // num i ��° ��Ҹ� �ӽú��� t�� ��� ��Ƶα�
					num[i] = num[i + 1]; // ������ ���� ���׿� �ִ´�. 
					num[i+1] = t;// num i + 1��°�� t�� �ִ� ���� �ִ´�.
				}
				System.out.print(num[i] + " ");
			}
			System.out.println("���ĵ� �� : " + t);
		}
		return num;
	}
	
	// ���� ���� �迭 ���
	public static void printResult(int[] result) {
		System.out.println("<<���� �� ��>>");
		for (int i : result) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("--------");
	}
	
	public static void main(String[] args) {
		int[] num = getNum();
		System.out.println(num); // �ּҰ��� ��µǱ� ������ 2. ���ĵǱ� �� �迭�� ������� ���� ����ؾ���
		printNum(num);
		int[] result = getResult(num);
		printResult(result);
	}
}
