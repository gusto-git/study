import java.util.Scanner;

public class Me {
	
	int MyAns;
	Scanner mouth = new Scanner(System.in);
	
	public int getMyAns() {
		System.out.println("���� ���� ���� :");
		MyAns = mouth.nextInt(3)+1;
		return MyAns;
	}
	
}
