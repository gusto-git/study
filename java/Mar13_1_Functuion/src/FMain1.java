import java.util.Scanner;

// �ɺθ� 
// 

public class FMain1 {
	// 1. ���� �� �濡�� ������ �ϰ� �ִµ� ������ �ɺθ��� ��Ų��.
	// 2. ������ �ɺθ� ��Ű�� ������ ����ϴ� �Լ�
	// �Լ� ���� : 1�� �Լ� 
	public static void mommySay() { //mommySay() > �Լ���
		System.out.println("�Ƶ�~");
		System.out.println("�����״ϱ�");
		System.out.println("���۰���");
		System.out.println("����̶�");
		System.out.println("�ݶ���");
		System.out.println("������ ������");
		System.out.println("------------------");
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	// ������ ���� �̴ּ� (�� = �Լ����� ���� �Է�)
	// ���� �ڿ� �ٸ� �Լ����� �Ž����� ����ؾ� ��! > ���� �� �ٸ� �Լ����� �� ����
	// �Լ� ���� : 3�� �Լ� 
	
	public static int takeMoney() { //-> return���� ���� void�� int�� �ٲ� ���Ͻ�ų �ڷ����� ��ġ ���Ѿ� �ϱ� ���� 
		Scanner k = new Scanner(System.in);
		System.out.print("������ �� �ݾ�: ");
		int money = k.nextInt();
		System.out.printf("������ %,d�� �̴ּ�!\n", money);
		System.out.println("======================");
		return money; 
	}
	
		// ����(int)�� ���� ���� main�Լ��� return(��ȯ)�� ���̹Ƿ� �Լ� ����� return  type ��ġ�� int�� ����
		// ���� return ��ų ������ �ڷ����� retun type���� �;���
		// return �Լ��� ������ �� �������� �ۼ��Ǿ� �Ѵ�. 
		// main �Լ��� ���� �� return �տ� �ڷ����� �־����
////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
	
	// �ɺθ��� �ϴ� ��...
	// ������ ��ǰ�� ������ Ȯ���ϰ�(�Լ� ������ ����)
	// ���� �������� ���� �� - ���� �� = ���µ� ������ ����'��'�� �� 
	// �Լ� ���� : 2�� 
	public static void thinking(int money) {
		int ramyeon = 1200;
		int cola = 2700;
		// money : �Ķ���ͷ� �ٸ� �Լ��� �ִ� ���� ������ �� �� 
		System.out.printf("�ɺθ��� �ϰ���... %,d�� ����..��\n", money - (ramyeon + cola));
		System.out.println("==================================");
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	// ����ϰ� �ܵ��� �������� ����..
	// �������� ���� �� - (��� + �ݶ� + �涥)
	// ���� �ݾ��� main �Լ��� ��ȯ 
	// �Լ� ���� : 4�� 	
	public static int calculate(int m) {
		int ramyeon = 1200;
		int cola = 2700;
		int  bbingddang = 500;
		
		int restMoney = m -(ramyeon + cola + bbingddang);
		return restMoney;
		
	}
	
	//main �Լ��� ������ ���� �Ұ���! 
	public static void main(String[] args) {
		mommySay();
		// return�� �ִ� �Լ��� main �Լ����� ���� �ȿ� ������ �ؾ���! 
		// �ٸ� �Լ����� ������ ��� �ϱ� ���� 
		int money = takeMoney();
		System.out.println(money);
		thinking(money); //return�� ������ �ڷ����� ���� �ʿ䰡����
		int rm = calculate(money);
		System.out.printf("�������� %,d�� ��ŭ �帰��." , rm);
	}
}
