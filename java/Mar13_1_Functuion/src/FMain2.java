
public class FMain2 {
	// ���� �ΰ��� �����ͼ� �� �߿� ū ���ڸ� ��� ���ִ� �Լ� > ������� �����ϰ�
	// ������ �´ٴ°� � �������� ������ �´�. -> �ִ°� �ʿ��ϴ� 2 or 4
	// ��� ���ְ� ������ -> return �� �ʿ����
	// ��� : 2�� �Լ� 
	
	
	public static void printBigger(int a, int b) { //-> ������ö� 
		
		int bigNum = (a > b) ? a : b;
		System.out.println(bigNum);
	}
	
	// 4���Լ� ) �Ǽ� �ΰ��� �����ͼ� �� �߿� ū ���ڸ� �����ִ� �Լ�
	 public static double getBigger(double a, double b) {
		 double bigNum = (a > b) ? a : b;
		 bigNum *= 1000; // �ڷ��� ���� ������ ��� : ���� ����
		 // a *= 10 >> a = a * 10 
		 return bigNum;
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		printBigger(20, 10);
		double bigNum = getBigger(1.2, 3.4);
		System.out.println(bigNum);
		Thread.sleep((int)bigNum); //�� ��ȯ �ʿ��� : sleep�� long�̰� bignum�� double �̱� ������ int�� ��ȯ���� 
	}
}
