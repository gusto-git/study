
public class RMain3 {
	public static void main(String[] args) {
		// ���ǹ� + �ݺ��� 
		// 1 ~ 100���� ���� �� 6�� ����� ���� ���� ���
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 6 == 0) {
				sum += i; //6�� ����� �������� 
				System.out.println("��� ���� ���� : " + i);
				System.out.println("��ݱ��� ���� ���� �� : " + sum);
				System.out.println("*****************");
				
			}else {
				
			}
			
		}
		System.out.println("�� �� : " + sum);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		// 4x + 5y = 60�� �Ǵ� ��(����)�� ��� ���ؼ�
		// �� ���� (x,y)�� ���·� ��� 
		
		
		int z = 60;
		for (int x = 0; x < 11; x++) {
			for (int y = 0; y < 11; y++) {
				if (4 * x + 5 * y == 60) {
					System.out.printf("(%02d, %02d)\n", x,y);	
				}
			}
		}
		
		
	}
}
