import java.util.Random;


public class Friend2 {
	Random brain = new Random();
	
	public int writeFriAns() {
		int think = brain.nextInt(100)+1;
		System.out.println("ģ���� ���� ���ߴ�! : ");
		return think;
		// return brain.nextInt(100) +1 ;
	}
		
		

}
