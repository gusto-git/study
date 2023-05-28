import java.util.Scanner;

// �Ž����� ȯ���ϴ� ���α׷� 
// �Լ� ���
// <�Է�>
// ������ ���� ���� : 3500
// ���� �� �� : 5410
// ------
// �Ž����� : 1910
// 50000
// 10000
// 5000
// 1000 : 1��
// 500 : 1��
// 100 : 4��
// 50
// 10 : 1�� 
public class PMain4 {
	// ���� ���� �Է��ϴ� �Լ�
	public static int getPrice() {
		Scanner k = new Scanner(System.in);
		System.out.println("���ǰ��� : ");
		int price = k.nextInt();
		return price;
	}
	
	// ������ ���� �Է��ϴ� �Լ�
	public static int payMoney(int price) { // ���� ���ݺ��ٴ� ���� �����Ѵ�.
		Scanner k = new Scanner(System.in);
		System.out.println("�� �� :");
		int money = k.nextInt();
		if (money < price) {
			System.out.println("���� �����մϴ�. �ٽ� �Է��ϼ���");
		}
		return (money > price) ? money : payMoney(price);
	}
	
	// �Ž����� ���
	public static int getChange (int price, int money) {
		return money - price;
	}
	
	// ���� 3�� ���
	public static void printResult(int price, int money, int change) {
		System.out.println("======================");
		System.out.printf("���� ���� : %d��\n", price);
		System.out.printf("�� �� : %d��\n", money);
		System.out.printf("�Ž����� : %d��\n", change);
		System.out.println("======================");
	}
	
	// �Ž��� ���� ȭ�� ���� ��� �� ������ - 2���� ���
	public static void printChange(int change) { // �� : 22421���� ���� // 10000������ 22421�� ���� -> 2��, 2421������
		//1.															// 1000������ 2421�� ���� -> 2�� , 421�� ���� ... 10������
		//�츮���� ȭ�� ���� ��� �迭									// �������� ��� ������ ��
		int[] currency = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		for (int i = 0; i < currency.length; i++) {
			if (change >= currency[i]) { // �ʿ���� ȭ�� �ǳ� �ٵ��� 
				System.out.printf("%,d���� : %d��\n", currency[i], (change / currency[i]));
				// Java Ư¡ : int / int = int >> ������ �� �� ���� �� ����.
				change %= currency[i]; // change = change % currency[i]; // �������� change�� �ִ´�.
			}
		}
		//2.
		// �迭�� ��������
		int currency2 = 100000; //�ѱ� ������ Ư���� Ȱ���� ��
		while (true) {
			currency2 /= 2; // currency2 = currency2 / 2 -> 5������ �ȴ�. currency2��
			if (change >= currency2) {
				System.out.printf("%,d���� : %d��\n", currency2, change / currency2);
				change %= currency2;
			}
			currency2 /= 5; // 5�������� 1������ ��
			if (change >= currency2) {
				System.out.printf("%,d���� : %d��\n", currency2, change / currency2);
				change %= currency2;
			}
			if (currency2 == 10) {
				break; // 100,000 -> 50,000 -> 10,000 -> 5,000 -> 1,000 -> 500 -> 100 �� ������ if���� ���� �ȴ�. 
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
