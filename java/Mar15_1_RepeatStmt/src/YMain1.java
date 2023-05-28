import java.util.Scanner;

// swicth-case문
// 점수를 입력
// 90점  A  / 80점  B / 70점  C / 60점  D / 그 외  F 
public class YMain1 {
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		System.out.print(" 점수 : ");
		int score = k.nextInt();
		
		String grade = ""; // -> 스트링 활용 
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
		System.out.printf("당신은 %s학점 입니다.", grade);
		
		// if 와 case 문의 가장 큰차이는 범위안에서 답을 구할경우 case에서는 표현 할 수 없다 . 
		
		
	}
}
