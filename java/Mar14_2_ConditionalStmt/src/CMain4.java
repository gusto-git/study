import java.util.Scanner;

public class CMain4 {
	public static void main(String[] args) {
		// switch-case ��) ���Ѽ���
		// Scanner�� �Է� ���� ��
		
		// �̺� : ��ġ, �����, �Ʒ�, ��
		// �Ϻ� : �����, �Ʒ�, ��
		// �� : �Ʒ�, ��
		// ���� : ��
		
		Scanner k = new Scanner(System.in);
		System.out.print("��� :");
		String level = k.next();
		
		switch (level) {
		case "�̺�":
			System.out.println("��ġ");
		case "�Ϻ�":
			System.out.println("�����");
		case "��":
			System.out.println("�Ʒ�");
		case "����":
			System.out.println("��");
			break;
		default:
			System.out.println("���� �����.. ������ ����� �ǰ� �ͽ��ϴ�.");
			break;
			// �߰��� break�� ������ ��ø�ǵ��� ���� �� �ִ�. 
		}
				
		
	
	}
}
