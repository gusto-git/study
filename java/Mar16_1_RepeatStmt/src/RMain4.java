import java.util.Iterator;
import java.util.Random;

import javax.naming.ReferralException;

public class RMain4 {
	public static void main(String[] args) {
		// 1~10까지 랜덤한 숫자를 5번 뽑아보기 
		// 같은 숫자 5번 출력  x , 랜덤을 5번 뽑기
		
		
		Random r = new Random();
		int x = 0; // x를 먼저 선언하고나서  반복문 아래에서 x를 뽑기! ! ! !
		for (int i = 0; i < 5; i++) {
			 x = r.nextInt(10)+1;
			System.out.println(x);
		}
		System.out.println("==========");
		
		// 1~10랜덤한 정수 출력 
		// 9가 나오면 반복문 종료
		for (int i = 0; true; i++) {
			x = r.nextInt(10)+1;
				System.out.println(x);
			 if (x == 9) {
				break;	
			}
			 System.out.println(x);
		}
		System.out.println("====");
		
		/////////////////////////////
		// for : 반복 횟수가 명확할때 사용
		// while : 반복 조건이 명확하지 않을 때 
		//			특정 조건에서 멈춰야 하는 경우 
//		while (조건식) {
//			내용
//		}
		// while : 조건을 먼저 검사하고 조건이 true(참)인 동안에는 계속 반복하면서 내용 부분 실행
		//         실행부분에서 조건을  false(거짓)으로 만들어서 멈추게 하거나
		//			break; 명령어로 반복문 종료가 가능
		//			조건식에 조건이 맞지 않으면 반복하던 작업 중지 가능
		//          무한대로 반복하고 싶다면 while(true) 사용!
	
		int y = 0;
		while (true) {
			y = r.nextInt(10)+1;
			System.out.println(y);
			if (y == 9) {
				break;
			}
		}
		
		System.out.println("---------------");
		int z = 0;
		while (z !=9) {
			z = r.nextInt(10)+1;
			System.out.println(z);
		}
		System.out.println("--------231-------");
		int y3 = r.nextInt(10)+1;
		while (y3 != 9) {
			System.out.println(y3);
			y3 = r.nextInt(10)+1;
		}
		// do-while 문 : 실행부터 하고 조건을 나중에 검사하는 것 (거의 안씀)
		// 왜냐하면 do-while문을 쓸거면 for문을 쓰면되기 때문
		// 일단은 무조건 한번은 반복이 보장 
		
		// q를 반복해서 더하는데 그 값이 100이 넘으면 종료 
		System.out.println("--------1-------");
		
		int q = 1;
		while (true) {
			q += q;
			if (q>=100) {
				break;
				
			}
			System.out.println(q);
		    
		}
		System.out.println("=================");
		System.out.println(q);
		System.out.println("=================");
		/////////////////////////////////////////////////////////////////////////
		int num = 0;
		int sum = 0;
		while (sum < 100) {
			num++;
			System.out.println("num : " +num);
			sum += num;
			System.out.println("sum : " +sum);
		}
		System.out.println("n의 값 : " + num);
		System.out.println("총 합 : " + sum);
		
		System.out.println("++++++++++++++++++++++++++");
		
		// 1000 이하의 수 중에서 가장 큰 15의 배수 >???
		
		int num2 = 1000;
		while (num2 % 15 > 0) { //1000으로 들어오지만, num2--가 바로 반응해서 999부터 나온다. 
			num2--; //num2를 1씩 줄여라
			System.out.println(num2);	
		}
				
		
		
		
		
		
		
		
		
	}
}
