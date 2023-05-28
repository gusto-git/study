
public class PMain2 {
	public static void main(String[] args) {
		System.out.println("11시 수업 중");
		// syso : 출력(print)기능 >> Console에 내가 원하는 말 출력

		// 출력의 형태
		// 1. println : Console 창에 글자 출력 + 줄 바꿈 기능(제일 많이 사용)
		// 2. print : Console 창에 글자 출력 + 줄 바꿈 x
		// 3. printf : Console 창에 형식을 지정해서 글자를 출력(ex 소수점 자리수)

		System.out.println("println : 글자출력 + 줄바꿈 기능!");
		System.out.print("print : 글자출력");
		System.out.println();
		System.out.printf("prinf : 이거는 다음 시간에 자세히");
		System.out.println(); // alt + 화살표 방향키 : 줄바꿈
		System.out.println("지금 부터 설명 합니다.");
		// syso를 자동완성 하면 println 만 나오는데
		// 왜 printf랑 print는 자동완성이 안될까요?
		// -> 가장 많이 사용하는게 println이라서(추측)

		// 사칙연산이 가능!!
		// 괄호 안에 숫자랑 부호 넣어서 간으
		System.out.println("-=-=-=-=-=-=-=-");
		System.out.println(10 + 2);
		System.out.println(10 - 2);
		System.out.println(10 * 2);
		System.out.println(10 / 2);
		System.out.println("-=-=-=-=-=-=-=-");

		// 왜 숫자는 ""를 넣지 않는가?
		// "" 사이에 뭔가를 입력하면 -> [글자]로 인식
		System.out.println("-=-=-=-=-=-=-=-");
		System.out.println("10 + 2");
		System.out.println("10 - 2");
		System.out.println("10 * 2");
		System.out.println("10 / 2");
		System.out.println("-=-=-=-=-=-=-=-");

		// 내용들이 너무 중구난방이라 보기 불편하다.
		// ctrl + shift + f : 줄정리
		System.out.println("sadf" + "sdsdd" + "sdwwqd" + "sdsdwdqd");
		System.out.println("qwdkhjbqwhjdb");
		System.out.println("ddwdwwdfff" + "qdwddfafg");
		
		// 띄어쓰기, 줄바꿈, 들여쓰기 -> 컴퓨터 입장에서는 상관없음
		// ㄴ 단순히 사람들 가독성을 위해 사용하는 것!!
	}
}
