import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Referee {
	
	String[] rulebook = new String[] {"", "가위", "바위","보"};
	// 가위 바위 보 소개
	public void readRuleBook() {
		System.out.println("---------------------------");
		for (int i = 1; i < rulebook.length; i++) {
		System.out.printf("%d. %s\n",i, rulebook[i]);
		}
		System.out.println("---------------------------");
	} 
	
	// Me 뭐낼지
	public int askAns(Me m) {
		System.out.print("뭐낼래? : ");
		int myAns = m.fire();
		return (myAns >= 1 && myAns <= 3 )? myAns : askAns(m);
	}
	
	// Friend 뭐낼지(같은 동작이라 오버로딩)
	public int askAns(Friend f) {
		int friAns = f.fire();
		return friAns; // 삼항연산자 안쓰는이유 범위를 지정해놔서
	}
	
	// 누가 뭐 냈는지
	public void printHand(int m , int f) {
		System.out.printf("나는 %s\n", rulebook[m]);
		System.out.printf("친구는 %s\n", rulebook[f]);
	}
	
	//판정
	private boolean judgeWin(int m, int f, Me mm) {
		int result = m - f;
		if (result == 0) {
			System.out.println("비김!!");
			mm.draw++;
		}else if (result == -1 || result == 2) {
			System.out.println("짐!!");
		
		}else {
			System.out.println("이김!");
			mm.win++;
		}
		// 졌을 경우에만 리턴되도록 -> 졌을때 true가 되도록을 의미함 , 졌을 때 true가 되서 아래 while if에서 트루일때 종료 시키기 위함
		return (result == -1 || result == 2); // 왜 false로 하는지 
	}
		
		public void sayHowManyWin(Me m) {
			System.out.printf("%d승 %d무!\n", m.win, m.draw);
		}
	
	public void start(Me m, Friend f) {
		readRuleBook();
		int myHand ;
		int friHand ;
		
		while (true) {
			myHand = askAns(m);
			friHand = askAns(f);
			printHand(myHand, friHand);
			System.out.println("========================");
			if (judgeWin(myHand, friHand, m)) { // true일때 > 졌을때 의미 
				sayHowManyWin(m);
				break; // 지면 반복문을 깨라 
			}
			System.out.println("========================");
		}
	}
}
