//변수
// 변수1 : 데이터1
//배열(Array) "[]"
// 변수1 : 데이터n

//배열 : 
//	같은 타입(자료형)의 여러 변수를 하나의 묶음으로 다루는 것
//	배열 속에 있는 각가의 데이터[요소]라고 부름
//  이 요소마다 붙여진 일련번호가 있음 -> 각 요소를 구분하는 데 사용
//  index(인덱스)/일련번호 : 시작은 0부터! 

// 배열생성 
// 자료형[] 변수명; // 배열선언
// 변수명 = new 자료형[배열 길이의 갯수]; // 배열 생성 
// 자료형[] 변수명 = new 자료형[배열 길이의 갯수]; 정식 
// 참조형(string)은 heap에 저장된다. 
// 참조형(배열)도 heap에 저장된다.
// 그래서 syso(eng) 했을때 이상한 값이 나온다. [I@2a139a55 << 참조형 주소값


public class AMain1 {
	public static void main(String[] args) {
		int[] eng = new int[3]; // 자료형(int)[] 변수명(eng) = new 자료형(int)배열 길이의 갯수[3]
		eng[0] = 100;
		eng[1] = 70;
		eng[2] = 50; // int[3]을 선언했기 때문에 eng[0]~eng[2] 까지 선언
		System.out.println(eng); // [I@2a139a55이 stack으로 넘어간다. 
		for (int i = 0; i < eng.length; i++) { // .length : 이 배열의 요소가 몇개인지 알려준다.
											   // .size() : 가 필요한 경우도 있다. 
			System.out.println(eng[i]); // 이렇게 해야지 추출이된다.
		}
		System.out.println("==================");
		int[] math = new int[] {10, 20, 30}; // 약식 못쓸때 사용 가능 
		System.out.println(math);
		for (int i = 0; i < math.length; i++) {
			System.out.println(math[i]);
		}
		System.out.println("--------------------");
		int[] kor = {60, 40, 20}; // 진짜 약식;
		for (int i= 0;  i< kor.length; i++) {
			System.out.println(kor[i]);
		}
		System.out.println("--------------------");
		int a = 100;
		int[] b = {10,20};
		System.out.println(a);
		System.out.println(b); // 참조형 번지값(주소값)
//		b[2] = 30; // ERROR!(배열이 처음에 지정된 범위를 벗어났기 때문)
//		System.out.println(b[2]); // 요소를 추가하는게 되지않아 활용도가 낮음
		
		System.out.println("--------------------");
		int[][] score = {{100,80},{50,30},{70,90}};// 2차원 배열 ... 거르세요
		System.out.println(score); // score 자체에 대한 주소값 출력
		System.out.println(score[0]); // score(0 번째 학생에 대한) 주소값 출력
		System.out.println(score[0][0]); // score(0 번째 학생)에 대한 0번째 점수 주소값 출력
		// 단점 : 주석을 빼고 해석이 가능한가? -> 힘들다 
		
		//java 잘하는사람 
		// 조건문 
		// 반복문 
		// 배열..? 다른 언어에서 중요  대신 나중에 배울 컬렉션!!! 이게 중요하다
		
	}
}
