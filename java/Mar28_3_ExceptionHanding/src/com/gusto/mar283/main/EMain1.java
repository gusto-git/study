package com.gusto.mar283.main;
import java.util.Scanner;

public class EMain1 {
	
		// 프로그램 실행 -> 콘솔창에 빨간 글씨로 ~~~ 나오는걸 -> 에러 / 버그 / 오류알림 / 경고문 ??
		
		// error
		// 		한국어  - 번역 - 영어
		//  	사과             apple
		// 		바나나            banana
		// 		띱퀭              ?? 
		// 		Java 문법에 맞지 않게 써서 Compile이 불가능한 상태
		//      개발자의 잘못!
		
		// warning
		//		문법이 틀린 건 아니나, 코드가 지저분하다
		//		개발자가 잘못!
		//  	컴파일은 가능 , 완성본(결과)이 나오긴함 -> 실행은 가능하다.
		//  	IDE(이클립스)가 잔소리를 좀 함 
		//  	EX) Scanner 객체를 만들고 나서 -> 기능을 닫아야함(k.close();) -> 노란줄로 표시함
		
		// exception
		// 		프로그램 자체는 100% 완성
		// 		실행할 때 뭔가 외부적인 요인에 의해서 작동이 제대로 되지 않는 상황
		//      개발자 잘못은 아님
		//		개발자 입장 -> 개발자가 상황을 예측해서 대책을 세워놓자...
	
	
	public static void main(String[] args) {
		// x값, y값 입력받아서
		// 사칙연산(정수로만) 값을 출력
		
		Scanner k = new Scanner(System.in);
		System.out.print("x : ");
		int x = k.nextInt();
		
		System.out.print("y : ");
		int y = k.nextInt();
		
		System.out.println(x+y);
		System.out.println(x-y); 
		System.out.println(x*y);
//		System.out.println(x/y); /0 을 쓰면 exception이 표시 된다.
		
		
		// 만약에 두가지 문제가 동시에 터진경우..? -> 먼저 나온 catch내용만 출력이 된다.
		// 	java 입장 : 첫번째 예외가 터졌을 때, 즉시 실행 중지 후 해당 예외처리 부분으로 넘어가기 때문
		
		// x: 10 , y: 0 => 56번 try -> 57번 x/y -> 61번 -> 62번 syso -> 
		// x: 10 , y: 1 => 56번 try -> 57번 x/y -> 59번 -> 63번 -> 64번 syso ->
		// x: 2 , y : 1 => 56번 try -> 57번 x/y -> 59번 -> 60번 syso -> 
		
		
//		try {
//			int d = x / y;
////			System.out.println(d); 
//			int[] ar = {1,2,3};
//			System.out.println(ar[d]);
//		} catch (ArithmeticException ae) { 만약에 y에 0을 넣으면 ..? ArithmeticException : 예외 유형명 복사 해놓은 것 
//			System.out.println("0으로 어떻게 나눠!!");
//		} catch (IndexOutOfBoundsException e) { IndexOutOfBoundsException : 배열에 벗어난 범위 
//			System.out.println("아 배열에 해당하는 index가 없다고");
//		}
		
		try {
			int d = x / y;
			int[] ar = {1,2,3};
			System.out.println(ar[d]);
		} catch (Exception e) { // 모~든 exception을 다 잡아줌 , 어떤게 문제인지 알 수 없다. , 보통은  이걸 쓴다 
			System.out.println("안되니?");
			e.printStackTrace(); // 상황출력 (개발자용)
		} finally {
			System.out.println("여긴 무조건 실행된다 ㅋㅋㅋ ");
		}
	}
}

// Exception 처리방법 :  try catch 자동완성
//try {
//		// 일단 이 부분을 실행 - (내용)
//	} catch (예외유형명 변수명) {
//		try 쪽을 실행하다가 해당 유형의 예외가 발생하면 이 부분 실행
//		만약에 try가 정상적으로 실행이 됐다면, catch부분은 그냥 지나치고 다음 소스를 진행한다.
//	} catch (Exception e) {
//		// TODO: handle exception
//	} finally {
//		정상적으로 프로그램이 실행 됐던지, 예외가 터졌던지 상관없이 진행한다. -> return보다 우선적으로 실행한다.
//	}
	
	