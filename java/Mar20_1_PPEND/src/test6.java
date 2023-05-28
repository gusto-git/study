import java.util.Scanner;

public class test6 {
	// 물건 가격 입력하는 함수
	public static int getPrice() {
		Scanner k = new Scanner(System.in);
		System.out.println("물건가격 : ");
		int price = k.nextInt();
		return price;
	}
	// 지불한 돈을 입력하는 함수
	public static int payMoney(int price) {
		Scanner k = new Scanner(System.in);
		System.out.println("낸 돈 :");
		int money = k.nextInt();
		if (price > money) {
			System.out.println("돈이 부족합니다.");
		}
		return (price < money)? money : payMoney(price);
	}
	// 거스름돈 계산
	public static int getChange(int price , int money) {
		return price - money;
	}
	// 위에 3개 출력
	public static void printResult(int price, int money, int Change) {
		System.out.println("-------------------------------");
		System.out.printf("물건 가격 : %d원\n", price);
		System.out.printf("내신 돈 : %d원\n", money);
		System.out.printf("잔 돈 : %d원\n", Change);
		System.out.println("-------------------------------");
	}
	// 거스름 돈을 화폐에 따라 어떻게 줄 것인지 - 2가지 방법
	//1. 배열을 이용한 방법
	public static void printChange(int change) {
		int[] currency = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		for (int i = 0; i < currency.length; i++) {
			System.out.printf("%,d원권 : %d개\n", currency[i], (change / currency[i]));
			change %= currency[i];
		}
	
	//2. 배열을 쓰지않는 방법 - 우리나라 화폐의 특성을 활용
    int currency2 = 100000;
    while (true) {
    	currency2 /= 2;
    	if (change >= currency2) {
			System.out.printf("%,d원권 : %d개\n", currency2, change / currency2);
			change %= currency2;
		}
    	if (currency2 == 10) {
			break;
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
