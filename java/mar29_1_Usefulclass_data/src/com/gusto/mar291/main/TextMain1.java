package com.gusto.mar291.main;

import java.text.DecimalFormat;
import java.util.StringTokenizer;

// ���� 1.8.12
//  ���ڸ�(1) : major ����
//	���ڸ�(8.12) : minor ����
//		�� �ڸ��� �� ���� �� minor�ϴ�
//		1.8.12 -> 1.8.13 ���׷��̵�(������) : ��¦ ����
//		1.8.12 -> 1.9.0 ���׷��̵�(������) : ��ȭ�� ������� ������ ��
//		1.8.12 -> 2.0.0 ���׷�����(������) : ���ο� ���α׷� ������ ��ȭ 

// ��Ʈ��ũ�� ���ؼ� �����͸� �޾ƿ��� : �������·� �޾�����.
// ����Ʈ��ũ�� ���ؼ� �����͸� �� �� : �������·� �޾�����.
// �ѱ�ó���� ��ٷο��� �� �ۿ� ����. : �ѱ��� �����ؼ� �ѱ��ڰ� ���������, �ٸ����� �����ؼ� ����� ��

public class TextMain1 {
	public static void main(String[] args) {
		String s1 = "������ �ݿ����� �ް�!"; // ��Ĺ���
		String s2 = new String("���� ������ ����~ ���� �Ϸ����� �ھ���"); // ���Ĺ��� 
		
		// �ܿ������� ã�ƺ��� (�ڵ��ϼ��� �ִ� ��� �о�鼭)
		// s2���� 5�� °�� �ִ� ���� ����ϱ� 
		// charAt(i) : Ư�� ��ġ�� �ִ� ���� ���� �� ���
		System.out.println(s2.charAt(5));
		
		// s2�� �� ����� ���� ���
		// length() : �� ���ڼ��� �˰� ������
		System.out.println(s2.length());
		
		// s2�� '��'��� �ܾ�� �����ϴ���
		// startWith() : �����ϴ� �ܾ �´��� Ȯ���� �� (true / false)
		System.out.println(s2.startsWith("��"));
		
		// s2�� "�ʹ�"��� �ܾ ���ԵǾ� �ִ���
		// contains() : ã�� �ܾ �ִ��� Ȯ���� �� (true / false)
		System.out.println(s2.contains("�ʹ�"));
		
		// s2���� '����'�̶�� ���ڸ� '�ʴ�'���� �ٲٱ�
		// replace(��������, �ٲܱ���) : Ư�� ���ڸ� �ٸ� ���ڷ� �ٲܶ�
		System.out.println(s2.replace("��", "��"));
		
		// s2���� 2~5��° ���ڸ� ��� (������ġ, ����ġ -1) �迭�� 0���� �����̴�.
		// substring(�̻�, �̸�) : ���ϴ� ��ġ�� ���ڸ� ���� ��
		System.out.println(s2.substring(2,6));
		System.out.println("---------------------------");
		
		// String ��ü�� �����ϴµ� ������ ��Ƽ�
		String s3 = String.format("���� : %.1f", 123.456);
		System.out.println(s3);
		String s4 = new DecimalFormat("###.##").format(12.456);
		System.out.println(s4);
		System.out.println("---------------------------");
		
		// s2�� ���� �߰�(���)
		System.out.println(s2);
		s2 = s2 + " ���� �� ���� ��������~";
		System.out.println(s2);
		s2 = s2 + " ��� ��~�� �Ǽ���~";
		System.out.println(s2);
		// s2�� ���� �߰�(����)
		s2 = new String(s2 + "ggggggggg");
		System.out.println(s2);
		
		// String �뷮���� �߰��ϱ�
		StringBuffer sb = new StringBuffer(s2);
		sb.append("���� ���� �ϵ� ���� ���� ���� ���ּ���!");
		sb.append("������������������");
		sb.append("�̹��� �ݿ����� �Ƚ�����? ");
		System.out.println(sb);
		
		String s5 = sb.toString();
		System.out.println(s5);
		System.out.println("---------------------------");
		
		// String �и� 
		String s6 = "����,�ں��,�ֺ��,����ƾ���";
		// 1.Split
		String[] s6Ar = s6.split(","); // ���ڿ� �迭�� �ٲٰ�, ������ �������� ���� ���ΰ�
		for (String s : s6Ar) {
			System.out.println(s);
		}
		System.out.println(s6Ar[0]);
		System.out.println("---------------------------");
		
		// 2. StringTokenizer
		StringTokenizer st = new StringTokenizer(s6,",");
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			System.out.println("---------------------------");
		}
		// �ӵ� : StringTokenizer
		// data�ӿ� ������ ���ٸ� : split 
	}
}
