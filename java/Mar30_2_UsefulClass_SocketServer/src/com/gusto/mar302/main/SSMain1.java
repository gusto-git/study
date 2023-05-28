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

// 통신
//		일반적인 통신 (요청하면 답 오는 것) - HTTP통신
//		실시간 통신 (냅다 답 오는 것) - Scoket 통신

// 서버	- 서비스를 제공하는 컴퓨터

// 클라이언트 - 서비스를 이용하는 컴퓨터 

// ip주소 - network 통신을 할 때 사용하는 전화번호 같은..
//		확인 : 시작 - cmd - ipconfig
// 		IPv4 주소 : 58.126.147.45

// 포트번호 -   무슨 서비스를 이용하러 가나
//				0 ~ 65535 까지 있음
//				웹서비스 : 80번
//				OracleDB : 1521번
//				이미 약속된 포트번호가 많기 때문에 4자리 이상 넘게 지정
//				2766

public class SSMain1 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(64435); // 잠시 비워 둠
			System.out.println("..."); // 연결되는 느낌
			Socket s = ss.accept(); // 받아들인다.
			System.out.println("연결됨!");
			
			// 프로그램 -> 외부로 보내는
			Scanner k = new Scanner(System.in);
			OutputStream os = s.getOutputStream();
			OutputStreamWriter ows = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(ows);
			
			// 외부 -> 프로그램
			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			// 눈에 보이게  시각적으로 만들기 
			JFrame jf = new JFrame();
			JTextArea jta = new JTextArea();
			jf.add(jta);
			jf.setSize(500, 500);
			jf.setVisible(true);
			
			Thread t = new Thread() { // 익명 내부 클래스
				@Override
				public void run() {
					super.run();
					while (true) {
						try {
							jta.append("상대] " + br.readLine() + "\r\n");
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}; // ;까지 써야함
			t.start();
			while (true) {
				System.out.println("나] ");
				String msg = k.next();
				bw.write( msg + "\r\n");
				jta.append("나]"+msg+"\r\n");
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