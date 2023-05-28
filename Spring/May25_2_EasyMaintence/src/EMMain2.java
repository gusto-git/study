import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

// 이마트 사장(대구)
//	구매금액을 입력하면 적립포인트 계산하는 프로그램
//	개발자에게 의뢰

//	개발자(강남)
//		개발(.java) -compile과정 -> 기계어(.class) - 실행 -> 테스트 
//		기계어(.class) - 압축 -> 배포파일(.jar)[.bat] -사장님께 전달 ->

//		.java를 수정 : 위 단계를 다시 다~ 거쳐야하는 번거로움이 있음 (bmmain버전)

//	유지보수에 용이 : IoC라고 함 (Inversion of Control)
//		.java를 수정하지 않아도 프로그램이 수정되게 하는 것
//		수정이 일어날 만한 부분을 .java에 코드로 작성하지 않고
//		외부파일에 작성
//		java는 그 외부파일을 불러오게

//  	IoC(제어의 역전)
//		프로그램 -> 파일(프로그램의 실행결과를 파일에 저장) : 일반적인 흐름
//		파일 -> 프로그램(파일로 프로그램을 제어)
public class EMMain2 {
	public static void main(String[] args) {
		try {
			Scanner k = new Scanner(System.in);
			System.out.print("가격 :");
			int price = k.nextInt();
			FileReader fr = new FileReader("C:\\gustofile/pointRate.txt"); // 역슬래시는 2개 , 슬래시는 1개로 구분 
			BufferedReader br = new BufferedReader(fr);
			
			String pr = br.readLine();
			System.out.println("--------------------");
			System.out.printf("가격 : %,d원\r\n", price);
			double point = price * Double.parseDouble(pr); // 0.1
			System.out.printf("포인트 %.01f점 적립", point);
			
			Thread.sleep(3000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
