import java.util.Scanner;

public class OMain4 {
	public static void main(String[] args) {
		// 이름을 console에서 입력받을 것
		// 그 이름이 '홍길동'과 같은지 여부 (true / false)
		/*	
		Scanner k = new Scanner(System.in);
		System.out.print("이름 :");
		String name = k.next();
		
		String r = name == "홍길동" ? "true" : "false";
		System.out.println(r);
		*/
		
		Scanner k = new Scanner(System.in);
		System.out.print("이름 : ");		
		String name = k.next();
//		boolean a = (name == "홍길동");
//		// '홍길동'과 name의 주소값을 비교하는거라 console에 홍길동을 입력해도 false 가나온다
//		System.out.println(b);
//		
//		//String 같은지 비교 **
//		// 대상의 값 자체를 비교하기 위해서는 .equals()를 사용
//		boolean nameCompare = (name.equals("홍길동")); // String 비교
//		System.out.println(b2);//true
//		
		
		//예제 삼항연산자 이용!
		// 이름이 홍길동 : [1강의장]
		// 나이가 짝수면 : [1강의장]
		// 그외 나머지   : [4강의장]
		System.out.print("나이 : ");;
		int age = k.nextInt();
		
		String classNo = ((age % 2 == 0)) || name.equals("홍길동") ? "1강의장" : "4강의장";
		System.out.println(classNo);
		
		// 예제 상자 갯수 구하기
		// 상자 하나에 야구공이 6개 들어갈 수 있음
		// 공의 개수를 입력받아서 
		// 그 공들을 모두 담을 상자의 개수가 몇개 인지?
		
		
//		System.out.print("공의 갯수 :");
//		int ball = k.nextInt();
//		
//		int box = (ball % 6 == 0 ) ? ball / 6 : (ball / 6) + 1; 
//		System.out.printf("필요한 상자의 갯수 : %d개" , box);
		
//		System.out.println("공의 갯수 : ");
//		int ball = k.nextInt();
//		double box1 = (ball / 6);
//		int box2 = (box1 % 0 !=0) ? 1 : 0;
//		System.out.println(box1+box2);

		
		
	}
}
