import java.util.Scanner;

public class test {
	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);
		String job = "";
	
		a: while (true) {
			System.out.print("穿备 : ");
			job = k.next();
			switch (job) { 
			case "概聪历":
				System.out.println("矫胶袍包府");
			case "碍荤":
				System.out.println("切积包府");
			case "切积":
				System.out.println("荐诀包府");
				break;
			case "场":
				break a;
			}
		}
	}
}