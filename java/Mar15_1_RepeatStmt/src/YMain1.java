import java.util.Scanner;

// swicth-case��
// ������ �Է�
// 90��  A  / 80��  B / 70��  C / 60��  D / �� ��  F 
public class YMain1 {
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		System.out.print(" ���� : ");
		int score = k.nextInt();
		
		String grade = ""; // -> ��Ʈ�� Ȱ�� 
		switch (score) {
		case 90:
//			System.out.println("A");
			grade = "A";
			break;
		case 80:
			System.out.println("B");
			break;
		case 70:
			System.out.println("C");
			break;
		case 60:
			System.out.println("D");
			break;
	
		default:
			System.out.println("F");
			break;
		}
		System.out.printf("����� %s���� �Դϴ�.", grade);
		
		// if �� case ���� ���� ū���̴� �����ȿ��� ���� ���Ұ�� case������ ǥ�� �� �� ���� . 
		
		
	}
}
