package com.gusto.mar273.main;

// import javax.swing.JFrame; // ctrl shift o 로 정리가능 

import com.gusto.mar273.coffee.Coffee;
import com.gusto.mar273.human.Human;

public class EMain1 {
	public static void main(String[] args) {

		Coffee c = new Coffee();
		// c.set변수명을 통해서 값을 지정할 수 있게 된다. -> set 전에 Coffee class에서 get&set 설정을 우선적으로 해야한다.
		c.setName("아메리카노"); 
		c.setPrice(3000);
		c.printInfo();
		// System.out.println(c.getName); 가능하다. / set을 안하면 개별 출력이 불가능하다. 
		
		Coffee c1 = new Coffee("디카페인 아메리카노", 3500);
		c1.printInfo();
		// System.out.println(c1.name); 불가능하다.
		
		// 사람 class
		// 이름 나이 몸무게 
		Human h = new Human();
		h.setName("길동");
		h.setAge(-25); // 나이는 -가 없어서 이걸 사전에 막는 방법이 존재함
		System.out.println(h.getAge());
		
		
		
	}
}

//// 타이틀이 ㅋㅋㅋ인 JFrame
///* jf + 자동완성 */ 
//
//JFrame f = new JFrame("ㅋㅋㅋ"); // 새 객체를 꺼내오는 것과 같다.
//// 사이즈를 300, 500으로 셋팅
//f.setSize(300, 500);
//
//// 보이게 하고싶음
//f.show(); // deprecated 권장하지 않음.. 
//
//// 타이틀을 ㅎㅎㅎ로 수정하고싶다.
//f.setTitle("ㅎㅎㅎ");
//
//// 보이게 하는 법
//f.setVisible(true);






