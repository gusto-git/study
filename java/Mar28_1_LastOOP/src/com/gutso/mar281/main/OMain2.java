package com.gutso.mar281.main;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.gutso.mar281.avengers.Hulk;

public class OMain2 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("����");
		JButton jb = new JButton("�����ϱ�");
		jf.add(jb);
		
		// ��ũ�� �����ϰ� �����
		Hulk h = new Hulk();
		
		// �����ϱ� ��ư�� ������ ��ũ�� �����ϰ�
		jb.addActionListener(h);
		
		// ũ��, ���� ���̰� 
		jf.setSize(500, 500);
		jf.setVisible(true);
		
		
	}
}
