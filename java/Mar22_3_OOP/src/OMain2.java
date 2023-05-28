import java.util.Random;
import java.util.Scanner;

public class OMain2 {
	
	// 1. 1 = 가위 , 2 = 바위, 3 = 보
	public static void printRule(String[] hand) {
		System.out.println("==============");
		for (int i = 1; i < hand.length; i++) {
			System.out.printf("%s : %d\n", hand[i], i);
		}
		System.out.println("==============");
	}
	
	// 2. 컴퓨터가 가위바위보 랜덤으로 뽑을 수 있도록 하는 메소드
	public static int pickCom() {
		Random r = new Random();
		int com = r.nextInt(3)+1;
		return com;
	}
	
	// 3. 내가 가위, 바위, 보를 입력하는 메소드
	public static int pickMine() {
		Scanner k = new Scanner(System.in);
		System.out.print("뭐낼래? :");
		int my = k.nextInt(3)+1;
		return (my > 0 && my < 4) ? my : pickMine();
	}
	
	// 4. 판정하는 함수
	public static int judgeGame(int m , int c) {
		int a =  m - c;
		// return 받아야 하는 값이 상황에 따라 다르므로
		// retrun a가 아니라 각자 숫자로 나누어 준다.
		if (a == 0) {
			System.out.println("무승부");
			return 0;
		}else if (a == -1 || a == 2) {
			System.out.println("패배");
			return -123456;
		}else {
			System.out.println("승리");
			return 1;
		}
	}
	// 5. 낸거 출력해주는 함수
	public static void printResult(int m , int c , String[] h) {
		System.out.printf("내가 낸 것 : %s\n", h[m]);
		System.out.printf("컴퓨터가 낸 것 : %s\n", h[c]);
		
	}
	
	
	
	public static void main(String[] args) {
		// 가위 바위 보 ( 1, 2 ,3)
		// 배열의 요소는 0부터 시작해서 0은 비우고 시작
		String[] hand = {"", "가위", "바위", "보  "};
		printRule(hand);
		int com = 0;
		int me = 0;
		int result = 0;
		int win = 0;
		while (true) {
			com = pickCom();
			me = pickMine();
			printResult(me, com, hand);
			result = judgeGame(me, com);
			
			if (result == -123456) {
				System.out.printf("%d연승\n", win);
				break;
			}
			win += result;
		}
		
	}
}
