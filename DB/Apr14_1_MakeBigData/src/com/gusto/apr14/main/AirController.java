package com.gusto.apr14.main;

import java.util.ArrayList;

public class AirController {
	public static void main(String[] args) {
		ArrayList<Air> airs = AirDAO.getAir();
		// airs�� ��� Javabean�� �ݸ� ������ instert�ϴ� method ����
		for (Air a : airs) {
			AirDAO.writeAir(a);
		}
		System.out.println("the end");
		// sql ���Ϸ� ���ư��� select * �� �� �� ������ Ȯ��
		
		
		
	}
}
