import java.util.Scanner;

// ATM 기능을 하는 프로그램(MAIN)
// 1. 입금, 2. 출금, 3. 잔고확인, 4. 프로그램 종료
// 입금, 출금 >> 입력을 받을 것 

// 콘솔 실행 - 1번 입력 - 얼마 입금 - 10000원
// 메뉴선택 - 3번입력 - 잔고 10000
// 메뉴선택 - 4번 입력 - 프로그램종료 
public class RMain7 {
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		int bank = 0;
		int money = 0;

		a: while (true) {
			
			System.out.println("");
			System.out.println("------------------------------------------------------");
			System.out.println("1.입금 | 2. 출금 | 3. 잔고확인 | 4. 프로그램 종료");
			System.out.println("------------------------------------------------------");
			System.out.println("");
			System.out.print("선택 : ");

			bank = k.nextInt();
			
			
		switch (bank) {
		case 1:
			System.out.print("입금 하실 금액 : ");
			bank = k.nextInt();
			money += bank;
			System.out.printf("%d금액을 입금합니다.", bank);
			break;
			
		case 2:
			System.out.print("출금 하실 금액 : ");
			bank = k.nextInt();
			money -= bank;
			System.out.printf("%d금액을 입금합니다.", bank);
			break;
			
		case 3:
			System.out.printf("통장잔고 : %d\n", money);
			break;
			
		case 4:
			System.out.print("프로그램 종료");

			break a;
			}
		
		}
	}
}
