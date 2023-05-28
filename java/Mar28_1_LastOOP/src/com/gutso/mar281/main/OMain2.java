package com.gutso.mar281.main;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.gutso.mar281.avengers.Hulk;

public class OMain2 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("지구");
		JButton jb = new JButton("공격하기");
		jf.add(jb);
		
		// 헐크가 공격하게 만들것
		Hulk h = new Hulk();
		
		// 공격하기 버튼을 누르면 헐크가 공격하게
		jb.addActionListener(h);
		
		// 크기, 눈에 보이게 
		jf.setSize(500, 500);
		jf.setVisible(true);
		
		
	}
}
