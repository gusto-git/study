
public class OMain2 {
	public static void main(String[] args) {
		
		// start �޼ҵ��� �Ķ���ͷ� ����ϱ� ���� Friend Ŭ���� ��ü�� �θ���
		// Me Class�� start �޼ҵ� �ȿ��� �ҷ��� ������
		// �Ķ���ͷ� �ʿ䰡 �����Ƿ� main �޼ҵ忡���� �θ� �ʿ䰡 ����! 
		Referee r = new Referee();
		Friend2 f = new Friend2(); // ��ü�� �ҷ��´� -> f�� �ν��Ͻ���, �ν��Ͻ��� �����Ѵ�. 
		r.start(f);
	}
}
// �̰� ���� 