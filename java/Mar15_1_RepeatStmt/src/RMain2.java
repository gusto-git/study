import java.util.Iterator;

// for �ȿ� for�� ��밡��
// ���� for �� = ��ø for �� 


public class RMain2 {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) { 
			System.out.printf("i�� : %d----\n",i); // 1�� ���� -> 2�� ����
			for (int j = 1; j < 6; j++) {
				System.out.printf("j�� : %d\n",j); // j�� 1~5���� ���� -> j�� 1~5���� ���� 
			}
		}
		System.out.println("----------------------------------");
		// ������ 2�� ���� 9�ܱ��� 
		
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d\n", i , j, i*j); //����� f11�� ���ؼ� �ݺ����� ����ϴ� ������ �� �� �ִ�.
			}
		}
		// ���� ���ʿ� �ִ� for���� �� ���ƾ� �ϳ� �ٱ��� �ִ� for���� ���� �� �� ����
		// 123 > 321 > 123 
		System.out.println("----------------------------------");	
//		2 x 1 = 2  3 x 1 = 3  4 x 1 = 4 ..... 9 x 1 = 9
//		2 x 2 = 4  3 x 2 = 6  4 x 2 = 8 ..... 9 x 2 = 18
		for (int i = 2; i <10; i++) {
			System.out.printf("<<%d��>>\t\t",i);
		}
		System.out.println();
		for (int i = 1; i < 10; i++) {
			for (int dan = 2; dan < 10; dan++) {
				System.out.printf("%d x %d = %d\t", dan , i, dan * i);
			}
			System.out.println();
		}
		
		
	}	
}
