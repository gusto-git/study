import java.util.Scanner;


// 국어, 수학, 영어 점수를 입력 받아서 출력 -> 각 과목점수는 정수
// 각각의 점수, 총점, 평균
public class YMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("국어 점수 :");
		int korean = k.nextInt();
		System.out.print("수학 점수 :");
		int math = k.nextInt();
		System.out.print("영어 점수 :");
		int english = k.nextInt();
		
//		System.out.printf("국어 점수는 : %3d점 수학 점수는 : %3d점 영어 점수는 : %3d점\n", korean , math , english);
//		System.out.printf("총점은 : %4d\n", korean + math + english);
//		System.out.printf("평균은 : %4d\n", (korean + math + english) / 3);
		
		int a = korean + math + english;
		double b = a / 3;
		System.out.printf("국어 점수는 : %3d점 수학 점수는 : %3d점 영어 점수는 : %3d점\n", korean , math , english);
		System.out.printf("총점은 : " + a + "점\n");
		System.out.printf("평균은 : " + b + "점");

//		1. 총점, 평균을 변수에 담아서
//		int sum = kor + math + eng;
//		double avg = (double)sum / 3; -> int / int 이기 때문에 double에서 오류나서 형 변환을 해야한다.		
		// 화면 캡쳐 스캔 파일 참조해서 다시 확인하기/// 
	}
}
