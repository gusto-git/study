package com.gusto.mar301.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.channels.FileLockInterruptionException;

public class EncodingMain {
	// Encoding : ������ ���ֳ� ������ ��ȯ�ϴ� ����
	// ��ǻ�� : ���ڱ��(���Ⱑ �帣�ų�, �帣�� �ʰų�)
	// '��'�� ������ �帧���� ǥ�� -> Encoding
	
	// Decoding : ���ڵ� �� ������ ��� ���� �� ������ ���� ���·� ��ȯ
	// ������ �帧 -> '��' -> decoding
	
	// Encoding ��Ŀ��� ���� ������ �ִ�.
	// ��ħ - A -> 1010 - A -> ��ħ
	// ��ħ - B -> 0101 - C -> ����
	// ��ħ - C -> 0100 - ? -> ?!?!?
	
	// �� ���������� �ַ� : UTF-8(Unicode Transform Format)
	// �ѱ� �ַ� : EUC-KR
	// MicroSoft : MS949
	// ���ڵ��� ���� �������� ������ OS���� ����ϴ� ���ڵ����� �����͸� �����Ѵ�. Windows�� MS949 ���� 
	public static void main(String[] args) {
//		FileOutputStream fos = null;
//		try { // ������ ���� �Ǵ� ������ ������� �ش� ������ ã���ִ� ������ �Ѵ�.
//			fos = 
//			  new FileOutputStream("C:\\Users\\yt866\\Desktop\\fos\\lee.txt", true);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		OutputStreamWriter osw = null;
//		try { // ���ڵ� ��� ���� 
//			osw = new OutputStreamWriter(fos, "UTF-8");
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		BufferedWriter bw = null;
//		try {
//			bw = new BufferedWriter(osw);
//			bw.write("���� ������ ������");
//			bw.append("\r\n��� �");
//			bw.append("\r\n�����ε�");
//			bw.append("\r\n�ٷ����Ű���");
//			bw.flush();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		// inputStream : �پ��� �ҽ��� ���� �����͸� �о���� ���� �߻� Ŭ����
		// ���� ���� ���� ��������
		BufferedReader br = null; // �� �پ� �����͸� �о���� ����
		try { // try �ȿ��� ���� ������ �ۿ��� ���� ����.
			FileInputStream fis = new FileInputStream("C:\\Users\\yt866\\Desktop\\fos\\lee.txt"); // ���Ϸκ��� �����͸� �о���� ���� Ŭ����
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); // inputSteam�� Reader�� ��ȯ���ִ� ���� 
			br = new BufferedReader(isr);
			String line = null; // ���� ���� ���� �� �ӽ������� ���� ���� , ���ο��� ���� ������ try ���ο� ���� ����
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
