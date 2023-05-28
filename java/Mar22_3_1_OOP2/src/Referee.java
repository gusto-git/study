import java.util.Random;
import java.util.Scanner;

public class Referee {
	int pickCom;
	int pickMine;
	String[] hand = {"", "가위", "바위", "보  "};
	
	
	public Me callMe() {
		System.out.println("심판 : 입장 하세요");
		System.out.println("나 : 입장 완료");
		return new Me();
	}

	public Friend callFri() {
		System.out.println("심판 : 입장 하세요");
		System.out.println("친구 : 입장 완료");
		return new Friend();
	}

	public void ruleBook(String hand[]) {
		System.out.println("============================");
		for (int i = 1; i < hand.length; i++) {
			System.out.printf("%s : %d\n",hand[i],i);
		}
		System.out.println("============================");
	}
	
	// 컴퓨터가 랜덤으로 뽑는 메소드
	public int pickComNum(Friend f) {
		pickCom = f.friAns;
		return pickCom;
	}
	
	// 내가 랜덤으로 뽑는 메소드
	public int pickMineNum(Me m) {
		
		pickMine = m.MyAns;
		return (pickMine >= 0 && pickMine <= 0 ) ? pickMine : pickMineNum(m);
	}
	
	// 판정하는 함수
	public int judgeGame(int pickMine , int pickCom) {
		int a = (pickMine - pickCom);
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
	
	// 낸 것 출력해주는 함수
	public void printResult(int pickMine , int pickCom, String[] h) {
		System.out.printf("내가 낸 것 : %s\n", h[pickMine]);
		System.out.printf("컴퓨터가 낸 것 : %s\n", h[pickCom]);
	}
	
	
	public void start() {
		Me m = callMe();
		Friend f = callFri();
		ruleBook(hand);
		int pickCom = 0;
		int pickMine = 0;
		int result = 0;
		int win = 0;
		int draw = 0;
		
		while (true) {
			pickCom = pickComNum(f);
			System.out.println(pickCom);
			pickMine = pickMineNum(m);
			////
			printResult(pickMine, pickCom, hand);
			result = judgeGame(pickMine, pickCom);
			
			if (result == 0) {
				System.out.println("무승부");
				draw += result;
				break;
			} else if (result == 1) {
				System.out.println("승리");
				win += result;
				break;
			}else if (result == -123456) {
				System.err.printf("%d승 %d무\n", win, draw);
				break;
			}
			
		}
		
	}
	
	
}
