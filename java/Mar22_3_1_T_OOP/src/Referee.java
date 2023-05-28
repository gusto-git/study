
public class Referee {
	String[] hand = {"", "가위", "바위", "보"};
	
	
	public Me callMe() {
		System.out.println("심판 : 나와주세요.");
		System.out.println("나   : 나왔습니다.");
		return new Me();
	}
	
	public Friend callFri() {
		System.out.println("심판 : 나와주세요.");
		System.out.println("친구 : 나왔습니다.");
		return new Friend();
	}
	
	public void rulebook(String[] hand) {
		System.out.println("============");
		for (int i = 1; i < hand.length; i++) {
			System.out.printf("%s : %d\n", hand[i],i);
		}
		System.out.println("============");
	}
	// 컴퓨터가 랜덤으로 뽑는 메소드
	public int pickCom(Friend f) {
		int com = f.callFri();
		return com;
	}
	
	// 내가 랜덤으로 뽑는 메소드
	public int pickMe(Me m) {
		int me = m.tellAnswer();
		return me;
	}
	
	// 판정하는 메소드
	public int judgeGame(int me , int com) {
		int a = me - com;
		
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
	
	//5. 낸거 출력하는 메소드
	public void printResult(int m , int c , String[] h) {
		System.out.printf("내가 낸 것 : %s\n", h[m]);
		System.out.printf("컴퓨터가 낸 것 : %s\n", h[c]);
	}
	
	//6. 무한 출력하는 메소드

	
	public void start() {
		Me m = callMe();
		Friend f = callFri();
		rulebook(hand);
		int result = 0;
		int win = 0;
		int draw = 0;
		int com = 0;
		int me = 0;
		while (true) {
			com = pickCom(f);
			System.out.println(com);
			me = pickMe(m);
			result = judgeGame(me, com);
			printResult(me, com, hand);
			
			if (result == 1) {
				System.out.printf("승\n");
				win += result;
			}else if (result == 0) {
				System.out.printf("무승부\n");
				draw += result+1;
			}else if (result == -123456) {
				System.out.printf("%d승 %d무 \n", win, draw);
				break;
			}
			
		}
		
		
		
		//정상 작동 
	}
	
}
