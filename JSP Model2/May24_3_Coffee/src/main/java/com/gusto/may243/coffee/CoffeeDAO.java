package com.gusto.may243.coffee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.gusto.db.manager.GustoDBManager;

public class CoffeeDAO {
	
	public static void getAllCoffee(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = GustoDBManager.connect("leePool");
			String sql = "select * from may24_coffee order by c_price";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			ArrayList<Coffee> coffees = new ArrayList<Coffee>();
			Coffee c = null;
			
			while (rs.next()) {
				c = new Coffee();
				c.setC_no(rs.getInt("c_no"));
				c.setC_name(rs.getString("c_name"));
				c.setC_price(rs.getInt("c_price"));
				c.setC_bean(rs.getString("c_bean"));
				c.setC_country(rs.getString("c_country"));
				c.setC_store(rs.getString("c_store"));
				c.setC_kcal(rs.getInt("c_kcal"));
				coffees.add(c);
			}
			
			req.setAttribute("coffees", coffees);
		} catch (Exception e) {
			e.printStackTrace();
		}
		GustoDBManager.close(con, pstmt, rs);
	}
	
	// xml
	public static String getAllCoffeeXML(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = GustoDBManager.connect("leePool");
			String sql = "select * from may24_coffee order by c_price";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			StringBuffer sb = new StringBuffer();
			sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			sb.append("<may24_coffee>");
				while (rs.next()) {
					sb.append("<coffee>");
					sb.append("<c_no>" + rs.getInt("c_no") + "</c_no>");
					sb.append("<c_name>" + rs.getString("c_name") + "</c_name>");
					sb.append("<c_price>" + rs.getInt("c_price") + "</c_price>");
					sb.append("<c_bean>" + rs.getString("c_bean") + "</c_bean>");
					sb.append("<c_country>" + rs.getString("c_country") + "</c_country>");
					sb.append("<c_store>" + rs.getString("c_store") + "</c_store>");
					sb.append("<c_kcal>" + rs.getInt("c_kcal") + "</c_kcal>");
					sb.append("</coffee>");
				}
			sb.append("</may24_coffee>");
			return sb.toString();
			
		} catch (Exception e) {
			e.printStackTrace();
			return "망";
		} finally {
			GustoDBManager.close(con, pstmt, rs);
		}
	}
	
	// json
	public static String getAllCoffeeJSON(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = GustoDBManager.connect("leePool");
			String sql = "select * from may24_coffee order by c_price";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			boolean isFirst = true;
			StringBuffer sb = new StringBuffer();
			sb.append("[");
				while (rs.next()) {
					if (isFirst) {
						isFirst = false;
					}else {
						sb.append(",");
					}
					
					//오브젝트
					sb.append("{");
					sb.append("\"c_no\":\"" + rs.getInt("c_no") + "\",");
					sb.append("\"c_name\":\"" + rs.getString("c_name") + "\",");
					sb.append("\"c_price\":" + rs.getInt("c_price") + ",");
					sb.append("\"c_bean\":\"" + rs.getString("c_bean") + "\",");
					sb.append("\"c_country\":\"" + rs.getString("c_country") + "\",");
					sb.append("\"c_store\":\"" + rs.getString("c_store") + "\",");
					sb.append("\"c_kcal\":" + rs.getInt("c_kcal"));
					sb.append("}");
				}
			sb.append("]");
			return sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return "망함";
		} finally {
			GustoDBManager.close(con, pstmt, rs);
			
		}
	}
	
}
