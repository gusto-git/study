package com.gusto.mar291.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExampleMain1 {
	// �л��� (�̸� / �������(yyyy.mm.dd) /����/����/����) ������ �Է� �ޱ�
	// �л��� ����(�ѱ�����), ����, ��� ���� ��� 
	// Split���� ������ 
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("�Է� : "); // Scanner�� �� ���� ����
		String s =  k.next();
//		System.out.println(s);
		String[] sData = s.split("/");
//	for (String s1 : sData) {
//			System.out.println(s);
//		}
//		System.out.println(sData[1]);
		
		try {
			// �̸�
			String name = sData[0];
			System.out.printf("�̸� : %s\n", name);
			
			// ����
			String bd = sData[1];
			// String -> Date : parse :String�� �ִ� ���ڰ� �� ���´� ��� �˷��ִ� ��
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd"); // � �������� �Ǿ��ִ���
			// ������ �� �� �ְ� ����� ��
			Date birthday = sdf.parse(bd);
//			System.out.println(birthday);
			// �츮���� ���� : ���� �⵵ - �¾ �⵵ +1
			// ����⵵ ���ϱ�
			Date now = new Date();
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
			String nowYr = sdf1.format(now);
//			System.out.println(nowYr);
			String birthdayYr = sdf1.format(birthday);
//			System.out.println(birthdayYr);
			
			// ���ڿ��� ���� �⵵�� ���������� ���ľ���
			int ny = Integer.parseInt(nowYr);
			int by = Integer.parseInt(birthdayYr);
			int age = ny - by + 1;
			System.out.printf("���� : %d\n", age);
			
			// ���ڿ��� �Ǿ��ִ� ������ ���������� ��ħ
			int kor = Integer.parseInt(sData[2]);
			int eng = Integer.parseInt(sData[3]);
			int math = Integer.parseInt(sData[4]);
			System.out.printf("���� : %d\n", kor);
			System.out.printf("���� : %d\n", eng);
			System.out.printf("���� : %d\n", math);
			
			int sum = kor + eng + math;
			System.out.printf("���� : %d\n", sum);
			
			double avg = (double) sum / 3;
			System.out.printf("��� : %.2f��", avg);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
// ������/1994.11.02/85/83/61		

	}
}
