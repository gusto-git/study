package com.gusto.apr272.main;

import java.util.Random;

public class Test {
	// 001 ~ 011 -> 답이 될 수 없다.
	// 012 ~ 987 -> 답이 될 수 있는 범위(중복 되는 숫자는 빼야함)
	// 988 ~ 999 -> 답이 될 수 없다.

	public static String pickAns() {
		int a = new Random().nextInt(976)+12; // 012~987까지 나옴
		String ans = String.format("%03d", a);
		
		if (ans.charAt(0) == ans.charAt(1)
				|| ans.charAt(1) == ans.charAt(2)
				|| ans.charAt(2) == ans.charAt(0) ) {
			
			return pickAns();
		}
		return ans;
	}
	
	public static void main(String[] args){
		String ans = pickAns();
		System.out.println(ans);
		
	}

	
	
}
