// A is a B : ��Ӱ���
// ���θ� - '��ǰ'�� ���� ������ �Խ��ϰ� ����
public class IMain2 {
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
		Notebook note = new Notebook("�Ｚ", 1320000, 1.2, 6, com);
		note.printInfo();
	}
}
