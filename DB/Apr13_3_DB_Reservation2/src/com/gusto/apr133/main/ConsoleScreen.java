package com.gusto.apr133.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.gusto.apr133.restaurant.Restaurant;
import com.gusto.apr134.reservation.Reservation;

// V -> VIEW 의미 : 디자이너의 영역이며, 직접적으로 사용자 눈에 보이는 영역
// Console 창에서 보이는 영역은 V(VIEW)에서 작업을 한다.
public class ConsoleScreen {

//		0. 메뉴 출력 및 번호 입력 받는 영역 
		public static int showMainMenu() {
			Scanner k = new Scanner(System.in);
			System.out.println("--------------------------");
			System.out.println("1. 예약하기");
			System.out.println("2. 매장등록");
			System.out.println("3. 전체예약조회");
			System.out.println("4. 전체매장조회");
			System.out.println("5. 매장찾기");
			System.out.println("6. 예약찾기");
			System.out.println("7. 예약정보수정");
			System.out.println("8. 예약취소");
			System.out.println("9. 종료");
			System.out.println("--------------------------");
			System.out.print("번호 : ");
			return k.nextInt(); // Controller로 반환하기 위해 return을 사용 함 
		}
//	  0-1. 결과확인
		public static void printResult(String result) {
			System.out.println(result); // String 결과값을 출력하기 위해 작성 
		}
		
// 		1. 예약하기 : 예약자가 직접 입력할 수 있도록 작성
		public static Reservation showRsvMenu() throws ParseException {
			Scanner k = new Scanner(System.in);
			System.out.println("예약자 : ");
			String name = k.next();
			
			System.out.println("예약날짜(yyyy-MM-dd-/HH:mm) : ");
			String when = k.next(); // 입력받는 값이 string인데, Reservation(Javabean)에서는 Date로 받고있기 때문에 변경해야한다.
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd/HH:mm");
			Date when2 = sdf.parse(when);
			
			System.out.println("전화번호 : ");
			String phone = k.next();
			
			System.out.println("지점명 : ");
			String location = k.next();
			
			Reservation r = new Reservation(0, name, when2, phone, location); // reservation 객체에 입력한 값을 담는다.
			return r; 
		}
//		2. 매장등록	: 회사가 직접 입력
		public static Restaurant showRstMenu() {
			Scanner k = new Scanner(System.in);
			System.out.println("지점명 : ");
			String location = k.next();
			
			System.out.println("식당주인 : ");
			String owner = k.next();
			
			System.out.println("좌석수 : ");
			int seat = k.nextInt();
			
			return new Restaurant(location, owner, seat);
		}

//		3. 예약확인(연-월-일 요일 오전/오후 시 :분)
		public static void showRsvResult(ArrayList<Reservation> rsvs) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd am hh:mm");
			for (Reservation r : rsvs) {
				// 1) [홍길동 - 010-1111-1111] - 강북 - 2023-04-13 오전 13:00
				System.out.printf("%d) ", r.getNo());
				System.out.printf("[%s - ", r.getName());
				System.out.printf("%s] - ", r.getPhone());
				System.out.printf("%s - ", r.getLocation());
				System.out.println(sdf.format(r.getWhen()));
				System.out.println("=====================");
				}
			}

//		4. 전체 매장 조회(showRstResult) : ( 위치(좌석수)-사장님 이름) : (강북(100석) - 홍길동)
		public static void showRstResult(ArrayList<Restaurant> rsts) {
			for (Restaurant r : rsts) {
				System.out.printf("(%s(", r.getLocation());
				System.out.printf("%d) - ", r.getSeat());
				System.out.printf("%s) \r\n", r.getOwner());
			}
		}
		
//		5. 매장찾기(showSearchRst) : 최소 좌석 수 입력 - > 좌석수 이상의 매장 정보 출력
		public static Restaurant showSearchRst() {
			Scanner k = new Scanner(System.in);
			System.out.println("좌석 수 : ");
			int seat = k.nextInt();
			return new Restaurant(null, null, seat);
	
		}
		
//		6. 예약찾기(showSearchRsv) : 예약자 이름 입력
		public static Reservation showSearchRsv() {
			Scanner k = new Scanner(System.in);
			System.out.println("예약자 : ");
			String name = k.next();
			return new Reservation(0, name, null, null, null);
			
		}
		
//		7. 예약정보 수정(showUpdateRsv) : 예약번호 입력, 변경할 연락처 입력
		public static Reservation showUpdateRsv() {
			Scanner k = new Scanner(System.in);
			System.out.println("예약번호 입력 : ");
			int num = k.nextInt();
			
			System.out.println("변경할 연락처 : ");
			String phoneNum = k.next();
			
			return new Reservation(num, null, null, phoneNum, null);
			
		}
		
//		8. 예약취소(showDeleteRsv) : 예약번호로 취소 
		public static Reservation showDeleteRsv() {
			Scanner k = new Scanner(System.in);
			System.out.println("예약번호 입력");
			int num = k.nextInt();
			return new Reservation(num, null, null, null, null);
		}
}
