package com.gusto.mar282.main;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.gusto.mar282.frame.BMIFrame;

// BMI 계산기 = BMIFrame
// 키, 몸무게, 결과, 확인버튼
// Double.parseDouble
// sysof -> String.format("%s입니다") : bmi : 몇 %고 당신은 정상입니다.
// bmi = w / (h * h) -> h는 meter 단위 
// 18.5 미만 저체중 / 18.5 이상 정상 / 25 이상 과체중 
// 30 이상 경도비만 / 35 이상 중등도 비만 / 40 이상 고도비만

public class GMain3 {
	public static void main(String[] args) {
		
		JFrame jf = new JFrame("BMI 검사");
		// 2열 3행 GridLayout
		GridLayout gl = new GridLayout(3,2); // 3행 2열
		jf.setLayout(gl);
		
		
		JLabel label1 = new JLabel("키 : ");
		jf.add(label1);
		JTextField field1 = new JTextField();
		jf.add(field1);
		
		JLabel label2 = new JLabel("몸무게 : ");
		jf.add(label2);
		JTextField field2 = new JTextField();
		jf.add(field2);
		
		JLabel label3 = new JLabel("결과 : " );
		jf.add(label3);
		
		JButton button = new JButton("검사");
		jf.add(button);
		
		BMIFrame bf = new BMIFrame(label3, field1, field2);
		button.addActionListener(bf);
		
		jf.setSize(450, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		

			
		
	}
}
