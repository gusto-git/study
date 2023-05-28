import java.io.Console;
import java.util.Scanner;

public class OMain1 {
	public static void main(String[] args) {
		// 자료형 변수명 = 값 
		// = (대입연산자)
		// A = B  프로그래밍적으로 보면 B에 있는 것(값)을 A에 담아라
		// 다시 말하면, 우항에 있는 것을 좌항에 담아라 
		
		// 예제)
		// x, y 값을 console로 입력 받아서
		// 각각 변수에 담아서 
		// x는 10 , y는 20
		
		Scanner k = new Scanner(System.in);
		System.out.print("x의 값은 ? ");
		double x = k.nextDouble();
		System.out.print("y의 값은 ? ");
		double y = k.nextDouble();
		System.out.printf("x는 %.1f , y는 %.1f\n", x, y);
		
		// 변수 끼리의 사칙 연산 
		// 각각 변수에 담아서 출력 
		System.out.printf("%.1f + %.1f = %.1f\n", x , y, x+y);
		System.out.printf("%.1f - %.1f = %.1f\n", x , y, x-y);
		System.out.printf("%.1f * %.1f = %.1f\n", x , y, x*y);
		System.out.printf("%.1f / %.1f = %.1f\n", x , y, x/y);
		
		/*
	    강사님 답
		int plus = x + y ;
		int minus = x - y ;
		int multiply = x * y ;
		int divide = x / y ;
		
		
		System.out.printf("%d + %d = %d\n", x ,y ,plus);
		System.out.printf("%d - %d = %d\n", x ,y ,minus);
		System.out.printf("%d * %d = %d\n", x ,y ,multiply);
		System.out.printf("%d / %d = %d\n", x ,y ,divide);
		*/
		
		// Java 한정 : int / int = int (Java 한정) 10 / 4 = 2.5 -> Java는 2로 나옴(나머지를 버림)
		// int / double = double
		// double / int = double
		// double / double = double
		
		double divide2 = x / (double)y; // 형변환, 자료형을 임의로 변경 int > double로 변경
		System.out.println(divide2);
		// + = * / %
		// % : 나눗셈이긴 한데 나머지 값을 알려줌
		double remainder = x % y;
		System.out.println(remainder); // x = 10 , y = 4 일때 x/y = 2.5 x%y = 2(나머지값) + 8 = 10
		
		// 다시 한번 리마인드
		// A = B 는 같다 라는 뜻이 아니고 < A에 B를 넣어라>
		int a = 10;
		int b = 5;
		System.out.println("a는 " + a); // 10
		System.out.println("b는 " + b); // 5
		a = b; // 10 =5 >> 틀린 답 , 하지만 = 는  우항을 좌항에 넣어라라는 뜻
		
		System.out.println("a는 " + a); // 5
		System.out.println("b는 " + b); // 5
		//////////////////////////////////////////////////////////////////////////////////////////
		
		// tip 한글자 2byte < 귀찮아서 한그자라도 덜치게 하는 방법
		// +=, -=, *=, /=, %=
		a = a +1 ;
		System.out.println(a); // 6
		a += 1 ; // a = a + 1 같은 말이다.
		b-= 1; // b = b - 1 같은 말
		a *= 2; // a = a * 2 
		b /= 2; // b = b / 2
		a %= 2; // a = a % 2; 
		
		///////////////////////////////////////////////////////////////////////////////////////
		//// 한번 더  줄이기
		//// ++ , --
		a++; //a += 1 ; // a = a + 1;
		a--; // a-= 1 ; // a = a - 1; 
		
		
		
		
		
		
	}
}
