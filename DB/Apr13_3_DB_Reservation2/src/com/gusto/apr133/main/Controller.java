package com.gusto.apr133.main;

import java.io.Console;
import java.util.ArrayList;

import com.gusto.apr133.restaurant.Restaurant;
import com.gusto.apr134.reservation.Reservation;

// C(CONTROLLER) : �����Լ��� ����ϴ� �������� ���������� �����ϴ� ����
// 	Model(DAO) <-> Controller <-> View(ConsoleScreen)
public class Controller {
	public static void main(String[] args) {
		int menu = 0;
		String result = null; // ��Ʈ�� ���� ������� �ۼ� 
		Reservation rsv = null; // ConsoleScreen���� �Է��� ���� DAO�� ��� ���� 
		Restaurant rst = null; // ConsoleScreen���� �Է��� ���� DAO�� ��� ���� 
		ArrayList<Reservation> rsvResult = null; // ConsoleScreen���� �Է��� ���� DAO�� ��� ���� 
		ArrayList<Restaurant> rstResult = null;

		System.out.println("<<���� ���α׷�>>");
		
//	1. ���� �ݺ��� �ۼ�	
		while (true) {
			try {
				menu = ConsoleScreen.showMainMenu(); // �޴� ���
				
				if (menu == 9) { // ���� �޴� ���� 
					System.out.println("���α׷��� �����մϴ�.");
					break; // while�� ����
				// �����ϱ�	
				} else if (menu == 1) { // ���� �޴����� 
					rsv = ConsoleScreen.showRsvMenu(); // ���� �޴� ���� �Է� controller -> ConsoleScreen
					result = DAO.book(rsv); // ���� ������ DAO�� �����ϰ� ������� �ޱ�  ConsoleScreen -> DAO
					ConsoleScreen.printResult(result); // ���� ����� ��� DAO -> ConsoleScreen
				// ������
				} else if (menu == 2) {
					rst = ConsoleScreen.showRstMenu();
					result = DAO.registerRst(rst);
					ConsoleScreen.printResult(result);
				// ��ü ����Ȯ��
				} else if (menu == 3) {
					rsvResult = DAO.getAllReserve();
					ConsoleScreen.showRsvResult(rsvResult);
				// ��ü ������ȸ
				} else if (menu == 4) {
					rstResult = DAO.getAllRestaurant();
					ConsoleScreen.showRstResult(rstResult);
				// Ư�� ���� ��ȸ
				} else if (menu == 5) {
					rst = ConsoleScreen.showSearchRst(); // �Է��� �޾ƾ��ؼ� consolescreen�� �������´�.
					rstResult = DAO.searchRst(rst);
					ConsoleScreen.showRstResult(rstResult);
				// ���� ã��
				} else if (menu == 6) {
					rsv = ConsoleScreen.showSearchRsv();
					rsvResult = DAO.searchRsv(rsv);
					ConsoleScreen.showRsvResult(rsvResult);
				// �������� ����
				} else if (menu == 7) {
					rsvResult = DAO.getAllReserve();
					ConsoleScreen.showRsvResult(rsvResult);
					rsv = ConsoleScreen.showUpdateRsv();
					result = DAO.updateRsv(rsv);
					ConsoleScreen.printResult(result);
				// �������
				} else if (menu == 8) {
					rsvResult = DAO.getAllReserve();
					ConsoleScreen.showRsvResult(rsvResult);
					
					rsv = ConsoleScreen.showDeleteRsv();
					result = DAO.deleteRsv(rsv);
					ConsoleScreen.printResult(result);
					
				}
				 
// TIP
// insert -> ConsoleScreen �ۼ� �� DAO
// select, delete, update -> DAO �ۼ� �� ConsoleScreen
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}// while
	}// main
}// class
