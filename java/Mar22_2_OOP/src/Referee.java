
public class Referee {

	
	// ME 부르기 -> 인스턴스(객체)를 만들었다. 
	public Me2 callMe() { // 새 객체를 꺼낼 때, method로 만들어도 가능!
		System.out.println("심판 : 야 나와!");
		System.out.println("나 : 참여 완");
		return new Me2(); // 아까전에 만든 Me 클래스 안에 있는 메소드가 실행이 불러올수있게된다.
	}
	
	// 친구에게 답요구
	public int askFriAns(Friend2 f) {
		int friAns = f.writeFriAns();
		return friAns; // 값 반환 
	}
	
	// 나에게 답 요구
	public int askMeAns(Me2 mm) {
		int myAns = mm.tellAnswer();
		if (myAns < 1 || myAns > 100) {
			System.out.println("아.. 그렇게 하는거 아닌데..");
		}
		return (myAns >= 1 && myAns <= 100) ? myAns : askMeAns(mm);
	}
	
	
	// 판정(맞출때 까지)
	public boolean judge(int answer, int myAnswer) {
		if (answer == myAnswer) {
			System.out.println("....!!");
		}else if (answer > myAnswer) {
			System.out.println("UP");
		}else {
			System.out.println("DOWN!");
		}
		return answer == myAnswer;
	}
	
	//  시도 횟수
	public void countTry(int turn) {
		System.out.println("========================");
		System.out.printf("%d번째 시도만에 정답!\n",turn);
		System.out.println("========================");
	}
	
	// 실질적으로 게임이 실행되는 곳
	public void start(Friend2 f) { // start(Fridend2 f, Me2 mm)처럼 파라미터로 Me를 사용해도 되고, 아래 처럼 new Me2();를 사용해서 바로 객체를 불러된다.
		Me2 mm = callMe(); // new Me(); :역할(새로운 객체 부르기), 새로운 객체를 불렀기 때문에 파라미터에 넣지 않는다. 
		int answer = askFriAns(f);
//		System.out.println("친구 정답 : " + answer);
		int myAns = 0;
		boolean endGame = false; // 기본값이 false이기 때문에
		for (int turn = 1; true; turn++) {
			myAns = askMeAns(mm);
			endGame = judge(answer, myAns); // true , flase 판단
			if (endGame) { // true일 때만 동작해라
				countTry(turn);
				break;// for문을 깨드려라
			
				
			}
		}
	}
}
