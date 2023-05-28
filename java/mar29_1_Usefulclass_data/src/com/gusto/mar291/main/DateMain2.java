package com.gusto.mar291.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.TimeZone;

public class DateMain2 {
	public static void main(String[] args) {
		String[] local = TimeZone.getAvailableIDs(); // 대륙과 나라를 알려주는 것 
		for (int i = 0; i < local.length; i++) {
			System.out.println(local[i]); 
		}
		//Europe/Rome
		//Asia/Seoul
		TimeZone t;
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD E HH:mm:ss");
		
//		t = TimeZone.getTimeZone("Asia/Seoul");
//		sdf.setTimeZone(t);
//		System.out.println(t.getDisplayName());
//		System.out.println(sdf.format(now));
		
		t = TimeZone.getTimeZone("Europe/Rome");
		sdf.setTimeZone(t);
		System.out.println(t.getDisplayName());
		System.out.println(sdf.format(now));
	}
}
