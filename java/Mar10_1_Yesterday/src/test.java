import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int kor = k.nextInt();

		System.out.print("���� ���� : ");
		int math = k.nextInt();

		System.out.print("���� ���� : ");
		int eng = k.nextInt();

		//�ܼ� ���//
		int a = kor + math + eng;
		double b = (double)a /3 ;
		System.out.printf("���� : %3d ���� : %3d ���� : %3d\n", kor, math, eng);
		// ������ ���� ��//
		System.out.printf("���� : %3d\n", a );
		System.out.printf("��� : %.2f\n", b);

	}
}