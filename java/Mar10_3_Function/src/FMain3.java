
public class FMain3 {
	public static void test(int q) { //q(blue) : �Ķ���� 
		// �̹� test�� ȣ��� �̻� ���� ������ ���� ������ main���� ���� �� �� ����
		System.out.println(q); // 10 //q(blue)
		q = 20; // ������ ���� -> main�� ������ �����ʴ´�. 
		System.out.println(q); // 20 //q(blue)
	}
	public static void main(String[] args) {
	int q = 10;			   // q(red)
	System.out.println(q); // 10 q(red)
	test(q);//�Ķ����	   // test �Լ� ȣ��, q(blue)���� ����
						   // q(blue)�� q(red)�� �ִ� �� ����
	System.out.println(q); // 10 q(red)
	
	// tip 
	// main ���� �а� test�κ��� �о�� 
	
	
	
	
	
	
	}
}
