package com.gusto.apr133.main;

import java.io.Console;
import java.util.ArrayList;

import com.gusto.apr133.restaurant.Restaurant;
import com.gusto.apr134.reservation.Reservation;

// C(CONTROLLER) : 메인함수를 사용하는 영역으로 실질적으로 실행하는 영역
// 	Model(DAO) <-> Controller <-> View(ConsoleScreen)
public class Controller {
	public static void main(String[] args) {
		int menu = 0;
		String result = null; // 스트링 값을 담기위해 작성 
		Reservation rsv = null; // ConsoleScreen에서 입력한 값을 DAO에 담는 역할 
		Restaurant rst = null; // ConsoleScreen에서 입력한 값을 DAO에 담는 역할 
		ArrayList<Reservation> rsvResult = null; // ConsoleScreen에서 입력한 값을 DAO에 담는 역할 
		ArrayList<Restaurant> rstResult = null;

		System.out.println("<<예약 프로그램>>");
		
//	1. 무한 반복문 작성	
		while (true) {
			try {
				menu = ConsoleScreen.showMainMenu(); // 메뉴 출력
				
				if (menu == 9) { // 종료 메뉴 선택 
					System.out.println("프로그램을 종료합니다.");
					break; // while문 종료
				// 예약하기	
				} else if (menu == 1) { // 예약 메뉴선택 
					rsv = ConsoleScreen.showRsvMenu(); // 예약 메뉴 정보 입력 controller -> ConsoleScreen
					result = DAO.book(rsv); // 예약 정보를 DAO로 전달하고 결과값을 받기  ConsoleScreen -> DAO
					ConsoleScreen.printResult(result); // 예약 결과를 출력 DAO -> ConsoleScreen
				// 매장등록
				} else if (menu == 2) {
					rst = ConsoleScreen.showRstMenu();
					result = DAO.registerRst(rst);
					ConsoleScreen.printResult(result);
				// 전체 예약확인
				} else if (menu == 3) {
					rsvResult = DAO.getAllReserve();
					ConsoleScreen.showRsvResult(rsvResult);
				// 전체 매장조회
				} else if (menu == 4) {
					rstResult = DAO.getAllRestaurant();
					ConsoleScreen.showRstResult(rstResult);
				// 특정 매장 조회
				} else if (menu == 5) {
					rst = ConsoleScreen.showSearchRst(); // 입력을 받아야해서 consolescreen이 먼저나온다.
					rstResult = DAO.searchRst(rst);
					ConsoleScreen.showRstResult(rstResult);
				// 예약 찾기
				} else if (menu == 6) {
					rsv = ConsoleScreen.showSearchRsv();
					rsvResult = DAO.searchRsv(rsv);
					ConsoleScreen.showRsvResult(rsvResult);
				// 예약정보 수정
				} else if (menu == 7) {
					rsvResult = DAO.getAllReserve();
					ConsoleScreen.showRsvResult(rsvResult);
					rsv = ConsoleScreen.showUpdateRsv();
					result = DAO.updateRsv(rsv);
					ConsoleScreen.printResult(result);
				// 예약취소
				} else if (menu == 8) {
					rsvResult = DAO.getAllReserve();
					ConsoleScreen.showRsvResult(rsvResult);
					
					rsv = ConsoleScreen.showDeleteRsv();
					result = DAO.deleteRsv(rsv);
					ConsoleScreen.printResult(result);
					
				}
				 
// TIP
// insert -> ConsoleScreen 작성 후 DAO
// select, delete, update -> DAO 작성 후 ConsoleScreen
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}// while
	}// main
}// class
