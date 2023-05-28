import java.util.Scanner;

public class KMain1 {
	public static void main(String[] args) throws InterruptedException {
		// Scanner : Java에 내장되어 있는 기능 중 하나!
		// 해당 기능을 이용하면 console에 입력이 가능해 진다.
		// 이 기능을 사용하려면 Import라는 것이 추가 됩니다.
		// sca + crtl + space
		
		// 조건하나 추가
		// new ~~ : 객체
		// Scanner는 화면(이클립스 콘솔창)으로 부터 데이터를 입력받는 기능 
		
		
		
//		Scanner keyboard = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);
		
		// 예제 이름 입력받기
		// 1. 입력받을 공간 만들어주기 >> syso
		System.out.print("이름 : "); // print 는 뒤에 써짐 , println 다음줄에 써짐
		// 2. 입력받은 내용(데이터) 변수에 담기 
		String name = keyboard.next(); // -> string은 next()
//		System.out.println(name); // 확인용
		// Console에 이름을 입력하고  enter를 치면 name이라는 변수에 콘솔에 입력한 이름이 저장이 된다.
		//////////////////////////////////////////////////////////////////////////////////////////////
		
		//나이 입력받기
		System.out.print("나이 : ");
		int age = keyboard.nextInt(); // ->int는 nextint()
//		System.out.println(age);
	
		// 키, 몸무게, 신발사이즈, 여행가고싶은 곳, 좋아하는 숫자
		// 지금 놀고싶은지 여부?
		
		System.out.print("키 : ");
		double cm = keyboard.nextDouble();
//		System.out.println(cm);
		
		System.out.print("몸무게 : ");
		int kg = keyboard.nextInt();
//		System.out.println(kg);
		
		System.out.print("신발사이즈 : ");
		int shoose = keyboard.nextInt();
//		System.out.println(shoose);
		
		System.out.print("여행가고 싶은 곳 : ");
		String place = keyboard.next();
//		System.out.println(place);
		
		System.out.print("좋아하는 숫자 : ");
		int num = keyboard.nextInt();
//		System.out.println(num);
		
		System.out.print("지금 놀고 싶은지 여부 : ");
		boolean play = keyboard.nextBoolean();
//		System.out.println(play);
		
//		강사님 답
		/*
	    System.out.print("키 : ");
	    double height = keyboard.nextDouble();
	    System.out.print("몸무게 :");
	    double weight = keyboard.nextDouble();
	    System.out.print("신발 사이즈 :");
	    int shoesSize = keyboard.nextInt();
	    System.out.print("여행가고 싶은 곳 : ");
	    String place1 = keyboard.next();
	    System.out.print("좋아하는 숫자 : ");
	    int num1 = keyboard.nextInt();
	    System.out.print("놀고 싶은지 여부 : ");
	    boolean wannaplay = keyboard.nextBoolean();
	    */
		
		//강사님이 쓴 확인법 
		System.out.println("=====================");
		System.out.printf("이름 : %s\n", name); //한글이 안읽힐 경우 font 문제이다. 이름을 name으로 변경
		System.out.println("나이 : " + age + "살"); // -> 이런식으로 해도 된다. +가 아니라 ,가 되면 에러남 
		System.out.printf("키 : %.1fcm\n", cm);
		System.out.printf("몸무게 : %dkg\n", kg);
		System.out.printf("신발사이즈 : %d cm\n", shoose);
		System.out.println("여행가고 싶은 곳 : " + place);
		System.out.printf("좋아하는 숫자 : %d\n", num);
//		System.out.print("놀고싶은가 ? "+ play + "\n");
		System.out.println("놀고싶은가 ? "+ play);
		System.out.println("=====================");
		
		// 예제) bat 파일 만들기
		// bat(배치파일) 하나 생성
		// '끄고 싶으면 아무거나 입력하세요'
		// 1초마다. 이 나오게 3번 반복시키고
		// 프로그램을 종료합니다 라는 문구가 출력되면서 0.5초 뒤에 프로그램이 종료되게 만들기
		
		System.out.println("끄고 싶으면 아무거나 입력하세요.");
		String quit = keyboard.next(); // 키보드 입력을 받기 위한 것
		keyboard.close(); // consle 입력 받는 기능 꺼짐
		// ...
		Thread.sleep(1000);
		System.out.print("."); //> println은 줄이 바껴서 print로 변경
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.println("."); // 다음 줄에 나와야해서 ln으로 변경
		
		System.out.println("프로그램을 종료합니다!");
		Thread.sleep(500);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    // int -> nextInt()
	    // String -> next()
	    // double -> nextDouble()
	    // boolean -> nextBoolean()
	
		
		
		
		
		
		
	}
}
