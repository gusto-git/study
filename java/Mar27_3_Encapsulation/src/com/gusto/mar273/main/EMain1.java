package com.gusto.mar273.main;

// import javax.swing.JFrame; // ctrl shift o �� �������� 

import com.gusto.mar273.coffee.Coffee;
import com.gusto.mar273.human.Human;

public class EMain1 {
	public static void main(String[] args) {

		Coffee c = new Coffee();
		// c.set�������� ���ؼ� ���� ������ �� �ְ� �ȴ�. -> set ���� Coffee class���� get&set ������ �켱������ �ؾ��Ѵ�.
		c.setName("�Ƹ޸�ī��"); 
		c.setPrice(3000);
		c.printInfo();
		// System.out.println(c.getName); �����ϴ�. / set�� ���ϸ� ���� ����� �Ұ����ϴ�. 
		
		Coffee c1 = new Coffee("��ī���� �Ƹ޸�ī��", 3500);
		c1.printInfo();
		// System.out.println(c1.name); �Ұ����ϴ�.
		
		// ��� class
		// �̸� ���� ������ 
		Human h = new Human();
		h.setName("�浿");
		h.setAge(-25); // ���̴� -�� ��� �̰� ������ ���� ����� ������
		System.out.println(h.getAge());
		
		
		
	}
}

//// Ÿ��Ʋ�� �������� JFrame
///* jf + �ڵ��ϼ� */ 
//
//JFrame f = new JFrame("������"); // �� ��ü�� �������� �Ͱ� ����.
//// ����� 300, 500���� ����
//f.setSize(300, 500);
//
//// ���̰� �ϰ����
//f.show(); // deprecated �������� ����.. 
//
//// Ÿ��Ʋ�� �������� �����ϰ�ʹ�.
//f.setTitle("������");
//
//// ���̰� �ϴ� ��
//f.setVisible(true);






