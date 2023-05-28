package com.gusto.mar282.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class BMIFrame implements ActionListener{
	
	

	private JLabel label3;
	private JTextField filed1;
	private JTextField filed2;

	
	public BMIFrame() {
		// TODO Auto-generated constructor stub
	}

	
	public BMIFrame(JLabel label3, JTextField filed1, JTextField filed2) {
		super();
		this.label3 = label3;
		this.filed1 = filed1;
		this.filed2 = filed2;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		double checkH = Double.parseDouble(filed1.getText());
		checkH /= 100;
		double checkW = Double.parseDouble(filed2.getText());	
		double bmi = checkW / (checkH * checkH);
		
		String result = "��ü��";
		if (bmi >= 40) {
			result = "����";
		}else if (bmi >= 35) {
			result = "�ߵ��";
		}else if (bmi >= 30) {
			result = "�浵��";
		}else if (bmi >= 25) {
			result = "��ü��";
		}else if (bmi >= 18.5) {
			result = "����";
		}
		
		// bmi = xx. xx% �� , ����� xx�Դϴ�.
		// syso -> string.format();
		// String�� ��Ƽ� ���� �����
		String finalResult = String.format("BMI : %.2f%%, ����� %s�Դϴ�.", bmi, result);
		label3.setText(finalResult);
		
	}
}
