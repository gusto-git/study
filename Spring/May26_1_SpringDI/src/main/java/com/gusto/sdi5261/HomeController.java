package com.gusto.sdi5261;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gusto.sdi5261.book.Book;
import com.gusto.sdi5261.dog.Dog;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	// Spring : Java에서 IoC로 DI해주는 Framework
	// 	지금까지 ) 객체를 .java에서 만들기 
	//	Spring ) 객체 외부파일(.xml)에서 만들기 -> .java에서 불러서 사용
	
	// IoC(제어의 역전, Inversion Of Control)은 일반적인 디자인 패턴 중 하나
	// 		프로그램의 제어 흐름을 직접 하는 것이 아니라 외부에서 관리하는 것 
	
	// DI(의존성 주입, Dependency Injection)은 제어의 역전(IoC)이라는 패턴을 달성하는 방법 중 하나 
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		// 원래 객체만드는 방법
//		 Dog d = new Dog("강아지", 3);
//		 System.out.println(d.getName());
//		 System.out.println(d.getAge());
		
		// DI 하는 방법 : may251Beans.xml 불러오기 -> xml파일에 등록해 놓은 객체들 가져오기 위해서
		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("may261Beans.xml");
		
		// aac가 없어질 때 등록해놓은 객체도 없애라라는 뜻 
		aac.registerShutdownHook();
		
		//id가 d인 강아지 객체 불러오기
		Dog d = aac.getBean("d", Dog.class); // xml 객체 불러오기
		System.out.println(d);
		
		// DI(Dependency Injection - 의존성 주입)
		//	xml에서 객체를 만들고, 속성값 넣고
		//	Java에서 가져다 쓰는 형식 
		Dog d2 = aac.getBean("d2", Dog.class);
		System.out.println(d2.getName());
		System.out.println(d2.getAge());
		
		// 책 제목, 책 가격 공간을 만들어서 객체 만들고 속성값 넣고 자바에서 쓰기 
		
		Book b = aac.getBean("b", Book.class);
		System.out.println(b.getName());
		System.out.println(b.getPrice());
		
		
		Book b2 = aac.getBean("b2", Book.class);
		System.out.println(b2.getName());
		System.out.println(b2.getPrice());
		
		// aac 없애기
		aac.close();
		 return "home";
	}
	
}
