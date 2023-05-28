import java.util.Scanner;

public class CMain6 {
	// 1년 = 12달
	// 각 달마다 며칠이 있는지 
	// 월을 입력받아서
	// 31일 까지 있습니다. 30월 까지 있습니다. 28일까지 있습니다.
	// 14> 없는달입니다.
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("달 :");
		int month = k.nextInt();
		int day = 0; // 만든 변수를 조건문 밖에서 사용할 때 활용을 할 수가 없음
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			System.out.printf("%d월은 %d일 까지 있습니다.\n", month, day);
			break;
			
		case 4: case 6: case 9: case 11:
			day = 30;
			System.out.printf("%d월은 %d일 까지 있습니다.\n", month, day);
			break;
		case 2:
			day = 28;
			System.out.printf("%d월은 %d일 까지 있습니다.\n", month, day);
			break;	
			
		default:
			System.out.printf("%d월은 없는 달입니다.", month);
			break;
		}
		
		
		
		
	}
}
