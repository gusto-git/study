// �ܰ� ���� ����
// Call By Value, Call By Reference

// Call By Vaule 	 : ������ '��'�� �����ؼ� �Լ��� �Ķ���� ������ ����ϴ� ��
// Call By Reference : ������ �����ϴ� ������(�ּҰ�)�� �Ķ���ͷ� �����ϴ� �� 
public class PMain5 {
	public static void test(int a, int[] b, int[] c) {
		System.out.println("b(gree)"+b); // �ּҰ�
		System.out.println("c(gree)"+c); // �ּҰ�
		System.out.println("a(gree)"+a); // �ּҰ�
		System.out.println(b[0] + "b(green)");
		System.out.println(c[0] + "c(green)");
		System.out.println("===============");
		a = 100; // main ���� x 
		b[0] = 100; // ��� �ϳ��� �ٲ�, main �ʿ� ���� �� (������) -> �⺻���� �������� ���� 
		c = new int[] {100, 200}; // �� �迭�� ���� ��  -> ����  x -> �� �״�� ���ο� ���� �ȴ�. c != new c ���� �ʴ�.  
								  // �迭 ��ü�� �ٲٷ��� new int[]�� �� �پ�� �Ѵ�.
								  // ����� ������ ���� : ���Խ�(new int[])�� �ƴ϶� 
		
		System.out.println("b(gree)"+b); // ����� �ּҰ�
		System.out.println("c(gree)"+c); // ���ο� �ּҰ�
		System.out.println("a(gree)"+a); // 100
		System.out.println(b[0] + "b(green)"); // 100
		System.out.println(c[0] + "c(green)"); // 100
		
	}
	public static void main(String[] args) {
		int a = 10; // �ٷ� stack�� ���� 
		int[] b = {10,20};
		int[] c = {10,20};
		
		System.out.println("b(red)"+ b); // �������̶� �������̳���
		System.out.println("c(red)"+ c) ;// �������̶� �������̳���
		System.out.println("--------------------") ;
		test(a, b, c);
		System.out.println("--------------------") ;
		System.out.println(a + "a(red)"); // 10 -> �� ����ȵ�
		System.out.println(b[0] + "b(red)"); // 100 -> �� ���� ��
		System.out.println(c[0] +"c(red)"); // 10 -> �� ���� �ȵ�
								  // test �Լ��� ����� c���� �ٸ��Ŷ� (�ּҰ��� �޶� �ٸ� ���� �����)
		
		// �ٸ� �Լ����� �迭�� �ִ� �� ��ü�� �ٲٸ�
		// main �Լ����� �ٲ� ���� ���;� �� -> call by reference
		// Java�� �� ��ü�� �ٲٸ� ������ ���� ���� : Java �� call by value �ۿ� ����. 
		// ���� �����ؼ� ���°� �����ϳ� ���� ��ü�� �����ؼ� �ҷ����°� �Ұ����ϴ�. *********
	}

}


//		 stack    		heap(������ ������ ���� ����)
//      	      		#7 10,20���� ����(b)
//				  		#3 10,20���� ����(c)
//				 		#4 100,200���� ���� (c)
//				
//				  
//				  
//				  
// 	green c   #3 -> #4 ���� (main) ���� ���� ����
// 	green b   #7
// 	green a   100
// 	red   c   #3
// 	red 	 b   #7
// 	red 	 a   10