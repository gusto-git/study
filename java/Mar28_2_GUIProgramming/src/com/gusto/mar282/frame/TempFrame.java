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
		// 섭씨 : 5 / 9 * (화씨 - 32) 
		// 화씨가 인트가 아니기때문에 인트로 바꿔야한다
		// Wrapper class(래퍼클래쓰) - 포장객체
		// 기본자료형을 객체로 다루기 위해서 사용하는 클래스
		// 자바의 기본형은 값을 가지는 객체 생성이 가능 
		// 기본형의 값을 내부에 두고 그 위를 포장하는 방식 
		// Boxing : 기본형을 래퍼클래스로 바꾸는 것
		// Unboxing : 래퍼클래스를 기본형으로 바꾸는 것
		// 문자열을 숫자열로 바꿀때 : integer class의 static함수
		// 숫자열을 문자열로 바꿀때 : integer.toString, Double.toString
		int faren = Integer.parseInt(field1.getText());
		double celcius = (double) 5 / 9 * (faren - 32);
		
		String c = new DecimalFormat("##.####").format(celcius);
		field2.setText(c);
		
		
		}
}
