import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class YMain1 {
	// �Լ��� �������� ����
	// Ű(cm), ������(kg) �Է¹޾Ƽ� �񸸵� �˻��ϴ� ���α׷�
	// �񸸵� = (����ü�� / ǥ��ü��) * 100
	// ǥ�� ü�� = (Ű - 100) x 0.9
	// �񸸵��� 120�� ������ �� �׷��� ������ �Ⱥ� �̶�� ���� ���
	// �ƹ�Ű�� �Է����� �� ���α׷��� ����ǰ� ����
	public static void main(String[] args) throws InterruptedException {
		
		Scanner k = new Scanner(System.in);
		System.out.print("Ű :");
		double height = k.nextDouble();
		System.out.print("������ :");
		double weight = k.nextDouble();
		
//		System.out.println(height); �߰� Ȯ�� �� 
//		System.out.println(weight); �߰� Ȯ�� �� 

		
		double standard = (height - 100) * 0.9;
		double obesity = (weight / standard) * 100;
//		System.out.printf("ǥ�� ü�� : %.1f\n" , standard);  �߰� Ȯ�ο�
//		System.out.printf( "�񸸵� : %.1f\n", obesity);  �߰� Ȯ�ο� 

		String result = (obesity > 120) ? "��" : "�Ⱥ�";
		System.out.println(result);		
//		System.out.println(obesity > 120 ? "��" : "�Ⱥ�"); 
		
		
	// 3�� ������
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.println(".");
		System.out.println("����м� �Ϸ�");
		Thread.sleep(500);
		System.out.println("[���]");
		
		System.out.printf("����� Ű�� %.1fcm, �����԰� %.1fkg���� " + "�񸸵��� %.1f%%�� %s�Դϴ�.\n", height,weight,obesity, result);
		System.out.println("�����Ϸ��� �ƹ�Ű�� �Է�");
		String bye = k.next();
		System.out.println("���α׷��� �����մϴ�.");
		k.close(); // �����ʾƵ� ���ᰡ ��, �ϴ� ���� : �Ʒ� thread.sleep ���� �ڵ尡 ��� ���ᰡ ��. k.close();�� Scanner�� �ݴ� ���
		Thread.sleep(1000);
		
	}
}
