package com.gusto.apr133.main;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.gusto.apr133.restaurant.Restaurant;
import com.gusto.apr134.reservation.Reservation;
import com.gusto.db.manager.GustoDBManager;

public class DAO {
	public static String book(Reservation rsv) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = GustoDBManager.connect();
			
			String sql = "insert into apr13_reservation values(apr13_reservation_seq.nextval, "
					+ " ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, rsv.getName());
			pstmt.setDate(2, new Date(rsv.getWhen().getTime()));
			pstmt.setString(3, rsv.getPhone());
			pstmt.setString(4, rsv.getLocation());
			
			if (pstmt.executeUpdate() == 1) {
				return "예약성공";
			}
			return ""; // Java문법상 필요해서 억지로 넣은 것 이유는 모름
		} catch (Exception e) {
			e.printStackTrace();
			return "예약실패";
		} finally {
			GustoDBManager.close(con, pstmt, null);
		}
	}
	// 2. 매장등록 - registerRst
	public static String registerRst(Restaurant rst) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = GustoDBManager.connect();
			String sql = "insert into APR13_RESTAURANT values(?, ? ,?)";
					
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, rst.getLocation());
			pstmt.setString(2, rst.getOwener());
			pstmt.setInt(3, rst.getSeat());
			
			if (pstmt.executeUpdate() == 1) {
				return "매장등록";
			}
			return "";
		} catch (Exception e) {
			e.printStackTrace();
			return "매장등록실패";
		} finally {
			GustoDBManager.close(con, pstmt, null);
		}
	}
		// 3. 전체예약확인 (예약번호 오름차순 정렬)
		// r - select : con,pstmt,rs 다필요
	public static ArrayList<Reservation> getAllReserve() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = GustoDBManager.connect();
			
			String sql = "select * from apr13_reservation order by r_no";
			pstmt = con.prepareStatement(sql);
			
//			rs : select문을 실행한 결과가 담김
			rs = pstmt.executeQuery();
			
//			데이터를 하나만 가져오는게 아니라 여러개 가지고 와야 함
//			reservation 자바빈 용 빈 ArrayList를 하나 열어둠
			ArrayList<Reservation> rsvs = new ArrayList<Reservation>();
			Reservation r = null;
			while (rs.next()) {
				r = new Reservation();
				// reservation 자바빈 클래스의 멤버변수명 x
				// db테이블의 컬럼명을 가져와야한다.
				r.setNo(rs.getInt("r_no"));
				r.setName(rs.getString("r_name"));
				r.setWhen(rs.getDate("r_time"));
				r.setPhone(rs.getString("r_phone"));
				r.setLocation(rs.getNString("r_location"));
				rsvs.add(r);
			}
			return rsvs;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			GustoDBManager.close(con, pstmt, rs);
		}
	}
	
	// 4. 전체매장조회(getAllRestaurant) : 지점명 오름차순  ( 위치(좌석수) - 사장님 이름)
	public static ArrayList<Restaurant> getAllrestaurant() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select일땐 필요 
		
		
		try {
			con = GustoDBManager.connect();
			String sql = "select * from apr13_restaurant order by r_location";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			ArrayList<Restaurant> rsts = new ArrayList<Restaurant>(); // 값을 담을 빈 어레이를 만듬 
			Restaurant r = null;
			while (rs.next()) {
				r = new Restaurant();
				r.setLocation(rs.getString("r_location"));
				r.setOwener(rs.getString("r_owner"));
				r.setSeat(rs.getInt("r_seat")); // Javabean 하나 완성
				rsts.add(r); // ArrayList에 완성된 Javabean 넣기 
			}
			return rsts;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			GustoDBManager.close(con, pstmt, rs);
		}
	}
	
	// 5. 매장 찾기(searchRst) : 입력한 좌석 수 이상을 가지고 있는 매장, 지점명 오름차순
	public static ArrayList<Restaurant> searchRst(Restaurant rst) { // console > controller 다음에 넣음
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = GustoDBManager.connect();
			String sql = "select * from apr13_restaurant "
					+ "where r_seat >= ? order by r_location"; // ? 때문에 consolescereen 갔다와야함
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, rst.getSeat());
			rs = pstmt.executeQuery();
			
			ArrayList<Restaurant> rsts = new ArrayList<Restaurant>();
			Restaurant r = null;
//			while (rs.next()) {
//				r = new Restaurant();
//				r.setLocation(rs.getString("r_loacation"));
//				r.setOwener(rs.getNString("r_owner"));
//				r.setSeat(rs.getInt("r_seat"));
//				rsts.add(r)
//			}
//			
			while (rs.next()) { // 위에 문장 효율적으로 쓰는 방법 
				rsts.add(
						new Restaurant(
						rs.getNString("r_location"),
						rs.getNString("r_owner"),
						rs.getInt("r_seat")
						)
					);
			}
			return rsts;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// 6. 예약 찾기(searchRsv) : 예약자의 이름으로 찾기, 예약 번호순 정렬
	public static ArrayList<Reservation> searchRsv(Reservation rsv) { // 콘솔에 입력한 값을 가져온다.
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		 try {
			 con = GustoDBManager.connect();
			 String sql ="select * "
			 		+ "	from apr13_reservation "
			 		+ "	where r_name like '%'||?||'%' "
			 		+ "	order by r_no";
			 pstmt = con.prepareStatement(sql);
			 pstmt.setString(1, rsv.getName());
			 rs = pstmt.executeQuery();
			 
			 ArrayList<Reservation> rsvs = new ArrayList<Reservation>();
			 while (rs.next()) {
				rsvs.add(
						new Reservation(rs.getInt("r_no"), rs.getNString("r_name"), rs.getDate("r_time"), 
								rs.getString("r_phone"), rs.getString("r_location")
								)
						);
			}
			 return rsvs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			GustoDBManager.close(con, pstmt, rs);
		}
		
	}
	
	// 7. 예약정보 수정(updateRsv) : 예약번호를 입력하면 연락처 변경
	public static String updateRsv(Reservation rsv) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = GustoDBManager.connect();
			String sql = "update apr13_reservation "
					+ "	set r_phone = ? "
					+ "	where r_no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, rsv.getPhone());
			pstmt.setInt(2, rsv.getNo());
			
			if (pstmt.executeUpdate() == 1) {
				return "예약 수정 성공";
			}
			return "해당 예약정보 없음";
		} catch (Exception e) {
			e.printStackTrace();
			return "예약 수정 실패";
		} finally {
			GustoDBManager.close(con, pstmt, null);
		}
	}
	
	// 8. 예약취소(deleteRsv) : 예약번호로 취소
	public static String deleteRsv(Reservation rsv) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = GustoDBManager.connect();
			String sql = "delete from apr13_reservation "
					+ "where r_no = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, rsv.getNo());
			
			if (pstmt.executeUpdate() == 1) {
				return "예약취소 성공";
			}
			return "예약정보 없음";
			
		} catch (Exception e) {
			e.printStackTrace();
			return "예약취소 실패";
			
		}finally {
			GustoDBManager.close(con, pstmt, null);
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	










