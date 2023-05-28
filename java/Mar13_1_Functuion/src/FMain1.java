import java.util.Scanner;

// 심부름 
// 

public class FMain1 {
	// 1. 쉬는 날 방에서 게임을 하고 있는데 엄마가 심부름을 시킨다.
	// 2. 엄마의 심부름 시키는 내용을 출력하는 함수
	// 함수 종류 : 1번 함수 
	public static void mommySay() { //mommySay() > 함수명
		System.out.println("아들~");
		System.out.println("돈줄테니까");
		System.out.println("슈퍼가서");
		System.out.println("라면이랑");
		System.out.println("콜라사고");
		System.out.println("남은돈 가져와");
		System.out.println("------------------");
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	// 엄마가 돈을 주셨다 (돈 = 함수에서 직업 입력)
	// 조금 뒤에 다른 함수에서 거스름돈 계싼해야 함! > 지금 돈 다른 함수에서 쓸 예정
	// 함수 종류 : 3번 함수 
	
	public static int takeMoney() { //-> return으로 인해 void가 int로 바뀜 리턴시킬 자료형과 일치 시켜야 하기 때문 
		Scanner k = new Scanner(System.in);
		System.out.print("엄마가 준 금액: ");
		int money = k.nextInt();
		System.out.printf("엄마가 %,d원 주셨다!\n", money);
		System.out.println("======================");
		return money; 
	}
	
		// 정수(int)에 대한 값을 main함수에 return(반환)할 것이므로 함수 상단의 return  type 위치를 int로 고정
		// 내가 return 시킬 내용의 자료형이 retun type으로 와야함
		// return 함수는 무조건 맨 마지막에 작성되야 한다. 
		// main 함수에 담을 때 return 앞에 자료형을 넣어야함
////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
	
	// 심부름을 하는 중...
	// 각각의 물품이 얼마인지 확인하고(함수 내에서 쓸것)
	// 내가 엄마한테 받은 돈 - 물건 값 = 남는돈 얼마인지 생각'만'할 것 
	// 함수 종류 : 2번 
	public static void thinking(int money) {
		int ramyeon = 1200;
		int cola = 2700;
		// money : 파라미터로 다른 함수에 있는 값을 가지고 온 것 
		System.out.printf("심부름을 하고나니... %,d원 남네..ㅎ\n", money - (ramyeon + cola));
		System.out.println("==================================");
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	// 계산하고 잔돈을 엄마한테 주자..
	// 엄마한테 받은 돈 - (라면 + 콜라 + 삥땅)
	// 남은 금액을 main 함수에 반환 
	// 함수 종류 : 4번 	
	public static int calculate(int m) {
		int ramyeon = 1200;
		int cola = 2700;
		int  bbingddang = 500;
		
		int restMoney = m -(ramyeon + cola + bbingddang);
		return restMoney;
		
	}
	
	//main 함수가 없으면 실행 불가능! 
	public static void main(String[] args) {
		mommySay();
		// return이 있는 함수는 main 함수에서 변수 안에 저장을 해야함! 
		// 다른 함수에서 가져다 써야 하기 때문 
		int money = takeMoney();
		System.out.println(money);
		thinking(money); //return이 없으니 자료형을 붙일 필요가없다
		int rm = calculate(money);
		System.out.printf("엄마에게 %,d원 만큼 드린다." , rm);
	}
}
