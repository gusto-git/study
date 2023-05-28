import java.util.Scanner;

public class RMain8 {
	public static void main(String[] args) {
		// ATM 강사님 풀이
		Scanner k = new Scanner(System.in);
		int num = 0; // 번호 저장할 변수
		int howMuch = 0 ; // 입금, 출금용 
		int money = 0; // 통장 잔고용 
		// while 문 풀이
		while (true) {
			System.out.println("---------------------------");
			System.out.println("1. 예금 2. 출금 3. 잔고 4. 종료");
			System.out.println("---------------------------");
			System.out.print("번호를 입력하세요 ");
			num = k.nextInt();
			if (num == 4) {
				System.out.println("프로그램을 종료합니다.");
				break; // 반목문 깨기 -> 무한 루프문이라 미리 종료버튼을 만든다. 
			}else if(num ==1){
				System.out.println("1.예금");
				while (true) {
					System.out.print("입금할 금액 : ");
					howMuch = k.nextInt();
					if (howMuch >0) {
						System.out.printf("%d원을 예금합니다\n",howMuch);
						money += howMuch; // money = money + howMuch; 
						break; // 가장 가까운 것이 깨짐 : 가장 가까운 반복문(while)
					} else { // howMuch의 금액이 0보다 작거나 같으면
						System.out.println("입금할 수 없는 금액입니다.");
					}
					
				}
				
			}else if (num == 2) {
				System.out.println("2.출금");
				while (true) {
					System.out.println("출금할 금액 : ");
					howMuch = k.nextInt();
					if (howMuch > 0 && howMuch <= money) { // 0 < howMuch <- 통장잔고 
						System.out.printf("%d원을 출금합니다.\n",howMuch);
						money -= howMuch; // money = money - howMuch;
						break; // 가장 가까운 반복문(while) 종료;
					}else {
						System.out.println("출금할 수 없습니다.");
					}
					
				}
			}else if (num ==3) {
				System.out.println("3. 잔고");
				System.out.printf("잔고는 [%d원] 입니다. \n", money);
			}
			
		}
		
	}
}
