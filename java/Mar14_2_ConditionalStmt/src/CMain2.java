import java.util.Scanner;

public class CMain2 {
	public static void main(String[] args) {
		// ���� �ϳ��� �Է��� �� �ֵ��� �ؼ�
		Scanner k = new Scanner(System.in);
		System.out.print("x : ");
		int x = k.nextInt();
		// �Է¹��� �������� 5���� ũ��  ���ο� ���� y���� ���� 10 ���
		// �Է¹��� �������� 3���� ũ�� ���ο� ���� y���� ���� 20 ���
		
		
		if (x > 5) {
			int y = 10; // ���� y�� ������ 
			System.out.println(y);
		}else if (x > 3) {
			int y = 20;
			System.out.println(y);
		}
			
		// if �� �ȿ� ������ �����
		// if���� ���ư��鼭 ����ؼ� int y�� �����ϰ� ���� -> ��ȿ����
		// if�� �ٱ��� ������ �̸� ������ �ΰ�
		// if�� �ȿ����� ���� [����](�Ҵ�)�� �� �ְ� �ϴ� ��! -> ȿ����
		int z = 0; // �⺻���� ���Ҷ� 0�� �ִ´�. if ���ǹ� �ȿ����� z�� =0�� ���൵ ������ main���� �ҷ��÷��� = 0 �� �ʼ��̴�
		if (x > 5) {
			z = 10; // �� ���� 
			System.out.println(z);
		} else if (x >3) {
			z = 20;
			System.out.println(z);
		}
		
		System.out.println(z); // �⺻���� ������ ���� ������ �� �κ� ����
		// ���ǹ� �Ŀ� ���� ����� �� ������ �ִٸ� �⺻������
		// ���� �ʱ�ȭ���� �ѹ��� ������ �Ǿ�� ����� ���� 
		
		
	}
}
