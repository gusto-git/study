package com.gusto.mar291.main;

import java.text.DecimalFormat;
import java.util.StringTokenizer;

// 獄穿 1.8.12
//  蒋切軒(1) : major 獄穿
//	急切軒(8.12) : minor 獄穿
//		急 切軒稽 哀 呪系 希 minor馬陥
//		1.8.12 -> 1.8.13 穣益傾戚球(獄穿穣) : 詞側 呪舛
//		1.8.12 -> 1.9.0 穣益傾戚球(獄穿穣) : 痕鉢拭 嬢汗舛亀 汗界戚 身
//		1.8.12 -> 2.0.0 穣益傾巨生(獄穿穣) : 歯稽錘 覗稽益轡 舛亀税 痕鉢 

// 革闘趨滴研 搭背辞 汽戚斗研 閤焼神檎 : 越切莫殿稽 閤焼遭陥.
// 革戚闘趨滴研 搭背辞 汽戚斗研 匝 凶 : 越切莫殿稽 閤焼遭陥.
// 廃越坦軒亜 猿陥稽趨霜 呪 鉱拭 蒸陥. : 廃越精 繕杯背辞 廃越切亜 幻級嬢走壱, 陥献情嬢澗 蟹伸背辞 幻級嬢 像

public class TextMain1 {
	public static void main(String[] args) {
		String s1 = "陥製爽 榎推析精 妃悪!"; // 鉦縦獄穿
		String s2 = new String("神森 榎塘析 舟陥~ 蟹澗 馬欠曽析 切醤走"); // 舛縦獄穿 
		
		// 須酔走源壱 達焼左奄 (切疑刃失拭 赤澗 奄管 石嬢左檎辞)
		// s2拭辞 5腰 属拭 赤澗 越切 窒径馬奄 
		// charAt(i) : 働舛 是帖拭 赤澗 越切 嗣聖 凶 紫遂
		System.out.println(s2.charAt(5));
		
		// s2亜 恥 護越切 昔走 窒径
		// length() : 恥 越切呪研 硝壱 粛聖凶
		System.out.println(s2.length());
		
		// s2亜 '神'虞澗 舘嬢稽 獣拙馬澗走
		// startWith() : 獣拙馬澗 舘嬢亜 限澗走 溌昔拝 凶 (true / false)
		System.out.println(s2.startsWith("神"));
		
		// s2拭 "格巷"虞澗 舘嬢亜 匂敗鞠嬢 赤澗走
		// contains() : 達澗 舘嬢亜 赤澗走 溌昔拝 凶 (true / false)
		System.out.println(s2.contains("格巷"));
		
		// s2拭辞 '蟹澗'戚虞澗 越切研 '格澗'生稽 郊荷奄
		// replace(据掘越切, 郊蝦越切) : 働舛 越切研 陥献 越切稽 郊蝦凶
		System.out.println(s2.replace("蟹", "格"));
		
		// s2拭辞 2~5腰属 越切幻 窒径 (獣拙是帖, 魁是帖 -1) 壕伸精 0採斗 獣拙戚陥.
		// substring(戚雌, 耕幻) : 据馬澗 是帖税 越切研 嗣聖 凶
		System.out.println(s2.substring(2,6));
		System.out.println("---------------------------");
		
		// String 梓端研 持失馬澗汽 莫縦聖 説焼辞
		String s3 = String.format("巷惟 : %.1f", 123.456);
		System.out.println(s3);
		String s4 = new DecimalFormat("###.##").format(12.456);
		System.out.println(s4);
		System.out.println("---------------------------");
		
		// s2拭 越切 蓄亜(鉦縦)
		System.out.println(s2);
		s2 = s2 + " 歯背 差 弦戚 閤生室推~";
		System.out.println(s2);
		s2 = s2 + " 乞砧 採~切 鞠室推~";
		System.out.println(s2);
		// s2拭 越切 蓄亜(舛縦)
		s2 = new String(s2 + "ggggggggg");
		System.out.println(s2);
		
		// String 企勲生稽 蓄亜馬奄
		StringBuffer sb = new StringBuffer(s2);
		sb.append("析精 旋惟 馬鞠 儀精 弦戚 忽惟 背爽室推!");
		sb.append("せせせせせせせせせ");
		sb.append("戚腰爽 榎推析精 照習蟹推? ");
		System.out.println(sb);
		
		String s5 = sb.toString();
		System.out.println(s5);
		System.out.println("---------------------------");
		
		// String 歳軒 
		String s6 = "沿搾獄,酵搾獄,置搾獄,煽什鴇搾獄";
		// 1.Split
		String[] s6Ar = s6.split(","); // 庚切伸 壕伸稽 郊荷壱, 巷譲聖 奄層生稽 蟹喚 依昔亜
		for (String s : s6Ar) {
			System.out.println(s);
		}
		System.out.println(s6Ar[0]);
		System.out.println("---------------------------");
		
		// 2. StringTokenizer
		StringTokenizer st = new StringTokenizer(s6,",");
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			System.out.println("---------------------------");
		}
		// 紗亀 : StringTokenizer
		// data紗拭 痕呪亜 弦陥檎 : split 
	}
}
