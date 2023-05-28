import java.util.Random;
import java.util.Scanner;

public class Friend {

	int friAns;
	Random mouth = new Random();
	
	public void getFriAns() {
		friAns = mouth.nextInt(3)+1;
		System.out.println("컴퓨터가 뽑은 숫자 " + friAns);
	}
}
