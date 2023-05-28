import java.util.Random;

public class Friend {
	Random r = new Random();
	
	
	public int callFri() {
	int friAns = r.nextInt(3)+1;
	System.out.print("¹¹ ³¾·¡? : ");
	return friAns;
			
	}
	
}
