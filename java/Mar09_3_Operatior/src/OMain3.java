import java.util.Scanner;

import org.omg.CosNaming._NamingContextExtStub;

// 논리 연산자
// 결과가 true, false >> boolean
//  >(초과), >=(이상) , ==(같다), !=(다르다), <(미만), <=(이하)

public class OMain3 {
	public static void main(String[] args) {
		// 놀이 공원에서 놀이기구를 타도 되는지를 판단해주는 프로그램
		// 키(소수점, cm), 나이를 입력받는 프로그램
		// 키는 000cm이고 나이는 00살 << 이 출력되게
		
		Scanner k = new Scanner(System.in);
		System.out.print("키 : ");
		double cm = k.nextDouble();
		//double height = k.nextDouble(); > 강사님 답
		System.out.print("나이 : ");
		int age = k.nextInt();
		System.out.println("============================");
		System.out.printf("키는 %.1fcm이고 나이는 %2d살\n", cm, age);
		
		// 예제) 나이가 10살이 넘는 사람만 탈 수 있는 놀이기구
		boolean ride1 = (age > 10);
		System.out.printf("ride1 탑승가능? : %b\n", ride1);
		
		// 예제) 나이가 5살 미만만 탈 수 있는 놀이기구
		boolean ride2 = (age < 5);
		System.out.printf("ride2 탑승가능? : %b\n", ride2);
		// boolean ride2 = (age < 5); > 강사님 답
		
		// 예제) 나이가 10살만 아니면 탈 수 있는 놀이기구
		boolean ride3 = (age != 10);
		System.out.printf("ride3 탑승가능? : %b\n", ride3);
		// boolean ride3 = (age != 5); > 강사님 답
		
		// 예제) 나이가 홀 수인 사람만 탈 수 있는 %활용
		boolean ride4 = (age % 2 != 0); // 2로 나눈 나머지가 0일 때 
		System.out.printf("ride4 탑승가능? : %b\n", ride4);
		// boolean ride4 = (age % 2  == 1); > 강사님 답 2로 나눈 나머지가 1일 때 
		
		
	}
}
