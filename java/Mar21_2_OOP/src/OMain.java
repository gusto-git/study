// Coder : ������ 
// Programmer : Coder + ���� -> �츮�� ��ǥ

// OOD(Object Oriented Design) : ��ü ���� ������
//	�ǻ�Ȱ�� ������


public class OMain {
	// OOP�� BMI���α׷� �����
	// ��ü�� �����ϴ� �����ι� : Doctor / Guest
	public static void main(String[] args) {
		
		// �մ� ��ü �ҷ��� �̸�, ���� -> printGusest()�Լ� ȣ��
		
		Guest g = new Guest();
		g.name = "������";
		g.age = 72;
		g.printGuest();

		Doctor d = new Doctor();
		d.start(g);
		
		
	}
}
