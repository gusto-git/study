package com.gusto.mar277.frame;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// JFram : Swing에서 윈도우를 나타내는 Class
// 	JPanel(보조 프레임), JButton(버튼), JLabel(라벨), JTextfield(글자입력).....

// GUI Library
//		- AWT (그리는 주체가 운영체제) - OS에 따라 외형이다름
//		- SWing (그리는 주체가 자바) - OS의 도움을 받지 않음
//			* AWT와 SWing은 완전히 호환 = 같이 사용이 가능하다.

//	layout : 
//		FlowLayout : 가운데 정렬
//		Border Layout : Frame 형식
//		Grid Layout : 격자 형태
//		setLocation, setBounds : 위치 임의로 지정 


public class MakeFram extends JFrame{// jf + 자동완성
	JPanel pl; // 임포트 생겨야함
	
	// 기본 생성자(Constructor) 
	public MakeFram() {
		setSize(500, 500); // Frame size
		setTitle("GUI 연습");
		pl = new JPanel(); // 패널 객체 하나 생성 
		pl.setLayout(new FlowLayout()); // 가운데 정렬 
		for (int i = 1; i < 11; i++) {
			pl.add(new JButton("버튼" + i)); // pl안에 button넣은 상황
		}
		
		add(pl); // JPanel을 JFrame 안에 넣기
		setVisible(true); // JFrame 보이게 하기 (반대 : false)
		
	}
	

}
