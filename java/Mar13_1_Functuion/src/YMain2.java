import java.util.Random;
import java.util.Scanner;

// Ȧ¦ ���� �����
// ������ 10�� ���� ��� �ִٰ�
// ��ǻ�Ͱ� �������� ���� ������ �̴´�.
// ���� [Ȧ]�̶�� ������
// ��ǻ�Ͱ� ���� ������ ������ ���� �������� ���θ� �Ǻ��ϴ� ���α׷� 


public class YMain2 {
	 public static void main(String[] args) {
//		Random r = new Random(); // �������� ���� �غ�
/*		int i = r.nextInt(); // int �����ȿ� �ִ� �������� ���� 
		System.out.println(i);
		int i2 = r.nextInt(5); // 0~4������ ���ڸ� �������� �̾��� 
		System.out.println(i2);
		int i3 = r.nextInt(5) + 1; // 1~5������ ���ڸ� �������� �̾��� 
		System.out.println(i3);*/
////////////////////////////////////////////////////////////////////////////		
		Scanner k = new Scanner(System.in);
		Random r = new Random(); // �������� ���� �غ�
		int i4 = r.nextInt(10) + 1; // 1~10���� �̱�
		System.out.println(i4); //Ȯ�ο�
		
		String result = i4 % 2 == 0 ? "¦" : "Ȧ"; // ���� ���� Ȧ����, ¦���� ����
		System.out.print("Ȧ or ¦ : ");
		String userAns = k.next();
		System.out.println(userAns); //Ȯ�ο�
		
		String result2 = result.equals(userAns) ? "����" : "Ʋ��";
		System.out.println("������ ������ " + i4 + " ������ ����� " + result2);
		
		
		
		
	}
}
