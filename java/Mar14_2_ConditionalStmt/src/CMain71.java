import java.util.Scanner;

// BMI 검사 프로그램(함수.ver)

// 이름, 키(cm), 몸무게(kg) 입력
// BMI(체질량지수) = 몸무게 / (키 * 키) >> 키 : m단위
//		18.5 미만 : 저체중
//		18.5 이상 : 정상
//		25 이상 : 과체중
//		30 이상 : 경도비만
//		35 이상 : 중증도비만
//		40 이상 : 고도비만
public class CMain71 {
	// 프로그램 시작을 알리는 함수
	public static void startBMI() {
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("BMI 검사를 시작합니다~");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
	}
	// 이름 입력하는 함수, 
	public static String getName() {
//		Scanner k = new Scanner(System.in);
		System.out.print("이름 : ");
//		String name = k.next();
		return new Scanner(System.in).next();
	}
	// 키 입력하는 함수, 
	public static double getHeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("키(cm) : ");
		double height = k.nextDouble();
		return height / 100;
	}
	// 몸무게 입력하는 함수
	public static double getWeight() {
		System.out.print("체중 : ");
		return new Scanner(System.in).nextDouble();
	}
	// BMI 계산해주는 함수 몸무게 / (키 * 키) >> 키 : m단위
	public static double calcBMI(double h, double w) {
//		double bmi = w / (h * h);
//		return bmi;
		return w / (h * h);
	}
	// 결과 판정해주는 함수 (재료 : bmi)
	// RAM을 덜 쓰려면 -> 변수를 줄이면 된다!
	// HDD를 덜 쓰려면 -> 코드를 줄이면 된다!
	public static String judgeBMI(double bmi) {
//		if (bmi >= 40) {
//			return "고도비만";
//		} else if (bmi >= 35) {
//			return "중등도비만";
//		} else if (bmi >= 30) {
//			return "경도비만";
//		} else if (bmi >= 25) {
//			return "과체중";
//		} else if (bmi >= 18.5) {
//			return "정상";
//		} else {
//			return "저체중";
//		}
		String result = "저체중"; // else 자리에 놓던 것을 변수만들 때 쓰기
		if (bmi >= 40) {
			result = "고도비만";
		}else if (bmi >= 35) {
			result = "중등도비만";
		} else if (bmi >= 30) {
			result = "경도비만";
		} else if (bmi >= 25) {
			result = "과체중";
		} else if (bmi >= 18.5) {
			result = "정상";
		}
		return result;
	}
	// 결과 출력해주는 함수
	public static void printResult(String n, double h, double w, double b, String r) {
		System.out.printf("%s]님의 키는 %.1fcm, 몸무게는 %.1fkg이고..\n", n, h*100, w);
		System.out.printf("체질량지수는 %.1f%% 입니다\n", b);
		try {
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.println(".");
			System.out.println("결과가 곧 나옵니다.");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("[%s]님은 %s 입니다!\n", n, r);
		switch (r) {
		case "저체중":
			System.out.println("드시고싶은 거 다 드세요");
			break;
		case "정상":
			System.out.println("잘 관리하고 계시네요");
			break;
		case "과체중":
			System.out.println("운동을 조금 해볼까요?");
			break;
		case "경도비만":
			System.out.println("하루에 두끼만 드세요");
			break;
		case "중등도비만":
			System.out.println("하루에 한끼만 드세요");
			break;
		case "고도비만":
			System.out.println("야 너두 할 수 있어");
			break;
		}
		
	}
	public static void main(String[] args) {
		startBMI();
		String name = getName();
		double height = getHeight();
		double weight = getWeight();
//		System.out.println(name + ", " + height + ", " + weight);
		double bmi = calcBMI(height, weight);
//		System.out.println(bmi);
		String result = judgeBMI(bmi);
//		System.out.println(result);
		printResult(name, height, weight, bmi, result);
	}
}










