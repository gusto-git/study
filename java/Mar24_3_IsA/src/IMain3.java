
public class IMain3 {
	public static void main(String[] args) {
		// ȫ�浿, 17��, �ֵ�����б�, 1�г� -> ���
		Student g = new Student("ȫ�浿", 17, "�ֵ�����б�", 1);
		g.printInfo();
		System.out.println("===========");
		// ��浿, 21��, �ֵ����б�, 3�г� -> ���
		Student g1 = new Student("��浿", 21, "�ֵ����б�", 3);
		g1.printInfo();
		System.out.println("===========");
		// ��浿, 22��, ����, �� -> ���
		Solder r = new Solder("��浿", 22, "����", "��");
		r.printInfo();
		System.out.println("===========");
		
		
		// Product2 Ŭ���� ���� �Ӽ��� �̸�, ����! 
		Pen p = new Pen();
		p.printInfo();
		System.out.println("===========");
		Pen p2 = new Pen("����");
		p2.printInfo();
		System.out.println("===========");
		Pen p3 = new Pen("�𳪹�", 300, "����");
		p3.printInfo();
		System.out.println("===========");
		
		// �̸��� �мǸ���ũ , ������ 1000���� ����ũ
		Mask m = new Mask("�мǸ���ũ", 1000);
		
		
		
		
		
		
		
	}
}
