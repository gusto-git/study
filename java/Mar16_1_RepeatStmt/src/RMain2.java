import java.util.Iterator;

public class RMain2 {
	public static void main(String[] args) throws InterruptedException {
		// 초시계
		// 일자(31일기준)시 분 초 
		// 1초마다 값이 증가 
		// [Day01] 00:00:01 <- 실행 후 1초 뒤 콘솔창
		// [Day01] 00:00:02 <- 실행 후 2초 뒤 콘솔창
	
		
		
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

