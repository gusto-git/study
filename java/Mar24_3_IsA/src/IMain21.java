// A is a B : ��Ӱ���
// ���θ� - '��ǰ'�� ���� ������ �Խ��ϰ� ����
public class IMain21 {
	public static void main(String[] args) {
		// �Ź�(�̸�, ����, ������)
		
		Shoes s = new Shoes("�Ｑ������", 3000, 250);
		s.printInfo();
		System.out.println("=======================");
		
		// ��ǻ��(�̸�, ����, cpu, ram , hdd)
		
		Computer com = new Computer("�Ｚ", 1200000, "i5-13600K", 32, 1000);
		com.printInfo();
		System.out.println("=======================");
		
		// ��Ʈ��(�̸�, ����, cpu, ram , hdd , ����, ���͸� ���ӽð�)
		Laptop lap = new Laptop("�Ｚ", 1230000, "i5-12600", 32, 500, 1.2, 8);
		lap.printInfo();
		System.out.println("=======================");
	}
}
