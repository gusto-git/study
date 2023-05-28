import java.util.Random;
import java.util.Scanner;

// 홀짝 게임 만들기
// 동전을 10개 정도 쥐고 있다가
// 컴퓨터가 랜덤으로 동전 개수를 뽑는다.
// 내가 [홀]이라고 적으면
// 컴퓨터가 뽑은 동전의 개수에 따라 정답인지 여부를 판별하는 프로그램 


public class YMain2 {
	 public static void main(String[] args) {
//		Random r = new Random(); // 랜덤으로 뽑을 준비
/*		int i = r.nextInt(); // int 범위안에 있는 랜덤안의 숫자 
		System.out.println(i);
		int i2 = r.nextInt(5); // 0~4까지의 숫자를 랜덤으로 뽑아줌 
		System.out.println(i2);
		int i3 = r.nextInt(5) + 1; // 1~5까지의 숫자를 랜덤으로 뽑아줌 
		System.out.println(i3);*/
////////////////////////////////////////////////////////////////////////////		
		Scanner k = new Scanner(System.in);
		Random r = new Random(); // 랜덤으로 뽑을 준비
		int i4 = r.nextInt(10) + 1; // 1~10까지 뽑기
		System.out.println(i4); //확인용
		
		String result = i4 % 2 == 0 ? "짝" : "홀"; // 뽑은 값이 홀인지, 짝인지 구분
		System.out.print("홀 or 짝 : ");
		String userAns = k.next();
		System.out.println(userAns); //확인용
		
		String result2 = result.equals(userAns) ? "맞음" : "틀림";
		System.out.println("동전의 개수는 " + i4 + " 임으로 결과는 " + result2);
		
		
		
		
	}
}
