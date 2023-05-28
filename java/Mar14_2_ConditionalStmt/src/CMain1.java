import java.util.Scanner;

//조건문

public class CMain1 {
	// 국어시험 점수를 입력해서 받아오는(리턴) 함수
	// 100점 만점 점수에는 -가 없음! 
	// 0~100 사이의 정수가 아닌 경우 다시 해당 함수 돌아오게
	
	public static int getScore() {
		Scanner k = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int score = k.nextInt();
		return score >= 0 && score <= 100 ? score : getScore();
	}
	// 조건문(Conditional Statement)
	//	작성한 코드를 조건에 따라 코드의 실행 흐름을
	// 다르게 동작하도록 제어하는 문법
	
	// if문 : 조건식의 결과가 true, false로 실행문의 동작여부를 결정
	
//	if(조건A){
//		조건A가 만족했을때(참일 때, true일 때)이 부분 실행
//	} else if(조건B){
//	조건B가 만족했을때(참일 때, true일 때)이 부분 실행
//  } else if(조건C){
//	조건C가 만족했을때(참일 때, true일 때)이 부분 실행
//  } else{
//		맞는 조건이 하나도 없으면 이 부분 실행	
//  }
	
	// 입력한 국어 점수가 60점 미만이면 : 가
	// 60점 이상 : 양 / 70점 이상 : 미 / 80점 이상 : 우 / 90점 이상 : 수 
	
	public static void main(String[] args) {
		int kor = getScore();
//		System.out.println(kor);
//		if (kor >= 60) {
//			System.out.println("양");
//		} else if (kor >= 70) {
//			System.out.println("미");
//		} else if (kor >= 80) {
//			System.out.println("우");
//		} else if (kor >= 90) {
//			System.out.println("수");
//		} else {
//			System.out.println("가");
//		}
		
		// 위에서 이미 true가 나왔기때문에 조건을 진행하지 않는다. 따라서 양미우수가 아닌 수우미양가으로 해야함 
		
		if (kor >= 90) {
			System.out.println("수");
		} else if (kor >= 80) {
			System.out.println("우");
		} else if (kor >= 70) {
			System.out.println("미");
		} else if (kor >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
		System.out.println("------------------------");
		// if문 안에 if문 사용 가능
		// 국어 점수가 50점이 안되면 "욕", 넘으면 "칭찬" 
		// 점수가 50점 이상, 60점 미만이면 "아쉬운 소리"
		// 점수가 30점 미만 "너 퇴학!"
		
		if (kor < 50) {
			System.out.println("욕");
			if (kor < 30) {
				System.out.println("너 퇴학");
			}
		} else {// kor >= 60가 포함되어있다.
			System.out.println("칭찬");
			if (kor < 60) {
				System.out.println("아쉽네");
			}
		}
		
		
		// if - if 문 if - else 문 차이
		// if - if 문 : 각각 다른 조건으로 해석 -> 비효율적
		// if - else 문 : 하나의 조건이 만족되면 나머지 부분 수행 x -> 효율
		
//		if (kor < 50) {
//			System.out.println("욕");
//		} else {
//			System.out.println("칭찬");
//		} 
		
		
		
	}
}
