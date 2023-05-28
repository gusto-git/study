// Static(����, ������)
//  �� ���� �ɹ� : static ����(���� �ʵ�), static �޼ҵ�(���� �޼ҵ�) 
//  �� ���α׷� �����Ҷ����� �����ִ�. 
//  �� class�� ����ƽ ������ �����ִ�. -> static ������ gc�� ������ ���� �ʴ´�. 
//  RAM �޸𸮿� �Ҵ��� �Ǹ� ���α׷��� ����� �� ���� �������� �ʴ´�.
//		�� Class�� Static������ ����
//		�� ��ü(new ~)�� heap������ �����̵ȴ�.
//		�� heap�� Garbage Collection�� ��� �����ؼ� ����
//		�� static�� GC ���� �ۿ� �־ ���� ������ �ʴ� �� ���α׷� ������� ���� �ִ�.
//		�� static�� ��� ��ü�� �����Ѵ�.

public class SMain1 {
	// Ŀ�� ��ü
	// Ŀ�� �̸�, �߷�, ���� : ���̺귯�� �� class �ϳ� �����
	public static void main(String[] args) {
		// main�� Coffee ��ü�� ���� ����
		// �� �̸�, �߷�, ������ �𸣴� ���� (Coffee Ŭ�������� ���������� ����)
		// �� ������, �����ڴ� �˼�����
		
		System.out.println(Coffee.MANUFACTURER); // static�� �����ϴ�.
//		System.out.println(Coffee.name); // �ȳ���
		
		//��ü �ϳ� ����
		Coffee c = new Coffee();
		c.name = "�Ƹ޸�ī��";
		c.weight = 300.6;
		c.price = 2500;
		c.printInfo();
		System.out.println("=====================");
		
		//��ü �ϳ� �� ����
		Coffee c1 = new Coffee();
		c1.name = "ī���";
		c1.weight = 320.1;
		c1.price = 3200;
//		c1.MANUFACTURER = "HYEON"; // �����ڰ� ����ȴ�. -> ���� �ٲ� �κ��� ������ ���.  ���� : FINAL ��������� ���ȭ�� ���� ������ �� ����.
		c1.printInfo(); 
	}
}

// STAIC     STACK      HEAP
//	LEE					#2 �Ƹ� , 300.6 , 2500
//						#3 ī���, 320.1 , 3200
//		
//       C1   #3
//		 C	  #2