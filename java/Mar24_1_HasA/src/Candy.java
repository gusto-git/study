// candy has a company : �����縦 �ǹ�(����� �̰� �´�)
// company has a candy : ��ǰ�� �ǹ� 
public class Candy {

	String name;
	String taste;
	Company brand; // �̰� �ϳ��� �߰��ϸ�ȴ�.
	
	// �⺻������(ctrl + space + enter)
	private void Candy() {
		
	}
	// ������ �����ε�(ctrl + shift + space)
	public Candy(String name, String taste) {
		super();
		this.name = name;
		this.taste = taste;
	}
	
	// �������
	public void printInfo() {
		System.out.println("�̸� : " + name );
		System.out.println("�� : " + taste );
	}
	
}
