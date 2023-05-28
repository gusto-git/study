package com.gusto.apr14.main;

import java.util.ArrayList;

public class ConverAirController {
	public static void main(String[] args) {
		ArrayList<Air> airs = AirDAO.getAllAir();
			AirDAO.writeToFile(airs);
			System.out.println("¿Ï");
}
}
