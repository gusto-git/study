
public class FMain2 {
	// 정수 두개를 가져와서 그 중에 큰 숫자를 출력 해주는 함수 > 실행까지 가능하게
	// 가지고 온다는건 어떤 공간에서 가지고 온다. -> 넣는게 필요하다 2 or 4
	// 출력 해주고 끝난다 -> return 이 필요없다
	// 결론 : 2번 함수 
	
	
	public static void printBigger(int a, int b) { //-> 가지고올때 
		
		int bigNum = (a > b) ? a : b;
		System.out.println(bigNum);
	}
	
	// 4번함수 ) 실수 두개를 가져와서 그 중에 큰 숫자를 구해주는 함수
	 public static double getBigger(double a, double b) {
		 double bigNum = (a > b) ? a : b;
		 bigNum *= 1000; // 자료형 없이 변수만 사용 : 값을 변경
		 // a *= 10 >> a = a * 10 
		 return bigNum;
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		printBigger(20, 10);
		double bigNum = getBigger(1.2, 3.4);
		System.out.println(bigNum);
		Thread.sleep((int)bigNum); //형 변환 필요함 : sleep이 long이고 bignum은 double 이기 때문에 int로 변환해줌 
	}
}
