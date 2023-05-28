import java.util.Scanner;

// ver.함수
public class test5 {
	
	public static void start() {
		System.out.println("---------------------------------------------------------");
		System.out.println("1. 학생 수 | 2. 점수 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
		System.out.println("---------------------------------------------------------");
	}
	
	// 선택하는 메뉴를 받아 오는 함수
	public static int getSelectNo() {
		Scanner k = new Scanner(System.in);
		System.out.print("선택 > ");
		int selectNo = k.nextInt();
		return selectNo;
	}
	// 학생 수 받아오는 함수
	public static int getStudentNum() {
		Scanner k = new Scanner(System.in);
		System.out.print("학생 수 : ");
		int studentNum = k.nextInt();
		return studentNum;		
	}
	// 학생 개개인의 점수 받아오는 함수
			// 점수 범위는 (0~100)
	public static int getScore() {
		Scanner k = new Scanner(System.in);
		int score = k.nextInt();
		if (score > 100) {
			System.out.println("점수는 100점을 넘을 수 없습니다.");
			System.out.println("다시 입력 : ");
		}else if (score < 0) {
			System.out.println("점수는 0보다 낮을 수 없습니다.");
			System.out.println("다시 입력 : ");
		}
		return (score <= 100 && score >= 0 ) ? score : getScore();
	}
	// 학생들 점수 입력하는 함수
	public static void getScore(int[] score) { // 오버로딩 사용
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d번 학생 점수 입력 : ", i+1);
			score[i] = getScore();
		}
	}
	// 학생 점수 출력하는 함수
	public static void printScore(int[] score) {
		int index = 1;
		for (int i : score) {
			System.out.printf("%d번 학생 점수 : %d\n", index++, i);
		}
	}
	
	// 최고 점수, 평균점수 출력하는 함수
	public static void printState(int[] score) {
		int sum = 0;
		int max = 0;
		for (int i : score) {
			sum += i;
			max = (max < i )? i : max;
		}
		double avg = (double)sum / score.length;
		System.out.printf("평균점수 : %.1f\n", avg);
		System.out.printf("최고점수 : %d\n", max);
	}
	// 종료하는 함수
		public static void end() {
			System.out.println("종료합니다");
			System.out.println("---------------------------------------------------------");
		}
		public static void activate() {
			int selectNo = 0;
			int studentNum = 0;
			int[] score = null;
			while (true) {
				start();
				selectNo = getSelectNo();
				if (selectNo == 5) {
					end();
					break;
				}else if (selectNo == 1) {
					studentNum =getStudentNum();
					score = new int[studentNum];
				}else if (selectNo == 2) {
					getScore(score);
				}else if (selectNo == 3) {
					printScore(score);
				}else if (selectNo == 4) {
					printState(score);
				}else {
					System.out.println("입력이 잘못되었습니다.");
					System.out.println("다시 입력하세요");
				}
			}
		}
		
	
	
	public static void main(String[] args) {
		activate();
	}
}
