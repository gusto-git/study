package com.gusto.may031.apple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.gusto.db.manager.GustoDBManager;

public class AppleDAO {
	private int allAppleCount; // 등록 버튼을 활용해서 데이터를 입력할 때, 카운팅되는 것을 위해서 작성
	
	private static final AppleDAO APPLEDAO = new AppleDAO(); // 상수화
	
	private AppleDAO() {
	}
	
	// AppleController에서 AppleDAO로 접근하기 위해서는 getAppledao()를 통해서 접속 가능하게 만들기
	public static AppleDAO getAppledao() {
		return APPLEDAO;
	}
	
	// 모든 사과 데이터 다 가져오기 - 멤버 변수가 있기 때문에 static을 쓰지 않는다. :R(read) - Select
	public void getAllApples(HttpServletRequest request) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// DB 연결
			con = GustoDBManager.connect("leePool");
			// sql 작성
			String sql = "select * from may031_apple order by a_price";
			// DB 연결하는 총괄 객체
			pstmt = con.prepareStatement(sql);
			
			// CRUD에서 Select = R  -> rs = pstmt.executeQuery();로 실행 ->  select의 결과가 ResultSet으로 보내짐
			rs = pstmt.executeQuery();
			
			// rs에 있는 것을 ArrayList로 작성
			ArrayList<Apple> apples = new ArrayList<Apple>();
			// apple 데이터 한 줄 완성하기 위한 빈 자바빈 생성
			Apple apple = null;
			
