import java.util.Iterator;

public class RMain2 {
	public static void main(String[] args) throws InterruptedException {
		// �ʽð�
		// ����(31�ϱ���)�� �� �� 
		// 1�ʸ��� ���� ���� 
		// [Day01] 00:00:01 <- ���� �� 1�� �� �ܼ�â
		// [Day01] 00:00:02 <- ���� �� 2�� �� �ܼ�â
	
		
		
		for (int day = 0; day < 31; day++) {
			for (int hour = 0; hour < 24; hour++) {
				for (int min = 0; min < 60; min++) {
					for (int sec = 0; sec < 60; sec++) {
						System.out.printf("[Day%02d]%02d:%02d:%02d\n",day,hour,min,sec);
						Thread.sleep(1000);
					}	
				}
			}
		}
	
		
	
				
				
				
	}
	
}

