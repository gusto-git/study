// static > 적재적소에 사용할 수 있어야
// ㄴ 이걸 다루는거 자체가 고급기술이다.

class Number{
	static int num = 0; // static 맴버 변수 : 객체들의 공통속성
	int num2 = 0;
}




public class SMain3 {

	public static void main(String[] args) {
		Number number1 = new Number();
		Number number2 = new Number();
		
		number1.num++;
		number1.num2++;
		
		System.out.println(number2.num);  // 1 -static o -> 값 공유가 가능하다.
		System.out.println(number2.num2); // 0 -static x
		
		System.out.println(number1.num);  // 1 -static o 
		System.out.println(number1.num2); // 1 -static o
	}
	
}
