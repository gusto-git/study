
public class PMain5 {
	public static void main(String[] args) throws InterruptedException {
		// ���� �����
		// �̸�, ����, ����, Ű, ��°�, ����
		// escape sequence + printf (%d, %.1f, %s)
		
		System.out.println("***********************");
		System.out.println("*       �ڱ�Ұ�      *");
		System.out.println("***********************");
		System.out.printf("*�̸�   : %s\n","������      *" );
		System.out.printf("*����   : %d          *\n",30);  // \n\r�� ���°� ������̳� ������ ���� ���� �ֿܼ� �ؽ�Ʈ ��½� ��
		System.out.printf("*����   : %s\n", "����        *");
		System.out.printf("*Ű     : %dcm       *\n",168);
		System.out.printf("*������ : %.1fkg      *\n", 64.1);
		System.out.printf("*��°� : %s\n" , "�泲 ���ؽ� *");
		System.out.printf("*����   : %s\n", "����        *");
		System.out.println("***********************");
		System.out.println("*       �����մϴ�    *");
		System.out.println("***********************");
		// \t�� Ȱ���ؼ� �ڰ��� ���ߴ°��� ����. 
		
		
		Thread.sleep(5000); // 1000�и� �� �� 1��
	}
}
