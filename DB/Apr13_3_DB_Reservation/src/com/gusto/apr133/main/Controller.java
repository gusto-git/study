package com.gusto.apr133.main;

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
		Restaurant rst = null; // 5번에서도 활용된다.
		ArrayList<Reservation> rsvResult = null;
		ArrayList<Restaurant> rstResult = null;
		
		System.out.println("<<예약 프로그램>>");
		while (true) {
			try {
				menu = ConsoleScreen.showMainMenu();
				if (menu == 9) {
					System.out.println("프로그램을 종료합니다.");
					break;
				} else if (menu == 1) {
					rsv = ConsoleScreen.showRsvMenu();
					result = DAO.book(rsv);
					ConsoleScreen.printResult(result);
				} else if (menu == 2) {
					rst = ConsoleScreen.showRstMenu();
					result = DAO.registerRst(rst);
					ConsoleScreen.printResult(result);
				} else if (menu == 3) {
					rsvResult = DAO.getAllReserve();
					ConsoleScreen.showRsvResult(rsvResult);
				} else if (menu == 4) {
					rstResult = DAO.getAllrestaurant();
					ConsoleScreen.showRstResult(rstResult);
				} else if (menu == 5) {
					rst = ConsoleScreen.showsearchRst();
					rstResult = DAO.searchRst(rst); // return이 있을경우
					ConsoleScreen.showRstResult(rstResult); // 4번에서 쓴 메소드 다시 사용
				} else if (menu == 6) {
					rsv = ConsoleScreen.showSearchRsv();
					rsvResult = DAO.searchRsv(rsv);
					ConsoleScreen.showRsvResult(rsvResult);
				} else if (menu == 7) {
//				전체 예약정보 보여주기 (3번 재활용)
					rsvResult = DAO.getAllReserve();
					ConsoleScreen.showRsvResult(rsvResult);
					
					rsv = ConsoleScreen.showUpdateRsv();
					result = DAO.updateRsv(rsv); // string을 받아올거라 result 사용
					ConsoleScreen.printResult(result);
//				바꼈는지 다시 보기위해 전체 정보 반복	
					rsvResult = DAO.getAllReserve();
					ConsoleScreen.showRsvResult(rsvResult);
				} else if (menu == 8) {
//				전체 예약정보 보여주기 (3번 재활용)	
					rsvResult = DAO.getAllReserve();
					ConsoleScreen.showRsvResult(rsvResult);
					
					rsv = ConsoleScreen.showDeleteRsv();
					result = DAO.deleteRsv(rsv);
					ConsoleScreen.printResult(result);
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		} // while
		
	} // main
} // class
