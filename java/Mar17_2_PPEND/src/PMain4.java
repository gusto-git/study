
public class PMain4 {
	public static void main(String[] args) {
		String[] ss = {"����", "����", "����", "�Ф�"};
		//���� ���
		System.out.println(ss[0]);
		System.out.println(ss[1]);
		System.out.println(ss[2]);
		System.out.println(ss[3]);
		System.out.println("--------------------");
		
		//�ѹ��� ����ϴ� ���
		String s = null;
		// �Ʒ� ���� for���� �������� 
		for (int i = 0; i < ss.length; i++) {
			s = ss[i]; // �ݺ����� ���鼭 ss[0], ss[1] ... ��ӵ��鼭
			System.out.println(s);
		}
		
	//	for - each (���� for��)
	//	�迭�� ��Ҹ� ������ ���� ��� x
	//  �迭 ���� ��ü�� ���� ���� �ƴ϶� �����ش� ���� ����
	//	�������� ���� x 
	//  �����ؼ� ���°�
	//  ���� : ���� ������ �ȵ� 
	//  �ε���(i)�� ��� ���ϴ� ���� �����ϴ� ���� �Ұ��� 
	//  Ȱ�뵵�� �������� �� 
	
		// for (�ڷ��� ������ : �迭){
		//����
		//}
		System.out.println("------------------");
		for (String s1 : ss) { // �迭  ss�� ��Ҹ� s1�̶�� �׸��� �ӽ÷� ����
			System.out.println(s1);//���(�迭 ��Ҹ� ������� ������ �������)
		}
	}
}
