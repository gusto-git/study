import java.util.Scanner;

// 비만도 검사 프로그램 (함수.ver)
// 키, 몸무게는 입력 받을 것
// 표준체중 = (키 - 100) * 0.9
// 비만도 = (몸무게 / 표준체중) * 100
// 비만도가 120이 넘으면 '비만' 그렇지 않으면 '안비만'

// ctrl + shift + /(Numpad) : 함수 닫기(전체만 가능)
// ctrl + shift + *(Numpad) : 함수 열기(전체만 가능)

// 함수를 따로 만들어서 쓰는 이유 : 기능별로 분류해서 표현 -> 유지 보수가 편해짐
// 만약, 표준 체중을 구하는 공식이 0.9 -> 0.8로 바뀌었다고 가정
// 다양한 기능을 함수 하나에 때려 박아 놓고 변경사항 수정 요청이 들어오면
// 한번에 찾아서 수정이 가능 함.

// 메모리를 아낄 것인가? vs 가독성을 좋게 할 것인가?


public class FMain4 {
	// 함수 만들 때 재료(파라미터)가 필요한지(parameter)
	// 내가 만든 함수에서 나온 값이 다른데서 필요한지?(return)
	
	
	// 1번 함수) 비만도 검사 시작 내용을 출력하는 함수
	public static void startBimando() {
		System.out.println("****비만도검사시작!****");
	}
	
	// 3번 함수) 키를 입력 받는 함수	-> 다른데서 사용
	public static double getHeight() {
		Scanner k = new Scanner(System.in);
		System.out.println("키 : ");
		double height = k.nextDouble();
		return height;
	}
	// 3번 함수) 몸무게를 입력 받는 함수	-> 다른데서 사용
	public static double getWeight() {
		Scanner k = new Scanner(System.in);
		System.out.println("몸무게 :");
//		double weight = k.nextDouble();
//		return weight;
		return new Scanner(System.in).nextDouble();
	}
	// 4번 함수) 키를 넣으면 표준체중을 구하는 함수
	public static double calStdWeright(double height) {
		double stdWeight = (height - 100) * 0.9;
		return stdWeight;
	    
	}
	// 4번 함수) 실제 체중, 표준체중을 넣으면 비만도 계산해서 값을 내주는 함수
		public static double calcBimando(double weight, double stdWeight) {
			double bimando = (weight / stdWeight) * 100;
			return bimando;
		}
	// 4번 함수) 비만인지 비만이 아닌지 판정해주는 함수
		public static String judgeBimando(double bimando) {
			String result = (bimando > 120) ? "비만" : "안비만";
			return result;
			
		}
	// 2번 함수) 결과를 출력해주는 함수
		public static void printResult(double h, double w, double s, double b, String r) {
			System.out.println("--------------------");
			System.out.printf("키 : %.1fcm\n", h);
			System.out.printf("몸무게 : %.1fkg\n", w);
			System.out.printf("표준체중 : %.1fkg\n", s);
			System.out.printf("비만도 : %.1f%%\n", b);
			System.out.printf("당신은 [%s]입니다.\n", r);
			System.out.println("--------------------");
		}
		
	public static void main(String[] args) {
		startBimando();
		double height = getHeight();
		double weight = getWeight();
		double stdWeight = calStdWeright(height);
		double bimando = calcBimando(weight, stdWeight);
		String result = judgeBimando(bimando);
		
		printResult(height, weight, stdWeight, bimando, result);
		// 이거 다시 복습해야함;; 한줄로 합치는 연습도 해야함 ..
	}
}
