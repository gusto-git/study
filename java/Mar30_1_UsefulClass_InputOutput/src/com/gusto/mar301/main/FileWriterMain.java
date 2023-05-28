package com.gusto.mar301.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

// CPU : ������ġ
// RAM : ������ġ(�ӽ�) - ������ϸ� ���ư� 
//                      - Static / Stack : ���α׷� ����(�����ϸ�) ���ư�
//                      - heap : �ڵ����� ���ư��� ����(GC�� ������ �ڵ����� ó�� ����)
// HDD(SSD) : ������ġ(����) - ����
// GPU : �׷���ó����(CPU + RAM + HDD)

// ���α׷������� �����͸� �ܺο��� �а�, �ٽ� �ܺη� ����ϴ� �۾��� ����
// �����ʹ� ����ڷκ��� Ű���带 ���� �Էµ� �� �ְ�(Scanner), 
// ����, ��Ʈ��ũ������ �Էµ� �� �ִ�.(Input)

// �ݴ��, �����ʹ� ����͸� ���� ��µ� ���� �ְ�(System.out.println)
// ����, ��Ʈ��ũ�ε� ��µ� �� �ִ�.(Output)

// System.in -> InputStream
// System.out -> PrintStream

// Stream : ��� , ���� (�����Ͱ� �Ű����� ���)
// �⺻��
// 		InputStream : ��ġ(Ű����, ����, ��Ʈ��ũ ..) -> ���α׷����� �Է�(1Byte�� �̵�)
//		InputStreamReader : ��ġ -> ���α׷�(2Byte��) : ���(����)�� ũ�� UP!
//		BufferedReader : (1String - line(����)) : ���(����)�� ũ�� UP! *** ���� ���� ����Ѵ�.

//		OutputStream : ���α׷��� ����� -> ��ġ�� ���(1Byte��)
//		OutputStreamWriter : ���α׷��� ���(2Byte��) -> ��ġ : ���(����)�� ũ�� UP!
//		BufferedWriter : ���α׷��� ���(1String - line(����)) -> ��ġ: ���(����)�� ũ�� UP! *** ���� ���� ����Ѵ�.
// ������(Ư�� ������)
//		PrintStream(OutputStream ����) : ���� ���ϰ� ������ �޼ҵ带 �߰��� ��
//		FileReader(InputStreamReader ����) : ���Ͽ��� ������ �о���� ���ϰ� ���� ��
//		FileWriter(OutputStreamWriter ����) : ������ ����ϱ� ���ϰ� ���� ��

public class FileWriterMain {
	public static void main(String[] args) {
		// System.in : �ܼ�â(��ġ) -> ���α׷�(InputStream)
		// JDK1.5���� Scanner ��� �߰� ! 
		// InputStream ����� ���ϰ� ����Ʈ
		Scanner k = new Scanner(System.in);
		System.out.println("�Է� : ");
		String cmt = k.next();
		
		// System.out : ���α׷� -> �ܼ�â(PrintStream)
		System.out.println("-------------------");
		
//		FileWriter
//			���α׷����� ���� ����(OutputStreamWriter�� ������)
//			������ ������ ������ �������ش�.
//			������ �������� ����
//			Linux ��� : "C:/Users/yt866/Desktop/fos/lee1.txt" -> /�� ��μ����ؾ��Ѵ�.
//			Windows ��� : "C:\\Users\\yt866/Desktop/fos/lee1.txt" -> / �Ǵ� \\�� ��� �����ؾ��Ѵ�.
//			Java���� \�� �̽������� ���ڿ� ����� �ȴ�.(\r,\n,\t...)
//			%%�� % ���� ���� \\�� \�� ���� ��

//			����, ������ ��Ÿ��, .... ������ -> ����ó���ϱ� ���� try-catch�� �־ �ۼ��Ѵ�.
		
		
		// fw���� bw�� ���� ����
		// ������ �͵� �߿� �ϳ��� ������ �� ó�� �ȴ�. 
		// bw�� ������ fw�� ���� �����ٴ� ��
		BufferedWriter bw = null; // ���߿� �ݾƾ��ؼ� �ۿ��ٰ� ����
		try {
			// ��ο� ������ lee1.txt ���� �̹� �����ϸ� ��� 
			// ������ �ִ� ���� �� ������(����)�� �������.
			// ������ �ִ� ���� �ڷ� �����̰� ������(�����͸� �߰��ϰ� ������)
			// �ι�° �Ķ���Ϳ� ������ true�� �ָ� �ȴ�.
			
			// Encoding ��� ���� X -> ANSI(�̱� ǥ��)�� ���ڵ� ��
			FileWriter fw = new FileWriter("C:\\Users\\yt866/Desktop/fos/lee1.txt", true); // /�� 1�� \\ �ΰ� 
			// �� ����Ʈ �� �Է��ϱ� ���ٴ�
			// '����'�� �̿��ؼ� �ѹ��� ���� ����Ʈ�� ������ϴ� ���� ����
			//  -> ��κ��� ����� �۾����� ��� 
			//  ���� : CPU�� HDD ���̿��� ���Ǵ� �ӽ����� ����
			//	���۸� : <������>�� ���۷� �����ϴ� ����
			
			bw = new BufferedWriter(fw);
			
			bw.write(cmt + "\r\n");
			bw.write("========\r\n");
			bw.flush(); // ���۸� ���� ������ ����� �뵵: ���ۿ뷮�� �� ä������ �ʾƵ� ���������� ��������(��� ������ ��������)
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
