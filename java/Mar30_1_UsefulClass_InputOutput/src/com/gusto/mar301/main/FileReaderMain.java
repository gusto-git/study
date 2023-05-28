package com.gusto.mar301.main;

import java.io.BufferedReader;
import java.io.FileReader;

//txt���� �о����
public class FileReaderMain {
	public static void main(String[] args) {
		// Windows�� ��ο� ��ҹ��� ���� ����
		// Linux�� ��ҹ��� ö���ϰ� ����

		// fr ������ br�� �� ���� ���� 
		// �ϳ��� �ݾƵ� ������ �͵��� �� ó���� ��
		BufferedReader br = null;
		try {
			// ���� -> ���α׷� (InputStreamReader ����)
			FileReader fr = new FileReader("C:\\Users\\yt866\\Desktop\\fos\\lee1.txt");
			br = new BufferedReader(fr);
			
			String line = null;
			while ((line = br.readLine()) != null) { // �����ٿ� ������ ������
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
