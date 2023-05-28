package com.gusto.mar302.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextArea;

// ���
//		�Ϲ����� ��� (��û�ϸ� �� ���� ��) - HTTP���
//		�ǽð� ��� (���� �� ���� ��) - Scoket ���

// ����	- ���񽺸� �����ϴ� ��ǻ��

// Ŭ���̾�Ʈ - ���񽺸� �̿��ϴ� ��ǻ�� 

// ip�ּ� - network ����� �� �� ����ϴ� ��ȭ��ȣ ����..
//		Ȯ�� : ���� - cmd - ipconfig
// 		IPv4 �ּ� : 58.126.147.45

// ��Ʈ��ȣ -   ���� ���񽺸� �̿��Ϸ� ����
//				0 ~ 65535 ���� ����
//				������ : 80��
//				OracleDB : 1521��
//				�̹� ��ӵ� ��Ʈ��ȣ�� ���� ������ 4�ڸ� �̻� �Ѱ� ����
//				2766

public class SSMain1 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(64435); // ��� ��� ��
			System.out.println("..."); // ����Ǵ� ����
			Socket s = ss.accept(); // �޾Ƶ��δ�.
			System.out.println("�����!");
			
			// ���α׷� -> �ܺη� ������
			Scanner k = new Scanner(System.in);
			OutputStream os = s.getOutputStream();
			OutputStreamWriter ows = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(ows);
			
			// �ܺ� -> ���α׷�
			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			// ���� ���̰�  �ð������� ����� 
			JFrame jf = new JFrame();
			JTextArea jta = new JTextArea();
			jf.add(jta);
			jf.setSize(500, 500);
			jf.setVisible(true);
			
			Thread t = new Thread() { // �͸� ���� Ŭ����
				@Override
				public void run() {
					super.run();
					while (true) {
						try {
							jta.append("���] " + br.readLine() + "\r\n");
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}; // ;���� �����
			t.start();
			while (true) {
				System.out.println("��] ");
				String msg = k.next();
				bw.write( msg + "\r\n");
				jta.append("��]"+msg+"\r\n");
				bw.flush();
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try { // 
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
// 58.126.147.45