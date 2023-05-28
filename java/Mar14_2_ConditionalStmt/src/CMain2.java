import java.util.Scanner;

public class CMain2 {
	public static void main(String[] args) {
		// 정수 하나를 입력할 수 있도록 해서
		Scanner k = new Scanner(System.in);
		System.out.print("x : ");
		int x = k.nextInt();
		// 입력받은 정수값이 5보다 크면  새로운 변수 y만들어서 정수 10 담기
		// 입력받은 정수값이 3보다 크면 새로운 변수 y만들어서 정수 20 담기
		
		
		if (x > 5) {
			int y = 10; // 변수 y를 만들어라 
			System.out.println(y);
		}else if (x > 3) {
			int y = 20;
			System.out.println(y);
		}
			
		// if 문 안에 변수를 만들면
		// if문이 돌아가면서 계속해서 int y를 생성하고 있음 -> 비효율적
		// if문 바깥에 변수를 미리 생성해 두고
		// if문 안에서는 값을 [변경](할당)할 수 있게 하는 것! -> 효율적
		int z = 0; // 기본값을 정할때 0을 넣는다. if 조건문 안에서는 z에 =0을 안줘도 되지만 main에서 불러올려면 = 0 은 필수이다
		if (x > 5) {
			z = 10; // 값 변경 
			System.out.println(z);
		} else if (x >3) {
			z = 20;
			System.out.println(z);
		}
		
		System.out.println(z); // 기본값을 지정해 놓지 않으면 이 부분 에러
		// 조건문 후에 변수 사용을 할 목적이 있다면 기본값까지
		// 변수 초기화까지 한번에 진행이 되어야 사용이 가능 
		
		
	}
}
