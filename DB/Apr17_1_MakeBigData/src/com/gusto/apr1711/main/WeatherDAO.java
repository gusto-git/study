package com.gusto.apr1711.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.gusto.db.manager.GustoDBManager;
import com.gusto.http.client.GustoHttpClient;
// �ʿ��� JAr ���� : json, ojdbc8, httpclient, dbmanager
public class WeatherDAO {
	// 1. Ȩ�������� �ִ� JSON �޾ƿͼ� ������ Parsing�ϱ�
	public static Weather getWeather() {
		try {
			// ��ġ(JSON)�� ���α׷�(IDE-Eclipse)���� �Է��� �� ���

			String addr = "https://api.openweathermap.org/data/2.5/weather"
					+ "?q=seoul&appid=8a6cd099fcff98185b8b37a3f69227b1&units=metric&lang=Kr";
					
		
//		input
			InputStream is = GustoHttpClient.download(addr);
			String str = GustoHttpClient.convert(is, "UTF-8");
			
//		javabean ����
			Weather w = new Weather();
			JSONParser jp = new JSONParser();
			// {} : ��ü(Object), [] : �迭(Array)
			JSONObject jo = (JSONObject) jp.parse(str);
			// �迭 �̸��� weather�� ��
			JSONArray wt = (JSONArray) jo.get("weather");
			// �迭 ���� 0��° ��ü
			JSONObject wt2 = (JSONObject) wt.get(0);
			// description�� ��������
			// Object�� String���� �ٲٱ�
			// 1. �տ� (String) �ֱ� - ����
			// 2. �����ڷ� �ٲٱ� - ���� / wt2.get("description") + "";
			// 3. Java���� ������� toString() ��� - ��õ(����
			// 		��� �ڹ��� ��ü�� String���� �ٲٱ� ���ϰ� toString()�̶�� method�� ����
			
			// wt2�ӿ� �ִ� description�� String���� ��������
			w.setDescription(wt2.get("description").toString());
			
			// main�̶�� ��ü(Object)
			JSONObject main = (JSONObject) jo.get("main");
			// temp �κ��� toString()���� ������ͼ� BigDecimal�� �ٲ۵� Javabean���� ����
			w.setTemp(new BigDecimal(main.get("temp").toString()));
			w.setFeels_like(new BigDecimal(main.get("feels_like").toString()));
			w.setTemp_min(new BigDecimal(main.get("temp_min").toString()));
			w.setTemp_max(new BigDecimal(main.get("temp_max").toString()));
			w.setPressure(new BigDecimal(main.get("pressure").toString()));
			w.setHumidity(new BigDecimal(main.get("humidity").toString()));
			
			return w;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 2. return ���� ��ü�� DB�� insert �ϱ�
	public static String insertWeather(Weather w) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			// �� DB������ ����
			con = GustoDBManager.connect();
			// ���� ���ϴ� SQL�� ->
			String sql = "insert into SEOUL_WEATHER values(sysdate, ?, ?, ?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			// ���α׷�(eclipse)���� �ʿ��� �͵��� ������(get) DB�ӿ�
			// �ش��ϴ� ���� ����(SET)�ϱ�
			pstmt.setString(1, w.getDescription());
			pstmt.setBigDecimal(2, w.getTemp());
			pstmt.setBigDecimal(3, w.getFeels_like());
			pstmt.setBigDecimal(4, w.getTemp_min());
			pstmt.setBigDecimal(5, w.getTemp_max());
			pstmt.setBigDecimal(6, w.getPressure());
			pstmt.setBigDecimal(7, w.getHumidity());
			// DB�� ���� ��ȭ�� ����� ����
			if (pstmt.executeUpdate() == 1) {
				return "�Ϸ�";
			}
			return "����";
			
		} catch (Exception e) {
			e.printStackTrace();
			return "����";
			
		} finally {
			GustoDBManager.close(con, pstmt, null);
		}
	}



	// 3. �� DB�� ����ִ� ���� ��ü ������ ��� �ҷ����� �ð������� ����
	public static ArrayList<Weather> getMyWeather() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = GustoDBManager.connect();
			String sql = "select * from SEOUL_WEATHER order by sw_when";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			ArrayList<Weather> weathers = new ArrayList<Weather>();
			while (rs.next()) {
				// DB �ʵ��� ������ ������ GET�ؼ� JAVABEAN(WEATHER)��ü�� SET�ϱ�
				weathers.add(
						new Weather(
								rs.getDate("sw_when"),
								rs.getString("sw_description"),
								rs.getBigDecimal("sw_temp"),
								rs.getBigDecimal("sw_feels_like"),
								rs.getBigDecimal("sw_temp_min"),
								rs.getBigDecimal("sw_temp_max"),
								rs.getBigDecimal("sw_pressure"),
								rs.getBigDecimal("sw_humidity")
								)
						
						);
				
			}
					return weathers;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			GustoDBManager.close(con, pstmt, rs);
			
		}
	}


	// 4. ���� ������ ���� ArrayList�� csv���Ϸ� �ٲٱ�
	public static void writeWeatherToFile(ArrayList<Weather> weathers) {
		FileOutputStream fos = null;
		
		try {
			String path = "C:\\Users\\yt866\\Desktop\\fos\\weather.csv";
			fos = new FileOutputStream(path, true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd,E,HH,mm,ss");
			
			for (Weather w : weathers) {
				bw.write(sdf.format(w.getWhen()) + ",");
				bw.write(w.getDescription() + ",");
				bw.write(w.getTemp() + ",");
				bw.write(w.getFeels_like() + ",");
				bw.write(w.getTemp_min() + ",");
				bw.write(w.getTemp_max() + ",");
				bw.write(w.getPressure() + ",");
				bw.write(w.getHumidity() + "\r\n"); // �������� enter
				bw.flush();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}	




