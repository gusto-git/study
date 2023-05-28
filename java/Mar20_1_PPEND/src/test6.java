import java.util.Scanner;

public class test6 {
	// ���� ���� �Է��ϴ� �Լ�
	public static int getPrice() {
		Scanner k = new Scanner(System.in);
		System.out.println("���ǰ��� : ");
		int price = k.nextInt();
		return price;
	}
	// ������ ���� �Է��ϴ� �Լ�
	public static int payMoney(int price) {
		Scanner k = new Scanner(System.in);
		System.out.println("�� �� :");
		int money = k.nextInt();
		if (price > money) {
			System.out.println("���� �����մϴ�.");
		}
		return (price < money)? money : payMoney(price);
	}
	// �Ž����� ���
	public static int getChange(int price , int money) {
		return price - money;
	}
	// ���� 3�� ���
	public static void printResult(int price, int money, int Change) {
		System.out.println("-------------------------------");
		System.out.printf("���� ���� : %d��\n", price);
		System.out.printf("���� �� : %d��\n", money);
		System.out.printf("�� �� : %d��\n", Change);
		System.out.println("-------------------------------");
	}
	// �Ž��� ���� ȭ�� ���� ��� �� ������ - 2���� ���
	//1. �迭�� �̿��� ���
	public static void printChange(int change) {
		int[] currency = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		for (int i = 0; i < currency.length; i++) {
			System.out.printf("%,d���� : %d��\n", currency[i], (change / currency[i]));
			change %= currency[i];
		}
	
	//2. �迭�� �����ʴ� ��� - �츮���� ȭ���� Ư���� Ȱ��
    int currency2 = 100000;
    while (true) {
    	currency2 /= 2;
    	if (change >= currency2) {
			System.out.printf("%,d���� : %d��\n", currency2, change / currency2);
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
