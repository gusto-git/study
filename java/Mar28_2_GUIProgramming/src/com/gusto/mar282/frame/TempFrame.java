package com.gusto.mar282.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TempFrame implements ActionListener{
	private JPanel panel;
	private JLabel label1;
	private JLabel label2;
	private JTextField field1;
	private JTextField field2;
	private JButton button;
	
	public TempFrame() {
		// TODO Auto-generated constructor stub
	}

	public TempFrame(JPanel panel, JLabel label1, JLabel label2, JTextField field1, JTextField field2, JButton button) {
		super();
		this.panel = panel;
		this.label1 = label1;
		this.label2 = label2;
		this.field1 = field1;
		this.field2 = field2;
		this.button = button;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// ���� : 5 / 9 * (ȭ�� - 32) 
		// ȭ���� ��Ʈ�� �ƴϱ⶧���� ��Ʈ�� �ٲ���Ѵ�
		// Wrapper class(����Ŭ����) - ���尴ü
		// �⺻�ڷ����� ��ü�� �ٷ�� ���ؼ� ����ϴ� Ŭ����
		// �ڹ��� �⺻���� ���� ������ ��ü ������ ���� 
		// �⺻���� ���� ���ο� �ΰ� �� ���� �����ϴ� ��� 
		// Boxing : �⺻���� ����Ŭ������ �ٲٴ� ��
		// Unboxing : ����Ŭ������ �⺻������ �ٲٴ� ��
		// ���ڿ��� ���ڿ��� �ٲܶ� : integer class�� static�Լ�
		// ���ڿ��� ���ڿ��� �ٲܶ� : integer.toString, Double.toString
		int faren = Integer.parseInt(field1.getText());
		double celcius = (double) 5 / 9 * (faren - 32);
		
		String c = new DecimalFormat("##.####").format(celcius);
		field2.setText(c);
		
		
		}
}
