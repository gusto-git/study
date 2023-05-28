package com.gusto.apr133.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.gusto.apr133.restaurant.Restaurant;
import com.gusto.apr134.reservation.Reservation;

//V
public class ConsoleScreen {
		// 사용자가 콘솔을 볼 수 있거나, 콘솔에 입력할 수 있게
		
		// 메뉴를 볼수있는 기능 - 보여줄 메뉴 화면
		public static int showMainMenu() {
			Scanner k = new Scanner(System.in);
			System.out.println("-------------------------------");
			System.out.println("1. 예약하기");
			System.out.println("2. 매장등록");
			System.out.println("3. 전체예약확인");
			System.out.println("4. 전체매장조회");
			System.out.println("5. 매장찾기");
			System.out.println("6. 예약찾기");
			System.out.println("7. 예약정보수정");
			System.out.println("8. 예약취소");
			System.out.println("9. 종료");
			System.out.println("-------------------------------");
			System.out.print("번호입력 > ");
			return k.nextInt();
		}
		// 결과 확인
		public static void printResult(String result) {
			System.out.println(result);
		}
		
		// 1. 예약하기(직접입력해야한다)
		public static Reservation showRsvMenu() throws ParseException {
			Scanner k = new Scanner(System.in);
			System.out.println("예약자 : ");
			String name = k.next();
			
			System.out.println("예약날짜(YYYY-MM-DD/HH:mm) : ");
			String when = k.next();
			// String -> date : parse
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd/HH:mm");
			Date when2 = sdf.parse(when);
			
			System.out.println("연락처 : ");
			String phone = k.next();
			
			System.out.println("지점명 : ");
			String location = k.next();
			
			// 각각 입력 받아서 변수에 넣은거 -> Javabean에 입혀 줘야함(채워준다)
			Reservation r = new Reservation(0, name, when2, phone, location);
			return r;
	}
//		 2. 매장등록	
		public static Restaurant showRstMenu() {
				Scanner k = new Scanner(System.in);
				System.out.print("지점명 : ");
				String location = k.next();
				
				
				System.out.print("식당주인 : ");
				String owener = k.next();
				
				System.out.print("좌석수 :");
				int seat = k.nextInt();
				
				return new Restaurant(location, owener, seat);
	}
//		3. 예약확인(연-월-일 요일 오전/오후 시 :분)
		public static void showRsvResult(ArrayList<Reservation> rsvs) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E a hh:mm");
			for (Reservation r : rsvs) {
				// 1) [홍길동 - 010-1111-1111] - 강북 - 2023-04-13 오전 ... 
				System.out.printf("%d) ", r.getNo());
				System.out.printf("[%s - ", r.getName());
				System.out.printf("%s] - ", r.getPhone());
				System.out.println(r.getLocation() + " - ");
				System.out.println(sdf.format(r.getWhen()));
				System.out.println("---------------------");
			}
		}
		
//		4. 전체 매장 조회(showRstResult) : ( 위치(좌석수)-사장님 이름) : (강북(100석) - 홍길동)
		public static void showRstResult(ArrayList<Restaurant> rsts) {
			for (Restaurant r : rsts) {
				System.out.printf("%s(%d석) -", r.getLocation(), r.getSeat());
				System.out.println("[" + r.getOwener() + "]");
			}
		}
//		5. 매장찾기(showSearchRst) : 최소 좌석 수 입력 - > 좌석수 이상의 매장 정보 출력
		public static Restaurant showsearchRst() {
			Scanner k = new Scanner(System.in);
			System.out.println("최소 좌석수 : ");
			int seat = k.nextInt();
			return new Restaurant(null, null, seat); // 값을 여러개 리턴해야할 경우 자바빈 자체를 리턴한다.
													 // 그리고 필요한 부분만 매개변수를 넣는다
		}
//		6. 예약찾기(showsearchRsv) : 예약자 이름 입력		
		public static Reservation showSearchRsv() {
			Scanner k = new Scanner(System.in);
			System.out.print("예약자명 : ");
			String name = k.next();
			return new Reservation(0, name, null, null, null); // 내가 입력할값을 제외하고는 전부 기본값
			// 내가 입력한 값만 controller에 반환되도록 만드는 작업 
		}
		
//		7. 예약정보 수정(showupdateRsv) : 예약번호 입력, 변경할 연락처 입력
		public static Reservation showUpdateRsv() {
			Scanner k = new Scanner(System.in);
			System.out.println("예약번호 : ");
			int no = k.nextInt();
			System.out.println("변경할 연락처 : ");
			String phoneNum = k.next();
			// return은 원칙 상 하나만 값을 전달하기 때문에
			// 두가지 전달을 위해 Javabean 사용
			// Javabean에 맞는 자리에다가 변수명 넣고 나머지는 초기값 
			return new Reservation(no, null, null, phoneNum, null); // no, phoneNum 두가지 전달하기위해 자바빈
		}
		
//		8. 예약취소(showdeleteRsv) : 예약번호로 취소 
		public static Reservation showDeleteRsv() {
			Scanner k = new Scanner(System.in);
			System.out.println("예약번호 : ");
			int no = k.nextInt();
			return new Reservation(no, null, null, null, null);
			
	}
}
