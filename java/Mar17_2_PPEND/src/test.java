import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

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
public class test {
	// 숫자 입력하는 함수 (1~45)까지 입력가능
	public static int getNum() {
		Scanner k = new Scanner(System.in);
											// 원래 syso("");으로 숫자를 받을 그릇을 만들어야 하나, 다음 함수에서 함수 자체를 받아서 쓸거라 생략 
		int num = k.nextInt();
		if (num < 0 || num > 45) { // num의 숫자가 0보다 작거나 45보다 크면 아래의 내용을 실행하라
			System.out.println("다시 입력하세요");
		}
		return (num >= 0 && num <= 45) ? num : getNum(); // if문이 끝난 후 return하라, 
													    //num이 0보다 크거나 같고 45보다 작거나 같으면 num 출력 아니면 getNum(); 다시 실행
	}
	// 배열 -> 중복 숫자없이
	public static int[] getNums() {
		int[] myAns = new int[6]; // myAns라는 정수를 받는 배열을 생성함과 6개의 요소를 가진 배열임을 선언함.
		for (int i = 0; i < myAns.length; i++) { // i를 myAns의 []보다 작아야 같은 갯수를 가지게 된다.
			System.out.printf("%d번째 숫자입력 : ",i+1); // getNum에서 생략된 syso를 여기서 사용
			myAns[i] = getNum(); // getNum에서 입력한 숫자를 myAns 배열의 i 번째에 넣어라(6번 반복)
			for (int j = 0; j < i; j++) { 
				if (myAns[i] == myAns[j]) { // [i]의 값과 [j]의 값이 같으면 i의 값을 1뺀다.
					i--; // 같을 경우 i--를 실행하고 다시 for i 문으로 넘어가는데 i-1이 되므로 다시 이전의 i의 값으로 돌아간다.
				}
			}
		}
		return myAns;
	}
	
	// 내가 입력한 숫자 출력하는 함수
	public static void printMyAns(int[] myAns){
		System.out.println("유저가 입력한 숫자");
		for (int i : myAns) { // 단순 출력이 목적임으로 for-each문을 활용해서 간단하게 출력한다. int i : myAns의 의미는 myAns의 요소를 i에 임시저장한다.
			System.out.printf("[" + i + "]"); // i에 임시저장된 myAns의 요소값을 출력하라 
		}
		System.out.println("");
		System.out.println("================");
	}
	
	// 컴퓨터가 랜덤으로 숫자 뽑는 함수 -> 중복없이
	public static int[] getLotto() {
		Random	r = new Random();
		int[] lottoNum = new int[6]; // lottoNum 이라는 정수배열을 생성하고 6개의 요소를 가진 배열임을 선언함
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = r.nextInt(45)+1; // lottoNum 배열의 요소의 값은 1~45임을 말함
			for (int j = 0; j < i; j++) {
				if (lottoNum[i] == lottoNum[j]) {
					i--;
				}
			}
		}
		return lottoNum;
	}
	
	// 컴퓨터가 입력한 숫자 print 함수
	public static void printLottoint(int[] lottoNum) {
		System.out.println("로또번호");
		for (int i : lottoNum) {
			System.out.println("[" + i + "]");
		}
		System.out.println();
		System.out.println("================");
	}
	
	// 내가 입력한것 = 컴퓨터 숫자 같은지 비교(카운팅)
	public static int chekNum(int[] myAns, int[] lottoNum ) {
		int count = 0; // 같은 숫자를 카운팅하기위한 변수 선언
		for (int i = 0; i <  myAns.length; i++) {
			for (int j = 0; j < lottoNum.length; j++) {
				if (myAns[i] == lottoNum[j]) {
					count ++; // 같은 숫자가 있을 경우 count + 1
				}
			}
			
		}
		return count;
	}
	// 카운팅에 맞추어서 1등 ~ 꽝
	public static void printResult(int count) {
		System.out.printf("%d개 맞춰서..", count);
		if (count == 6) {
			System.out.println("1등");
		}else if (count == 5) {
			System.out.println("2등");
		}else if (count == 4) {
			System.out.println("3등");
		}else {
			System.out.println("꽝");
		}
	}
	
	
	public static void main(String[] args) {
		int[] myAns = getNums();
		printMyAns(myAns);
		int[] lotto = getLotto();
		printLottoint(lotto);
		int count = chekNum(myAns, lotto);
		printResult(count);
	}
}