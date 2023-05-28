import java.util.Random;
import java.util.Scanner;

public class RMain1 {
	public static void main(String[] args) {
	// up % down 게임(main)
	// 1~100사이의 숫자(정수)
	// 컴퓨터 vs 나 -> 같은 숫자를 내면 반복문을 종료 -> break;로 깰수가 있음, 
	// 컴퓨터가 숫자를 랜덤으로 뽑고
	// 유저가 맞추는데, 정답보다 낮은 숫자를 말했으면 up
	// 정답보다 높은 숫자를 말했으면 down이 뜨도록
	// + 몇 턴만에 정답을 찾았는지 출력
		Random r = new Random();
		int num = r.nextInt(100)+1;
		System.out.println("컴퓨터가 뽑은 숫자 : " + num); // 확인용
		Scanner k = new Scanner(System.in);
		
		int myNum = 0; // myNum 초기화 
		for (int turn = 1; true; turn++) { // 반복횟수가 정해져 있지 않아서 true(빈칸)로 변경해주면된다. 
			System.out.print("숫자 : ");
			myNum = k.nextInt(); //값을 변경하는 용도로 변수 사용
			if (num == myNum) {
				System.out.println("정답");
				System.out.printf("%d번 만에 정답을 맞췄습니다!\n", turn);
				break; // if문을 정지 시키는게 아니라 for 반복문을 정지 시키는 기능이다.
			}else if (num < myNum) {
				System.out.println("down!");
			}else {
				System.out.println("up!");
			}
			System.out.println("*****************");
		}
	}
}

