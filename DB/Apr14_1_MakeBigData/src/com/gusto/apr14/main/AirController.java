package com.gusto.apr14.main;

import java.util.ArrayList;

public class AirController {
	public static void main(String[] args) {
		ArrayList<Air> airs = AirDAO.getAir();
		// airs에 담긴 Javabean들 반목문 돌려서 instert하는 method 실행
		for (Air a : airs) {
			AirDAO.writeAir(a);
		}
		System.out.println("the end");
		// sql 파일로 돌아가서 select * 로 값 다 들어갓는지 확인
		
		
		
	}
}
