package com.gusto.mar291.main;

// Wrapper Class : (�ڷ���) �⺻������ ��üȭ 
//		Integer, Long, Double, Boolean, Void..
//		�⺻ �ڷ������� ��ü�� �ٷ�� ���ؼ� ������� Class
//		�⺻�� ���� �����ϴ� ���

// Boxing : �⺻���� wrapper class�� �ٲٴ� ��
// unBoxing : wrapper class�� �⺻������ �ٲٴ� ��

// ��� �ñ�
// 1. ��ü�� Ŭ������ �����ϴ� Method ����� ��
// 2. Ŭ������ �����ϴ� ����� ���(MIN_VALUE, MAX_VALUE, ...)
// 3. ����, ���ڵ��� ���� ����ȯ�� �� *** 


public class WMain {
	public static void main(String[] args) {
		int a = 10;
		String a1 = "100";
		
		Integer b = new Integer(a1); // int�� �ٲٱ� ���� integer ���
		b.intValue(); // Integer ��ü���� int�� ���� �̾Ƴ��� �޼ҵ� 
		System.out.println(b);
		System.out.println(b.TYPE);
		
		// �⺻�� > ��ü��
		double c = 123.456;
		Double d = new Double(c);
		System.out.println(d.TYPE);
		
		// ��ü�� > �⺻��
		Boolean e = new Boolean(true);
		boolean f = e.booleanValue();
		
		// ��ü�� > �⺻�� : ���� ������ �ڵ����� ���ִ� ��� : Auto-Unboxing
		Integer g = 10;
		
		// �⺻�� > ��ü�� : ���� ������ �ڵ����� ���ִ� ��� : Auto-boxing
		int h =g;
		
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		int min = Integer.MIN_VALUE;  // ���� System.out.println(Integer.MIN_VALUE);
		System.out.println(min);
		
		// int �ڷ��� ���� String(���ڿ�)�� �ٲٴ� ���
		String num1 = Integer.toString(321); // 321�� ���ڿ��� 321�� ����ȴ�.
		// int �ڷ��� ���� Binary(2����)�� �ٲٴ� ��� 
		String num2 = Integer.toBinaryString(5);
		System.out.println(num2);
		
		// ���ڿ� - �⺻������ ����ȯ(���̷�Ʈ�� ������, ��ü���� ���ľ�)
		String ss = "345.67";
		Double ss1 = Double.parseDouble(ss); // ��������� �ص� ����� double�� �޾Ƶ��δ� , Warrper Ŭ����
		Double ss2 = ss1.doubleValue(); // ���������ϴ�. / �⺻���̴�.
		System.out.println(ss1);
		System.out.println(ss2);
		
		// ���� ���� ����. 
		String sss = "123";
		int sss1 = Integer.parseInt(sss); // parse�� ���ڿ��� parse �ڿ� �ٴ°ɷ� �ٲ��ִ¿���
		System.out.println(sss1);
	}
	
	
}
