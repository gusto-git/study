// A has a B : ���԰���


public class HMain1 {
	public static void main(String[] args) {
		// �̸��� Kim Andrew, ���� : ���� , ����ȣ 010-1234-5678
		// ���� ���
		Person p = new Person("Kim Andrew" ,"male", "010-1234-5678");
		p.printInfo();
		System.out.println("==============");
		// ��������, �ų�����, 022223333, Kim Andrew�� �Ĵ� 
		// �Ĵ������� ��������
		
		Store s = new Store("��������", "�ų�����", "022223333", p);
		s.printInfo();
		System.out.println("==============");
		// ���� �Ұ��, 25000, ������������ �Ĵ� �޴�
		// ���õ� ���� ��� ���
		
		Menu m = new Menu("����Ұ��", 25000, s);
		m.printInfo();
		System.out.println("==============");
		
		// �������, 18000, ������������ �Ĵ� �޴�
		// ���õ� ���� ��� ���
		Menu m1 = new Menu("�������", 18000, s);
		m1.printInfo();
		System.out.println("==============");
		
		// ����, 5000��, ����Ұ�⸦ ���� ����
		// ���õ� ��ü������ ��� ���
		Tool t = new Tool("����", 5000, m1);
		t.printInfo();
		System.out.println("==============");
		
	    /////////////////////////////////////////////////////////////////////////	
		// ��������, ���ı�, ���ڸ� ������ ����(Market)
		Market mk = new Market("��������", "���ı�", t);
		mk.printInfo();
		System.out.println("==============");
		
		// �̼�ȣ, ���������� �����ϴ� ����
		Merchant mer = new Merchant("�̼�ȣ",  mk);
		mer.printInfo();
		
		// �̼�ȣ�� �̸��� ��� 
		System.out.println(mer.name);
		System.out.println("==============");
		
		// �̼�ȣ�� �����ϴ� ���������� ���
		mer.like.printInfo();
		System.out.println("==============");
		
		// �̼�ȣ�� �����ϴ� ������ ��ġ�� ��� ?
		System.out.println(mer.like.location);
		System.out.println("==============");
		
		// �̼�ȣ�� �����ϴ� ���忡�� �� ������ ��ü����
		mer.like.buy.printInfo();
		System.out.println("==============");
		
		// �̼�ȣ�� �����ϴ� ���忡�� �� ������ ����
		System.out.println(mer.like.buy.price);
		System.out.println("==============");
		
		// �̼�ȣ�� �����ϴ� ���忡�� �� ���ÿ� ��� �޴� ��ü����
		mer.like.buy.dish.printInfo();
		System.out.println("==============");
		
		// �̼�ȣ�� �����ϴ� ���忡�� �� ���ÿ� ��� �޴��� ���
		System.out.println(mer.like.buy.dish.name);
		System.out.println("==============");
		
		// �̼�ȣ�� �����ϴ� ���忡�� �� ���ÿ� ��� �޴��� �� �Ĵ� ����ó
		System.out.println(mer.like.buy.dish.where.callNumber);
		System.out.println("==============");
		
		// �̼�ȣ�� �����ϴ� ���忡�� �� ���ÿ� ��� �޴��� �� �Ĵ� ���� ����ó
		System.out.println(mer.like.buy.dish.where.owner.handy);
		System.out.println("==============");
		
		// ������̸� �Ĵ� ����� ����ó
		System.out.println(m1.where.owner.handy);
		System.out.println("==============");
		
		
	}
}
