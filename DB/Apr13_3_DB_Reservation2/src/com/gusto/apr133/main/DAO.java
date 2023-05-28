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
	
// 1. �����ϱ� - crud �� c(insert)
	public static String book(Reservation rsv) {
		Connection con = null; // �����ͺ��̽����� ������ ��Ÿ���� ��ü, �̸� ���� �����ͺ��̽��� �۾��� ��������
		PreparedStatement pstmt = null; // sql ������ �����Ű�� ���� ��ü
		
		try {
			con = GustoDBManager.connect(); 
			
			String sql = "insert into apr13_reservation values(apr13_reservation_seq.nextval, "
					+ "	?, ?, ? ,?)";
			
			pstmt = con.prepareStatement(sql); // �����ͺ��̽��� �����ϱ� ���� ��ü�� �����ϴ� ���Դϴ�.
			
			pstmt.setString(1, rsv.getName());
			pstmt.setDate(2, new Date(rsv.getWhen().getTime())); // Java.util.Date -> java.sql.Date�� ��ȯ�ϱ� ���� 
			pstmt.setString(3, rsv.getPhone());
			pstmt.setString(4, rsv.getLocation());
			
			if (pstmt.executeUpdate() == 1) {
				return "���༺��";
			}
			return "";
			
		} catch (Exception e) {
			e.printStackTrace();
			return "�������";
		}finally {
			GustoDBManager.close(con, pstmt, null);
		}
	}
	
// 2. ������ - registerRst
	public static String registerRst(Restaurant rst) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = GustoDBManager.connect();
			
			String sql = "insert into APR13_RESTAURANT values(?, ?, ?)";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1,rst.getLocation());
			pstmt.setString(2, rst.getOwner());
			pstmt.setInt(3, rst.getSeat());
			
			if (pstmt.executeUpdate() == 1) {
				return "������";
			}
			return "";
			
		} catch (Exception e) {
			e.printStackTrace();
			return "�����Ͻ���";
		}
	}


// 3. ��ü����Ȯ��(getAllReserve) (�����ȣ �������� ����)
	public static ArrayList<Reservation> getAllReserve() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select �������� resultset�� ����.
		// resultset rs�� sql���� ����Ǿ��� �� ���� ������ �Ǵ� �����̴�.
		
		try {
			con = GustoDBManager.connect();
			String sql = "select * from apr13_reservation order by r_no";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); 
			// ������ ��ü�� �������� ���̶�, Javabean �� ArrayList�� �ۼ��ؾ���
			ArrayList<Reservation> rsvs = new ArrayList<Reservation>();
			Reservation r = null;
			
			while (rs.next()) {
				r = new Reservation();
				// Javabeen.class�� ����������� �ƴ�, DB ���̺��� �÷��� ���
				r.setNo(rs.getInt("r_no"));
				r.setName(rs.getString("r_name"));
				r.setWhen(rs.getDate("r_time"));
				r.setPhone(rs.getString("r_phone"));
				r.setLocation(rs.getString("r_location"));
				rsvs.add(r); // r�� ���� ���� array�� �־ ��ȯ�ϱ� ����
			}
			return rsvs;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			GustoDBManager.close(con, pstmt, rs);
		}
	}
	
// 4. ��ü������ȸ(getAllRestaurant) : ������ ��������  ( ��ġ(�¼���) - ����� �̸�)
	public static ArrayList<Restaurant> getAllRestaurant() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = GustoDBManager.connect();
			String sql = "select * from apr13_restaurant order by r_location";
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
	
// 5. ���� ã��(searchRst) : �Է��� �¼� �� �̻��� ������ �ִ� ����, ������ ��������
	public static ArrayList<Restaurant> searchRst(Restaurant rst) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = GustoDBManager.connect();
			String sql = "select * from apr13_restaurant where r_seat >= ? order by r_location";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, rst.getSeat());
			rs = pstmt.executeQuery();
			
			ArrayList<Restaurant> rsts = new ArrayList<Restaurant>();
			Restaurant r = null;
			
			while (rs.next()) {
				rsts.add(
						new Restaurant(
							rs.getString("r_location"),
							rs.getString("r_owner"),
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

// 6. ���� ã��(searchRsv) : �������� �̸����� ã��, ���� ��ȣ�� ����
	public static ArrayList<Reservation> searchRsv(Reservation rsv) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = GustoDBManager.connect();
			String sql = "select * "
					+ "	from apr13_reservation "
					+ "	where r_name like '%'||?||'%' "
					+ "	order by r_no";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, rsv.getName());
			rs = pstmt.executeQuery();
			
			ArrayList<Reservation> rsvs = new ArrayList<Reservation>();
			while (rs.next()) {
				rsvs.add(
						new Reservation(rs.getInt("r_no"), rs.getString("r_name"), rs.getDate("r_time"), 
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
	
// 7. �������� ����(updateRsv) : �����ȣ�� �Է��ϸ� ����ó ����
	public static String updateRsv(Reservation rsv) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = GustoDBManager.connect();
			String sql = "update apr13_reservation "
					+ "	set r_phone = ? "
					+ "	where r_no = ?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1,rsv.getPhone()) ;
			pstmt.setInt(2, rsv.getNo());
			
			if (pstmt.executeUpdate() == 1) {
				return "���� ���� ����";
			}
			return "�ش� �������� ����";
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return "���� ���� ����";
		} finally {
			GustoDBManager.close(con, pstmt, null);
		}
	}
	
// 8. �������(deleteRsv) : �����ȣ�� ���
	public static String deleteRsv(Reservation rsv) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = GustoDBManager.connect();
			String sql = "delete from apr13_reservation where r_no = ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, rsv.getNo());
			
			if (pstmt.executeUpdate() == 1) {
				return "���� ��� ����";
			}
			return "�������� ����";
		} catch (Exception e) {
			e.printStackTrace();
			return "������� ���� ";
		} finally {
			GustoDBManager.close(con, pstmt, null);
		}
	}
	

}















