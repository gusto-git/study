import java.util.Scanner;

//Bubble Sort : 인접한 두 항목의 값을 비교해서 기준을 만족하면 서로의 값을 교환하는 정렬 방법
public class PMain1 {
	
	// 1.숫자 5개를 입력 받아서 배열에 담는 메소드
	public static int[] getNum() {
		Scanner k = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d번째 숫자 입력 : ", i+1);
			num[i] = k.nextInt();
		}
		System.out.println();
		System.out.println("-----------");
		return num;
	}
	// 2.정렬되기 전 배열을 출력
	public static void printNum(int[] num) {
		System.out.println("<<정렬 전 값>>");
		for (int i : num) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("--------");
	}

	// 정렬 < bubble sort
		// 앞과 뒤 요소를 비교해서 앞이 크면 앞과 뒤의 값을 서로 교환
	public static int[] getResult(int[] num) {
		//임시변수
		int t = 0 ;
		for (int turn1 = 1; turn1 < num.length; turn1++) {
			for (int i = 0; i < num.length-1; i++) { // num.length-1 하는 이유 : 
				if (num[i] > num[i + 1]) {
					t = num[i]; // num i 번째 요소를 임시변수 t에 잠시 담아두기
					num[i] = num[i + 1]; // 우항의 값을 좌항에 넣는다. 
					num[i+1] = t;// num i + 1번째에 t에 있던 것을 넣는다.
				}
				System.out.print(num[i] + " ");
			}
			System.out.println("정렬된 값 : " + t);
		}
		return num;
	}
	
	// 정렬 후의 배열 출력
	public static void printResult(int[] result) {
		System.out.println("<<정렬 후 값>>");
		for (int i : result) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("--------");
	}
	
	public static void main(String[] args) {
		int[] num = getNum();
		System.out.println(num); // 주소값이 출력되기 때문에 2. 정렬되기 전 배열을 출력으로 가서 출력해야함
		printNum(num);
		int[] result = getResult(num);
		printResult(result);
	}
}
