// 紺啄奄
public class RMain3 {
	public static void main(String[] args) {
		// せ
		// せせ
		// せせせ
		// せせせせ
		// せせせせせ
		
		for (int i = 1; i < 6; i++) {//1  // 2 
			for (int j = 1; j <= i; j++) { //1,2 // 1,2,3
				System.out.print("せ"); // せ聖 for拭 限仲辞 鎧虞 
			}
			System.out.println();
		}
		System.out.println("========1=======");// i人 j亜 旭聖 凶幻 亜管 益依左陥 拙生檎 朔牒生稽 蟹人醤敗.
		for (int i = 1; i < 6; i++) {  
			for (int j = 1; j <= i; j++) {  
				if(j == i) {
					System.out.println("せ");
				}else {
					System.out.print(" ");
				}
			} 	
		}
		
		System.out.println("========2=======");
		// 砧腰属
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((i == j)? "せ" : " ");
			}
			System.out.println(" ");
		}
		
		System.out.println("========3=======");
		// 室腰属
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("  "); // j亜 i左陥 拙精 因娃精 句嬢床奄稽 
			}
			
			System.out.println("せ");
		}
		System.out.println("========徳=======");
		int x = 15;
//		System.out.println(x++);// x拭 1聖 希背虞  x胡煽 妊薄馬壱 益 及拭 + 1
//		System.out.println(x++);// 廃腰 希背醤 1聖 希背層陥 .
		System.out.println(++x);// 聖 背醤走 郊稽 1聖 希背層陥. 希馬奄 1聖 廃 x
		
	
		System.out.println("========4=======");
		for (int i = 5; i >= 1; i--) { // 繊繊 層陥  
			for (int j = 1; j <= i; j++) { //
//				System.out.print((i % 2 == 1 ? "せ" : "ぞ"));
				if (i % 2 == 1) {
					System.out.print("せ");
				} else {
					System.out.print("ぞ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("========5=======");
		for (int i = 1; i < 6; i++) { 
			for (int j = 6; 1 <= j-i; j--) { 
				System.out.print((i % 2 == 1 ? "せ" : "ぞ"));
			}
			System.out.println();
		}
		
		System.out.println("========6=======");
		for (int i = 1; i < 6; i++) {  // 1 -> 6
			for (int j = 1; j <= (6 - i); j++) {  // 1 < = 6-1 
				System.out.print((i % 2 == 1 ? "せ" : "ぞ"));
			}
			System.out.println();
		}
		
		// 寿薦 //
		//せ
		//ぞぞぞ
		//せせせせせ
		//ぞぞぞぞぞぞぞ
		//せせせせせせせせせ
		
		// 寿薦 //
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		
		
		
		//main///////////////////////////////////////////////////////
	}

}