package com.gusto.apr133.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import javax.sound.sampled.ReverbType;

import com.gusto.apr133.restaurant.Restaurant;
import com.gusto.apr134.reservation.Reservation;

//V
public class ConsoleScreen {

//		�޴��� �����ִ� ��� - ������ �޴� ȭ��
		public static int showMenu() {
			Scanner k = new Scanner(System.in);
			System.out.println("============================");
			System.out.println("1. �����ϱ�");
			System.out.println("2. ������");
			System.out.println("3. ����Ȯ��");
			System.out.println("4. ��ü������ȸ");
			System.out.println("5. ����ã��");
			System.out.println("6. ����ã��");
			System.out.println("7. ������������");
			System.out.println("8. �������");
			System.out.println("============================");
			System.out.print("��ȣ �Է� > ");
			return k.nextInt();
			
		}
//      ��� Ȯ��
		public static void showResult(String result) {
			System.out.println(result);
		}		
		
//      1. �����ϱ�(showRsvMenu)
		public static Reservation showRsvMenu() throws ParseException {
			Scanner k = new Scanner(System.in);
			System.out.print("������ : ");
			String name = k.next();
			
			System.out.print("���೯¥(YYYY-MM-DD/HH:mm) : ");
			String when = k.next();
			// String -> date : parse
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd/HH:mm");
			Date when2 = sdf.parse(when);
			
			System.out.print("����ó : ");
			String phone = k.next();
			
			System.out.print("������ : ");
			String location = k.next();
			
			// ���� �Է� �޾Ƽ� ������ ������ -> Javabean�� ���� �����(ä���ش�)
			Reservation r = new Reservation(0, name, when2, phone, location);
			return r;
	}
//		2. ������(showRstMenu)
		public static Restaurant showRstMenu() {
			Scanner k = new Scanner(System.in);
			System.out.println("������ : ");
			String location = k.next();
			
			System.out.println("���� : ");
			String owner = k.next();
			
			System.out.println("�¼��� : ");
			int seat = k.nextInt();
			
			Restaurant r = new Restaurant(location, owner, seat);
			return r ;
		}

//		3. ����Ȯ��(showRsvResult)(��-��-�� ���� ����/���� ��:��)
		public static void showRsvResult(ArrayList<Reservation> rsvs) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E a hh:mm");
			for (Reservation r : rsvs) {
				// 1) [ȫ�浿 - 010-1111-1111] - ���� - 2023-04-13 ���� 13:30
				System.out.printf("%d) ", r.getNo());
				System.out.printf("[%s - ", r.getName());
				System.out.printf("%s] - ", r.getPhone());
				System.out.print(r.getLocation() + " - ");
				System.out.println(sdf.format(r.getWhen()));
				System.out.println("---------------------");
			}
	
		}
		
//		4. ��ü ���� ��ȸ(showRstResult) : (��ġ(�¼���)-����� �̸�) : (����(100��) - ȫ�浿)
		public static void showRstResult(ArrayList<Restaurant> rsts) {
			for (Restaurant r : rsts) {
				System.out.printf("(%s(%d) - %s)\r\n", r.getLocation(),r.getSeat(),r.getOwner());
				System.out.println("=============================================================");
			}
		}

//		5. ����ã��(showSearchRst) : �ּ� �¼� �� �Է� - > �¼��� �̻��� ���� ���� ���
		public static Restaurant showSearchRst() {
			Scanner k = new Scanner(System.in);
			System.out.print("�¼� �� : ");
			int seat = k.nextInt();
			
			return new Restaurant(null, null, seat);
		}		

//		6. ����ã��(showSearchRsv) : ������ �̸� �Է�
		public static Reservation showSearcgRsv() {
			Scanner k = new Scanner(System.in);
			System.out.println("������ �̸� : ");
			String name = k.next();
			
			return new Reservation(0, name, null, null, null);
		}
		
//		7. �������� ����(showUpdateRsv) : �����ȣ �Է�, ������ ����ó �Է�
		public static Reservation showUpdateRsv() {
			Scanner k = new Scanner(System.in);
			System.out.println("�����ȣ : ");
			int num = k.nextInt();
			
			System.out.println("������ ����ó : ");
			String phone = k.next();
			
			return new Reservation(num, null, null, phone, null);
		}
		
//		8. �������(showDeleteRsv) : �����ȣ�� ��� 
		public static Reservation showDeleteRsv() {
			Scanner k = new Scanner(System.in);
			System.out.println("�����ȣ : ");
			int num = k.nextInt();
			
			return new Reservation(num, null, null, null, null);
		}

		
}
