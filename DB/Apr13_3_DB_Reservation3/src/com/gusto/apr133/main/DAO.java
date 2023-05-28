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
	
//  1. 예약하기(book)(직접입력해야한다)
	public static String book(Reservation rsv) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = GustoDBManager.connect();
			String sql = "insert into apr13_reservation values(apr13_reservation_seq.nextval, ?, ?, ?, ?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, rsv.getName());
			pstmt.setDate(2, new Date(rsv.getWhen().getTime())); 
			// .getTime 이 rsv.getWhen(util date)를 long(밀리세컨트형태)로 변환 시키고, 이를 Date 라는 객체로 생성해서 setDate(sql date)로 받아 들인다.
			pstmt.setString(3, rsv.getPhone());
			pstmt.setString(4, rsv.getLocation());
			
			if (pstmt.executeUpdate() == 1) { // 도출할 값이 하나라서 if문을 사용한다.
				return "예약성공";
			}
			return "";
			
		} catch (Exception e) {
			e.printStackTrace();
			return "예약실패";
		} finally {
			GustoDBManager.close(con, pstmt, null);
		}
	}

//	2. 매장등록(registerRst)
	public static String registerRst(Restaurant rst) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = GustoDBManager.connect();
			String sql = "insert into APR13_RESTAURANT values(?, ? ,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, rst.getLocation());
			pstmt.setString(2, rst.getOwner());
			pstmt.setInt(3, rst.getSeat());
			
			if (pstmt.executeUpdate() == 1) {
				return "매장등록";
			}
			return "";
		} catch (Exception e) {
			e.printStackTrace();
			return "매장등록 실패";
		} finally {
			GustoDBManager.close(con, pstmt, null);
		}
	}

//	3. 예약확인(getAllReserve) 예약번호 오름 차순 
	public static ArrayList<Reservation> getAllReserve() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = GustoDBManager.connect();
			String sql = "select * from apr13_reservation order by r_no";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			ArrayList<Reservation> rsvs = new ArrayList<Reservation>();
			Reservation r = null;
			
			while (rs.next()) {
				r = new Reservation();
				r.setNo(rs.getInt("r_no"));
				r.setName(rs.getString("r_name"));
				r.setWhen(rs.getDate("r_time"));
				r.setPhone(rs.getString("r_phone"));
				r.setLocation(rs.getString("r_location"));
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
	
//	4. 전체 매장 조회(getAllRestaurant)  : 지점명 오름차순  ( 위치(좌석수) - 사장님 이름)
	public static ArrayList<Restaurant> getAllRestaurant() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = GustoDBManager.connect();
			String sql = "select * from APR13_RESTAURANT order by r_location";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			ArrayList<Restaurant> rsts = new ArrayList<Restaurant>();
			Restaurant r = null;
			
			while (rs.next()) {
				r = new Restaurant();
				r.setLocation(rs.getString("r_location"));
				r.setOwner(rs.getString("r_owner"));
				r.setSeat(rs.getInt("r_seat"));
				rsts.add(r);
			}
			return rsts;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			GustoDBManager.close(con, pstmt, rs);
		}
	}

//	5. 매장찾기(searchRst) : 입력한 좌석 수 이상을 가지고 있는 매장, 지점명 오름차순
	public static ArrayList<Restaurant> searchRst(Restaurant rst) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = GustoDBManager.connect();
			String sql = "select * from apr13_restaurant "
					+ "where r_seat >= ? order by r_location"; 
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, rst.getSeat());
			rs = pstmt.executeQuery();
			
			ArrayList<Restaurant> rsts = new ArrayList<Restaurant>();
			Restaurant r = null;
			
			while (rs.next()) {
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
			
		} finally {
			GustoDBManager.close(con, pstmt, rs);
		}
	}

//	6. 예약찾기(searchRsv)  : 예약자의 이름으로 찾기, 예약 번호순 정렬
	public static ArrayList<Reservation> searchRsv(Reservation rsv) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = GustoDBManager.connect();
			String sql = "select * from APR13_RESERVATION  "
					+ "	where r_name like '%'||?||'%' order by r_no";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, rsv.getName());
			rs = pstmt.executeQuery();
			
			ArrayList<Reservation> rsvs = new ArrayList<Reservation>();
			Reservation r = null;
			
			while (rs.next()) {
				rsvs.add(
						new Reservation( rs.getInt("r_no"), rs.getString("r_name"), rs.getDate("r_time"),
								rs.getString("r_phone"), rs.getString("r_location")
								)
						);
			}
			return rsvs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			
		} finally {
			GustoDBManager.close(con, pstmt, rs);
		}
	}
	
//	7. 예약정보 수정(updateRsv) : 예약번호를 입력하면 연락처 변경
	public static String updateRSV(Reservation rsv) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = GustoDBManager.connect();
			String sql = "update APR13_RESERVATION  "
					+ "	set r_phone = ? "
					+ "	where r_no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, rsv.getPhone());
			pstmt.setInt(2, rsv.getNo());
			
			if (pstmt.executeUpdate() == 1) {
				return "수정 완료";
			}
			return "예약 정보 없음";
		} catch (Exception e) {
			e.printStackTrace();
			return  "수정 실패";
		} finally {
			GustoDBManager.close(con, pstmt, null);
		}
	}
	
//	8. 예약취소(deleteRsv) : 예약번호로 취소 
	public static String deleteRsv(Reservation rsv) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = GustoDBManager.connect();
			String sql = "delete APR13_RESERVATION where r_no = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, rsv.getNo());
			
			if (pstmt.executeUpdate() == 1) {
				return "예약 취소 완료";
			}
			return "예약 정보 없음";
		} catch (Exception e) {
			e.printStackTrace();
			return "예약 취소 실패";
		} finally {
			GustoDBManager.close(con, pstmt, null);
			
		}
		
	}
	
	
} 















