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
// 필요한 JAr 파일 : json, ojdbc8, httpclient, dbmanager
public class WeatherDAO {
	// 1. 홈페이지에 있는 JSON 받아와서 데이터 Parsing하기
	public static Weather getWeather() {
		try {
			// 장치(JSON)를 프로그램(IDE-Eclipse)으로 입력할 때 사용

			String addr = "https://api.openweathermap.org/data/2.5/weather"
					+ "?q=seoul&appid=8a6cd099fcff98185b8b37a3f69227b1&units=metric&lang=Kr";
					
		
//		input
			InputStream is = GustoHttpClient.download(addr);
			String str = GustoHttpClient.convert(is, "UTF-8");
			
//		javabean 생성
			Weather w = new Weather();
			JSONParser jp = new JSONParser();
			// {} : 객체(Object), [] : 배열(Array)
			JSONObject jo = (JSONObject) jp.parse(str);
			// 배열 이름이 weather인 곳
			JSONArray wt = (JSONArray) jo.get("weather");
			// 배열 안의 0번째 객체
			JSONObject wt2 = (JSONObject) wt.get(0);
			// description만 가져오기
			// Object를 String으로 바꾸기
			// 1. 앞에 (String) 넣기 - 정석
			// 2. 연산자로 바꾸기 - 간편 / wt2.get("description") + "";
			// 3. Java에서 만들어준 toString() 사용 - 추천(안전
			// 		모든 자바의 객체는 String으로 바꾸기 편하게 toString()이라는 method가 존재
			
			// wt2속에 있는 description을 String으로 가져오기
			w.setDescription(wt2.get("description").toString());
			
			// main이라는 객체(Object)
			JSONObject main = (JSONObject) jo.get("main");
			// temp 부분을 toString()으로 가지고와서 BigDecimal로 바꾼뒤 Javabean으로 셋팅
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

	// 2. return 받은 객체를 DB에 insert 하기
	public static String insertWeather(Weather w) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			// 내 DB서버와 연결
			con = GustoDBManager.connect();
			// 내가 원하는 SQL문 ->
			String sql = "insert into SEOUL_WEATHER values(sysdate, ?, ?, ?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			// 프로그램(eclipse)에서 필요한 것들을 꺼내서(get) DB속에
			// 해당하는 곳에 설정(SET)하기
			pstmt.setString(1, w.getDescription());
			pstmt.setBigDecimal(2, w.getTemp());
			pstmt.setBigDecimal(3, w.getFeels_like());
			pstmt.setBigDecimal(4, w.getTemp_min());
			pstmt.setBigDecimal(5, w.getTemp_max());
			pstmt.setBigDecimal(6, w.getPressure());
			pstmt.setBigDecimal(7, w.getHumidity());
			// DB에 한줄 변화가 생기면 성공
			if (pstmt.executeUpdate() == 1) {
				return "완료";
			}
			return "실패";
			
		} catch (Exception e) {
			e.printStackTrace();
			return "에러";
			
		} finally {
			GustoDBManager.close(con, pstmt, null);
		}
	}



	// 3. 내 DB에 들어있는 날씨 전체 정보를 모두 불러오고 시간순으로 정렬
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
				// DB 필드명과 동일한 내용을 GET해서 JAVABEAN(WEATHER)객체에 SET하기
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


	// 4. 역대 날씨를 담은 ArrayList를 csv파일로 바꾸기
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
				bw.write(w.getHumidity() + "\r\n"); // 마지막은 enter
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




