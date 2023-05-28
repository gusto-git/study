package com.gusto.may262;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gusto.may262.cat.Cat;
import com.gusto.may262.dog.Dog;
import com.gusto.may262.human.Human;


@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		AbstractApplicationContext acc = new ClassPathXmlApplicationContext("may262Beans.xml");
		
		Dog d = acc.getBean("d", Dog.class);
		System.out.println(d.getName());
		System.out.println(d.getAge());
		
		Cat c = acc.getBean("c", Cat.class);
		System.out.println(c.getName());
		System.out.println(c.getAge());
		
		Human h1 = acc.getBean("h1", Human.class);
		System.out.println(h1.getName());
		System.out.println(h1.getAge());
		
		for (String nn : h1.getNickname()) {
			System.out.println(nn);
		}
		
		for (String fr : h1.getFriend()) {
			System.out.println(fr);
		}
		System.out.println(h1.getFamily().get("아빠"));
		System.out.println(h1.getFamily().get("엄마"));
		
		
		System.out.println(h1.getPet().getName());
		System.out.println(h1.getPet().getAge());
		
		System.out.println(h1.getPet2().getName());
		System.out.println(h1.getPet2().getAge());
		
		acc.close();
		return "home";
	}
	
}
