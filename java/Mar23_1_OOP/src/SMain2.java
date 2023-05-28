import java.util.Calendar;

public class SMain2 {
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		c.sum(10, 20); // static o > 실행은 가능하나 권장하지  x
		c.sum(10, 20, 30);  // static x
		
		//
		Calculator.sum(10, 20); // static o > 메모리 덜쓰고 해결 -> 굳이 c.sum이라고 쓸 필요가없다는 의미 
//		Calculator.sum(10, 20, 30);// static x
		
		// math 라는 java 내장 클래스
		// 객체를 만들지 않고 사용한 경우
		// static 영역에 이미 저장되어있는 내장 클래스라서 static을 쓰지않고 바로 쓸수있다.
		System.out.println(Math.PI);
		double s = Math.sqrt(10); // 제곱근 구하는 법 
		System.out.println(s);
		
		// 강의 영상 다시봐야할듯 sum 두자리와 세자리 차이 구분이안됨
	}
}
