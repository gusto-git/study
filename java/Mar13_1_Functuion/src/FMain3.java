import java.util.Random;
import java.util.Scanner;

public class FMain3 {
	// 랜덤한 정수(함수 안에서 만듬)를 출력하는 함수
	// 1번 함수
	
	public static void red() { // 가져다 쓸거 아니라서 red()안에 아무것도 안들어감
		Random r = new Random();
		int i = r.nextInt(10)+1;
		System.out.println(i);
	}
	
	// 랜덤한 정수를  '생성'하는 함수 -> 정수를 만들어내는 것이 목표 
	// 3번함수 
	
	public static int blue() {
		Random r = new Random();
		int i = r.nextInt(10)+1;
		return i; // i에 있는 값을 최종 결과로 뱉어내기
		
	}
	
	// 정수를 하나 함수에 넣으면 홀인지 짝인지 출력하는 함수
	// 2번함수
	
	public static void green(int a) {
		String result = a % 2 == 0 ? "짝" : "홀";
		System.out.printf("%d는 %s!\n",a,result);
		
	}
	
	// 정수를 두개 넣었을 때
	// 먼저 넣은게 크면 앞, 뒤에 넣은게 크면 뒤를 구해주는 함수 
	// 다른데서 쓸 예정
	// 4번함수
	public static String purple(int a, int b) {
		String result = a > b ? "앞" : "뒤";
//		System.out.println(result);
		return result;
		
	}
	
	public static void main(String[] args) {
		red();
		int i = blue(); //int i에 blue() 가져오기, blue()함수를 통해서 구해진 숫자를  i라는 int 그릇에 담아  콘솔에 출력
		System.out.println(i);
		System.out.println("======================");
		green(i);
		String ss = purple(10,20);
		System.out.println(ss);
		
		// 점심 메뉴 골라주는 (2가지 중 하나)
		// 위에 있는 함수 이용
		// 랜덤한 숫자 2개 뽑아서
		// 먼저 뽑힌게 크면'초밥', 아니면 '짜장면'
		// blue , purple 활용
		
		int b1 =blue();
//		System.out.println(b1);
		int b2 =blue();
//		System.out.println(b2);
		String sss = purple(b1, b2);
		System.out.println(sss);
		String menu =(sss.equals("앞")) ? "초밥" : "짜장면";
		System.out.println(menu);
		String menu2 = (b1 > b2) ? "초밥" : "짜장면";
		System.out.println(menu2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
