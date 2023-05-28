import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

// 질문 x
// 월요일에 풀이 ! 
// 조건
// 	로또 1,2,3등 맞추기
//  로또 번호는 총 6개 지정(1 ~ 45) : 콘솔에 쓰기
//  6개 일치 : 1등
//  5개 일치 : 2등
//  4개 일치 : 3등
//  그외     : 꽝
//  Random 객체 사용해서 랜덤 정수값 생성(1 ~ 45까지 범위 지정)
//  for문 이용해서 두 배열의 일치 값 개수 확인하고 등수 지정 

// main에 하지 않고 함수 이용

public class PMain6 {
	// 숫자 입력하는 함수 (1~45)까지 입력가능
	public static int getNum() {
		Scanner k = new Scanner(System.in);
		// syso를 쓰지 않는건 아래 getNums으로 getNum을 보내서 쓸 거라 그럼
		int num = k.nextInt();
		if (num < 0 || num > 45) { // 입력한 숫자(num)이 0보다 작거나, 45보다 클 경우
			System.out.println("다시 입력 : "); // "다시 입력을 출력해라"
		}
		return (num >= 1 && num <= 45) ? num : getNum();
	}
	
	// 배열 -> 중복 숫자없이
	public static int[] getNums() {
		int[] myAns = new int[6];
		for (int i = 0; i < myAns.length; i++) {
			System.out.printf("%d번째 숫자 입력 : ", i + 1);
			myAns[i] = getNum(); // 위에서 만든 함수 담기 
	        for (int j = 0; j < i; j++) {
				if (myAns[i] == myAns[j]) {
					i--; 
				}
			}
		}
	    return myAns;
	}
	// 내가 입력한 숫자 출력하는 함수
	public static void printMyAns(int[] myAns) {
		System.out.println("나의 답!");
		for (int i : myAns) { // 배열안에 있는 각각의 요소를 i에 임시로 넣어서 출력하는 것
			System.out.print("["+i+"]");
		}
		System.out.println();
		System.out.println("***************");
	}
	// 컴퓨터가 랜덤으로 숫자 뽑는 함수 -> 중복없이
	public static int[] getLotto() {
		int[] lottoNum = new int[6];
		Random r = new Random();
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = r.nextInt(45)+1;
			// 앞의 뱅열 요소와 뒤의 배열 요소의 값을 을 구분하기 위해서 반복문 하나 추가 
			for (int j = 0; j < i; j++) {// 인덱스 값이하나 덜 나와야 비교 가능 
				//이전에 뽑은 것과 새로 뽑은 값을 비교 
				if (lottoNum[i] == lottoNum[j]) {
					i--; // 중복값이 있으면 제거 후 첫번째 for문으로 돌아간다.
				}
			}
		}
		return lottoNum;
	}
	// 컴퓨터가 입력한 숫자 print 함수
	public static void printLottoint(int[] lottoNum) {
		System.out.println("로또번호!");
		for (int i : lottoNum) {
			System.out.print("["+i+"]");
		}
		System.out.println();
		System.out.println("*****************");
	}
	// 내가 입력한것 = 컴퓨터 숫자 같은지 비교(카운팅)
	public static int checkNum(int[] myAns, int[] lotto) {
		int count = 0; // 카운팅 될 변수 생성
		for (int i = 0; i < myAns.length; i++) {
			for (int j = 0; j < lotto.length; j++) {
				if (myAns[i] == lotto[j]) {
					count++;
				}
			}
		}
		return count;
	}
	// 카운팅에 맞추어서 1등 ~ 꽝
	public static void printResult(int count) {
		System.out.printf("%d개 맞춰서..", count);
		if (count == 6) {
			System.out.println("1등!");
		}else if (count == 5) {
			System.out.println("2등!");
		}else if (count == 4) {
			System.out.println("3등!");
		}else  {
			System.out.println("꽝");
		}
	}
	
	public static void main(String[] args) {
		int[] myAns = getNums();
		printMyAns(myAns);
		int[] looto = getLotto();
		printLottoint(looto);
		int count = checkNum(myAns, looto);
		printResult(count);
	}
}


















