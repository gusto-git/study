import java.util.Random;
import java.util.Scanner;

public class Computer {

	Random cpu = new Random();
	int coin = 20;
	
	// 몇개로 할지 물어봐야 함
	public int askHowManyCoin(User u) {
		System.out.print("몇 개로 하겠습니까? (2개 이상 20개 이하)");
		int startCoin = u.answerHowManyCoin(); //몇개를 할지 startCoin에 담는다.
		if (startCoin < 2 || startCoin > 21 ) {
			System.out.println("다시 입력해 주세요");
		}
		return (startCoin >= 2 && startCoin <= 20) ? startCoin : askHowManyCoin(u);
	}
	
	// 컴퓨터가 유저가 대답한 숫자 범위 안에서 랜덤으로 숫자 뽑도록
		public int shakeCoin(int userCoin) {
			return cpu.nextInt(userCoin);
		}
	
	// 홀인지 짝인지 콘솔에 쓰는 메소드
		public String askHJ(User u) {
			System.out.print("홀 or 짝 : ");
			String userAnswer = u.answerHJ();
			return (userAnswer.equals("홀") || userAnswer.equals("짝"))? userAnswer : askHJ(u);
		}
	
	// 컴퓨터가 랜덤으로 뽑은  숫자가 홀인지 짝인지 판단하는 메소드
		public String judgeCoin(int shakeCoin) {
			return (shakeCoin % 2 == 0) ? "짝" : "홀";
		}
		
	// 내가 입력한 답 vs 컴퓨터의 답 => 정답여부
		public String getResult(String userAnswer , String comAnswer) {
			return userAnswer.equals(comAnswer) ? "정답" : "틀림";
		}
	
	// 정답을 알려주는 method
		public void printResult(int shakeCoin , String result) {
			System.out.printf("컴퓨터는 %d개 뽑았고, %s\n", shakeCoin, result);
		}
		
	// 실행하는 메소드
	public void start(User u) {
		int userCoin = askHowManyCoin(u);
//		System.out.println("내가 고른 동전 갯수 : " + userCoin); // 확인용
		int shakeCoin = shakeCoin(userCoin);
//		System.out.println("컴퓨터가 뽑은 동전 갯수 : " + shakeCoin); // 확인용
		String userAnswer = askHJ(u);
//		System.out.println("내가 입력한 답 : "+ userAnswer);// 확인용
		String comAnswer = judgeCoin(shakeCoin);
//		System.out.println("컴퓨터의 답 : " + comAnswer);// 확인용
		String result = getResult(userAnswer, comAnswer);
//		System.out.println("정답확인 : " + result);// 확인용
		printResult(shakeCoin, result);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	



//
//int coin;
//int answer;
//int randomCoin;
//String answer1;
//Scanner mouth = new Scanner(System.in);
//Random coin1 = new Random();
//
//
//public void printComputer() {
//	System.out.printf("컴퓨터가 가지고 있는 동전의 수 : %d\n", coin);
//	
//}
//
//public void getUserAnswer(User u) {
//	System.out.print("동전 몇개를 사용할 까요? ");
//	answer = u.UserAnser();
//}
//
//public void shakeCoin() {
//	randomCoin = coin1.nextInt(answer)+1;
//	System.out.printf("컴퓨터가 뽑은 동전의 수 : %d\n",randomCoin);
//
//}
//public void checkCoin() {
//	
//	if (randomCoin % 2 == 0) {
//		System.out.println("짝");
//	}else if (randomCoin % 2 == 1) {
//	    System.out.println("홀");
//	}
//	return 
//}
//
//public void askUser(User u) {
//	System.out.print("홀 or 짝 : ");
//	answer1 = u.UserAnser1();	
//}
//
//public void checkAnswer() {
//	if (check) {
//		
//	}
//}
//
//
//

