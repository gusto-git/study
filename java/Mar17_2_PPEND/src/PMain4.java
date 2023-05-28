
public class PMain4 {
	public static void main(String[] args) {
		String[] ss = {"ㅋㅋ", "ㅎㅎ", "ㅇㅇ", "ㅠㅠ"};
		//개별 출력
		System.out.println(ss[0]);
		System.out.println(ss[1]);
		System.out.println(ss[2]);
		System.out.println(ss[3]);
		System.out.println("--------------------");
		
		//한번에 출력하는 방법
		String s = null;
		// 아래 신형 for문의 원래버전 
		for (int i = 0; i < ss.length; i++) {
			s = ss[i]; // 반복문이 돌면서 ss[0], ss[1] ... 계속돌면서
			System.out.println(s);
		}
		
	//	for - each (신형 for문)
	//	배열의 요소를 변경할 때는 사용 x
	//  배열 원본 자체를 쓰는 것이 아니라 복사해다 쓰는 개념
	//	원본에는 영향 x 
	//  복사해서 쓰는것
	//  단점 : 순서 조절이 안됨 
	//  인덱스(i)가 없어서 원하는 값만 추출하는 것이 불가능 
	//  활용도가 떨어지는 편 
	
		// for (자료형 변수명 : 배열){
		//내용
		//}
		System.out.println("------------------");
		for (String s1 : ss) { // 배열  ss의 요소를 s1이라는 그릇에 임시로 담음
			System.out.println(s1);//출력(배열 요소를 순서대로 끝까지 출력해줌)
		}
	}
}
