// OOP
// static �����������
// constructor
// ��ü���� ����
//	A has a B : ��� has a �ڵ���
//	A is a B  :  �� is a ���� 
public class HMain1 {
	public static void main(String[] args) {
		// �̸��� û����, ���� û���� ���� ����
		// ���� ���
		
	Candy c = new Candy("û����", "û����");
		c.printInfo();
		System.out.println("----------------------");
		// �̸��� �Ե� , ��ġ�� ���, ȸ�����  100���� ȸ��
		// �������
		
		Company co = new Company("�Ե�", "���", 100);
		co.printInfo();
		System.out.println("----------------------");
		// û���� ������ �Ե����� ������ٸ�?
		c.brand = co;
		c.brand.printInfo();
		System.out.println("----------------------");
		// �Ｚ, ����, 300���� �ٴϴ� ȸ��
		
		Company co1 = new Company("�Ｚ", "����", 300);
		co1.printInfo();
		System.out.println("----------------------");
		
		//CPU i7-1234, ram 32gb, hdd 500gb �Ｚ��ǻ��
		// ��ǻ�� , ȸ�� ���� ���
		
		Computer cp = new Computer("i7-1234", 32, 500, co1);
		cp.printinfo();
		
	}
}
