
public class PMain3 {
	
	public static void main(String[] args) {
		
		// Escape Sequence(이스케이프 문자)
		// 	: 특수한 문자나 특수한 기능을 표현할 때 역슬래시(\), 원화모양도 상관없다.
		
		// \t : TAB키(자간 맞추는 용도)
		// \n : New Line(새로운 줄/ 다음 줄)
		// \r : Carriage Return(커서를 맨 앞으로)
		// \r\n :보통 같이 쓴다.(Enter 키 효과)
		
		// \b : Backspace키(1byte만 지움) -> Java에서는 사용 못함
		//		ㄴC언어 : 한글자가 1byte
		//		ㄴJava  : 한글자가 2byte 
		// \0 : 빈칸(Space) 기능을 안함
		
		System.out.println("오늘날짜 : 2023.03.08");
		System.out.println("이름\t: 이현석");
		System.out.println("오늘 날짜\t: 2023.03.08");
		System.out.println("요일 :\r\n수요일");
		System.out.println("날\0씨가 완전히 봄\b이네요"); //오류가 남
		
		// 현재상황 : 가볍게 확인하는 용도로 사용하는 console이기 때문에 
		// \r or \n 둘 중 하나만 있어도 enter 효과를 볼 수 있음
		// 파일처리 OR 통신 : \n or \r 하나만 쓰면 다 뒤집어질 수도 있음 (습관화 필요)
		// -> 파일 경로처리 할 때 주의 ! \\ or / 사용해야함(차후 설명 예정)
		
		
		
		
		// \('_')/ 출력
		System.out.println("\\('_')/"); // 자동적으로 \가 두개가 나온다. \ 1개면 오류남
		
		// ("0") 출력
		System.out.println("(\"0\")"); // 글자로 표현하고 싶은 곳을 붙여넣기 하거나, 역슬레시 추가

	}
}
