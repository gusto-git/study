import java.util.Iterator;
import java.util.Random;

import javax.naming.ReferralException;

public class RMain4 {
	public static void main(String[] args) {
		// 1~10���� ������ ���ڸ� 5�� �̾ƺ��� 
		// ���� ���� 5�� ���  x , ������ 5�� �̱�
		
		
		Random r = new Random();
		int x = 0; // x�� ���� �����ϰ���  �ݺ��� �Ʒ����� x�� �̱�! ! ! !
		for (int i = 0; i < 5; i++) {
			 x = r.nextInt(10)+1;
			System.out.println(x);
		}
		System.out.println("==========");
		
		// 1~10������ ���� ��� 
		// 9�� ������ �ݺ��� ����
		for (int i = 0; true; i++) {
			x = r.nextInt(10)+1;
				System.out.println(x);
			 if (x == 9) {
				break;	
			}
			 System.out.println(x);
		}
		System.out.println("====");
		
		/////////////////////////////
		// for : �ݺ� Ƚ���� ��Ȯ�Ҷ� ���
		// while : �ݺ� ������ ��Ȯ���� ���� �� 
		//			Ư�� ���ǿ��� ����� �ϴ� ��� 
//		while (���ǽ�) {
//			����
//		}
		// while : ������ ���� �˻��ϰ� ������ true(��)�� ���ȿ��� ��� �ݺ��ϸ鼭 ���� �κ� ����
		//         ����κп��� ������  false(����)���� ���� ���߰� �ϰų�
		//			break; ��ɾ�� �ݺ��� ���ᰡ ����
		//			���ǽĿ� ������ ���� ������ �ݺ��ϴ� �۾� ���� ����
		//          ���Ѵ�� �ݺ��ϰ� �ʹٸ� while(true) ���!
	
		int y = 0;
		while (true) {
			y = r.nextInt(10)+1;
			System.out.println(y);
			if (y == 9) {
				break;
			}
		}
		
		System.out.println("---------------");
		int z = 0;
		while (z !=9) {
			z = r.nextInt(10)+1;
			System.out.println(z);
		}
		System.out.println("--------231-------");
		int y3 = r.nextInt(10)+1;
		while (y3 != 9) {
			System.out.println(y3);
			y3 = r.nextInt(10)+1;
		}
		// do-while �� : ������� �ϰ� ������ ���߿� �˻��ϴ� �� (���� �Ⱦ�)
		// �ֳ��ϸ� do-while���� ���Ÿ� for���� ����Ǳ� ����
		// �ϴ��� ������ �ѹ��� �ݺ��� ���� 
		
		// q�� �ݺ��ؼ� ���ϴµ� �� ���� 100�� ������ ���� 
		System.out.println("--------1-------");
		
		int q = 1;
		while (true) {
			q += q;
			if (q>=100) {
				break;
				
			}
			System.out.println(q);
		    
		}
		System.out.println("=================");
		System.out.println(q);
		System.out.println("=================");
		/////////////////////////////////////////////////////////////////////////
		int num = 0;
		int sum = 0;
		while (sum < 100) {
			num++;
			System.out.println("num : " +num);
			sum += num;
			System.out.println("sum : " +sum);
		}
		System.out.println("n�� �� : " + num);
		System.out.println("�� �� : " + sum);
		
		System.out.println("++++++++++++++++++++++++++");
		
		// 1000 ������ �� �߿��� ���� ū 15�� ��� >???
		
		int num2 = 1000;
		while (num2 % 15 > 0) { //1000���� ��������, num2--�� �ٷ� �����ؼ� 999���� ���´�. 
			num2--; //num2�� 1�� �ٿ���
			System.out.println(num2);	
		}
				
		
		
		
		
		
		
		
		
	}
}
