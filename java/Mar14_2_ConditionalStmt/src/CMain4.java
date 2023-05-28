import java.util.Scanner;

public class CMain4 {
	public static void main(String[] args) {
		// switch-case 예) 권한설정
		// Scanner로 입력 받을 것
		
		// 이병 : 눈치, 관등성명, 훈련, 잠
		// 일병 : 관등성명, 훈련, 잠
		// 상병 : 훈련, 잠
		// 병장 : 잠
		
		Scanner k = new Scanner(System.in);
		System.out.print("계급 :");
		String level = k.next();
		
		switch (level) {
		case "이병":
			System.out.println("눈치");
		case "일병":
			System.out.println("관등성명");
		case "상병":
			System.out.println("훈련");
		case "병장":
			System.out.println("잠");
			break;
		default:
			System.out.println("꿈은 없고요.. 돈많은 백수가 되고 싶습니다.");
			break;
			// 중간에 break를 지워서 중첩되도록 만들 수 있다. 
		}
				
		
	
	}
}
