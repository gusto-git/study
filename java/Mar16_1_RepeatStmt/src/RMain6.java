import java.util.Scanner;

// part1 : 절차지향 프로그래밍(순서대로 잘 써서 결과를 잘 내자) -이과스러움-
// part2 : 객체지향 프로그래밍 - 개념잡기가 상당히 힘들다.  -문과스러움-
// prat3 : 기타 등등 .... 외부 라이브러리 등을 활용 

// 조건문 , 반복문, 배열을 얼마나 잘 활용하는가에 따라서 판단이 된다.
// 정보 올림피아드 문제 .. 질문 받지 않는다. 

// 프로그래머 vs 코더 
// 코딩 : 누군가 설계해 둔 것을 토대로 프로그램만 짜는 것
// 프로그래밍 : 내가 생각해서 설계하고 + 내가 프로그램 짜는 것
// 수업만 듣는다고 이루어지지 않는다. 


public class RMain6 {
	// 누구 :
	// 매니저
	// 	시스템관리
	// 	학생관리
	// 	수업관련 업무
	// 강사
	//	학생관리
	//	수업관련 업무
	// 학생
	//	수업관련 업무
	//	반복을 하다가 "끝"이라고 입력하면 프로그램이 종료 
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		String role = null; // ""; 와 동일 
		
		a: while (true) { // 반복문에 이름 붙이는 방법 -> [이름] : while
			System.out.print("누구? : ");
			role = k.next();
			switch (role) {
			case "매니저":
				System.out.println("시트템 관리");
			case "강사":
				System.out.println("학생 관리");
			case "학생":
				System.out.println("수업 관련 업무");
				break;

			case "끝":
//				break; // 무조건 가까운 switch문을 종료시킴
				break a;// break 뒤에 [이름]을 종료하겠다.
			
			
			}
		}
			
		


		
		
		
		
		
	}
}
