import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int selectNo = 0;
		int studentNo = 0; 
		int[] scores = null; // 배열은 참조형이라 null로 초기화 해야한다.
		a:while (true) {
			System.out.println("---------------------------------------------------------");
			System.out.println("1. 학생 수 | 2. 점수 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------------------");
			System.out.println("선택 > ");
			selectNo = k.nextInt();
			
			switch (selectNo) {
			case 5:
				System.out.println("종료합니다.");
				System.out.println("---------------------------------------------------------");
				break a;
			case 1:
				System.out.println("학생 수 입력 : ");
				studentNo = k.nextInt();
				scores = new int[studentNo];
				break;
			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("%d번 학생 점수 : ", i + 1);
					scores[i] = k.nextInt(); // 각 index마다 점수 넣기
				}
			case 3:
				int index = 1; // for - each문에는 인덱스가없어서 새로 넣어줘야한다.
				for (int i : scores) {// scores에 있는 요소들(점수들)
					System.out.printf("%d번 학생 점수 : %d점\n", index++, i);
				}
				break;
			case 4:
				//변수 밖으로 빼는 것이 좋긴함
				int max = 0;
				int sum = 0;
 				for (int i : scores) {
 					sum += i;
					// max에 있는 순자보다 i가 크면 i의 값을 max 그릇에 옮겨답ㅁ기
					max = ( max < i) ? i : max;
				}
 				double avg = (double)sum / scores.length;
				System.out.printf("최고점수 : %d\n,", max);
				System.out.printf("평균점수 : %.2f점\n", avg);
				break;
				
				
				
			default:
				System.out.println("1~5사이만 입력해주 세요");
				break;

			}
		}
	}
}
