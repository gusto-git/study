// for, while, do-while - �ݺ���

public class RMain5 {
	public static void main(String[] args) {
		// �ݺ��� 10�� -> �ݺ��� �ѹ� �� ������ �ȳ��ϼ��� x3 ���� ���
		// ���ڱ� ���� 4�� ������ ���� �ʾ�.. 
		// �׹�°�� �ش��ϴ� �ȳ��ϼ���� ���ϰ� �ʹ�. 
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				continue; // �ش��ϴ� ������ �����ϰ� �������� 
			}
			System.out.printf("====%d=====\n", i);
			System.out.println("�ȳ��ϼ���");	
			System.out.println("�ȳ��ϼ���");	
			System.out.println("�ȳ��ϼ���");
		}
		System.out.println("==");	
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("��!" + i);
			}else {
//				continue; // ���� �ݺ� - > Ȧ���϶� else���� - > for������ ���ư� , ¦���� �� 
//			}
//			break;// �������� �ݺ��� ��!
			}return; // ����������� �Լ��� �� 
		}	
	}
}
