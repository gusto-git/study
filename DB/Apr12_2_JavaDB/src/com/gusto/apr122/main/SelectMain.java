package com.gusto.apr122.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//상품 이름을 오름차순으로 정렬해서 상품 전체 정보 조회
public class SelectMain {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
				String addr = "jdbc:oracle:thin:@58.126.147.45:1521:xe";
				con = DriverManager.getConnection(addr,"yt8662","1");
//				System.out.println("성공!");
				String sql = "select * from apr12_product order by p_name";
				pstmt = con.prepareStatement(sql);
				
				// pstmt.executeUpdate() : 몇개나 영향을 받았는가? (C,U,D)에만 해당
				// pstmt.executeQuery()  : 데이터 (R)
				
				// select문을 수행한 결과를 담을 그릇이 필요
				// select문을 수행한 결과 : ResultSet (List와 비슷한 느낌)
				
				rs = pstmt.executeQuery();
				// rs.next() : 다음 데이터로 넘어감, xml 느낌
				// 다음 데이터가 있는 경우 : true
				// 다음 데이터가 없는 경우 : false가 리턴
				while (rs.next()) { // 데이터가 있는 한 계속 돌아라
//					rs.getXXX("컬럼명") : 현재 위치의 컬럼 읽기
//					rs.getXXX(인덱스) 	: 현재 데이터의 인덱스에 해당하는 컬럼 읽기(비추)
//					System.out.println(rs.getString(2)); 비추
					System.out.println(rs.getInt("p_no"));
					System.out.println(rs.getString("p_name"));
					System.out.println(rs.getInt("p_weight"));
					System.out.println(rs.getInt("p_price"));
					System.out.println("-------------");
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
