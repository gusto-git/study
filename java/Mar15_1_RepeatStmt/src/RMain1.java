import java.util.Iterator;
import java.util.Random;

// �ݺ���(Repeat Statement)
		// "��" 5�� ��� -> 54�� ����Ҷ� �ʿ��Ѱ� �ݺ��� 
		// System.out.println("��");
		
		// � �۾��� 50�� �ݺ�
//		for (int i = 0; i < args.length; i++) { // for �ڵ��ϼ� 2��° 
//		for (���� �ʱ�ȭ; ���ǽ� ; ���� ����){
//			����
//			}
//		}
//		
//		1. ���� �ʱ�ȭ -> 2. ���ǽ� üũ(��,true) -> 3. ������ ��� 
//		4. ���� ���� -> 5. ���ǽ� üũ(��,true) -> 6. ���� ���
//		7. ���� ���� -> 8. ���ǽ� üũ(����,false) -> 9. �ݺ��� ���� 
		
		
public class RMain1 {
	public static void main(String[] args) {

		// "��" ��� �ϱ� 3�� ���
		
		for (int i = 0; i < 3; i++) { // ���� �ʱ�ȭ�ض�, i�� 3������ �۵��϶�(0,1,2), i++(i+i) : i�� i�� ��� ���ض� 
			System.out.println(i +"��");	
		}
		System.out.println("-=-=-=-=-=-=-1=--=-=-=-=-");
		// 1���� 5���� ���ʷ� ���
		for (int i = 1; i < 6; i++) {
			System.out.println(i); // ���� �ʱ� ���� 1�� �� 
		}
		// ����� //
		for (int i = 0; i < 5; i++) {
			System.out.println(i+1); //���� �ʱ� ���� 0�� �� 
		}
		System.out.println("-=-=-=-=-=-=-2=--=-=-=-=-");
		
		// 5���� 1���� ���ʷ� ��� //
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("-=-=-=-=-=-=-3=--=-=-=-=-");
		// 1���� 21���� Ȧ���� ��� //
		for (int i = 1; i < 22 ; i+=2) {
			System.out.println(i);
		}
		System.out.println("-=-=-=-=-=-=-4=--=-=-=-=-");
		// �ݺ��� 5�� ���� ���ȿ� 1~10������ ���ڸ� �����ϰ� �̰� ���� ��
		Random r = new Random();
		int x = r.nextInt(10)+1;
		for (int i = 0; i < 5; i++) {
			System.out.println(x);// �ݺ��� �ۿ��� ���� ���ڰ� 5�� �ݺ� �Ǳ� ������ Ʋ�� ��
		}
		System.out.println("-=-=-=-=-=-=-5=--=-=-=-=-");
		// �ݺ��� �ȿ��� ���� ������ ���δ�.
		for (int i = 0; i < 5; i++) {
			int x2 = r.nextInt(10)+1;
			System.out.println(x2);
		}
		System.out.println("-=-=-=-=-=-=-6=--=-=-=-=-");
		// �ݺ��� �ۿ��� ���� �����ϱ�.
		int x3 = 0;
		for (int i = 0; i < 5; i++) { // int i = 0 �� �ۿ� ���� �� �� �ִ�. 
			x3 = r.nextInt(10)+1; // ���� '����' x -> ���� �� '����'
			System.out.println(x3);
		}
		// �ݺ��� �ȿ��� ���� ������ �ݺ��� �ۿ��� Ȱ���� �Ұ����ϴ�.
		// �ݺ��� �ۿ��� ���� ������ �ݺ��� �ۿ��� Ȱ���� ������ ȿ�����̴�.
		
		
		System.out.println("-=-=-=-=-=-=-7=--=-=-=-=-");
		for (int i = 0; i < 5; i++) {
			System.out.println(r.nextInt(10)+1); //���� ���� ���ϰ� �ϱ� 
		}
		
		System.out.println("-=-=-=-=-=-=-8=--=-=-=-=-");
		// 1���� 10���� ���� ��� ���� �� ���
		int sum = 0; // �� ���� ���� ���� ���� �ϳ� ����(�ݺ��� �ۿ�)
		for (int i = 1; i < 11; i++) {
			//System.out.println(i);
			sum += i; //sum = sum + i;
			System.out.println(sum); // �ݸ� �ȿ��� ����ϸ� ������ ��� ��� 
		}
		System.out.println("-=-=-=-=-=-=-9=--=-=-=-=-");
		// 7!(���丮��) 
		int fac = 1; // ���丮���� ���� ���� ���� ���� * /�� �ʱⰪ 1�� �������ϤӤ�
		for (int i = 1; i < 8; i++) {
			fac *= i;
			System.out.println(i);
			System.out.println(fac);
		}
		System.out.println("-=-=-=-=-=-=-10=--=-=-=-=-");
		
		
		// 1 ~ 50 ���� ���� �߿� 
		// 3�� ����̰ų� 5�� ����� ���ڸ� �� ���� ���� ���
		// �ݺ��� + ���ǹ� ��ġ�� �� 
		int sum2 = 0;
		for (int i = 1; i < 51; i++) {
			if (i % 3 == 0) {
				sum2 += i;
			}else if (i % 5 ==0) {
				sum2 += i;
			}
		}
		System.out.println(sum2);
		
		
		//System.out.println(sum); // �ݺ��� �ۿ��� ����ϸ� ���� ���� ���
	
		
	}
}
