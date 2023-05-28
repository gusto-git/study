
public class PMain4 {
	public static void main(String[] args) {
		
		// print
		System.out.print("1asdf");
		System.out.print("2asdf\r\n");
		System.out.print("23132f");
		
		// printf	
		//System.out.printf("%?" , 값); 의 형태
		
		//정수(decimal)
		// %d  : 정수 데이터가 들어올 자리(decimal, 10진수) -> 모든언어공통
		// %x(숫자)d : 자리가 x의 숫자만큼이고 뒤에서부터 채워져서 남은 곳은 빈칸으로 표시
		// %0xd : 자리가 x의 숫자만큼, 뒤에서 부터 채워져서 남은 곳은 숫자 0으로 채워짐
		
		System.out.printf("%d\n", 8); // %뒤에 해당하는 자리에 , 뒤의 값이 들어간다.
		System.out.printf("%2d\n", 8); // %2d > 2 = 2자리를 가진 정수, 빈값은 띄어쓰기
		System.out.printf("%02d\n", 8); // %02d > 02 = 2자리를 가진 정수, 빈값은 0을 채움
		System.out.printf("%d%%만큼 확신합니다!\r\n", 100);// %를 쓰고싶으면 %%를 쓰면된다.
		
		
		// ex) 00006 만들기
		System.out.printf("%05d\n", 6);
		System.out.println();
		System.out.println("--------");
		
		//실수(float)
		// %f : 실수 데이터가 들어올 자리
		//.x(숫자)f : x는 소수점 이하의 자릿수 표현(잘리는 소수점은 반올림, 빈자리는 0)
		
		System.out.printf("%f\n", 123.456789);
		System.out.printf("%.3f\n", 123.456789);
		System.out.printf("%.10f\n", 123.456789);
		
		//ex) 98.7654321 >> 소수점 아래 두자리까지만 표현
		System.out.printf("%.2f\n", 98.7654321);

		//ex) 오늘은 2023년 03월 08일이고, 내 시력은 0.1 입니다.
		//    ㄴ syso 한번만 써주기 (여러번 쓰기)
		//    ㄴ 콘솔에 결과는 한줄로 나오게 하기! 
		
		System.out.printf("오늘은 %d년",2023);
		System.out.printf(" %02d월", 3);
		System.out.printf(" %02d일", 8);
		System.out.printf(" 이고, 내 시력은 %.1f 입니다", 1.0);
		System.out.println();
		
		System.out.printf("오늘은 %d년 %02d월 %02d일 이고, ", 2023, 3, 8);
		System.out.printf("내 시력은 %.1f 입니다\n", 1.0);
		
		
		System.out.printf("오늘은 %d년 %02d월 %02d일 이고, 내 시력은 %.1f 입니다\n", 2023, 3, 8,1.0);
		
		//문자열(String)
		//	%s : 글자 데이터가 들어올 자리
		//	숫자 데이터 : 그냥 그대로 입력하면 됨
		//	글자 데이터 : 그냥 입력하면 Java의 문법으로 인식 -> 오류가 난다!
		//	-> "내용"(큰 따옴표 안에 글자 넣기!)
		
		//	ex) 오늘 점심 뭐 드셨나요?
		System.out.printf("%s\n", "오늘 점심 뭐 드셨나요?");
		
		//	ex) Consoile에 날씨 : 곧 비올 것 같음
		System.out.printf("%s\n", "날씨 : 곧 비올 것 같음");
		System.out.printf("날씨 : %s\n", "곧 비올 것 같음");
		
		
	}
}
