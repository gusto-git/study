import java.util.Scanner;


// ����, ����, ���� ������ �Է� �޾Ƽ� ��� -> �� ���������� ����
// ������ ����, ����, ���
public class YMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("���� ���� :");
		int korean = k.nextInt();
		System.out.print("���� ���� :");
		int math = k.nextInt();
		System.out.print("���� ���� :");
		int english = k.nextInt();
		
//		System.out.printf("���� ������ : %3d�� ���� ������ : %3d�� ���� ������ : %3d��\n", korean , math , english);
//		System.out.printf("������ : %4d\n", korean + math + english);
//		System.out.printf("����� : %4d\n", (korean + math + english) / 3);
		
		int a = korean + math + english;
		double b = a / 3;
		System.out.printf("���� ������ : %3d�� ���� ������ : %3d�� ���� ������ : %3d��\n", korean , math , english);
		System.out.printf("������ : " + a + "��\n");
		System.out.printf("����� : " + b + "��");

//		1. ����, ����� ������ ��Ƽ�
//		int sum = kor + math + eng;
//		double avg = (double)sum / 3; -> int / int �̱� ������ double���� �������� �� ��ȯ�� �ؾ��Ѵ�.		
		// ȭ�� ĸ�� ��ĵ ���� �����ؼ� �ٽ� Ȯ���ϱ�/// 
	}
}
