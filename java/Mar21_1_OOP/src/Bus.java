// Class : ��ü�� ���� Ʋ(����)
// function(�Լ�) - Ŭ���� �ۿ� ����� �� ���� �ڹٿ��� �Լ��� ���� �ȵǴ� ��
// method(�޼ҵ�) - Ŭ���� �ӿ� �ִ� ��(class�� ���ӵ� ��)
// ��� : ���±��� ��� �� �� method��

public class Bus {
	// �ɹ�����(member veriable, field, attribute)
	// �Ӽ� 
	// ��ü�� �����Ͱ� ����Ǵ� ���� 
	
		int busName;
		String bus;
		String busCompany;
		String busDriver;
		String startingPoint;
	
	// static ������ ���߿� ����
	public void printInfo() {
		// this : �ڱ��ڽ��� ���� (this. : ��������)
		System.out.println(this.busName);
		System.out.println(this.bus);
		System.out.println(this.busCompany);
		
		System.out.println(busDriver);
		System.out.println(startingPoint);
	}
	// method(����޼ҵ�) - �׼�, ���α׷��� �ʿ��� ���
	//					  - ��ü�� ���ۿ� �ش��ϴ� ���� ��� 
	
	public void go() {
		System.out.println("�θ��θ�~~");
	}

}
