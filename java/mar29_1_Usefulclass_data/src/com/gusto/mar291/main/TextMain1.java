package com.gusto.mar291.main;

import java.text.DecimalFormat;
import java.util.StringTokenizer;

// 버전 1.8.12
//  앞자리(1) : major 버전
//	뒷자리(8.12) : minor 버전
//		뒷 자리로 갈 수록 더 minor하다
//		1.8.12 -> 1.8.13 업그레이드(버전업) : 살짝 수정
//		1.8.12 -> 1.9.0 업그레이드(버전업) : 변화에 어느정도 느낌이 옴
//		1.8.12 -> 2.0.0 업그레디으(버전업) : 새로운 프로그램 정도의 변화 

// 네트워크를 통해서 데이터를 받아오면 : 글자형태로 받아진다.
// 네이트워크를 통해서 데이터를 줄 때 : 글자형태로 받아진다.
// 한글처리가 까다로워질 수 밖에 없다. : 한글은 조합해서 한글자가 만들어지고, 다른언어는 나열해서 만들어 짐

public class TextMain1 {
	public static void main(String[] args) {
		String s1 = "다음주 금요일은 휴강!"; // 약식버전
		String s2 = new String("오예 금토일 쉰다~ 나는 하루종일 자야지"); // 정식버전 
		
		// 외우지말고 찾아보기 (자동완성에 있는 기능 읽어보면서)
		// s2에서 5번 째에 있는 글자 출력하기 
		// charAt(i) : 특정 위치에 있는 글자 뽑을 때 사용
		System.out.println(s2.charAt(5));
		
		// s2가 총 몇글자 인지 출력
		// length() : 총 글자수를 알고 싶을때
		System.out.println(s2.length());
		
		// s2가 '오'라는 단어로 시작하는지
		// startWith() : 시작하는 단어가 맞는지 확인할 때 (true / false)
		System.out.println(s2.startsWith("오"));
		
		// s2에 "너무"라는 단어가 포함되어 있는지
		// contains() : 찾는 단어가 있는지 확인할 때 (true / false)
		System.out.println(s2.contains("너무"));
		
		// s2에서 '나는'이라는 글자를 '너는'으로 바꾸기
		// replace(원래글자, 바꿀글자) : 특정 글자를 다른 글자로 바꿀때
		System.out.println(s2.replace("나", "너"));
		
		// s2에서 2~5번째 글자만 출력 (시작위치, 끝위치 -1) 배열은 0부터 시작이다.
		// substring(이상, 미만) : 원하는 위치의 글자를 뽑을 때
		System.out.println(s2.substring(2,6));
		System.out.println("---------------------------");
		
		// String 객체를 생성하는데 형식을 잡아서
		String s3 = String.format("무게 : %.1f", 123.456);
		System.out.println(s3);
		String s4 = new DecimalFormat("###.##").format(12.456);
		System.out.println(s4);
		System.out.println("---------------------------");
		
		// s2에 글자 추가(약식)
		System.out.println(s2);
		s2 = s2 + " 새해 복 많이 받으세요~";
		System.out.println(s2);
		s2 = s2 + " 모두 부~자 되세요~";
		System.out.println(s2);
		// s2에 글자 추가(정식)
		s2 = new String(s2 + "ggggggggg");
		System.out.println(s2);
		
		// String 대량으로 추가하기
		StringBuffer sb = new StringBuffer(s2);
		sb.append("일은 적게 하되 돈은 많이 벌게 해주세요!");
		sb.append("ㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
		sb.append("이번주 금요일은 안쉬나요? ");
		System.out.println(sb);
		
		String s5 = sb.toString();
		System.out.println(s5);
		System.out.println("---------------------------");
		
		// String 분리 
		String s6 = "김비버,박비버,최비버,저스틴비버";
		// 1.Split
		String[] s6Ar = s6.split(","); // 문자열 배열로 바꾸고, 무엇을 기준으로 나눌 것인가
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
		// 속도 : StringTokenizer
		// data속에 변수가 많다면 : split 
	}
}
