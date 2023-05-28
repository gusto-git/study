import java.util.Scanner;
public class PMain3_1 {
	

	// main함수에서 진행
	// 1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료
//		1을 입력하면 학생 수의 값을 입력받을 수 있게
//		2를 입력하면 각 학생들의 점수를 입력받을 수 있게 (점수 범위는 고려 X)
//	 	3을 입력하면 각 학생들의 점수 리스트 (1번학생 : 50점 / 2번학생 :80점 / ...)
//		4를 입력하면 최고점수 및 평균점수 분석해서 출력
//	 	5를 입력하면 프로그램 종료
	// 각각 상황에 따라 조건문, 반복문 어떤게 더 편할지 생각해서 진행~

		public static void main(String[] args) {
			Scanner k = new Scanner(System.in);
			int selectNo = 0;
			int studentNo = 0;
			int[] scores = null; // 배열의 기본값은 null!
			int index = 0;
			a:while (true) {
				System.out.println("=================================================================");
				System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
				System.out.println("=================================================================");
				System.out.print("선택 > ");
				selectNo = k.nextInt();
				switch (selectNo) {
				case 5:
					System.out.println("종료합니다");
					System.out.println("=================================================================");
					break a;
				case 1:
					System.out.print("학생 수 입력 : ");
					studentNo = k.nextInt();
					scores = new int[studentNo];
					break;
				case 2:
					for (int i = 0; i < scores.length; i++) {
						System.out.printf("%d번 학생 점수 : ", i + 1);
						scores[i] = k.nextInt(); // 각 index 마다 점수 넣기
					}
					break;
				case 3:
					index = 1; // foreach문에는 index가 없으므로 임의로 만들어줘야
					for (int i : scores) { // scores에 있는 요소들(점수들)
						System.out.printf("%d번 학생 점수 : %d점\n",  index++, i);
					}
					break;
				case 4:
					// 변수 반복문 밖으로 빼는 것이 좋음!
					int max = 0;
					int sum = 0;
					for (int i : scores) {
						sum += i;
						// max에 있는 숫자보다 i가 크면 i의 값을 max그릇에 옮겨담기
						max = (max < i) ? i : max;
					}
					double avg = (double) sum / scores.length;
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

