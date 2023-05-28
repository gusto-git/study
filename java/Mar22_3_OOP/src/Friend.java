import java.util.Random;
import java.util.Scanner;

public class Friend {

	
	Random brain = new Random();
	
	public int fire() {
		return brain.nextInt(3)+1;
	}
}
