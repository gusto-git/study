import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class YMain1 {
	// 함수는 생각하지 않음
	// 키(cm), 몸무게(kg) 입력받아서 비만도 검사하는 프로그램
	// 비만도 = (실제체중 / 표준체중) * 100
	// 표준 체중 = (키 - 100) x 0.9
	// 비만도가 120이 넘으면 비만 그렇지 않으면 안비만 이라는 문구 출력
	// 아무키나 입력했을 때 프로그램이 종료되게 만듬
	public static void main(String[] args) throws InterruptedException {
		
		Scanner k = new Scanner(System.in);
		System.out.print("키 :");
		double height = k.nextDouble();
		System.out.print("몸무게 :");
		double weight = k.nextDouble();
		
//		System.out.println(height); 중간 확인 용 
//		System.out.println(weight); 중간 확인 용 

		
		double standard = (height - 100) * 0.9;
		double obesity = (weight / standard) * 100;
//		System.out.printf("표준 체중 : %.1f\n" , standard);  중간 확인용
//		System.out.printf( "비만도 : %.1f\n", obesity);  중간 확인용 

		String result = (obesity > 120) ? "비만" : "안비만";
		System.out.println(result);		
//		System.out.println(obesity > 120 ? "비만" : "안비만"); 
		
		
	// 3초 딜레이
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.println(".");
		System.out.println("결과분석 완료");
		Thread.sleep(500);
		System.out.println("[결과]");
		
		System.out.printf("당신은 키가 %.1fcm, 몸무게가 %.1fkg으로 " + "비만도가 %.1f%%라서 %s입니다.\n", height,weight,obesity, result);
		System.out.println("종료하려면 아무키나 입력");
		String bye = k.next();
		System.out.println("프로그램을 종료합니다.");
		k.close(); // 하지않아도 종료가 됨, 하는 이유 : 아래 thread.sleep 이후 코드가 없어서 종료가 됨. k.close();는 Scanner를 닫는 기능
		Thread.sleep(1000);
		
	}
}
