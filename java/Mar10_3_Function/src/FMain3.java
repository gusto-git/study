
public class FMain3 {
	public static void test(int q) { //q(blue) : 파라미터 
		// 이미 test가 호출된 이상 이쪽 내용이 전부 끝나야 main으로 돌아 갈 수 있음
		System.out.println(q); // 10 //q(blue)
		q = 20; // 변수값 변경 -> main에 영향을 주지않는다. 
		System.out.println(q); // 20 //q(blue)
	}
	public static void main(String[] args) {
	int q = 10;			   // q(red)
	System.out.println(q); // 10 q(red)
	test(q);//파라미터	   // test 함수 호출, q(blue)변수 생성
						   // q(blue)에 q(red)에 있는 값 복사
	System.out.println(q); // 10 q(red)
	
	// tip 
	// main 부터 읽고 test부분을 읽어라 
	
	
	
	
	
	
	}
}
