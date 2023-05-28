package com.gusto.mar244.main; //패키지명이 나온다. -> 메인만 모아두는 곳 

import com.gusto.mar244.product.Computer; // 부르는 순간  생긴다. Computer는 클래스명 
import com.gusto.mar244.product.Scanner;

public class PMain1 {
	// product라는 class 만들고 -> main에 안넣음 
	// 이름 , 가격 속성 
	public static void main(String[] args) {
	// 매직스테이션 , 800000원, i5-2134, 8gb, 500gb 컴퓨터 	
	Computer com = new Computer("매직스테이션", 800000, "i5-2134", 8, 500);
	com.printInfo();
	
	System.out.println("=========================");
	// 멀티익스프레스, 500000인 스캐너 출력
	Scanner sca = new Scanner("멀티익스프레스", 500000); 
	// 내장변수인 Scanner를 쓰고 나서 Scanner 클래스를 가져오면 임포트 되어야할 
	// 글자가 아래 써지고  패키지명("멀티익스프레스", 500000)을 입력해야한다.
	sca.printInfo();
	
	
	}
}
