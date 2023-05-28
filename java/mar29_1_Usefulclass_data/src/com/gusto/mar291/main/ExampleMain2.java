package com.gusto.mar291.main;
// 학생의 (이름 / 생년원일(yyyy.mm.dd) /국어/영어/수학) 점수를 입력 받기
// 학생의 나이(한국나이), 태어난 날의 요일, 총점, 평균 값을 출력 
// 잘못 입력한 것 고려하지 않음
// StringTokenizer

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ExampleMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("입력하세요 : ");
		String s = k.nextLine();
		StringTokenizer st = new StringTokenizer(s, "/"); // string s를 / 기준으로 나누겠다.
		// 이름
		System.out.printf("이름 : %s\n", st.nextToken());
		
		// 생일
		try {
			String bd = st.nextToken();
//			System.out.println(bd);	
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
			Date birthday = sdf.parse(bd);
			System.out.println(birthday);
			
			SimpleDateFormat sdf1 = new SimpleDateFormat("E"); // 요일을 뜻한다.
			String birthdayStr = sdf1.format(birthday);
			System.out.printf("생일 : %s\n", birthdayStr);
			
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
			String	nowYr = sdf2.format(new Date());
			int ny = Integer.parseInt(nowYr);
			
			String birthdayYr = sdf2.format(birthday);
			int by = Integer.parseInt(birthdayYr);
			
			int age = ny - by + 1;
			System.out.printf("나이 : %d\n", age);
			
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());
			
			int sum = kor + eng + math;
			System.out.printf("총점 : %d\n", sum);
			System.out.printf("평균 : %.1f", (double) sum / 3);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

		
		

		
	
		
		
	}
}
//이현석/1994.11.02/85/83/61	
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
//	System.out.println(bd2 + "요일");
//} catch (Exception e) {
//	// TODO: handle exception
//}
