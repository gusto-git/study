package com.gusto.may231.main;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

// 여기 저기 날짜를 많이 다를 수도 있기 때문에 main에서 사용 
public class DateManager {
	//  signup.jsp의 <select> 년도 부분에서 해마다 바꾸지 않고 여기서 받아오기 위함
	
	public static void getCurYear(HttpServletRequest req) { // setattribute 쓰려면 필요함
		Date now = new Date(); // 지금 현재날짜를 now에 불러왔음
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy"); // 내가 원하는 부분만 작성
		String curYear = sdf.format(now); // date -> string으로 넘어갈땐 format
		req.setAttribute("cy", curYear); // cy에 curYear 넣기 
		
		
		
	}
}
