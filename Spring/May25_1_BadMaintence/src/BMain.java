import java.util.Scanner;

// 어플리케이션 배포(포트폴리오)
//		jar, war관련해서 만들고, 사용하고

// 이마트 사장(대구)
//	구매금액을 입력하면 구매금액의 1%를 적립포인트로 계산하는 프로그램을
//	개발자에게 의뢰

// 개발자(강남)
//	개발 -> 테스트
//	배포 
// 	퇴근

public class BMain {
	// 구매금액의 10%
	// 가격을 입력받게
	// 가격 : 10,000원
	// 포인트 : 100점 적립
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("가격 : ");
		int price = k.nextInt();
		System.out.println("---------------");
		System.out.printf("가격 : %,d원\r\n", price);
		double point = price * 0.01;
		System.out.printf("포인트 %.0f점 적립", point);
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		// 배치 파일로 만들어서 다시 실행 
	}
}




