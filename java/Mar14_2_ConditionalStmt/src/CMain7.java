import java.util.Scanner;

// BMI 검사 프로그램(함수.VER)

// 이름, 키(cm), 몸무게(kg)
// 입력받을 것
// BMI(체질량 지수) = 몸무게 / (키 * 키) >> 키 : m단위
//	18.5 미만이면 : 저체중
// 	18.5 이상이면 : 정상
// 	25 이상 : 과체중
//  30 이상 : 경도비만
//  35 이상 : 중증도비만
//  40 이상 : 고도비만

public class CMain7 {
	// 힌트 : 프로그램 시작을 알리는 함수
	// 이름 입력하는 함수, 키 입력하는 함수, 몸무게 입력하는 함수
	// BMI 계산해주는 함수
	// 결과 판정해주는 함수 
	// 결과 출력해주는 함수
	
	//프로그램 시작을 알리는 함수//
	public static void bmiCheck() {  // 1번 함수
		System.out.println("BMI 검사를 시작합니다");
	}
	//이름을 입력하는 함수//
	public static String userName() {  // 3번 함수
		Scanner k = new Scanner(System.in);
		System.out.print("이름 :");
		String name = k.next();
		return name;
	}
	
	//키를 입력하는 함수//
	public static double userHeight() {  // 3번 함수
		Scanner k = new Scanner(System.in);
		System.out.print("키 :");
		double height = k.nextDouble();
		return height / 100; // cm -> m단위로 변경 
	}
	
	//몸무게를 입력하는 함수//
	public static double userWeight() {  // 3번 함수
		Scanner k = new Scanner(System.in);
		System.out.print("몸무게 :");
		double weight = k.nextDouble();
		return weight; // return new Scanner(System.in).nextDouble();
	}
				
	//BMI 계산해주는 함수// BMI(체질량 지수) = 몸무게 / (키 * 키) >> 키 : m단위 // 4번 함수
	public static double checkBmi(double h , double w) {
		double bmi = w / (h * h);
		return bmi; // return w / (h * h);
	}
	//결과 판정해주는 함수// // 4번 함수 -> 재료 : bmi
	// ram을 덜 쓰려면 -> 변수를줄이면된다
	// hdd를 덜 쓰는것 = > 코드를 줄이면된다
	public static String userBmi(double a) { 
//		if (a >= 40) {
//			System.out.println("고도비만");
//		}else if (a >= 35) {
//			System.out.println("중증도비만");
//		}else if (a >= 30) {
//			System.out.println("경도비만");
//		}else if (a >= 25) {
//			System.out.println("과체중");
//		}else if (a >= 18.5) {
//			System.out.println("정상");
//		}else {
//			return "저체중";
//		}
//		
		String result = "저체중";
		if (a >= 40) {
			result = "고도비만";
		}else if (a >= 35) {
			result = "중등도비만";
		}else if (a >= 30) {
			result = "경도비만";	
		}else if (a >= 25) {
			result = "과체중"; 	
		}else if (a >= 18.5) {
			result = "정상";
		}
		return result;
		
		
	}
	
	//test//
	
	
	//결과 출력해주는 함수// 2번함수
	public static void userResult(String a,double b, double c, double d, String e ) {
		System.out.printf("이름 : %s, 키 : %.1fcm, 몸무게 : %.1fkg BMI수치 : %.1f%%임으로 %s입니다. ", a,b*100,c,d,e);
		try {
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.println(".");
			Thread.sleep(1000);
			System.out.println(".");
			System.out.println("결과가 곧 나옵니다.");
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		bmiCheck();
		String name = userName();
		Double height = userHeight();
		Double weight = userWeight();
		Double bmi = checkBmi(height, weight);
		String uBmi = userBmi(bmi);
		userResult(name, height, weight, bmi, uBmi);
		
		
		
		
		
	}
	
}
