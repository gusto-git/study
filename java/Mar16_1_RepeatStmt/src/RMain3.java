
public class RMain3 {
	public static void main(String[] args) {
		// 조건문 + 반복문 
		// 1 ~ 100까지 정수 중 6의 배수만 더한 값을 출력
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 6 == 0) {
				sum += i; //6의 배수만 더해지게 
				System.out.println("방금 더한 숫자 : " + i);
				System.out.println("방금까지 더한 수의 합 : " + sum);
				System.out.println("*****************");
				
			}else {
				
			}
			
		}
		System.out.println("총 합 : " + sum);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		// 4x + 5y = 60이 되는 해(정수)를 모두 구해서
		// 그 값이 (x,y)의 형태로 출력 
		
		
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
