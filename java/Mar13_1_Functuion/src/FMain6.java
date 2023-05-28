import java.util.Random;
import java.util.Scanner;

// 동전 맞추기 게임
// 동전 10개 -> 8개! 입력했는데 컴퓨터가 랜덤으로 뽑은 갯수랑 맞는지 안맞는지 확인하는 것
// 1. 동전 10개 섞어서 뽑기
// 2. 몇개? 라는 질문과 함께 콘솔에 답 입력하기
// 3. 동전 뽑은 것과 답 입력한 것 맞는지 틀린지 비교
// 4. 컴퓨터가 쥐고 있던 동전은 0 개고 당신의 답은 0개였다. 그래서 결과는 정답(땡)이다. 출력


public class FMain6 {
	
	// 1. 동전 10개 섞어서 뽑기 -> 3번
	public static int shakeCoin() {
//		Random r = new Random();
//		int coin = r.nextInt(10)+1;
//		return coin; 
		return new Random().nextInt(10)+1;
	}
	
	// 2. 몇개? 라는 질문과 함께 콘솔에 답 입력하기 ->3번
	public static int userAns() {
		Scanner k = new Scanner(System.in);
		System.out.print("몇개 ? ");
		int ans = k.nextInt();
		return ans;
		// return new Scanner(System.iin).nextInt();
	}
	
	// 3. 동전 뽑은 것과 답 입력한 것 맞는지 틀린지 비교 -> 4번
	public static String getResult(int coin, int ans) { //coin , ans는 c , a로 해도 상관없다. 메인에서 그냥 쓸때만 제대로 들어가면됨
		String result = coin == ans ? "정답" : "틀림" ;
		return result;
		// return (coin == ans) ? "정답" : "땡" ;
	}
	
	// 4. 컴퓨터가 쥐고 있던 동전은 0 개고 당신의 답은 0개였다. 그래서 결과는 정답(땡)이다. 출력 -> 2번
	 public static void printResult(int c , int a , String r) {
		System.out.printf("컴퓨터가 뽑은 동전 %d개고 ", c);
		System.out.printf("당신이 뽑은 동전 %d개고 ", a );
		System.out.printf("그래서 결과는 %s", r);
	}
	
	public static void main(String[] args) {
		int coin = shakeCoin();  //리턴이 있으면 변수에 담을 수 있다.
		int ans = userAns();
		String result = getResult(coin, ans);
		printResult(coin, ans, result);
		
		
	}

}
