
// WORA(Write Once Run Anywhere) -> JVM
// JVM이 java를 실행시킬 때 -> main 함수 호출! 
public class AMain2 {
	// public / static : 좀 더 나중에
	// void : 리턴타입 -> 리턴할게 없다!
	// main : 함수명 
	// 파라미터 : String[] args ..?
	// parameter : 외부에서 값을 받아오기 위해 사용하는 것 (재료)
	// args : 문자열을 배열로 사용하겠다
	// args는 변수명이기 때문에 다른 이름으로 사용해도 되지만
	// 파라미터 안의 [String[] 변수명]이라는 구조를 바꾸면 안된다. -> main 함수 한정
	
	
	// pp: 절차지향 oop: 객체지향
	// 내가 jar파일 저장한 파일탐색기에서 cmd -> -jar aray.jar hello my name is lee
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		Thread.sleep(10000);
		
		
	}
}
