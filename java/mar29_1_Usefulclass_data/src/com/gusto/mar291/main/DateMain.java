package com.gusto.mar291.main;

import java.text.SimpleDateFormat;
import java.util.Date; // Date util o  / Date sql x
import java.util.Locale;

import javax.print.DocFlavor.STRING;

// Date.java : ��~~�� ������ (1900���) ������� Class
// 				Y2K�� ������ ���� ����(Year 2000 Problem) > k = kilo = 1000
//				���� ������ ���� �ʴ�.
// 				1900��� ��ÿ� �뷮�� ����� ������ ������ ����� 19�� �����ϰ� ���� 00 �ڸ��� �����
//				1970��� ������ ��ǻ�� : �ӵ� ������, ��ġ �뷮�� ������.
//				������ ���� �Ƴ��� ���� 4byte�� ����ó���� 2byte�� �Ҵ� 
//				������ ����
//				1900, 2000�� ���� ���ڸ��� 00������ �����ϰ� �ν� �ȴ�.
//				����, 1900��� , 20000����� ������ �Ұ����ؼ� ��ǻ�� ���۵� ���ɼ��� ������

// deprecated
// 	������ �帣��, ��ǻ�͵� ������ �� -> ������ ����� ������ ��������
//	���α׷��� �� ������Ʈ�� �ȴ�.
//  ���ְų� ������ ��ȹ�� ����
// 	���� ���� �ڹٹ��������� OK! / ���� �������� �Ҹ� ���� ���ƶ� : getYear()

public class DateMain {
	public static void main(String[] args) {
		// �⺻ ���� -> ���� �ð�, ��¥ ����
		Date now = new Date();
		System.out.println(now); // ������״� �ð��� '��'���� ��µȴ�.
		
		// now���� ������ �̱�
		System.out.println(now.getYear() + 1900); // -> 123 ���, ��Ȯ�ϰ��ҷ��� + 1900 ������Ѵ�.
		// now���� �� �̱�
		System.out.println(now.getMonth() + 1); // -> 2 ���, ��Ȯ�ϰ� �Ϸ��� + 1 ������Ѵ�.
		// now���� �� �̱�
		System.out.println(now.getDate()); // -> 29 ���, ��Ȯ�ϰ� ����
		// now���� ���� �̱�
		System.out.println(now.getDay()); // -> 3 ���, ��Ȯ�ϰ� ���� ������ 0~6 , ��~�� ǥ��
		String[] day = {"��", "��", "ȭ", "��", "��", "��", "��"};
		System.out.println(day[now.getDay()]+ "����");
		// �ѱ�ó�� / ��¥ / �ð� : ���������� �����е��� ������ ��
		
		// Date  - ������ ���� -> String���� �ٲ���ϴ� ��Ȳ�� ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd E a hh:mm:ss", Locale.GERMANY); // - or / �߿� �ƹ��ų� �ᵵ �ȴ�.
		System.out.println(sdf); // �̷����ϸ� ����� �ȵȴ�.
		String s1 = sdf.format(now); // date�� �̾Ƴ���
		System.out.println(s1); // E : ���� , a : am/pm
		System.out.println("===================================");
		
		// Ư�� �ð� ��¥ 
		Date d2 = new Date(2000, 10, 20);
		
		// String - �������� -> Date
		try {
			String s2 = "2000-10-20";
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
			Date d3 = sdf1.parse(s2);
			System.out.println(d3);
		} catch (Exception e) {
		}
		System.out.println("===================================");
		
		
		// 10���� ũ���������� ���� ����
		Date c1 = new Date(2013, 12, 25);
		
		try {
			String christmas = "2013-12-25";
			SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
			Date christmas2 = sdf3.parse(christmas); // parse : ���ڿ��� ���ڿ��� �ٲٴ� �� 
			//System.out.println(christmas2);
			
			SimpleDateFormat sdf4 = new SimpleDateFormat("E");
			String christmas3 = sdf4.format(christmas2);
			System.out.println(christmas3 + "����");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
