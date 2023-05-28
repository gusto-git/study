import java.util.Iterator;

// for 안에 for문 사용가능
// 이중 for 문 = 중첩 for 문 


public class RMain2 {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) { 
			System.out.printf("i값 : %d----\n",i); // 1번 돌고 -> 2번 돌고
			for (int j = 1; j < 6; j++) {
				System.out.printf("j값 : %d\n",j); // j값 1~5까지 돌고 -> j값 1~5까지 돌고 
			}
		}
		System.out.println("----------------------------------");
		// 구구단 2단 부터 9단까지 
		
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d\n", i , j, i*j); //디버그 f11를 통해서 반복문이 사용하는 과정을 볼 수 있다.
			}
		}
		// 가장 안쪽에 있는 for문이 다 돌아야 하나 바깥에 있는 for문이 돌아 갈 수 있음
		// 123 > 321 > 123 
		System.out.println("----------------------------------");	
//		2 x 1 = 2  3 x 1 = 3  4 x 1 = 4 ..... 9 x 1 = 9
//		2 x 2 = 4  3 x 2 = 6  4 x 2 = 8 ..... 9 x 2 = 18
		for (int i = 2; i <10; i++) {
			System.out.printf("<<%d단>>\t\t",i);
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
