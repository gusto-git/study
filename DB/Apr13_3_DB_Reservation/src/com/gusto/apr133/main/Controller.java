package com.gusto.apr133.main;

import java.util.ArrayList;

import com.gusto.apr133.restaurant.Restaurant;
import com.gusto.apr134.reservation.Reservation;

// C
// 	Model(DAO) <-> Controller <-> View(ConsoleScreen)
public class Controller {
	// ���������� ���α׷� ����
	public static void main(String[] args) {
		int menu = 0;
		String result = null;
		Reservation rsv = null;
		Restaurant rst = null; // 5�������� Ȱ��ȴ�.
		ArrayList<Reservation> rsvResult = null;
		ArrayList<Restaurant> rstResult = null;
		
		System.out.println("<<���� ���α׷�>>");
		while (true) {
			try {
				menu = ConsoleScreen.showMainMenu();
				if (menu == 9) {
					System.out.println("���α׷��� �����մϴ�.");
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
					rstResult = DAO.searchRst(rst); // return�� �������
					ConsoleScreen.showRstResult(rstResult); // 4������ �� �޼ҵ� �ٽ� ���
				} else if (menu == 6) {
					rsv = ConsoleScreen.showSearchRsv();
					rsvResult = DAO.searchRsv(rsv);
					ConsoleScreen.showRsvResult(rsvResult);
				} else if (menu == 7) {
//				��ü �������� �����ֱ� (3�� ��Ȱ��)
					rsvResult = DAO.getAllReserve();
					ConsoleScreen.showRsvResult(rsvResult);
					
					rsv = ConsoleScreen.showUpdateRsv();
					result = DAO.updateRsv(rsv); // string�� �޾ƿðŶ� result ���
					ConsoleScreen.printResult(result);
//				�ٲ����� �ٽ� �������� ��ü ���� �ݺ�	
					rsvResult = DAO.getAllReserve();
					ConsoleScreen.showRsvResult(rsvResult);
				} else if (menu == 8) {
//				��ü �������� �����ֱ� (3�� ��Ȱ��)	
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
