package com.gusto.mar282.frame;
// JFrame 생성(500,500)
// JPanel 안에 1~30 숫자가 랜덤한 위치에 나오게 만들기

import java.awt.Color;
import java.util.Iterator;
import java.util.Random;

// 숫자를 여러개 뽑을 때는 반복문이 필요함
// array[] 


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NumberFrame extends JFrame{
	JPanel p = new JPanel();
	JLabel[] l = new JLabel[31];
	// JLabel은 JFrame에서 글자를 쓸 때 사용하는 것 
	
	public NumberFrame() {
		p.setLayout(null); // 정렬을 안하겠다.
		p.setBackground(Color.green); // 배경색 바꾸기
		Random r = new Random(); // 위치 랜덤으로 바꾸기 위한 random
		int x = 0;
		int y = 0;
		for (int i = 1; i < 31; i++) {
			l[i] = new JLabel(" " + i); // 반복문의 i 번째 숫자를 JLabel에 넣겠다.
			x = r.nextInt(500)+1 ;
			y = r.nextInt(500)+1 ;
			l[i].setLocation(x, y); // 해당하는 숫자의 위치를 조절하겠다.
			l[i].setSize(50, 50); // 각 숫자별 크기를 지정하겠다.
			l[i].setForeground(Color.DARK_GRAY); // 숫자의 색깔
			
			p.add(l[i]); // 하나 완되면 JPanel에 넣고 
		}
		
		add(p); // JFrame에 반복문에서 한 것들을(JPanel)에 넣겠다.
		setTitle("뒤죽박죽 숫자"); // 제목을 바꾸겠다.
		setSize(500, 500); // 판넬의 사이즈를 정하겠다.
		setVisible(true); // 눈에 보이게 만들어라
	}
	
}
