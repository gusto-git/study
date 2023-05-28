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

//		메뉴를 볼수있는 기능 - 보여줄 메뉴 화면
		public static int showMenu() {
			Scanner k = new Scanner(System.in);
			System.out.println("============================");
			System.out.println("1. 예약하기");
			System.out.println("2. 매장등록");
			System.out.println("3. 예약확인");
			System.out.println("4. 전체매장조회");
			System.out.println("5. 매장찾기");
			System.out.println("6. 예약찾기");
			System.out.println("7. 예약정보수정");
			System.out.println("8. 예약취소");
			System.out.println("============================");
			System.out.print("번호 입력 > ");
			return k.nextInt();
			
		}
//      결과 확인
		public static void showResult(String result) {
			System.out.println(result);
		}		
		
//      1. 예약하기(showRsvMenu)
		public static Reservation showRsvMenu() throws ParseException {
			Scanner k = new Scanner(System.in);
			System.out.print("예약자 : ");
			String name = k.next();
			
			System.out.print("예약날짜(YYYY-MM-DD/HH:mm) : ");
			String when = k.next();
			// String -> date : parse
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd/HH:mm");
			Date when2 = sdf.parse(when);
			
			System.out.print("연락처 : ");
			String phone = k.next();
			
			System.out.print("지점명 : ");
			String location = k.next();
			
			// 각각 입력 받아서 변수에 넣은거 -> Javabean에 입혀 줘야함(채워준다)
			Reservation r = new Reservation(0, name, when2, phone, location);
			return r;
	}
//		2. 매장등록(showRstMenu)
		public static Restaurant showRstMenu() {
			Scanner k = new Scanner(System.in);
			System.out.println("지점명 : ");
			String location = k.next();
			
			System.out.println("주인 : ");
			String owner = k.next();
			
			System.out.println("좌석수 : ");
			int seat = k.nextInt();
			
			Restaurant r = new Restaurant(location, owner, seat);
			return r ;
		}

//		3. 예약확인(showRsvResult)(연-월-일 요일 오전/오후 시:분)
		public static void showRsvResult(ArrayList<Reservation> rsvs) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E a hh:mm");
			for (Reservation r : rsvs) {
				// 1) [홍길동 - 010-1111-1111] - 강북 - 2023-04-13 오전 13:30
				System.out.printf("%d) ", r.getNo());
				System.out.printf("[%s - ", r.getName());
				System.out.printf("%s] - ", r.getPhone());
				System.out.print(r.getLocation() + " - ");
				System.out.println(sdf.format(r.getWhen()));
				System.out.println("---------------------");
			}
	
		}
		
//		4. 전체 매장 조회(showRstResult) : (위치(좌석수)-사장님 이름) : (강북(100석) - 홍길동)
		public static void showRstResult(ArrayList<Restaurant> rsts) {
			for (Restaurant r : rsts) {
				System.out.printf("(%s(%d) - %s)\r\n", r.getLocation(),r.getSeat(),r.getOwner());
				System.out.println("=============================================================");
			}
		}

//		5. 매장찾기(showSearchRst) : 최소 좌석 수 입력 - > 좌석수 이상의 매장 정보 출력
		public static Restaurant showSearchRst() {
			Scanner k = new Scanner(System.in);
			System.out.print("좌석 수 : ");
			int seat = k.nextInt();
			
			return new Restaurant(null, null, seat);
		}		

//		6. 예약찾기(showSearchRsv) : 예약자 이름 입력
		public static Reservation showSearcgRsv() {
			Scanner k = new Scanner(System.in);
			System.out.println("예약자 이름 : ");
			String name = k.next();
			
			return new Reservation(0, name, null, null, null);
		}
		
//		7. 예약정보 수정(showUpdateRsv) : 예약번호 입력, 변경할 연락처 입력
		public static Reservation showUpdateRsv() {
			Scanner k = new Scanner(System.in);
			System.out.println("예약번호 : ");
			int num = k.nextInt();
			
			System.out.println("변경할 연락처 : ");
			String phone = k.next();
			
			return new Reservation(num, null, null, phone, null);
		}
		
//		8. 예약취소(showDeleteRsv) : 예약번호로 취소 
		public static Reservation showDeleteRsv() {
			Scanner k = new Scanner(System.in);
			System.out.println("예약번호 : ");
			int num = k.nextInt();
			
			return new Reservation(num, null, null, null, null);
		}

		
}
