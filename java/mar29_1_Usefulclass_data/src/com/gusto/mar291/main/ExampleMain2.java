package com.gusto.mar291.main;
// �л��� (�̸� / �������(yyyy.mm.dd) /����/����/����) ������ �Է� �ޱ�
// �л��� ����(�ѱ�����), �¾ ���� ����, ����, ��� ���� ��� 
// �߸� �Է��� �� ������� ����
// StringTokenizer

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ExampleMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("�Է��ϼ��� : ");
		String s = k.nextLine();
		StringTokenizer st = new StringTokenizer(s, "/"); // string s�� / �������� �����ڴ�.
		// �̸�
		System.out.printf("�̸� : %s\n", st.nextToken());
		
		// ����
		try {
			String bd = st.nextToken();
//			System.out.println(bd);	
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
			Date birthday = sdf.parse(bd);
			System.out.println(birthday);
			
			SimpleDateFormat sdf1 = new SimpleDateFormat("E"); // ������ ���Ѵ�.
			String birthdayStr = sdf1.format(birthday);
			System.out.printf("���� : %s\n", birthdayStr);
			
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
			String	nowYr = sdf2.format(new Date());
			int ny = Integer.parseInt(nowYr);
			
			String birthdayYr = sdf2.format(birthday);
			int by = Integer.parseInt(birthdayYr);
			
			int age = ny - by + 1;
			System.out.printf("���� : %d\n", age);
			
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());
			
			int sum = kor + eng + math;
			System.out.printf("���� : %d\n", sum);
			System.out.printf("��� : %.1f", (double) sum / 3);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

		
		

		
	
		
		
	}
}
//������/1994.11.02/85/83/61	
//Date d = new Date(birth);
//
//try {
//	String bd = birth;
//	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//	Date bd1 = sdf.parse(bd);
////	System.out.println(bd1);
//	
//	SimpleDateFormat sdf1 = new SimpleDateFormat("E");
//	String bd2 = sdf1.format(bd1);
//	System.out.println(bd2 + "����");
//} catch (Exception e) {
//	// TODO: handle exception
//}
