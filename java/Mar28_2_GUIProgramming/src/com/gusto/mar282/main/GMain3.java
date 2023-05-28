package com.gusto.mar282.main;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.gusto.mar282.frame.BMIFrame;

// BMI ���� = BMIFrame
// Ű, ������, ���, Ȯ�ι�ư
// Double.parseDouble
// sysof -> String.format("%s�Դϴ�") : bmi : �� %�� ����� �����Դϴ�.
// bmi = w / (h * h) -> h�� meter ���� 
// 18.5 �̸� ��ü�� / 18.5 �̻� ���� / 25 �̻� ��ü�� 
// 30 �̻� �浵�� / 35 �̻� �ߵ �� / 40 �̻� ����

public class GMain3 {
	public static void main(String[] args) {
		
		JFrame jf = new JFrame("BMI �˻�");
		// 2�� 3�� GridLayout
		GridLayout gl = new GridLayout(3,2); // 3�� 2��
		jf.setLayout(gl);
		
		
		JLabel label1 = new JLabel("Ű : ");
		jf.add(label1);
		JTextField field1 = new JTextField();
		jf.add(field1);
		
		JLabel label2 = new JLabel("������ : ");
		jf.add(label2);
		JTextField field2 = new JTextField();
		jf.add(field2);
		
		JLabel label3 = new JLabel("��� : " );
		jf.add(label3);
		
		JButton button = new JButton("�˻�");
		jf.add(button);
		
		BMIFrame bf = new BMIFrame(label3, field1, field2);
		button.addActionListener(bf);
		
		jf.setSize(450, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		

			
		
	}
}
