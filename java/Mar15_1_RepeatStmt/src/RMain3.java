// 별찍기
public class RMain3 {
	public static void main(String[] args) {
		// ㅋ
		// ㅋㅋ
		// ㅋㅋㅋ
		// ㅋㅋㅋㅋ
		// ㅋㅋㅋㅋㅋ
		
		for (int i = 1; i < 6; i++) {//1  // 2 
			for (int j = 1; j <= i; j++) { //1,2 // 1,2,3
				System.out.print("ㅋ"); // ㅋ을 for에 맞춰서 내라 
			}
			System.out.println();
		}
		System.out.println("========1=======");// i와 j가 같을 때만 가능 그것보다 작으면 빈칸으로 나와야함.
		for (int i = 1; i < 6; i++) {  
			for (int j = 1; j <= i; j++) {  
				if(j == i) {
					System.out.println("ㅋ");
				}else {
					System.out.print(" ");
				}
			} 	
		}
		
		System.out.println("========2=======");
		// 두번째
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((i == j)? "ㅋ" : " ");
			}
			System.out.println(" ");
		}
		
		System.out.println("========3=======");
		// 세번째
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("  "); // j가 i보다 작은 공간은 띄어쓰기로 
			}
			
			System.out.println("ㅋ");
		}
		System.out.println("========팁=======");
		int x = 15;
//		System.out.println(x++);// x에 1을 더해라  x먼저 표현하고 그 뒤에 + 1
//		System.out.println(x++);// 한번 더해야 1을 더해준다 .
		System.out.println(++x);// 을 해야지 바로 1을 더해준다. 더하기 1을 한 x
		
	
		System.out.println("========4=======");
		for (int i = 5; i >= 1; i--) { // 점점 준다  
			for (int j = 1; j <= i; j++) { //
//				System.out.print((i % 2 == 1 ? "ㅋ" : "ㅎ"));
				if (i % 2 == 1) {
					System.out.print("ㅋ");
				} else {
					System.out.print("ㅎ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("========5=======");
		for (int i = 1; i < 6; i++) { 
			for (int j = 6; 1 <= j-i; j--) { 
				System.out.print((i % 2 == 1 ? "ㅋ" : "ㅎ"));
			}
			System.out.println();
		}
		
		System.out.println("========6=======");
		for (int i = 1; i < 6; i++) {  // 1 -> 6
			for (int j = 1; j <= (6 - i); j++) {  // 1 < = 6-1 
				System.out.print((i % 2 == 1 ? "ㅋ" : "ㅎ"));
			}
			System.out.println();
		}
		
		// 숙제 //
		//ㅋ
		//ㅎㅎㅎ
		//ㅋㅋㅋㅋㅋ
		//ㅎㅎㅎㅎㅎㅎㅎ
		//ㅋㅋㅋㅋㅋㅋㅋㅋㅋ
		
		// 숙제 //
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		
		
		
		//main///////////////////////////////////////////////////////
	}

}