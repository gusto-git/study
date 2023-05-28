import java.util.Random;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

// 홀짝(함수.ver)

public class FMain5 {
	// 1. 랜덤한 동전 개수 가져오는 함수 -> 3번 함수
	public static int shakeCoin() {
		Random r = new Random();
		int coin = r.nextInt(10)+1;
		return coin; 
		// return new Random().nextInt(10)+1
	}
	
	// 2. 질문에 대한 답 입력하는 함수 (홀? 짝? -> 답 입력) -> 3번 함수  3번에서 끌어다씀
	public static String askserAns() {
		Scanner k = new Scanner(System.in);
		System.out.print("홀? , 짝? : ");
		String userAns = k.next();
		return userAns;
		// return new Scanner(System.in).next();
	}	
	
	// 3.동전 개수가 홀수면 '홀', 짝수면 '짝'결과 내는 함수 -> 4번 함수 
	public static String getAnser(int coin) {
		String anser = (coin % 2 == 0) ? "짝" : "홀";
		System.out.println(anser);
		return anser;
		// return (coin % 2 == 0) ? "짝" : "홀";
		
	}
	
	// 4. 결과낸 것과 답 입력한 것이 일치하면 '정답', 틀리면 '땡'알려주는 함수 -> 4번 함수
	public static String getResult(String ua , String a) {
		String result = (ua.equals(a)) ? "정답" : "땡";
		return result;
	}
	
	// 출력하는 함수(동전은 0개였고, 내가 입력한 답은 00고, 결과는 0라서 땡 or 정답) -> 2번 함수
	public static void printResult(int coin, String ua, String r, String a) {
		System.out.printf("동전은 %d개\n", coin);
		System.out.printf("내가 입력한 답 : %s!\n", ua);
		System.out.printf("결과는 %s라서 %s!", a, r);
	}
	

	
	public static void main(String[] args) {
		int coin = shakeCoin();
		String userAns = askserAns();
		String anser = getAnser(coin);
		String result = getResult(userAns, anser);
		System.out.println(result);
		printResult(coin, userAns, anser, result);
		
	}
}
