package com.gutso.mar281.main;

import com.gutso.mar281.avengers.Ironman;
import com.gutso.mar281.person.Person;
import com.gutso.mar281.planet.Planet;

//게임 개발중
	// 행성 (이름,크기,보이는지 여부)
	// 사람 (이름)
	
public class OMain1 {
	public static void main(String[] args) {
	
	// 이름이 지구인 행성 생성
	Planet p = new Planet("지구");
	// 본인 이름 적어서 사람하나 생성
	Person p1 = new Person("이현석");
	
	// add라는 메소드를 이용해서 지구에 이현석을 입주
	// "지구에 이현석이 입주!" 출력되게
	p.add(p1);
	
	// 사수 : interface
	// 		interface는 부사수 제어용
	//	attack();을 반드시 구현
	// 아이언맨- attack(); 기능이 반드시 필요
	
	// 아이언맨 객체를 만들어서 attack 기능을 구현
	Ironman i = new Ironman();
//	i.attack();
	
	
	// 이현석이 아이언맨을 전담 영웅으로 픽하는 것
	p1.pick(i);
	p1.heppp();
	
	// 지구라는 행성 사이즈를 1000으로 수정 
	p.setSize(1000);
	// 지구라는 행성을 보이게 수정
	p.setVisible(true);
	
	

	
	
		
		
		
		
		
		
	}
}
