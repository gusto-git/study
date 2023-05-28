import java.util.Scanner;

public class test2 {
// Bubble Sort : 인접한 두 항목의 값을 비교해서 기준을 만족하면 서로의 값을 교환하는 정렬 방법
	
	// 1.숫자를 5개 입력 받아서 배열에 담는 함수
	public static int[] getNum() {
		Scanner k = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d번째 숫자 : ", i + 1);
			num[i] = k.nextInt();
		}
		System.out.println();
		System.out.println("---------------");
		return num;
	}
	// 2.정렬되기 전 배열을 출력
	public static void printNum(int[] num) {
		System.out.println("<<정렬 전>>");
		for (int i : num) {
			System.out.println(i + "");
		}
		System.out.println();
		System.out.println("---------------");	
	}
	// 3. 정렬(bubble sort)
	// 앞과 뒤 요소를 비교해서 앞이 크면 앞과 뒤의 값을 서로 교환
	public static int[] getResult(int[] num) {
		int t = 0; 
		for (int turn = 1; turn < num.length; turn++) { //turn을 의미하고
			for (int i = 0; i < num.length-1; i++) { // 요소를 의미
				if (num[i] > num[i + 1]) { // num[i]의 값이 num[i+1]보다 클때,
					t = num[i]; // t에 num[i]번째 값을 넣는다.
					num[i] = num[i+1]; // 비어있는 num[i]에 num[i+1]의 값을 넣는다.
					num[i+1] = t; // 비어있는 num[i+1]에 t를 넣는다.
				}
				System.out.println(num[i] + " ");
			}
			System.out.println("정렬된 값 : " + t);
		}
		return num;
	}
	// 4. 정렬 후의 배열 출력
	public static void printResult(int[] num) {
		System.out.println("<<정렬 후>>");
		for (int i : num) {
			System.out.println(i + " ");
		}
		System.out.println();
		System.out.println("---------");
	}
	
	public static void main(String[] args) {
		int[] num = getNum();
		System.out.println(num);
		printNum(num);
		int[] result = getResult(num);
		printResult(result);
	}
}
