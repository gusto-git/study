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
		
		String result = "저체중";
		if (bmi >= 40) {
			result = "고도비만";
		}else if (bmi >= 35) {
			result = "중등도비만";
		}else if (bmi >= 30) {
			result = "경도비만";
		}else if (bmi >= 25) {
			result = "과체중";
		}else if (bmi >= 18.5) {
			result = "정상";
		}
		
		// bmi = xx. xx% 고 , 당신은 xx입니다.
		// syso -> string.format();
		// String을 잡아서 형식 만드기
		String finalResult = String.format("BMI : %.2f%%, 당신은 %s입니다.", bmi, result);
		label3.setText(finalResult);
		
	}
}
