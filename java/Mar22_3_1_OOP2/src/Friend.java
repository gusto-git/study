import java.util.Random;
import java.util.Scanner;

public class Friend {

	int friAns;
	Random mouth = new Random();
	
	public void getFriAns() {
		friAns = mouth.nextInt(3)+1;
		System.out.println("��ǻ�Ͱ� ���� ���� " + friAns);
	}
}
