// 단골 면접 문제
// Call By Value, Call By Reference

// Call By Vaule 	 : 변수의 '값'을 복사해서 함수의 파라미터 값으로 사용하는 것
// Call By Reference : 변수를 참조하는 번지값(주소값)을 파라미터로 전달하는 것 
public class PMain5 {
	public static void test(int a, int[] b, int[] c) {
		System.out.println("b(gree)"+b); // 주소값
		System.out.println("c(gree)"+c); // 주소값
		System.out.println("a(gree)"+a); // 주소값
		System.out.println(b[0] + "b(green)");
		System.out.println(c[0] + "c(green)");
		System.out.println("===============");
		a = 100; // main 영향 x 
		b[0] = 100; // 요소 하나만 바꿈, main 쪽에 영향 줌 (참조형) -> 기본형과 참조형의 차이 
		c = new int[] {100, 200}; // 새 배열을 넣은 것  -> 영향  x -> 말 그대로 새로운 수가 된다. c != new c 같지 않다.  
								  // 배열 전체를 바꾸려면 new int[]가 꼭 붙어야 한다.
								  // 약식을 못쓰는 이유 : 정규식(new int[])이 아니라서 
		
		System.out.println("b(gree)"+b); // 복사된 주소값
		System.out.println("c(gree)"+c); // 새로운 주소값
		System.out.println("a(gree)"+a); // 100
		System.out.println(b[0] + "b(green)"); // 100
		System.out.println(c[0] + "c(green)"); // 100
		
	}
	public static void main(String[] args) {
		int a = 10; // 바로 stack에 쌓임 
		int[] b = {10,20};
		int[] c = {10,20};
		
		System.out.println("b(red)"+ b); // 참조형이라 번지값이나옴
		System.out.println("c(red)"+ c) ;// 참조형이라 번지값이나옴
		System.out.println("--------------------") ;
		test(a, b, c);
		System.out.println("--------------------") ;
		System.out.println(a + "a(red)"); // 10 -> 값 변경안됨
		System.out.println(b[0] + "b(red)"); // 100 -> 값 변경 됨
		System.out.println(c[0] +"c(red)"); // 10 -> 값 변경 안됨
								  // test 함수의 변경된 c랑은 다른거라서 (주소값이 달라서 다른 수로 취급함)
		
		// 다른 함수에서 배열에 있는 값 전체를 바꾸면
		// main 함수에서 바꾼 값이 나와야 함 -> call by reference
		// Java는 값 전체를 바꾸면 영향을 받지 않음 : Java 는 call by value 밖에 없다. 
		// 값이 복사해서 오는건 가능하나 값을 전체를 변경해서 불러오는건 불가능하다. *********
	}

}


//		 stack    		heap(순서가 정해져 있지 않음)
//      	      		#7 10,20으로 저장(b)
//				  		#3 10,20으로 저장(c)
//				 		#4 100,200으로 저장 (c)
//				
//				  
//				  
//				  
// 	green c   #3 -> #4 변경 (main) 영향 주지 않음
// 	green b   #7
// 	green a   100
// 	red   c   #3
// 	red 	 b   #7
// 	red 	 a   10