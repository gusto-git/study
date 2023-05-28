package com.gusto.apr133.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.gusto.apr133.restaurant.Restaurant;
import com.gusto.apr134.reservation.Reservation;

// V -> VIEW �ǹ� : �����̳��� �����̸�, ���������� ����� ���� ���̴� ����
// Console â���� ���̴� ������ V(VIEW)���� �۾��� �Ѵ�.
public class ConsoleScreen {

//		0. �޴� ��� �� ��ȣ �Է� �޴� ���� 
		public static int showMainMenu() {
			Scanner k = new Scanner(System.in);
			System.out.println("--------------------------");
			System.out.println("1. �����ϱ�");
			System.out.println("2. ������");
			System.out.println("3. ��ü������ȸ");
			System.out.println("4. ��ü������ȸ");
			System.out.println("5. ����ã��");
			System.out.println("6. ����ã��");
			System.out.println("7. ������������");
			System.out.println("8. �������");
			System.out.println("9. ����");
			System.out.println("--------------------------");
			System.out.print("��ȣ : ");
			return k.nextInt(); // Controller�� ��ȯ�ϱ� ���� return�� ��� �� 
		}
//	  0-1. ���Ȯ��
		public static void printResult(String result) {
			System.out.println(result); // String ������� ����ϱ� ���� �ۼ� 
		}
		
// 		1. �����ϱ� : �����ڰ� ���� �Է��� �� �ֵ��� �ۼ�
		public static Reservation showRsvMenu() throws ParseException {
			Scanner k = new Scanner(System.in);
			System.out.println("������ : ");
			String name = k.next();
			
			System.out.println("���೯¥(yyyy-MM-dd-/HH:mm) : ");
			String when = k.next(); // �Է¹޴� ���� string�ε�, Reservation(Javabean)������ Date�� �ް��ֱ� ������ �����ؾ��Ѵ�.
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd/HH:mm");
			Date when2 = sdf.parse(when);
			
			System.out.println("��ȭ��ȣ : ");
			String phone = k.next();
			
			System.out.println("������ : ");
			String location = k.next();
			
			Reservation r = new Reservation(0, name, when2, phone, location); // reservation ��ü�� �Է��� ���� ��´�.
			return r; 
		}
//		2. ������	: ȸ�簡 ���� �Է�
		public static Restaurant showRstMenu() {
			Scanner k = new Scanner(System.in);
			System.out.println("������ : ");
			String location = k.next();
			
			System.out.println("�Ĵ����� : ");
			String owner = k.next();
			
			System.out.println("�¼��� : ");
			int seat = k.nextInt();
			
			return new Restaurant(location, owner, seat);
		}

//		3. ����Ȯ��(��-��-�� ���� ����/���� �� :��)
		public static void showRsvResult(ArrayList<Reservation> rsvs) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd am hh:mm");
			for (Reservation r : rsvs) {
				// 1) [ȫ�浿 - 010-1111-1111] - ���� - 2023-04-13 ���� 13:00
				System.out.printf("%d) ", r.getNo());
				System.out.printf("[%s - ", r.getName());
				System.out.printf("%s] - ", r.getPhone());
				System.out.printf("%s - ", r.getLocation());
				System.out.println(sdf.format(r.getWhen()));
				System.out.println("=====================");
				}
			}

//		4. ��ü ���� ��ȸ(showRstResult) : ( ��ġ(�¼���)-����� �̸�) : (����(100��) - ȫ�浿)
		public static void showRstResult(ArrayList<Restaurant> rsts) {
			for (Restaurant r : rsts) {
				System.out.printf("(%s(", r.getLocation());
				System.out.printf("%d) - ", r.getSeat());
				System.out.printf("%s) \r\n", r.getOwner());
			}
		}
		
//		5. ����ã��(showSearchRst) : �ּ� �¼� �� �Է� - > �¼��� �̻��� ���� ���� ���
		public static Restaurant showSearchRst() {
			Scanner k = new Scanner(System.in);
			System.out.println("�¼� �� : ");
			int seat = k.nextInt();
			return new Restaurant(null, null, seat);
	
		}
		
//		6. ����ã��(showSearchRsv) : ������ �̸� �Է�
		public static Reservation showSearchRsv() {
			Scanner k = new Scanner(System.in);
			System.out.println("������ : ");
			String name = k.next();
			return new Reservation(0, name, null, null, null);
			
		}
		
//		7. �������� ����(showUpdateRsv) : �����ȣ �Է�, ������ ����ó �Է�
		public static Reservation showUpdateRsv() {
			Scanner k = new Scanner(System.in);
			System.out.println("�����ȣ �Է� : ");
			int num = k.nextInt();
			
			System.out.println("������ ����ó : ");
			String phoneNum = k.next();
			
			return new Reservation(num, null, null, phoneNum, null);
			
		}
		
//		8. �������(showDeleteRsv) : �����ȣ�� ��� 
		public static Reservation showDeleteRsv() {
			Scanner k = new Scanner(System.in);
			System.out.println("�����ȣ �Է�");
			int num = k.nextInt();
			return new Reservation(num, null, null, null, null);
		}
}
