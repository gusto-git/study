import java.util.Scanner;

// 논리 연산자
// >(초과), >=(이상), ==(같다), !=(다르다), <(미만), <=(이하)

public class OMain1 {
	public static void main(String[] args) {
		
		// 놀이 공원에서 놀이기구를 타도 되는지를 판단해주는 프로그램
		// 키(소수점, cm), 나이를 입력받는 프로그램
		// 키는 000cm이고 나이는 00살 << 이 출력되게
				
		Scanner k = new Scanner(System.in);
		System.out.print("키 : ");
		double height = k.nextDouble();
		System.out.print("나이 : ");
		int age = k.nextInt();
		System.out.println("============================");
		System.out.printf("키는 %.1fcm이고 나이는 %2d살\n", height, age);
		
		// 예제 키가 135센치미터만 아니면 놀이기구 탈 수 있게
		boolean ride1 = (height != 135);
		System.out.printf("ride1 탑승 할 수 있음? : %b\n", ride1 );
		
		// 예제 나이가 짝수인 사람만 탈 수 있게 
		boolean ride2 = (age % 2 == 0);
		System.out.printf("ride2 탑승 할 수 있음? : %b\n", ride2 );
		
		// 강사님 답
		// boolean ride1 = height != 135; ()안쳐도 상관은 없으나 보기가 힘듬
		// System.out.println(ride1);
		// boolean ride2 = age %2 == 0; 
		// System.out.println(ride2);
		
		// 조건 2개 이상 일 경우
		// ~고, ~면서(AND)        : && 
		// ~거나(OR)              : ||
		// 결과를 뒤집을 때(NOT)  : ! (true와 false의 결과 뒤집기)
		// eXclusive OR(XOR)      : ^ (두 입력이 서로 다를 때, 결과 값으로 1을 출력)
 		
		// OR      		AND			XOR
		// O , O > O    O , O > O	O , O > X
		// O , X > O	O , X > X	O , X > O
		// X , 0 > O	X , O > X	X , O > O
		// X , X > X    X , X > X	X , X > X
		
		// KKUL TIP 
		// A && B : A도 만족, B도 만족 > 최종 OK!
		// 상대적으로 확률이 낮은 조건을 먼저 배치하는 것이 유리
		// > 나이가 3살 이상이고, 키가 200 이상 이어야 할 경우
		// > 조건을 걸때 boolean ride3 = (height >= 200 && age >= 3); 
		// > 이유는 &&는 둘다 참이 아니면 무조건 거짓이라 확률이 낮은 걸 먼저 앞에 배치함
		
		// A || B : A가 만족하거나, B가 만족하거나, 둘다 만족해도 OK!
		// 상대적으로 확률이 높은 조건을 먼저 배치하는 것이 유리
		// > 나이가 3살 이상거나 키가 200 이상 이어야 할 경우
		// > 조건을 걸때 boolean ride3 = (age >= 3 || height >= 200)
		// > 이유는 || 둘 중 하나만 참이면 참이라 확률이 높은 걸 먼저 앞에 배치함
		
		// 순서를 미리 생각해서 사용 > 컴퓨터 작업 횟수가 줄어듬
		// -> 메모리 효율이 높아짐
		// 결과 : 미리 사전에 손좀 봐두면 컴퓨터 할일이 줄어들고 프로그램 실행이 빨라짐
		
		
		// 예제 나이가 3살 이상이고 키가 120 이상이어야 탈 수 있다
		boolean ride3 = (age >= 3 && height >= 120); //둘다 true 일때만 true 출력
		System.out.println(ride3);
		// 예제 나이가 3살 이상이고 키가 2M 이상이어야 탈 수 있다 cm > m(cm/100)
		boolean ride4 = ((height / 100) >= 2 && age >= 3); // &&라서 확률이 높은 height가 앞에 감
		System.out.println(ride4);
		
		// 예제 키가 1.6m 가 넘거나 나이가 70 이하면 탈 수 있음
		boolean ride5 = ((height / 100) > 1.6 || age <= 70);
		System.out.println(ride5);
		// 나이가 10살 보다 많거나 40살 보다 적으면 탈 수 있음
		// 의도 10 < age < 40 이나, Java에서는 한 번에 구현 불가 
		// age > 10 , age > 40 을 따로 구축 해야함
		// age > 10 || age > 40  -> 100살이라 하면 앞은 true 뒤는 false -> 결과 값은 true가 나오는 오류 발생  
		// ** 중요한 문제
		boolean ride6 = (age > 10 && age < 40); // "거나" 때문에 ||로 착각하는 경우가 있다. 하지만 &&가 맞다.
		System.out.println(ride6);
		
		// 나이가 11살 이상이던지, 키가 1.5m던지 둘 중 하나만 참 일때 괜찮다  > xor
		boolean ride7 = (age >= 11 ^ (height / 100) == 1.5);
		System.out.println(ride7);
		
		// ride7을 탈 수 있는 사람은 못타고, ride7 못타는 사람은 탈 수 있음 > ! 써야함 
		boolean ride8 = (ride7 == true != true); // 정답 boolean ride8 = !ride7;
		System.out.println(ride8);
		
		
		// 나이가 50세 이하거나 키가 1m 이하인 경우만 가능 
		boolean ride9 = age <=50 || (height/100) <= 1; 
		System.out.println(ride9);
		
		// 키가 1m 초과면서 나이가 5세 미만이면 가능 
		boolean ride10 = (height / 100) > 1 && age < 5 ;
		System.out.println(ride10);
		
		
		
		
		
		
	}
}
