
public class VMain1 {
	public static void main(String[] args) {
		// ���� : int
		// �Ǽ� : double
		// ���� : String -> �ҹ��ڷ� ���� �ȵȴ�. 
		// �ڷ��� ������ = ��; 
		// = �� ������ ���� ���׿� �����϶�
		
//		 ����) ���� ����� 
		// 1. ���� �̸� �����͸� ���� ���� �����
		// 2. ���� �ڵ��� ����
		// 3. ���� �÷�
		// 4. ������ ���� �����ϴ� ���� �̸�
		// 5. ������ �����Ͽ� ����ϴ� �ݾ� 
		// 6. ���� �����ϴ� �� = ��
		// 7. it �迭 ���� ���� (�����̸� ��, �������̸� ����) -> boolean
		
		String name = "������";
		int price = 1200000;
		double eyes = 0.1;
		String food = "�ܹ���";
		int pay = 50000;
		char color = '��';
		boolean it = false;
		
		
//		����� ��
//		String name = "������";
//		int my_phone = 1200000;
//		double eye = 1.2;
//		String my_favorite_food = "��������"
//		int money = 100000;
//		char color = '��'
//		boolean it = true;		
		
		
		System.out.printf("�̸� : %s\r\n", name);
		System.out.printf("�ڵ��� ���� : %d��\r\n", price);
		System.out.printf("�÷� : %.1f\r\n", eyes);
		System.out.printf("���� �����ϴ� ���� : %s\r\n", food);
		System.out.printf("������ �뵷 : %d��\r\n", pay);
		System.out.printf("�����ϴ»� : %s\r\n", color); //-> %s�� �ƴ� %c�� ����ؾ� ��
		System.out.println(it); // System.out.printf("���� ���� : %b", it); ��� �� 
		System.out.println("///////////////////////////////////////////////");
		
//		����� ��
//		System.out.printf("�̸� : %s\n", name);
//		System.out.printf("�ڵ��� ���� : %d��\n", my_phone);
//		System.out.printf("�� �÷� : %.1f\n", eye);
//		System.out.printf("���� �����ϴ� ���� : %s\n", my_favorite_food);
//		System.out.printf("�� ������ �뵷 : %,d\n", money);
//		System.out.printf("�����ϴ� �� : %c\n", color);
//		System.out.printf("���� ���� : %b", it);
		
		// ����)
		// �̸� : �������
		// ���� : 5000��
		// �뷮 : 100ml
		// �� : ü������
		// ��� : 99.9%
		// �� : ��ũ
		// ȸ�� : ���̼� 
		// ��Ȱ�� ���� : true(����)
		// ���� : ���� ������ ��� -> sysof �� �õ�
	
		String name1 = "�������";
		int price1 = 5000;
		int ml = 100;
		String smell = "ü������";
		double a = 99.9;
		String color1 = "��ũ";
		String maker = "���̼�";
		boolean recycle = true ;
		
		System.out.printf("�̸� : %s\n", name1);
		System.out.printf("���� : %,d��\n", price1);
		System.out.printf("�뷮 : %dml\n", ml);
		System.out.printf("�� : %s\n", smell);
		System.out.printf("��� : %.1f%%\n", a);
		System.out.printf("�� : %s\n", color1);
		System.out.printf("ȸ�� : %s\n", maker);
		System.out.printf("��Ȱ�� ���� : %b\n", recycle);
		
//		����� ��
//		String product = "�������";
//		int price = 5000;
//		int volume = 100;
//		String smell = "ü������";
//		double anti = 99.9;
//		String col = "pink";
//		String company = "���̼�"
//		bolean recycle = true;
		
//		System.out.printf("�̸� : %s\n", product);
//		System.out.printf("���� : %,d��\n", price);
//		System.out.printf("�뷮 : %dml\n", volume);
//		System.out.printf("�� : %s\n", smell);
//		System.out.printf("��� : %.1f%%\n", anti);
//		System.out.printf("�� : %s\n", col);
//		System.out.printf("ȸ�� : %s\n", company);
//		System.out.printf("��Ȱ�뿩�� : %b\n", recycle);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
