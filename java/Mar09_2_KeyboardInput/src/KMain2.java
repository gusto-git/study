import java.util.Scanner;

public class KMain2 {

	public static void main(String[] args) {
		
		// 예제) 원 면적 계산
		// 반지름을 입력 받아서 원의 면적 계산
		// 반지름 x 반지름 x 3.14
		// 1. 원의 반지름 입력받기
		// 2. 원의 면적 계산
		// 3. sys로 원의 면적 : 000
	
		/*
		Scanner k = new Scanner(System.in);  // 키보드로 입력받을 것이다. 
		System.out.print("원의 반지름 : ");  // 입력받을 장소 제공 
		double radius = k.nextDouble();      // 키보드로 받을 변수 선언 (k의 형태(정수, 실수, 문자 등) 
		double area = (3.14 * radius * radius); // 변수 선언(계산식)
		double area2 = (Math.PI * Math.pow(radius, 2)); // 변수 선언(계산식)
		System.out.println(area); // 정답 출력 
		System.out.printf("원의 반지름은 %.1f이고, 원의 면적은 %.2f", radius, area); // 정답 출력 
		*/
		
//		System.out.printf("원의 면적 : %.2f * %.2f * 3.14", pie, pie);
		
		//강사님 답
		// Scanner k = new Scanner(System.in);
		// double radius = k.netDouble();
		// double area = (3.14 * radius * raidus);
		// System.out.println(area);
		// System.out.printf("원의 반지름은 %.1f이고, 원의 면적은 %.2f", radius, area);
		//////////////////////////////////////////////////////////////////////////////////
		
		// 예제) 사각형 면적 구하기
		// 가로 * 세로
		// 사각형 면적은 12 입니다
		
		
		Scanner s = new Scanner(System.in); // 위에 k로 Scanner를 해놨기 때문에 또할 필요 ㅇ벗다
		/*
		System.out.print("사각형의 세로 : ");
		int q = s.nextInt();
		System.out.print("사각형의 가로 : ");
		int p = s.nextInt();
		
		int area3 = ( q * p);
		System.out.printf("사각형 면적은 %2d 입니다", area3);
		*/  //드래그 + ctrl + / 
		
		//강사님 답
		/*
		System.out.print("가로 :");
		double width = k.nextDouble();
		System.out.print("세로 :");
		double height = k.nextDouble();
		double area = width * height;
		System.out.printf("면적 : %.2f\n", area); >> area 대신 그냥 width * height 로 끝내도 된다. 
													그러면 변수 한줄이 사라진다.
		*/
		
		// 예제 
		// 초를 입력받아서 분 , 시간 단위로 변환해서 출력
		// 600 > 분 : 10분 > 시 : 
		
		System.out.print("입력할 초 : "); //> 초 입력받는 공간
		int second = s.nextInt();
		double min = second / 60.0; // 60.0이 필수다 . second 가 int 이기 때문에 60으로 나누면 int/int가 되서 오류
		double hour = min / 60;  // sencond / 3600도 가능
		System.out.printf("[%d]초는 [%.4f]분이고, ", second, min);
		System.out.printf("[%d]초는 [%.4f]시간이다, ", second, hour);
		// int / int = double x ? 무조건 int로 받아야함
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
