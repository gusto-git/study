import java.util.Scanner;

// Shift 연산자 
// 3 << 1 : 앞의 숫자를 이진수로 바꿔서 왼쪽으로 뒤의 숫자만큼 밀고, 빈칸은 0으로 채워 넣기 : 110
//        : 이진수를 다시 십진수로 바꿈 : 2^2 + 2^1 = 6

public class PMain2 {
// 24시간 : 1 << 0 : 1
// 주차장 : 1 << 1 : 2
// Wifi   : 1 << 2 : 4
// 흡연실 : 1 << 3 : 8 
// 총합: 15
	
// 조건
// 버튼(정수)을 하나 입력 받아서
// 각각 무엇을 의미하는지 파악하고
// 내가 입력한 버튼 값으로 어떤 혜택을 받을 수 있는 지 출력
// 배열사용 가능
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int button = k.nextInt();
//		
//		String[] option = {"24시간", "주차장", "WIFI", "흡연실"};
//		for (int i = option.length-1; i >= 0; i--) { //option.lenth -1 : 4-1을 만들어야해서 option(4)-1로 지정함. 새로 추가 할 수 있어서 option.legth로 함
//			if (button >= (1 << i)) {
//				System.out.println(option[i]);
//				button -= (1 << i );
//			}
//		}
		
		if (button >= (1 << 3)) {
			System.out.println("흡연실");
			button -= (1 << 3); //else if 사용하면 안된다. 조건이 참이 되는순간 나머지 조건이 사라진다.
		}
		if (button >= (1 << 2)) {
			System.out.println("WIFI");
			button -= (1 << 2);
		}
		if (button >= (1 << 1)) {
			System.out.println("주차장");
		}
		if (button >= (1 << 0)) {
			System.out.println("24시간");
			button -= (1 << 0);
		}
		
		
	}
}
