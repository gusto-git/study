package com.gusto.mar282.main;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.gusto.mar282.frame.TempFrame;

// 화씨 온도 -> 섭씨 온도로 변환
public class GMain2 {
	public static void main(String[] args) {
		
		// 겉면 만들기
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		jf.add(jp);
		
		JLabel label1 = new JLabel("화씨온도 : ");
		JLabel label2 = new JLabel("섭씨온도 : ");
		JTextField field1 = new JTextField(15);
		JTextField field2 = new JTextField(15);
		JButton button = new JButton("변환");
		
		// 놓는 순서에 따라 나오는게 달라진다.
		jp.add(label1);
		jp.add(field1);
		jp.add(label2);
		jp.add(field2);
		jp.add(button);
		
		TempFrame tFrame = new TempFrame(jp, label1, label2, field1, field2, button);
		button.addActionListener(tFrame); // 버튼 누르면 기능 동작하게 만드는 것
		
		jf.setSize(300, 150);
		//프레임을 끄면 프로그램이 종료되게
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("온도변환기");
		jf.setVisible(true);
		
	}
}
