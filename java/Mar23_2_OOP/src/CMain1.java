// Constructor
public class CMain1 {

	public static void main(String[] args) {
		// �Ź�
		// ����Ű Ȩ������
		// �̸� : ???
		// ������ : 250
		// ���� : 110,000
		// �귣�� : ����Ű
		// ���� ���
		///////////////////////
		// �̸� : !!!
		// ������ : 260
		// ���� : 120,000
		// �귣�� : ����Ű
		// ���� ��� 
		
		System.out.println("---------------");
		System.out.println("�Ź� �԰�"); 
		System.out.println(Shoose.brand); 
		System.out.println("---------------");
		
		Shoose s1 = new Shoose(); // ��ü�� ��������� ������ �ѹ� ��ġ�� ���� �ȴ�.  shoose.java �ȿ� ���� 
		s1.name = "����Ű �䰡���� Ʈ���� 4 GORE-TEX";
		s1.size = 250;
		s1.price = 189000;
		s1.printInfo();
		System.out.println("---------------");
		
		Shoose s2 = new Shoose();
		s2.name = "����Ű ����Ʈ ���Ǵ�Ƽ 3 �����̾�";
		s2.size = 260;
		s2.price = 188100;
		s2.printInfo();
		System.out.println("---------------");
				
		Shoose s3 = new Shoose("�Ź�", 250, 3000); // �����ε������� �Ź��԰� �ȳ��´�.. ������ �𸣰ڴ�.. -> oop���� �� ����̶�� �Ϳ��� �����Ѵ�. 
		s3.printInfo();
		
		
	}
}
