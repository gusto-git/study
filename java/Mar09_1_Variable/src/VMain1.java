
public class VMain1 {
	public static void main(String[] args) {
		// 정수 : int
		// 실수 : double
		// 문자 : String -> 소문자로 쓰면 안된다. 
		// 자료형 변수명 = 값; 
		// = 는 우항의 값을 좌항에 대입하라
		
//		 예제) 변수 만들기 
		// 1. 본인 이름 데이터를 담은 변수 만들기
		// 2. 본인 핸드폰 가격
		// 3. 본인 시력
		// 4. 본인이 가장 좋아하는 음식 이름
		// 5. 본인이 일주일에 사용하는 금액 
		// 6. 내가 좋아하는 색 = 흑
		// 7. it 계열 전공 여부 (전공이면 참, 비전공이면 거짓) -> boolean
		
		String name = "이현석";
		int price = 1200000;
		double eyes = 0.1;
		String food = "햄버거";
		int pay = 50000;
		char color = '흑';
		boolean it = false;
		
		
//		강사님 답
//		String name = "정지희";
//		int my_phone = 1200000;
//		double eye = 1.2;
//		String my_favorite_food = "돼지갈비"
//		int money = 100000;
//		char color = '흑'
//		boolean it = true;		
		
		
		System.out.printf("이름 : %s\r\n", name);
		System.out.printf("핸드폰 가격 : %d원\r\n", price);
		System.out.printf("시력 : %.1f\r\n", eyes);
		System.out.printf("가장 좋아하는 음식 : %s\r\n", food);
		System.out.printf("일주일 용돈 : %d원\r\n", pay);
		System.out.printf("좋아하는색 : %s\r\n", color); //-> %s가 아닌 %c를 사용해야 함
		System.out.println(it); // System.out.printf("전공 여부 : %b", it); 써야 함 
		System.out.println("///////////////////////////////////////////////");
		
//		강사님 답
//		System.out.printf("이름 : %s\n", name);
//		System.out.printf("핸드폰 가격 : %d원\n", my_phone);
//		System.out.printf("내 시력 : %.1f\n", eye);
//		System.out.printf("내가 좋아하는 음식 : %s\n", my_favorite_food);
//		System.out.printf("내 일주일 용돈 : %,d\n", money);
//		System.out.printf("좋아하는 색 : %c\n", color);
//		System.out.printf("전공 여부 : %b", it);
		
		// 예제)
		// 이름 : 섬유향수
		// 가격 : 5000원
		// 용량 : 100ml
		// 향 : 체리블라썸
		// 향균 : 99.9%
		// 색 : 핑크
		// 회사 : 다이소 
		// 재활용 여부 : true(가능)
		// 조건 : 각각 변수에 담고 -> sysof 로 시도
	
		String name1 = "섬유향수";
		int price1 = 5000;
		int ml = 100;
		String smell = "체리블라썸";
		double a = 99.9;
		String color1 = "핑크";
		String maker = "다이소";
		boolean recycle = true ;
		
		System.out.printf("이름 : %s\n", name1);
		System.out.printf("가격 : %,d원\n", price1);
		System.out.printf("용량 : %dml\n", ml);
		System.out.printf("향 : %s\n", smell);
		System.out.printf("향균 : %.1f%%\n", a);
		System.out.printf("색 : %s\n", color1);
		System.out.printf("회사 : %s\n", maker);
		System.out.printf("재활용 여부 : %b\n", recycle);
		
//		강사님 답
//		String product = "섬유향수";
//		int price = 5000;
//		int volume = 100;
//		String smell = "체리블라썸";
//		double anti = 99.9;
//		String col = "pink";
//		String company = "다이소"
//		bolean recycle = true;
		
//		System.out.printf("이름 : %s\n", product);
//		System.out.printf("가격 : %,d원\n", price);
//		System.out.printf("용량 : %dml\n", volume);
//		System.out.printf("향 : %s\n", smell);
//		System.out.printf("향균 : %.1f%%\n", anti);
//		System.out.printf("색 : %s\n", col);
//		System.out.printf("회사 : %s\n", company);
//		System.out.printf("재활용여부 : %b\n", recycle);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
