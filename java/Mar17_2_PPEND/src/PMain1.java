import java.util.Iterator;
import java.util.Scanner;

public class PMain1 {
// main안에 때려박아 넣는다.
// 어떤 숫자를 콘솔창에 입력
// 그 숫자의 약수를 구해서 출력해주는 프로그램
// 음수 값은 무시
// ex) 12 > 12의 약수는 1,2,3,4,5,6,12
// 계속 반복하게 (숫자를 입력하면 해당하는 숫자의 약수를 계속 보여줌)
// 그러다가 콘솔창에 숫자 0을 입력하면 프로그램 종료
// 0 누리기 전까지는 무한반복
// 배열사용 xxxxxx
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int num = 0;
		while (true) {
			System.out.print("숫자 입력(0 입력하면 종료) :");
			num = k.nextInt();
			if (num == 0) {
				System.out.println("종료합니다.");
				break; // while 종료 
			}
			System.out.printf("%d의 약수는 : ", num);
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
//					System.out.printf("%d의 약수는 %d\n", num,i);
					System.out.printf("%d ",i);
				}
			}
			System.out.println();
		}
		
	}
}

