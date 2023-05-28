// 지역변수(Local Variable)
// 		method 속에서 만든 변수
// 		그 메소드가 실행되는 동안만 필요한 임시변수
// method parameter(메소드 파라미터)
// 		메소드가 실행되는데 필요한 재료
// return값
// 		메소드가 실행한 후의 결과물
// 멤버변수(Member Variable)
//		객체의 속성
public class Doctor2 {
	// 맴버 변수 
	// 의사 이름 , 나이 

	String name;
	int age;
	
	public void printDoctor() {
		System.out.println("<<의사>>");
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println("---------");
	}
	// 손님 부르는 메소드-> 객체 자체를 가져옴
	public void callGuest(Guest2 g) {
		System.out.printf("%s씨, 들어오세요\n", g.name);
	}
	// 키를 물어보는 메소드 -> 재료가 필요함(누구한테) // 결과 : 손님 키 
	public double askHeight(Guest2 g) {
		System.out.println("키(cm) : ");
		double h = g.answerWeight();//scanner 입력 구문으로 감.
		if (h >= 1 && h <= 300) {
			System.out.println("=============");
			System.out.printf("아 ~ 키가 %.1fcm 이구나\n", h);
			System.out.println("=============");
		}else {
			System.out.println("=============");
			System.out.println("다시 말해주세요");
			System.out.println("=============");
		}
		return (h >= 1 && h <= 300) ? h/100 : askHeight(g);
	}
	// 몸무게 묻는 메소드 - > 재료가 필요함(누구한테) // 결과 : 손님 몸무게
	public double askWeight(Guest2 g) {
		
		System.out.print("몸무게(kg) :");
		double w = g.answerWeight();
		if (w >= 1 ) {
			System.out.println("=============");
			System.out.printf("아 ~ 몸무게가 %.1fkg이구나\n", w);
			System.out.println("=============");
		}else if (w < 1) {
			System.out.println("=============");
			System.out.printf("다시 말해주세요");
			System.out.println("=============");
		}
		return (w >= 1 ) ? w : askWeight(g);
	}
	// bmi 계산 -> 재료가 필요함(손님의 키 , 몸무게) // 결과 : bmi 값
	// 몸무게 / (키m * 키m)
	public double calcBMI(Guest2 g) {
		return g.weight / (g.height * g.height);
	} // 이대로 출력하면 안나온다. 
	
	public String checkBMI(Guest2 g) {
		if (g.bmi >= 40) {
			return "고도비만";
		}else if (g.bmi >= 35) {
			return "중등도 비만";
		}else if (g.bmi >= 30) {
			return "경도 비만";
		}else if (g.bmi >= 25) {
			return "과체중";
		}else if (g.bmi >= 18.5) {
			return "정상";
		}else {
			return "저체증";
		}
	
	}
	public void printResult(Guest2 g) {
		System.out.printf("키는 %.1fcm, 몸무게는 %.1fkg ", g.height * 100, g.weight);
		System.out.printf("체질량 지수(BMI)는 %.1f%%",calcBMI(g));
		System.out.printf("임으로 %s씨는 %s입니다.", g.name, checkBMI(g));
	}
	
	
	
	// 과정을 실행하는 부분  // 
	
	public void start(Guest2 g) {
		callGuest(g);
		g.height = askHeight(g); // 입력한 값을 g.height에 넣어야함
		g.weight = askWeight(g); // 입력한 값을 g.weight에 넣어야함
		g.bmi = calcBMI(g);
		g.bmiResult = checkBMI(g);
		printResult(g);
	}

}