			while (rs.next()) {
				apple = new Apple(); // 새 객체 꺼내기
				apple.setA_location(rs.getString("a_location")); // "db필드명"
				apple.setA_color(rs.getString("a_color"));
				apple.setA_flavor(rs.getString("a_flavor"));
				apple.setA_price(rs.getInt("a_price"));
				apple.setA_introduce(rs.getString("a_introduce"));
				apples.add(apple); // 자바빈 하나 완성되면 ArrayList에 담기 
			}
			// ArrayList를 jsp파일에 풀어야 한다.  -> setAttribute
			request.setAttribute("apples", apples);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		GustoDBManager.close(con, pstmt, rs);
		// DAO <- controller -> JSP파일이랑 소통하기 위해서 
	}
	
	// 사과 등록하기 -c(create) - insert
	public  void reg(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = GustoDBManager.connect("leePool");
			
			// WEB에서 작성한 데이터 받아오기 
			req.setCharacterEncoding("UTF-8");
			// reg.jsp의 name 부분
			String location = req.getParameter("a_location");
			String color = req.getParameter("a_color");
			String flavor = req.getParameter("a_flavor");
			int price = Integer.parseInt(req.getParameter("a_price"));
			String introduce = req.getParameter("a_introduce").replace("\r\n", "<br>");
			
			// db sql문 작성(?로 미완성) - 웹에 누가 어떤걸 쓸지 몰라
			String sql = "insert into MAY031_APPLE values(?, ?, ?, ?, ?)";
			
			// db관련 총괄 매니저
			pstmt = con.prepareStatement(sql);
			
			// sql문 완성
			pstmt.setString(1, location);
			pstmt.setString(2, color);
			pstmt.setString(3, flavor);
			pstmt.setInt(4, price);
			pstmt.setString(5, introduce);
			
			// 실행 + 결과처리
			if (pstmt.executeUpdate() == 1) {
				req.setAttribute("r", "[등록성공]");
				allAppleCount++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "[등록실패]");
		}
		GustoDBManager.close(con, pstmt, null);
	}
	
	// 총 사과 데이터가 몇개인지? - CRUD - R(Select)
	public void countApples() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = GustoDBManager.connect("leePool");
			String sql = "select count(*) from MAY031_APPLE";
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
	
	// 만약 데이터가 20만개가 넘는다? -> 해당 페이지 번호에 맞는 데이터만 가져오게 
	public void getApples(int pageNo, HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = GustoDBManager.connect("leePool");
			
			// SQL 수행하는데 필요한 값 챙기기
			// allAppleCount : 전체 사과 데이터 수
			
			// 한 페이지에 보여줄 사과 데이터 수
			int applePerPage = 5;
			
			// 총 데이터 수 : 6 
			// 필요한 페이지 수 : 2
			// Math.ceil : 숫자 올림(반올림 x)
			int pageCount = (int) Math.ceil(allAppleCount / (double) applePerPage); 
			req.setAttribute("pageCount", pageCount); // 뒤에가 방금 만든 int pageCount
			//////////////////////////////
			int start = (applePerPage * (pageNo - 1 )) + 1;
			int end = (pageNo == pageCount) ? allAppleCount : (start + applePerPage - 1 );
			
			String sql = "select * from( "
					+ "select rownum as rn, a_location, a_color, a_flavor, a_price, a_introduce "
					+ "from( "
					+ "select * from MAY031_APPLE order by a_price "
					+ "	) "
					+ ") "
					+ "where rn >= ? and rn <= ?";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			
			rs = pstmt.executeQuery();
			
			// 빈 ArrayList
			ArrayList<Apple> apples = new ArrayList<Apple>();
			// 빈 javabean
			Apple apple = null;
			while (rs.next()) {
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
	
	// 상세정보 -> pk를 이용해야
	// 제대로 데이터를 가지고 오면 : true
	// 실패했으면 : false 
	public boolean getAppleDetail(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = GustoDBManager.connect("leePool");
			String location = req.getParameter("a_location"); // go.js의 ? 뒤
			
			String sql = "select * from MAY031_APPLE where a_location =?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, location);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				Apple apple = new Apple();
				apple.setA_location(rs.getString("a_location")); // (db필드명)
				apple.setA_color(rs.getString("a_color"));
				apple.setA_flavor(rs.getString("a_flavor"));
				apple.setA_price(rs.getInt("a_price"));
				apple.setA_introduce(rs.getString("a_introduce"));
				req.setAttribute("apple", apple);
				
				return true; // 일반적인 상황 : 데이터가 하나
			}
			return false; // ex) 이미 지워져버린 데이터 : 데이터 없음
			
		} catch (Exception e) {
			e.printStackTrace();
			return false; // ex)  db 서버 상태가 안 좋을 경우: 서버가 안켜짐, 연결이 안되는 경우 
		} finally {
			GustoDBManager.close(con, pstmt, rs);
		}
	}
	
	// 데이터 수정 - u
	public boolean update(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = GustoDBManager.connect("leePool");
			
			req.setCharacterEncoding("UTF-8");
			String location = req.getParameter("a_location");
			String color = req.getParameter("a_color");
			String flavor = req.getParameter("a_flavor");
			int price = Integer.parseInt(req.getParameter("a_price"));
			String introduce = req.getParameter("a_introduce");
			
			String sql = "update may031_apple set"
					+ " a_color = ?, a_flavor =? , a_price= ?, a_introduce =?"
					+ "where a_location=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, color);
			pstmt.setString(2, flavor);
			pstmt.setInt(3, price);
			pstmt.setString(4, introduce);
			pstmt.setString(5, location);
			
			if (pstmt.executeUpdate() == 1) {
				req.setAttribute("r", "[수정성공]");
				return true;
			} else {
				req.setAttribute("r", "[수정실패]");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "[수정실패-DB]");
			return false;
		} finally {
			GustoDBManager.close(con, pstmt, null);
		}
	}

	// 데이터 삭제 - d
	public void delet(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = GustoDBManager.connect("leePool");
			String location = req.getParameter("a_location"); // 파라미터 하나를 받아온다.
			String sql = "delete from may031_apple where a_location = ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, location);
			if (pstmt.executeUpdate() == 1) {
				req.setAttribute("r", "[삭제성공]");
				allAppleCount--;
			} else {
				req.setAttribute("r", "[삭제실패]");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "[삭제실패-DB]");
		}
		GustoDBManager.close(con, pstmt, null);
		
	}
}
