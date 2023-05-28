// for, while, do-while - 반복문

public class RMain5 {
	public static void main(String[] args) {
		// 반복문 10번 -> 반복문 한번 돌 때마다 안녕하세요 x3 번씩 출력
		// 갑자기 숫자 4가 마음에 들지 않아.. 
		// 네번째에 해당하는 안녕하세요는 안하고 싶다. 
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				continue; // 해당하는 조건은 무시하고 지나가라 
			}
			System.out.printf("====%d=====\n", i);
			System.out.println("안녕하세요");	
			System.out.println("안녕하세요");	
			System.out.println("안녕하세요");
		}
		System.out.println("==");	
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("와!" + i);
			}else {
//				continue; // 강제 반복 - > 홀수일때 else무시 - > for문으로 돌아감 , 짝수일 때 
//			}
//			break;// 공식적인 반복문 끝!
			}return; // 비공식적으로 함수가 끝 
		}	
	}
}
