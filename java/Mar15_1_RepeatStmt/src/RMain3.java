// �����
public class RMain3 {
	public static void main(String[] args) {
		// ��
		// ����
		// ������
		// ��������
		// ����������
		
		for (int i = 1; i < 6; i++) {//1  // 2 
			for (int j = 1; j <= i; j++) { //1,2 // 1,2,3
				System.out.print("��"); // ���� for�� ���缭 ���� 
			}
			System.out.println();
		}
		System.out.println("========1=======");// i�� j�� ���� ���� ���� �װͺ��� ������ ��ĭ���� ���;���.
		for (int i = 1; i < 6; i++) {  
			for (int j = 1; j <= i; j++) {  
				if(j == i) {
					System.out.println("��");
				}else {
					System.out.print(" ");
				}
			} 	
		}
		
		System.out.println("========2=======");
		// �ι�°
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((i == j)? "��" : " ");
			}
			System.out.println(" ");
		}
		
		System.out.println("========3=======");
		// ����°
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("  "); // j�� i���� ���� ������ ����� 
			}
			
			System.out.println("��");
		}
		System.out.println("========��=======");
		int x = 15;
//		System.out.println(x++);// x�� 1�� ���ض�  x���� ǥ���ϰ� �� �ڿ� + 1
//		System.out.println(x++);// �ѹ� ���ؾ� 1�� �����ش� .
		System.out.println(++x);// �� �ؾ��� �ٷ� 1�� �����ش�. ���ϱ� 1�� �� x
		
	
		System.out.println("========4=======");
		for (int i = 5; i >= 1; i--) { // ���� �ش�  
			for (int j = 1; j <= i; j++) { //
//				System.out.print((i % 2 == 1 ? "��" : "��"));
				if (i % 2 == 1) {
					System.out.print("��");
				} else {
					System.out.print("��");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("========5=======");
		for (int i = 1; i < 6; i++) { 
			for (int j = 6; 1 <= j-i; j--) { 
				System.out.print((i % 2 == 1 ? "��" : "��"));
			}
			System.out.println();
		}
		
		System.out.println("========6=======");
		for (int i = 1; i < 6; i++) {  // 1 -> 6
			for (int j = 1; j <= (6 - i); j++) {  // 1 < = 6-1 
				System.out.print((i % 2 == 1 ? "��" : "��"));
			}
			System.out.println();
		}
		
		// ���� //
		//��
		//������
		//����������
		//��������������
		//������������������
		
		// ���� //
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		
		
		
		//main///////////////////////////////////////////////////////
	}

}