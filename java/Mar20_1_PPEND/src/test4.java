import java.util.Scanner;

// main함수에서 진행
// 1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료
//		1을 입력하면 학생 수의 값을 입력받을 수 있게
//		2를 입력하면 각 학생들의 점수를 입력받을 수 있게 (점수 범위는 고려 X)
//	 	3을 입력하면 각 학생들의 점수 리스트 (1번학생 : 50점 / 2번학생 :80점 / ...)
//		4를 입력하면 최고점수 및 평균점수 분석해서 출력
//	 	5를 입력하면 프로그램 종료
// 각각 상황에 따라 조건문, 반복문 어떤게 더 편할지 생각해서 진행~

public class test4 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int selectNo = 0;
		int studentNo = 0;
		int index = 0;
		int[] score = null; // 배열의 기본값은 null;로 초기화
		
		a:while (true) {
			System.out.println("=================================================================");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("=================================================================");
			System.out.print("선택 > ");
			selectNo = k.nextInt(); // 위에서 int selectNo을 선언했기 때문에 또 int를 붙일 필요가 없다.
			switch (selectNo) {
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break a;
			case 1:
				System.out.print("학생수 입력 :");
				studentNo = k.nextInt();
				score = new int[studentNo];
				break;
			case 2:
				for (int i = 0; i < studentNo; i++) {
					System.out.print("점수 입력 :");
					score[i] = k.nextInt();
				}
				break;
			case 3:
				index = 1;
				for (int i : score) {
					System.out.printf("%d번 학생 점수 : %d점\n", index++, i);
				}
				break;
			case 4:
				int max = 0;
				int sum = 0;
				for (int i : score) {
					sum += i;
					max = (max < i) ? i : max;
				}
				double avg = (double) sum / score.length;
				System.out.printf("최고점수 : %d\n", max);
				System.out.printf("평균점수 : %.2f점\n", avg);
				break;
			default:
				System.out.println("1부터 5사이만 입력해주세요");
				break;
			}
		}
	}
}
