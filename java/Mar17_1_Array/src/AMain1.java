//����
// ����1 : ������1
//�迭(Array) "[]"
// ����1 : ������n

//�迭 : 
//	���� Ÿ��(�ڷ���)�� ���� ������ �ϳ��� �������� �ٷ�� ��
//	�迭 �ӿ� �ִ� ������ ������[���]��� �θ�
//  �� ��Ҹ��� �ٿ��� �Ϸù�ȣ�� ���� -> �� ��Ҹ� �����ϴ� �� ���
//  index(�ε���)/�Ϸù�ȣ : ������ 0����! 

// �迭���� 
// �ڷ���[] ������; // �迭����
// ������ = new �ڷ���[�迭 ������ ����]; // �迭 ���� 
// �ڷ���[] ������ = new �ڷ���[�迭 ������ ����]; ���� 
// ������(string)�� heap�� ����ȴ�. 
// ������(�迭)�� heap�� ����ȴ�.
// �׷��� syso(eng) ������ �̻��� ���� ���´�. [I@2a139a55 << ������ �ּҰ�


public class AMain1 {
	public static void main(String[] args) {
		int[] eng = new int[3]; // �ڷ���(int)[] ������(eng) = new �ڷ���(int)�迭 ������ ����[3]
		eng[0] = 100;
		eng[1] = 70;
		eng[2] = 50; // int[3]�� �����߱� ������ eng[0]~eng[2] ���� ����
		System.out.println(eng); // [I@2a139a55�� stack���� �Ѿ��. 
		for (int i = 0; i < eng.length; i++) { // .length : �� �迭�� ��Ұ� ����� �˷��ش�.
											   // .size() : �� �ʿ��� ��쵵 �ִ�. 
			System.out.println(eng[i]); // �̷��� �ؾ��� �����̵ȴ�.
		}
		System.out.println("==================");
		int[] math = new int[] {10, 20, 30}; // ��� ������ ��� ���� 
		System.out.println(math);
		for (int i = 0; i < math.length; i++) {
			System.out.println(math[i]);
		}
		System.out.println("--------------------");
		int[] kor = {60, 40, 20}; // ��¥ ���;
		for (int i= 0;  i< kor.length; i++) {
			System.out.println(kor[i]);
		}
		System.out.println("--------------------");
		int a = 100;
		int[] b = {10,20};
		System.out.println(a);
		System.out.println(b); // ������ ������(�ּҰ�)
//		b[2] = 30; // ERROR!(�迭�� ó���� ������ ������ ����� ����)
//		System.out.println(b[2]); // ��Ҹ� �߰��ϴ°� �����ʾ� Ȱ�뵵�� ����
		
		System.out.println("--------------------");
		int[][] score = {{100,80},{50,30},{70,90}};// 2���� �迭 ... �Ÿ�����
		System.out.println(score); // score ��ü�� ���� �ּҰ� ���
		System.out.println(score[0]); // score(0 ��° �л��� ����) �ּҰ� ���
		System.out.println(score[0][0]); // score(0 ��° �л�)�� ���� 0��° ���� �ּҰ� ���
		// ���� : �ּ��� ���� �ؼ��� �����Ѱ�? -> ����� 
		
		//java ���ϴ»�� 
		// ���ǹ� 
		// �ݺ��� 
		// �迭..? �ٸ� ���� �߿�  ��� ���߿� ��� �÷���!!! �̰� �߿��ϴ�
		
	}
}
