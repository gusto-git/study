
public class Yesterday {
	public static void main(String[] args) {
		
		// 예제) % 활용하기 
		// 어제 집까지 얼마나 걸렸는지? 시간 1.5 or 침대까지 걸린 시간
		// 어제 저녁 식사 메뉴
		// 수업 끝나고 뭐하셨나요?
		// 취침 시간? 몇 시 몇 분 
		// 오늘 아침 컨디션 ? %
		// syso >> prinf + escape 문자 활용
		
		System.out.printf("침대까지 걸린 시간 : %02d시간\r\n",6);
		
		System.out.printf("저녁 식사 메뉴 : %s\n", "수제햄버거"); // %s를 활용해서 해야한다. 
//		String dinner = "어제 저녁메뉴 : 수제햄버거\r\n";
//		System.out.printf(dinner);
		
		System.out.printf("어제 수업 끝나고? : %s\n", "친구랑 저녁약속, 카페");
		
//		String afterStudy = "친구랑 저녁약속, 카페";
//		System.out.println(afterStudy);
		
		System.out.printf("%02d시 %2d분\r\n", 00,30);
		
		System.out.printf("%2d%%\r\n",80);
		
//		thread의 역할은 딜레이를 걸어주는 거다. 창을 몇 초 뒤에 꺼지는 기능이 아니다. 
//		정상적으로 작동을 다했기 때문에 바로 꺼지는게 맞다. 
	}
}
