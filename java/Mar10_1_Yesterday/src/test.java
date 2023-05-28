import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int kor = k.nextInt();

		System.out.print("수학 점수 : ");
		int math = k.nextInt();

		System.out.print("영어 점수 : ");
		int eng = k.nextInt();

		//콘솔 출력//
		int a = kor + math + eng;
		double b = (double)a /3 ;
		System.out.printf("국어 : %3d 수학 : %3d 영어 : %3d\n", kor, math, eng);
		// 변수를 담은 것//
		System.out.printf("총점 : %3d\n", a );
		System.out.printf("평균 : %.2f\n", b);

	}
}