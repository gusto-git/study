package com.gusto.apr133.main;

import java.io.Console;
import java.util.ArrayList;

import com.gusto.apr133.restaurant.Restaurant;
import com.gusto.apr134.reservation.Reservation;

// C
// 	Model(DAO) <-> Controller <-> View(ConsoleScreen)
public class Controller {
	// 실질적으로 프로그램 실행
	public static void main(String[] args) {
		int menu = 0;
		String result = null;
		Reservation rsv = null;
		Restaurant rst = null;
		ArrayList<Reservation> rsvResult = null;
		ArrayList<Restaurant> rstResult = null;
		
		System.out.println("<<예약프로그램>>");
		while (true) {
			try {
				menu = ConsoleScreen.showMenu();
				if (menu == 9) {
					System.out.println("프로그램을 종료합니다.");
					break;
				} else if (menu == 1) {
					rsv = ConsoleScreen.showRsvMenu();
					result = DAO.book(rsv);
					ConsoleScreen.showResult(result);
				} else if (menu == 2) {
					rst = ConsoleScreen.showRstMenu();
					result = DAO.registerRst(rst);
					ConsoleScreen.showResult(result);
				} else if (menu == 3) {
					rsvResult = DAO.getAllReserve();
					ConsoleScreen.showRsvResult(rsvResult);
				} else if (menu == 4) {
					rstResult = DAO.getAllRestaurant();
					ConsoleScreen.showRstResult(rstResult);
				} else if (menu == 5) {
					rst = ConsoleScreen.showSearchRst();
					rstResult = DAO.searchRst(rst);
					ConsoleScreen.showRstResult(rstResult);
				} else if (menu == 6) {
					rsv = ConsoleScreen.showSearcgRsv();
					rsvResult = DAO.searchRsv(rsv);
					ConsoleScreen.showRsvResult(rsvResult);
				} else if (menu == 7) {
					rsv = ConsoleScreen.showUpdateRsv();
					result = DAO.updateRSV(rsv);
					ConsoleScreen.showResult(result);
				} else if (menu == 8) {
					rsv = ConsoleScreen.showDeleteRsv();
					result = DAO.deleteRsv(rsv);
					ConsoleScreen.showResult(result);
				}
					
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		
		
	} // main
} // class
