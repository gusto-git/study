// ����� class : ���α׷� ������ ���� main() method�� �����ϴ� ����

public class OMain3 {
	public static void main(String[] args) {
		// �л� ��ü(�л�id, �л��̸�, �л��ּ�) -> ���
		
		Student s = new Student();
		s.idNumber = 1373051009;
		s.name = "������";
		s.address = "���ش�� 2326 102�� 1101ȣ";
		System.out.println("s�� Student ��ü�� ����");
		System.out.println(s);
		s.printinfo();
		System.out.println("====");
		
		Student s1 = new Student();
		System.out.println(s1); // ������
		s1.idNumber = 2;
		s1.name = "ȫ";
		s1.address = "����";
		System.out.println(s1); // ���� ���� ���ص� �ּҰ��� ����
		
		Student s2 = s1;
		s1.address = "����";
		
	}
	
}
