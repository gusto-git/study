package com.gusto.mar273.main;

// import javax.swing.JFrame; // ctrl shift o 稽 舛軒亜管 

import com.gusto.mar273.coffee.Coffee;
import com.gusto.mar273.human.Human;

public class EMain1 {
	public static void main(String[] args) {

		Coffee c = new Coffee();
		// c.set痕呪誤聖 搭背辞 葵聖 走舛拝 呪 赤惟 吉陥. -> set 穿拭 Coffee class拭辞 get&set 竺舛聖 酔識旋生稽 背醤廃陥.
		c.setName("焼五軒朝葛"); 
		c.setPrice(3000);
		c.printInfo();
		// System.out.println(c.getName); 亜管馬陥. / set聖 照馬檎 鯵紺 窒径戚 災亜管馬陥. 
		
		Coffee c1 = new Coffee("巨朝凪昔 焼五軒朝葛", 3500);
		c1.printInfo();
		// System.out.println(c1.name); 災亜管馬陥.
		
		// 紫寓 class
		// 戚硯 蟹戚 倖巷惟 
		Human h = new Human();
		h.setName("掩疑");
		h.setAge(-25); // 蟹戚澗 -亜 蒸嬢辞 戚杏 紫穿拭 厳澗 号狛戚 糎仙敗
		System.out.println(h.getAge());
		
		
		
	}
}

//// 展戚堂戚 せせせ昔 JFrame
///* jf + 切疑刃失 */ 
//
//JFrame f = new JFrame("せせせ"); // 歯 梓端研 襖鎧神澗 依引 旭陥.
//// 紫戚綜研 300, 500生稽 実特
//f.setSize(300, 500);
//
//// 左戚惟 馬壱粛製
//f.show(); // deprecated 映舌馬走 省製.. 
//
//// 展戚堂聖 ぞぞぞ稽 呪舛馬壱粛陥.
//f.setTitle("ぞぞぞ");
//
//// 左戚惟 馬澗 狛
//f.setVisible(true);






