package com.gusto.mar291.main;

import java.text.SimpleDateFormat;
import java.util.Date; // Date util o  / Date sql x
import java.util.Locale;

import javax.print.DocFlavor.STRING;

// Date.java : 아~~주 옛날에 (1900년대) 만들어진 Class
// 				Y2K에 관심이 없던 시절(Year 2000 Problem) > k = kilo = 1000
//				현재 설정에 맞지 않다.
// 				1900년대 당시에 용량이 상당히 적었기 때문에 공통된 19는 제외하고 끝에 00 자리만 사용함
//				1970년대 이전의 컴퓨터 : 속도 느리고, 장치 용량이 적었다.
//				데이터 양을 아끼기 위해 4byte인 연도처리를 2byte만 할당 
//				문제가 생김
//				1900, 2000년 끝의 두자리가 00년으로 동일하게 인식 된다.
//				따라서, 1900년대 , 20000년대의 구분이 불가능해서 컴퓨터 오작동 가능성이 높아짐

// deprecated
// 	세월이 흐르고, 컴퓨터도 발전을 함 -> 옛날에 만들어 놓은거 못쓰겠음
//	프로그래밍 언어도 업데이트가 된다.
//  없애거나 수정할 계획이 생김
// 	지금 현재 자바버전에서는 OK! / 언제 없어져도 불만 갖지 말아라 : getYear()

public class DateMain {
	public static void main(String[] args) {
		// 기본 생성 -> 현재 시간, 날짜 생성
		Date now = new Date();
		System.out.println(now); // 실행시켰던 시간의 '초'까지 출력된다.
		
		// now에서 연도만 뽑기
		System.out.println(now.getYear() + 1900); // -> 123 출력, 정확하게할려면 + 1900 해줘야한다.
		// now에서 월 뽑기
		System.out.println(now.getMonth() + 1); // -> 2 출력, 정확하게 하려면 + 1 해줘야한다.
		// now에서 일 뽑기
		System.out.println(now.getDate()); // -> 29 출력, 정확하게 나옴
		// now에서 요일 뽑기
		System.out.println(now.getDay()); // -> 3 출력, 정확하게 나옴 요일은 0~6 , 일~토 표시
		String[] day = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(day[now.getDay()]+ "요일");
		// 한글처리 / 날짜 / 시간 : 지속적으로 여러분들을 괴롭힐 것
		
		// Date  - 형식을 지정 -> String으로 바꿔야하는 상황이 있음
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd E a hh:mm:ss", Locale.GERMANY); // - or / 중에 아무거나 써도 된다.
		System.out.println(sdf); // 이렇게하면 출력이 안된다.
		String s1 = sdf.format(now); // date를 뽑아낼때
		System.out.println(s1); // E : 요일 , a : am/pm
		System.out.println("===================================");
		
		// 특정 시간 날짜 
		Date d2 = new Date(2000, 10, 20);
		
		// String - 형식지정 -> Date
		try {
			String s2 = "2000-10-20";
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
			Date d3 = sdf1.parse(s2);
			System.out.println(d3);
		} catch (Exception e) {
		}
		System.out.println("===================================");
		
		
		// 10년전 크리스마스는 무슨 요일
		Date c1 = new Date(2013, 12, 25);
		
		try {
			String christmas = "2013-12-25";
			SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
			Date christmas2 = sdf3.parse(christmas); // parse : 문자열을 숫자열로 바꾸는 것 
			//System.out.println(christmas2);
			
			SimpleDateFormat sdf4 = new SimpleDateFormat("E");
			String christmas3 = sdf4.format(christmas2);
			System.out.println(christmas3 + "요일");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
