package com.gusto.apr032.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

// Set域伸
//	亜痕紫戚綜
//	掻差汽戚斗 切疑 肢薦
//		旭精 梓端亜 食君腰 級嬢亜檎 馬蟹幻 害沿
//	授辞亜 沓棋
//	HashSet, TreeSet, ... .
//		-> 叔穿拭辞 益韓 政遂馬走 省製

public class SetMain {
	public static void main(String[] args) {
//	HashSet 切疑 掻差薦暗 溌昔
		HashSet<String> hs = new HashSet<String>();
		hs.add("けけ");
		hs.add("けけ");
		hs.add("しし");
		hs.add("ぞぞ");
		hs.add("けけ");
		hs.add("けけ");
		System.out.println(hs.size()); // 衣引 : 3 / 掻差 薦暗亜 喫
		System.out.println("---------");
		for (String s : hs) { 
		// 害精 推社亜 更亜 赤澗走澗 硝 呪 赤生蟹, 掻差 推社 掻 嬢巨亜 肢薦吉走澗 硝走 公敗
			System.out.println(s);
			System.out.println("---------");
		}
//	ArrayList稽 汽戚斗研 閤焼神切 -> 舛呪 10鯵(掻差葵戚 赤亀系)
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(101);
		al.add(102);
		al.add(101);
		al.add(101);
		al.add(103);
		al.add(104);
		al.add(105);
		al.add(100);
		al.add(101);
		al.add(104);
		System.out.println(al);
		
//	掻差薦暗 : set拭 list研 眼焼辞 掻差 薦暗!
		HashSet<Integer> hs2 = new HashSet<Integer>(al);
		al = new ArrayList<Integer>(hs2); // 掻差薦暗 板 陥獣 list稽 隔奄
//	掻差薦暗 板 鎧顕託授
		Comparator<Integer> c = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1.compareTo(o2);
			}
		};	
		al.sort(c);
		for (Integer integer : hs2) {
			System.out.println(integer);
		}
	}
}
