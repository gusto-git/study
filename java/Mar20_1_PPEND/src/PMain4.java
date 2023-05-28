import java.util.Scanner;

// 거스름돈 환전하는 프로그램 
// 함수 사용
// <입력>
// 구매할 물건 가격 : 3500
// 내가 낸 돈 : 5410
// ------
// 거스름돈 : 1910
// 50000
// 10000
// 5000
// 1000 : 1장
// 500 : 1개
// 100 : 4개
// 50
// 10 : 1개 
public class PMain4 {
	// 물건 가격 입력하는 함수
	public static int getPrice() {
		Scanner k = new Scanner(System.in);
		System.out.println("물건가격 : ");
		int price = k.nextInt();
		return price;
	}
	
	// 지불한 돈을 입력하는 함수
	public static int payMoney(int price) { // 물건 가격보다는 많이 내야한다.
		Scanner k = new Scanner(System.in);
		System.out.println("낸 돈 :");
		int money = k.nextInt();
		if (money < price) {
			System.out.println("돈이 부족합니다. 다시 입력하세요");
		}
		return (money > price) ? money : payMoney(price);
	}
	
	// 거스름돈 계산
	public static int getChange (int price, int money) {
		return money - price;
	}
	
	// 위에 3개 출력
	public static void printResult(int price, int money, int change) {
		System.out.println("======================");
		System.out.printf("물건 가격 : %d원\n", price);
		System.out.printf("낸 돈 : %d원\n", money);
		System.out.printf("거스름돈 : %d원\n", change);
		System.out.println("======================");
	}
	
	// 거스름 돈을 화폐에 따라 어떻게 줄 것인지 - 2가지 방법
	public static void printChange(int change) { // 예 : 22421으로 가정 // 10000원으로 22421을 나눔 -> 2장, 2421원남음
		//1.															// 1000원으로 2421을 나눔 -> 2장 , 421원 남음 ... 10원까지
		//우리나라 화폐 단위 모두 배열									// 나머지를 계속 나누면 됨
		int[] currency = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		for (int i = 0; i < currency.length; i++) {
			if (change >= currency[i]) { // 필요없는 화폐 건너 뛰도록 
				System.out.printf("%,d원권 : %d개\n", currency[i], (change / currency[i]));
				// Java 특징 : int / int = int >> 나머지 뺀 몫만 구할 수 있음.
				change %= currency[i]; // change = change % currency[i]; // 나머지를 change에 넣는다.
			}
		}
		//2.
		// 배열을 쓰지않음
		int currency2 = 100000; //한국 지폐의 특성을 활용한 것
		while (true) {
			currency2 /= 2; // currency2 = currency2 / 2 -> 5만원이 된다. currency2가
			if (change >= currency2) {
				System.out.printf("%,d원권 : %d개\n", currency2, change / currency2);
				change %= currency2;
			}
			currency2 /= 5; // 5만원에서 1만원이 됨
			if (change >= currency2) {
				System.out.printf("%,d원권 : %d개\n", currency2, change / currency2);
				change %= currency2;
			}
			if (currency2 == 10) {
				break; // 100,000 -> 50,000 -> 10,000 -> 5,000 -> 1,000 -> 500 -> 100 원 순으로 if문이 진행 된다. 
			}
		}
	}
	
	public static void main(String[] args) {
		int price = getPrice();
		int money = payMoney(price);
		int change = getChange(price, money);
		printResult(price, money, change);
		printChange(change);
		
	}
	
	
	
	
	
	
	
}
