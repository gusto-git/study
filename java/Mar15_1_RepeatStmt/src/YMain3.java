import java.util.Scanner;

// 평일 스케줄 출력해주는 프로그램
// 시간을 입력받아서(24시간 단위) -> 해당 시간에 속하는 내용을 출력
// -> 입력한 시간이 원하는 범위가 아니면 다시 입력 

// 오전 9시 ~ 오후 6시 : 학원에서 공부 x
// 오전 9시, 오후 2시, 오후 6시, : QR 찍기x
// 오후 12 ~ 오후 1시 : 점심시간x
// 오후 6시 이후 ~ 오후 8시 : 집에가는 시간x
// 오전 6시 ~ 오전 9시 전까지 : 기상 + 씻기 학원가기 시간x
// 오후 8시 이후 ~ 오전 6시 : 여가시간 + 취침x
// 편의상 분 입력 X

// 함수로 제작

public class YMain3 {
// 시간을 받는 함수 // 
	public static int timeSchedule() {
		Scanner k = new Scanner(System.in);
		System.out.print("시간입력(00~24) : ");
		int time = k.nextInt();
		return (time >= 0 && time <= 24) ? time : timeSchedule();
	}
// 시간을 출력하는 함수 // 
	public static void printHour(int a) {
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.printf("%02d시!\n", a); // 두 자리 수 시간을 나타 낼 수 있음 
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-");
	}
// 결과 출력하는 함수 //
	public static void printResult(int time) {
		if (time >= 9 && time <= 18) {
			System.out.println("학원 공부 ");
			if (time == 9 || time == 14 || time == 18) {
				System.out.println("QR");
			} else if (time >= 12 && time <=13) {
				System.out.println("점심시간");
			}
		} else if (time > 18 && time <= 20) {
			System.out.println("귀가 시간");
		} else if (time >= 6 && time < 9) {
			System.out.println("기상 + 샤워 + 학원 가기");
		} else if (time >= 6 && time < 9) {
			System.out.println("기상 + 샤워 + 학원 가기");
	    } else { // 24시간 중 그외 나머지 이기 때문
	    	System.out.println("여가 시간 + 취침");
		}
	}
	// 큰거 부터 작성 범위안에 종속되는건 if문 안에 if문 으로 작성
	public static void main(String[] args) {
		int time =timeSchedule();
		System.out.println(time);
		printHour(time);
		printResult(time);
		
	}
}

//내가쓴거//

//String answer = "";
//if (time >= 0 && time <9){
//	answer = "여가 시간";
//} else if (time >= 6 && time <9)  { 
//	answer = "기상 + 씻기 + 학원가기";
//} else if (time >= 9 && time <=18) {
//	answer = "학원 공부";
//} else if (time >= 12 && time <= 13  ) {
//	answer = "점심 시간";
//} else if (time > 18 && time <= 20 ) {
//	answer = "귀가 시간";
//} else if (time > 20 && time < 24 ) {
//	answer = "여가 시간";
//} else if (time == 9 || time == 14 || time == 18 ) {
//	answer = "qr 찍기";
//} else {
//	return timeSchedule();
//}
//return answer;
