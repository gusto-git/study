package com.gusto.mar282.frame;
// JFrame ����(500,500)
// JPanel �ȿ� 1~30 ���ڰ� ������ ��ġ�� ������ �����

import java.awt.Color;
import java.util.Iterator;
import java.util.Random;

// ���ڸ� ������ ���� ���� �ݺ����� �ʿ���
// array[] 


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NumberFrame extends JFrame{
	JPanel p = new JPanel();
	JLabel[] l = new JLabel[31];
	// JLabel�� JFrame���� ���ڸ� �� �� ����ϴ� �� 
	
	public NumberFrame() {
		p.setLayout(null); // ������ ���ϰڴ�.
		p.setBackground(Color.green); // ���� �ٲٱ�
		Random r = new Random(); // ��ġ �������� �ٲٱ� ���� random
		int x = 0;
		int y = 0;
		for (int i = 1; i < 31; i++) {
			l[i] = new JLabel(" " + i); // �ݺ����� i ��° ���ڸ� JLabel�� �ְڴ�.
			x = r.nextInt(500)+1 ;
			y = r.nextInt(500)+1 ;
			l[i].setLocation(x, y); // �ش��ϴ� ������ ��ġ�� �����ϰڴ�.
			l[i].setSize(50, 50); // �� ���ں� ũ�⸦ �����ϰڴ�.
			l[i].setForeground(Color.DARK_GRAY); // ������ ����
			
			p.add(l[i]); // �ϳ� �ϵǸ� JPanel�� �ְ� 
		}
		
		add(p); // JFrame�� �ݺ������� �� �͵���(JPanel)�� �ְڴ�.
		setTitle("���׹��� ����"); // ������ �ٲٰڴ�.
		setSize(500, 500); // �ǳ��� ����� ���ϰڴ�.
		setVisible(true); // ���� ���̰� ������
	}
	
}
