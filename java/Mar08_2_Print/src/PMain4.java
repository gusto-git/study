
public class PMain4 {
	public static void main(String[] args) {
		
		// print
		System.out.print("1asdf");
		System.out.print("2asdf\r\n");
		System.out.print("23132f");
		
		// printf	
		//System.out.printf("%?" , ��); �� ����
		
		//����(decimal)
		// %d  : ���� �����Ͱ� ���� �ڸ�(decimal, 10����) -> ��������
		// %x(����)d : �ڸ��� x�� ���ڸ�ŭ�̰� �ڿ������� ä������ ���� ���� ��ĭ���� ǥ��
		// %0xd : �ڸ��� x�� ���ڸ�ŭ, �ڿ��� ���� ä������ ���� ���� ���� 0���� ä����
		
		System.out.printf("%d\n", 8); // %�ڿ� �ش��ϴ� �ڸ��� , ���� ���� ����.
		System.out.printf("%2d\n", 8); // %2d > 2 = 2�ڸ��� ���� ����, ���� ����
		System.out.printf("%02d\n", 8); // %02d > 02 = 2�ڸ��� ���� ����, ���� 0�� ä��
		System.out.printf("%d%%��ŭ Ȯ���մϴ�!\r\n", 100);// %�� ��������� %%�� ����ȴ�.
		
		
		// ex) 00006 �����
		System.out.printf("%05d\n", 6);
		System.out.println();
		System.out.println("--------");
		
		//�Ǽ�(float)
		// %f : �Ǽ� �����Ͱ� ���� �ڸ�
		//.x(����)f : x�� �Ҽ��� ������ �ڸ��� ǥ��(�߸��� �Ҽ����� �ݿø�, ���ڸ��� 0)
		
		System.out.printf("%f\n", 123.456789);
		System.out.printf("%.3f\n", 123.456789);
		System.out.printf("%.10f\n", 123.456789);
		
		//ex) 98.7654321 >> �Ҽ��� �Ʒ� ���ڸ������� ǥ��
		System.out.printf("%.2f\n", 98.7654321);

		//ex) ������ 2023�� 03�� 08���̰�, �� �÷��� 0.1 �Դϴ�.
		//    �� syso �ѹ��� ���ֱ� (������ ����)
		//    �� �ֿܼ� ����� ���ٷ� ������ �ϱ�! 
		
		System.out.printf("������ %d��",2023);
		System.out.printf(" %02d��", 3);
		System.out.printf(" %02d��", 8);
		System.out.printf(" �̰�, �� �÷��� %.1f �Դϴ�", 1.0);
		System.out.println();
		
		System.out.printf("������ %d�� %02d�� %02d�� �̰�, ", 2023, 3, 8);
		System.out.printf("�� �÷��� %.1f �Դϴ�\n", 1.0);
		
		
		System.out.printf("������ %d�� %02d�� %02d�� �̰�, �� �÷��� %.1f �Դϴ�\n", 2023, 3, 8,1.0);
		
		//���ڿ�(String)
		//	%s : ���� �����Ͱ� ���� �ڸ�
		//	���� ������ : �׳� �״�� �Է��ϸ� ��
		//	���� ������ : �׳� �Է��ϸ� Java�� �������� �ν� -> ������ ����!
		//	-> "����"(ū ����ǥ �ȿ� ���� �ֱ�!)
		
		//	ex) ���� ���� �� ��̳���?
		System.out.printf("%s\n", "���� ���� �� ��̳���?");
		
		//	ex) Consoile�� ���� : �� ��� �� ����
		System.out.printf("%s\n", "���� : �� ��� �� ����");
		System.out.printf("���� : %s\n", "�� ��� �� ����");
		
		
	}
}
