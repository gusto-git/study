import java.util.Scanner;

public class KMain2 {

	public static void main(String[] args) {
		
		// ����) �� ���� ���
		// �������� �Է� �޾Ƽ� ���� ���� ���
		// ������ x ������ x 3.14
		// 1. ���� ������ �Է¹ޱ�
		// 2. ���� ���� ���
		// 3. sys�� ���� ���� : 000
	
		/*
		Scanner k = new Scanner(System.in);  // Ű����� �Է¹��� ���̴�. 
		System.out.print("���� ������ : ");  // �Է¹��� ��� ���� 
		double radius = k.nextDouble();      // Ű����� ���� ���� ���� (k�� ����(����, �Ǽ�, ���� ��) 
		double area = (3.14 * radius * radius); // ���� ����(����)
		double area2 = (Math.PI * Math.pow(radius, 2)); // ���� ����(����)
		System.out.println(area); // ���� ��� 
		System.out.printf("���� �������� %.1f�̰�, ���� ������ %.2f", radius, area); // ���� ��� 
		*/
		
//		System.out.printf("���� ���� : %.2f * %.2f * 3.14", pie, pie);
		
		//����� ��
		// Scanner k = new Scanner(System.in);
		// double radius = k.netDouble();
		// double area = (3.14 * radius * raidus);
		// System.out.println(area);
		// System.out.printf("���� �������� %.1f�̰�, ���� ������ %.2f", radius, area);
		//////////////////////////////////////////////////////////////////////////////////
		
		// ����) �簢�� ���� ���ϱ�
		// ���� * ����
		// �簢�� ������ 12 �Դϴ�
		
		
		Scanner s = new Scanner(System.in); // ���� k�� Scanner�� �س��� ������ ���� �ʿ� ������
		/*
		System.out.print("�簢���� ���� : ");
		int q = s.nextInt();
		System.out.print("�簢���� ���� : ");
		int p = s.nextInt();
		
		int area3 = ( q * p);
		System.out.printf("�簢�� ������ %2d �Դϴ�", area3);
		*/  //�巡�� + ctrl + / 
		
		//����� ��
		/*
		System.out.print("���� :");
		double width = k.nextDouble();
		System.out.print("���� :");
		double height = k.nextDouble();
		double area = width * height;
		System.out.printf("���� : %.2f\n", area); >> area ��� �׳� width * height �� ������ �ȴ�. 
													�׷��� ���� ������ �������.
		*/
		
		// ���� 
		// �ʸ� �Է¹޾Ƽ� �� , �ð� ������ ��ȯ�ؼ� ���
		// 600 > �� : 10�� > �� : 
		
		System.out.print("�Է��� �� : "); //> �� �Է¹޴� ����
		int second = s.nextInt();
		double min = second / 60.0; // 60.0�� �ʼ��� . second �� int �̱� ������ 60���� ������ int/int�� �Ǽ� ����
		double hour = min / 60;  // sencond / 3600�� ����
		System.out.printf("[%d]�ʴ� [%.4f]���̰�, ", second, min);
		System.out.printf("[%d]�ʴ� [%.4f]�ð��̴�, ", second, hour);
		// int / int = double x ? ������ int�� �޾ƾ���
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
