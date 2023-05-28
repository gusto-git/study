package com.gusto.mar291.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExampleMain1 {
	// 학생의 (이름 / 생년원일(yyyy.mm.dd) /국어/영어/수학) 점수를 입력 받기
	// 학생의 나이(한국나이), 총점, 평균 값을 출력 
	// Split으로 나누기 
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("입력 : "); // Scanner를 쓸 공간 마련
		String s =  k.next();
//		System.out.println(s);
		String[] sData = s.split("/");
//	for (String s1 : sData) {
//			System.out.println(s);
//		}
//		System.out.println(sData[1]);
		
		try {
			// 이름
			String name = sData[0];
			System.out.printf("이름 : %s\n", name);
			
			// 나이
			String bd = sData[1];
			// String -> Date : parse :String에 있는 문자가 이 형태다 라고 알려주는 것
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd"); // 어떤 형식으로 되어있는지
			// 생일을 알 수 있게 만드는 것
			Date birthday = sdf.parse(bd);
//			System.out.println(birthday);
			// 우리나라 나이 : 현재 년도 - 태어난 년도 +1
			// 현재년도 구하기
			Date now = new Date();
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
			String nowYr = sdf1.format(now);
//			System.out.println(nowYr);
			String birthdayYr = sdf1.format(birthday);
//			System.out.println(birthdayYr);
			
			// 문자열로 구한 년도를 정수형으로 고쳐야함
			int ny = Integer.parseInt(nowYr);
			int by = Integer.parseInt(birthdayYr);
			int age = ny - by + 1;
			System.out.printf("나이 : %d\n", age);
			
			// 문자열로 되어있는 점수들 정수형으로 고침
			int kor = Integer.parseInt(sData[2]);
			int eng = Integer.parseInt(sData[3]);
			int math = Integer.parseInt(sData[4]);
			System.out.printf("국어 : %d\n", kor);
			System.out.printf("영어 : %d\n", eng);
			System.out.printf("수학 : %d\n", math);
			
			int sum = kor + eng + math;
			System.out.printf("총점 : %d\n", sum);
			
			double avg = (double) sum / 3;
			System.out.printf("평균 : %.2f점", avg);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
// 이현석/1994.11.02/85/83/61		

	}
}
