import java.util.Random;


public class Friend2 {
	Random brain = new Random();
	
	public int writeFriAns() {
		int think = brain.nextInt(100)+1;
		System.out.println("친구가 답을 정했다! : ");
		return think;
		// return brain.nextInt(100) +1 ;
	}
		
		

}
