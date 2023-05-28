package com.gusto.apr14.main;

import java.util.ArrayList;

public class AirController {
	public static void main(String[] args) {
		ArrayList<Air> airs = AirDAO.getAir();
		for (Air a : airs) {
			AirDAO.writeAir(a);
		}
		System.out.println("¿Ï·á");
		
	}
}
