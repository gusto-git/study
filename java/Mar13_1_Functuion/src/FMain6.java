import java.util.Random;
import java.util.Scanner;

// ���� ���߱� ����
// ���� 10�� -> 8��! �Է��ߴµ� ��ǻ�Ͱ� �������� ���� ������ �´��� �ȸ´��� Ȯ���ϴ� ��
// 1. ���� 10�� ��� �̱�
// 2. �? ��� ������ �Բ� �ֿܼ� �� �Է��ϱ�
// 3. ���� ���� �Ͱ� �� �Է��� �� �´��� Ʋ���� ��
// 4. ��ǻ�Ͱ� ��� �ִ� ������ 0 ���� ����� ���� 0������. �׷��� ����� ����(��)�̴�. ���


public class FMain6 {
	
	// 1. ���� 10�� ��� �̱� -> 3��
	public static int shakeCoin() {
//		Random r = new Random();
//		int coin = r.nextInt(10)+1;
//		return coin; 
		return new Random().nextInt(10)+1;
	}
	
	// 2. �? ��� ������ �Բ� �ֿܼ� �� �Է��ϱ� ->3��
	public static int userAns() {
		Scanner k = new Scanner(System.in);
		System.out.print("� ? ");
		int ans = k.nextInt();
		return ans;
		// return new Scanner(System.iin).nextInt();
	}
	
	// 3. ���� ���� �Ͱ� �� �Է��� �� �´��� Ʋ���� �� -> 4��
	public static String getResult(int coin, int ans) { //coin , ans�� c , a�� �ص� �������. ���ο��� �׳� ������ ����� �����
		String result = coin == ans ? "����" : "Ʋ��" ;
		return result;
		// return (coin == ans) ? "����" : "��" ;
	}
	
	// 4. ��ǻ�Ͱ� ��� �ִ� ������ 0 ���� ����� ���� 0������. �׷��� ����� ����(��)�̴�. ��� -> 2��
	 public static void printResult(int c , int a , String r) {
		System.out.printf("��ǻ�Ͱ� ���� ���� %d���� ", c);
		System.out.printf("����� ���� ���� %d���� ", a );
		System.out.printf("�׷��� ����� %s", r);
	}
	
	public static void main(String[] args) {
		int coin = shakeCoin();  //������ ������ ������ ���� �� �ִ�.
		int ans = userAns();
		String result = getResult(coin, ans);
		printResult(coin, ans, result);
		
		
	}

}
