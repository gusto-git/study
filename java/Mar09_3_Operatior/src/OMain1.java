import java.io.Console;
import java.util.Scanner;

public class OMain1 {
	public static void main(String[] args) {
		// �ڷ��� ������ = �� 
		// = (���Կ�����)
		// A = B  ���α׷��������� ���� B�� �ִ� ��(��)�� A�� ��ƶ�
		// �ٽ� ���ϸ�, ���׿� �ִ� ���� ���׿� ��ƶ� 
		
		// ����)
		// x, y ���� console�� �Է� �޾Ƽ�
		// ���� ������ ��Ƽ� 
		// x�� 10 , y�� 20
		
		Scanner k = new Scanner(System.in);
		System.out.print("x�� ���� ? ");
		double x = k.nextDouble();
		System.out.print("y�� ���� ? ");
		double y = k.nextDouble();
		System.out.printf("x�� %.1f , y�� %.1f\n", x, y);
		
		// ���� ������ ��Ģ ���� 
		// ���� ������ ��Ƽ� ��� 
		System.out.printf("%.1f + %.1f = %.1f\n", x , y, x+y);
		System.out.printf("%.1f - %.1f = %.1f\n", x , y, x-y);
		System.out.printf("%.1f * %.1f = %.1f\n", x , y, x*y);
		System.out.printf("%.1f / %.1f = %.1f\n", x , y, x/y);
		
		/*
	    ����� ��
		int plus = x + y ;
		int minus = x - y ;
		int multiply = x * y ;
		int divide = x / y ;
		
		
		System.out.printf("%d + %d = %d\n", x ,y ,plus);
		System.out.printf("%d - %d = %d\n", x ,y ,minus);
		System.out.printf("%d * %d = %d\n", x ,y ,multiply);
		System.out.printf("%d / %d = %d\n", x ,y ,divide);
		*/
		
		// Java ���� : int / int = int (Java ����) 10 / 4 = 2.5 -> Java�� 2�� ����(�������� ����)
		// int / double = double
		// double / int = double
		// double / double = double
		
		double divide2 = x / (double)y; // ����ȯ, �ڷ����� ���Ƿ� ���� int > double�� ����
		System.out.println(divide2);
		// + = * / %
		// % : �������̱� �ѵ� ������ ���� �˷���
		double remainder = x % y;
		System.out.println(remainder); // x = 10 , y = 4 �϶� x/y = 2.5 x%y = 2(��������) + 8 = 10
		
		// �ٽ� �ѹ� �����ε�
		// A = B �� ���� ��� ���� �ƴϰ� < A�� B�� �־��>
		int a = 10;
		int b = 5;
		System.out.println("a�� " + a); // 10
		System.out.println("b�� " + b); // 5
		a = b; // 10 =5 >> Ʋ�� �� , ������ = ��  ������ ���׿� �־���� ��
		
		System.out.println("a�� " + a); // 5
		System.out.println("b�� " + b); // 5
		//////////////////////////////////////////////////////////////////////////////////////////
		
		// tip �ѱ��� 2byte < �����Ƽ� �ѱ��ڶ� ��ġ�� �ϴ� ���
		// +=, -=, *=, /=, %=
		a = a +1 ;
		System.out.println(a); // 6
		a += 1 ; // a = a + 1 ���� ���̴�.
		b-= 1; // b = b - 1 ���� ��
		a *= 2; // a = a * 2 
		b /= 2; // b = b / 2
		a %= 2; // a = a % 2; 
		
		///////////////////////////////////////////////////////////////////////////////////////
		//// �ѹ� ��  ���̱�
		//// ++ , --
		a++; //a += 1 ; // a = a + 1;
		a--; // a-= 1 ; // a = a - 1; 
		
		
		
		
		
		
	}
}
