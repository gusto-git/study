import java.util.Scanner;

public class YMain1 {
	public static void main(String[] args) {
		
		// 복습 (console 입력)
		// 기분(좋다, 나쁘다), 컨디션 점수(/100), 대중교통 몇번 갈아 탔는지, 어제 밤에 푹 잤는지 (true / false)
		// 취침 시간
		// syso로 출력하는데 > println, printf 
		
		Scanner k = new Scanner(System.in); // Scanner k = new Scanner(System.in)
		System.out.print("현재 기분 : ");	// System.out.print("오늘 기분 : ");
		String feel = k.next();				// String feelings = k.next();
		
		System.out.print("컨디션 점수 : "); // System.out.print("컨티션 점수 : ");
		int condition = k.nextInt();		// int conditionScore = k.nextInt();
		
		System.out.print("환승 횟수 : ");   // System.out.print("대중교통 몇번? : ");
		int transfer = k.nextInt();			// int transfer = k.nextInt();
		
		System.out.print("숙면 여부 : ");	// System.out.print("숙면 : ");
		boolean sleep = k.nextBoolean();	// boolean deepSleep = k.nextBoolean();
		
		System.out.print("잠잔 시간 : ");	// System.out.print("수면 시간 : ");
		int sleeptime = k.nextInt();		// double sleepHour = k.nextDouble();
		
		System.out.println("=========================");
		System.out.printf("기분이 %s\n", feel);
		System.out.printf("컨디션 점수는 %3d점이다\n", condition);
		System.out.printf("환승 횟수는 %1d이다\n", transfer);
		System.out.printf("%b\n", sleep);
		System.out.printf("잠잔 시간은 %2d\n", sleeptime);
		System.out.println("=========================");
		
//		강사님답
//		System.out.println("=-=-=-=-=-=-=-==-=-=-=-=-");
//		System.out.printf("오늘 기분 :" + feelings);
//		System.out.printf("컨디션 점수 : %d점\n", conditionScore);
//		System.out.printf("대중교통을" + transfer + "번 갈아탐");
//		System.out.printf("숙면 : %b\n", deepSleep);
//		System.out.printf("숙면 시간 : " + sleepHour);
//		System.out.println("=-=-=-=-=-=-=-==-=-=-=-=-");
		
		
		
	}
}
