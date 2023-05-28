package com.gusto.mar277.frame;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// JFram : Swing���� �����츦 ��Ÿ���� Class
// 	JPanel(���� ������), JButton(��ư), JLabel(��), JTextfield(�����Է�).....

// GUI Library
//		- AWT (�׸��� ��ü�� �ü��) - OS�� ���� �����̴ٸ�
//		- SWing (�׸��� ��ü�� �ڹ�) - OS�� ������ ���� ����
//			* AWT�� SWing�� ������ ȣȯ = ���� ����� �����ϴ�.

//	layout : 
//		FlowLayout : ��� ����
//		Border Layout : Frame ����
//		Grid Layout : ���� ����
//		setLocation, setBounds : ��ġ ���Ƿ� ���� 


public class MakeFram extends JFrame{// jf + �ڵ��ϼ�
	JPanel pl; // ����Ʈ ���ܾ���
	
	// �⺻ ������(Constructor) 
	public MakeFram() {
		setSize(500, 500); // Frame size
		setTitle("GUI ����");
		pl = new JPanel(); // �г� ��ü �ϳ� ���� 
		pl.setLayout(new FlowLayout()); // ��� ���� 
		for (int i = 1; i < 11; i++) {
			pl.add(new JButton("��ư" + i)); // pl�ȿ� button���� ��Ȳ
		}
		
		add(pl); // JPanel�� JFrame �ȿ� �ֱ�
		setVisible(true); // JFrame ���̰� �ϱ� (�ݴ� : false)
		
	}
	

}
