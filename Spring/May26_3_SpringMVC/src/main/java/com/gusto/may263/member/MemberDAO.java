package com.gusto.may263.member;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// SpringMVC + Maven + MyBatis framework

// 연/월/일 << 의 형태로 현재시간을 표현해주고 있었음

// 운영자가 시,분,초 까지 나오게 하고 싶다고 요청
// 연/월/일 -> 연-월-일 시:분:초

// servlet-context.xml에 등록한 것과 같은 효과
@Service
public class MemberDAO {
	@Autowired
	private SimpleDateFormat sdf;
	
	public void test() {
		Date now = new Date();
		System.out.println(sdf.format(now));
	}
}
