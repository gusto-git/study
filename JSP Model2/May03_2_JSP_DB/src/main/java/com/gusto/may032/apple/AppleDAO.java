package com.gusto.may032.apple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.gusto.db.manager.GustoDBManager;

public class AppleDAO {
	private int allAppleCount;
	
	private static final AppleDAO appleDAO = new AppleDAO(); //appleDAO의 상수화
	
	private AppleDAO() { // 기본생성자 : 외부에서 생성되지 않음으로 클래스의 싱글패턴화됨
	}
	
	public static AppleDAO getAppledao() {
		return appleDAO;
	}
	
	// 모든 사과 데이터 가져오기 : 멤버 변수(allAppleCount)가 존재하기 때문에 static을 쓰지 않는다.
	// 데이터를 가져오기 위해서 Select를 사용하는데, 이것은 CRUD 중 R(read)를 의미한다.
	public void getAllApples(HttpServletRequest request) { // HttpServletRequest request는  HTTP 요청을 가져오기 위함
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// DB 연결
			con = GustoDBManager.connect("leePool");
			// SQL 작성
			String sql = "select * from apple order by a_price";
			// DB 연결하는 총괄 객체 생성
			pstmt = con.prepareStatement(sql);
			// Selcet 실행
			rs = pstmt.executeQuery();
			// apple 객체(인스턴스)를 가져오기 위한 빈 커리 작성
			ArrayList<Apple> apples = new ArrayList<Apple>();
			// apple 데이터를 완성하기 위한 비어있는 자바빈 생성
			Apple apple = null;
			
			while (rs.next()) {
				// 새로운 Apple 객체 꺼내서 apple에 담기
				apple = new Apple();
				apple.setA_location(rs.getString("a_location"));
				apple.setA_color(rs.getString("a_color"));
				apple.setA_flavor(rs.getString("a_flavor"));
				apple.setA_price(rs.getInt("a_price"));
				apple.setA_introduce(rs.getString("a_introduce"));
				// 자바빈 하나 완성되면 ArrayList에 담기 
				apples.add(apple);
			}
			request.setAttribute("apples", apples);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		GustoDBManager.close(con, pstmt, rs);
	}
	
	// 사과등록하기
	// 데이터를 등록하기 위해서 Insert를 사용하는데, 이것은 CRUD 중 C(create)를 의미한다.
	public void reg(HttpServletRequest request) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = GustoDBManager.connect("leePool");
			// WEB에서 작성한 데이터 받아오기
			request.setCharacterEncoding("UTF-8");
			// reg.jsp의 name 부분을 통해서 각 값을 변수에 담기
			String location = request.getParameter("a_location"); // "reg.jsp의 "a_location"에 입력된 값을 String location에 담는 코드
			String color = request.getParameter("a_color");
			String flavor = request.getParameter("a_flavor");
			int price = Integer.parseInt(request.getParameter("a_price"));
			String introduce = request.getParameter("a_introduce").replace("\r\n", "<br>");
			
			String spl = "insert into apple values(?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(spl);
			
			pstmt.setString(1, location);
			pstmt.setString(2, color);
			pstmt.setString(3, flavor);
			pstmt.setInt(4, price);
			pstmt.setString(5, introduce);
			
			if (pstmt.executeUpdate() == 1) {
				request.setAttribute("r", "[등록성공]");
				allAppleCount++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("r", "[등록실패]");
		}
		GustoDBManager.close(con, pstmt, null);
	}
	
	// 사과 데이터가 몇개인지?
	// CRUD 중 R(Select) 
	public void countApples() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
		con = GustoDBManager.connect(null);
		String sql = "select count(*) from apple";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		rs.next();
		
		allAppleCount = rs.getInt("count(*)");
		System.out.println(allAppleCount);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		GustoDBManager.close(con, pstmt, rs);
	}

	// 페이지에 맞는 데이터만 가져오기
	public void getApples(int pageNo, HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = GustoDBManager.connect("leePool");
			// 한 페이지에 보여줄 사과 데이터 수 
			int applePerPage = 5;
			
			int pageCount = (int) Math.ceil(allAppleCount / (double) applePerPage);
			req.setAttribute("pageCount", pageCount);
			
			int start = (applePerPage * (pageNo -1)) + 1;
			int end = (pageNo == pageCount) ? allAppleCount : (start + applePerPage - 1);
		
		String sql = "select * from( "
				+ "select rownum as rn, a_location, a_color, a_flavor, a_price, a_introduce "
				+ "from( "
				+ "select * from APPLE order by a_price "
				+ "	) "
				+ ") "
				+ "where rn >= ? and rn <= ?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			
			rs = pstmt.executeQuery();
			
			ArrayList<Apple> apples = new ArrayList<Apple>();
			Apple apple = null;
			while (rs.next()) {
				apple = new Apple();
				apple = new Apple();
				apple.setA_location(rs.getString("a_location"));
				apple.setA_color(rs.getString("a_color"));
				apple.setA_flavor(rs.getString("a_flavor"));
				apple.setA_price(rs.getInt("a_price"));
				apple.setA_introduce(rs.getString("a_introduce"));
				apples.add(apple);
			}
				req.setAttribute("apples", apples);
			
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			GustoDBManager.close(con, pstmt, rs);
		}

	
	
}
