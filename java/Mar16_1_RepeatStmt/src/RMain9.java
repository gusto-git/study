import java.util.Scanner;

public class RMain9 {
	public static void main(String[] args) {
		// switch - case 문 
		Scanner k = new Scanner(System.in);
		int num = 0;
		int money = 0;
		int howMuch = 0;
		
		lee : while (true) {
			System.out.println("---------------------------");
			System.out.println("1. 예금 2. 출금 3. 잔고 4. 종료");
			System.out.println("---------------------------");
			System.out.print("번호를 입력하세요 ");
			num = k.nextInt();
			
			switch (num) {
			case 4:
				System.out.println("프로그램 종료!");
				break lee; //switch - case안에 있으면 switch-case 문을 종료하기 때문에 반복문 앞에 이름을 붙여서 종료 / if문은 while문이 바로 깨짐 
				
			case 3 :
				System.out.println("3. 잔고");
				System.out.printf("잔고는 [%d원] 입니다.", money);
				break; // break를 안해주면 밑에 생성되는 case랑 중복이 되버리기 때문에 무조건 해야함.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////				
			case 1 : 
				System.out.println("1. 예금");
				System.out.print("입금액 : ");
				howMuch = k.nextInt();
				
				while (true) 	
				if (howMuch > 0) {
					System.out.printf("%,d원 입금합니다.\n", howMuch);
					money += howMuch; // money = money + howMuch;
					break; // while문을 깨기 위해 여기 위치함 
					} else {
					System.out.println("입금할 수 없는 금액입니다.");
					}
				
			case 2:
				System.out.println("2. 출금");
				System.out.println("출금액 : ");
				howMuch = k.nextInt();
				while (true) {
				if(howMuch > 0 && howMuch <= money) {
					System.out.printf("%,d원을 출금합니다\n",howMuch);
					break; // while
				}else {
					System.out.println("출금할 수 없습니다.");
				}
				System.out.printf("%,d원을 출금합니다\n", howMuch);
				money -= howMuch; //money = money - howMuch;
				break; // switch-case문 깨지게
				}
				break;// switch - case 깨기 위한 용도 
				}
			}
		}
	}
