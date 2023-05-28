import java.util.Scanner;

// 맴버 변수
// 이름 , 나이, 스캐너, 키, 몸무게, bmi , 결과 
// 손님을 부르는 method = 이름, 나이 출력
// 키에 대한 대답하는 method 
// 몸무게에 대한 대답하는 method
public class Guest {
	
	String name;
	int age;
	Scanner mouth = new Scanner(System.in);
	double height;
	double weight;
	double bmi;
	String bmiResult;
	// 손님을 부르는 method = 이름, 나이 출력
	public void printGuest() {
		System.out.println(" < 손님 >");
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println("----===----");
	}
	// 키에 대한 대답하는 method 
	public double answerHeight() {
		return mouth.nextDouble();
	}
	
	// 몸무게에 대한 대답하는 method
	public double answerWeight() {
		return mouth.nextDouble();
	}
}
