package com.gusto.mar291.main;

import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TextMain2 {
	public static void main(String[] args) {
		// �Է� ���� ��
		// a/b/c/d/e/f/...
		// 1/2/3/4/5/6 + enter -> �� �� : 15 , ��� 3 
		// ���ڸ� �Է��� �͸� ��� ���� , ��� -> ���
		// ���ڰ� �����ִ�, ������ ��쿣 �׳� �ѱ⵵�� -> excption �޼��� �ȶ߰�
		
	     Scanner k = new Scanner(System.in);
	     System.out.println("�Է�(a/b/c/d..) : ");
	     String s = k.nextLine(); // ���� �ѹ��� ĥ�Ŷ� String�� �־ �ȴ�.
	     System.out.println(s);
	     
	     StringTokenizer st = new StringTokenizer(s, "/");
	     int n;
	     int sum = 0; // �� �տ�
	     int count = 0; // ���� ����� ī��Ʈ �� ����
	     while (st.hasMoreTokens()) {
//			System.out.println(st.nextToken()); // ���� ���ڿ��̴�. 
	    	 try {
	    		 n = Integer.parseInt(st.nextToken()); // �̷����ϸ� �Ѿ����.
//	    		 System.out.println(n);
	    		 count++;
	    		 sum += n ;
			} catch (Exception e) {
			}
	    	
		}
	     System.out.printf("���� : %d\n", sum);
	     System.out.printf("��� : %.1f\n", (double)sum / count);
	     
	     
//	        int sum = 0;
//	        int count = 0;
//
//	        for (String s : input.split("/")) {
//	            try {
//	                int num = Integer.parseInt(s);
//	                sum += num;
//	                count++;
//	            } catch (NumberFormatException e) {
//	               
//	            }
//	        }
//
//	        double average = (count > 0) ? ((double) sum / count) : 0.0;
//
//	        System.out.printf("�� �� : %d, ��� : %.2f", sum, average);
		
	}
}
