// Java : ����� ������ �Ϻ��ϴ�(Perfect) -> ��ü���� �� ���⿡ 
// c++ , Python : Hybrid�� ��ü ���� ���

// �ǻ�Ȱ�� �������� > ���Ⱑ ������ �� > ���������� ����!


// main�Լ��� �ִ� Ŭ���� : xxxMain���� �ʿ��� Ŭ������ ctrl + Ŭ���ϸ� �ʿ��� class�� �Ѿ����.
public class OMain2 {
	public static void main(String[] args) {
		// ������ �ڹٷ� ǥ�� -> ǥ���ϰ� ���� �� �׻� Ŭ������ ���� ������
		// �뼱��ȣ / ���� / ����ȸ�� / ���� ���� / ������ -> ���
		// Ŭ���� ���Ͽ� main�� ����ȵȴ�.
		
		
	Bus b = new Bus();
	b.busName = 128;
	b.bus = "bus";
	b.busCompany = "���߹���";
	b.busDriver = "����";
	b.startingPoint = "���� ���굿 ������";
	
	System.out.println(b.busName);
	System.out.println(b.bus);
	System.out.println(b.busCompany);
	System.out.println(b.busDriver);
	System.out.println(b.startingPoint);
	b.printInfo(); // �� �޼ҵ��� this�� b�� �ǹ� (Bus Ŭ�������� �ҷ��ͼ� ���)
	b.go();
	// �ڵ���
	// �𵨸� / ������ / ���� / ������� / ��ȭ������ "�츮��~"
	System.out.println("====phone=====");
	Phone p = new Phone();
	System.out.println(p); // �⺻���� �ƴ� �͵��� ���� �������̶� �ּҰ�����
	p.info();// �� �ڷ��� �⺻���� ��µȴ�. �����ϱ����̶�
	p.model = "z�ø�3"; 
	p.brand = "SAMSUNG";
	p.price = 1200000;
	
	p.info();// �� �ڷ������� �⺻�� 
	p.call();
	System.out.println("---------------");
	Phone p1 = p;
	//p�� ���� �Ӽ����� ���� p1����
	// * ������ new�� �����ؾ��� �ּҰ�/�������� �޶�����.
	System.out.println(p1); // p�� �ּҰ�/�������� ����. / �����ϳ��� �� �߰��� ��
	// �ڵ��� �ϳ��� �θ��� �����ϰ� �ִ� ��Ȳ�̴�.
	p1.price = 1110000;
	p1.info();
	p.info();// p1���� �ٲٸ� p���� ������ �ִ�.
	System.out.println("---------------");
	WhatIsValue value = new WhatIsValue();
	value.printInfo();
	}	
}
