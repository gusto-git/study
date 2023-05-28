package com.gusto.may263;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gusto.may263.coffee.Coffee;
import com.gusto.may263.member.MemberDAO;


@Controller
public class HomeController {

	// Coffee 클래스 가져오는 것
	@Autowired
	private Coffee c1;
	
	@Autowired MemberDAO mDAO;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		System.out.println(c1.getName());
		System.out.println(c1.getPrice());
		
		mDAO.test();
		
		return "home";
	}
	
}
