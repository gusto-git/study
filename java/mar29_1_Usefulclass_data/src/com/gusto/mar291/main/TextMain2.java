package com.gusto.mar291.main;

import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TextMain2 {
	public static void main(String[] args) {
		// 입력 받을 것
		// a/b/c/d/e/f/...
		// 1/2/3/4/5/6 + enter -> 총 합 : 15 , 평균 3 
		// 숫자를 입력한 것만 골라서 총합 , 평균 -> 출력
		// 글자가 섞여있다, 글자인 경우엔 그냥 넘기도록 -> excption 메세지 안뜨게
		
	     Scanner k = new Scanner(System.in);
	     System.out.println("입력(a/b/c/d..) : ");
	     String s = k.nextLine(); // 엔터 한번만 칠거라 String에 넣어도 된다.
	     System.out.println(s);
	     
	     StringTokenizer st = new StringTokenizer(s, "/");
	     int n;
	     int sum = 0; // 총 합용
	     int count = 0; // 숫자 몇개인지 카운트 할 목적
	     while (st.hasMoreTokens()) {
//			System.out.println(st.nextToken()); // 현재 문자열이다. 
	    	 try {
	    		 n = Integer.parseInt(st.nextToken()); // 이렇게하면 넘어가진다.
//	    		 System.out.println(n);
	    		 count++;
	    		 sum += n ;
			} catch (Exception e) {
			}
	    	
		}
	     System.out.printf("총합 : %d\n", sum);
	     System.out.printf("평균 : %.1f\n", (double)sum / count);
	     
	     
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
//	        System.out.printf("총 합 : %d, 평균 : %.2f", sum, average);
		
	}
}
