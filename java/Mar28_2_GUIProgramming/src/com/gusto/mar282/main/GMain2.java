package com.gusto.mar282.main;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.gusto.mar282.frame.TempFrame;

// ȭ�� �µ� -> ���� �µ��� ��ȯ
public class GMain2 {
	public static void main(String[] args) {
		
		// �Ѹ� �����
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		jf.add(jp);
		
		JLabel label1 = new JLabel("ȭ���µ� : ");
		JLabel label2 = new JLabel("�����µ� : ");
		JTextField field1 = new JTextField(15);
		JTextField field2 = new JTextField(15);
		JButton button = new JButton("��ȯ");
		
		// ���� ������ ���� �����°� �޶�����.
		jp.add(label1);
		jp.add(field1);
		jp.add(label2);
		jp.add(field2);
		jp.add(button);
		
		TempFrame tFrame = new TempFrame(jp, label1, label2, field1, field2, button);
		button.addActionListener(tFrame); // ��ư ������ ��� �����ϰ� ����� ��
		
		jf.setSize(300, 150);
		//�������� ���� ���α׷��� ����ǰ�
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("�µ���ȯ��");
		jf.setVisible(true);
		
	}
}
