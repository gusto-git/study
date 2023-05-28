import java.util.Scanner;

public class FMain4 {
	
	// 정수 1개 입력 받는 함수 2개 만들기
	public static int getX() {
		Scanner k = new Scanner(System.in);
		System.out.print("x : ");
		int x = k.nextInt();
		return x;
	}
	
	public static int getY() {
		Scanner k = new Scanner(System.in);
		System.out.print("y : ");
		int y = k.nextInt();
		return y;
	}
	
//	그 정수 2개를 더했을 때 짝수면 결과를 리턴, 
//	홀수면 값을 다시 입력하는 함수
	public static int getResult(int x, int y) {
		int sum = x + y;	
//		return sum % 2 == 0 ? sum : getResult(x, y); ->무한 루프
		// 원하는 값이 들어오지 않으면 무한루프 돌아감
		return (sum % 2 == 0) ?sum : getResult(getX(), getY());
	}

	public static void main(String[] args) {
	int x =	getX();
	int y =	getY();
	System.out.println(x + y);
	int sum = getResult(x, y);
	System.out.println(sum);
		
	}
	
}
