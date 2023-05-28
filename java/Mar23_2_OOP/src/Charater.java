// client가 게임 캐릭터 생성 기능을 만들어 달라고 요구 -> 만드는데 성공
// 건네주는 방법 
// 결론 : .java파일 말고 .jar파일로 줘라
// 	.java : 소스공개
//  .jar : 소스를 공개하지 않고 + 그 기능만 전달 
// JAR(Java Archive, 자바 아카이브) 파일 
//	기계어(.class) 상태로 바꿔서 압축 해놓은 상태

// 한국어로 생각한걸 - 번역(개발) -> .java로 저장 
// (저장할때).java파일 - 번역(Compile) -> .class파일 (기계어/ 바이트 코드)
// 자동으로 생성해줌 
// (실질적으로 실행할때) .class파일 -> 실행 -> 

// 우리가 만든 코드는 .java파일로 저장되고 이때 Compile이라는 작업을 통해서 .class파일 , 즉 기계어(바이트코드)로 변환되어 자동으로 생성
// 실행이 될 때는 .class 파일로 JVM위에서 가동되는 형태 

// .Java : 사람이 보려고 만든것
// .Class : 실제로 자바에서 구동되는 것 

// 왜 굳이? 기계어로 변환해서 구동을 시킬까
// - 바이트 코드를 사용하면 실행이 빠름!
// - 코드를 노출하게 되면 이게 무슨 프로그램인지 알 수 있게 됨 -> 보안 상의 이유
// -> 다른 사람에게 기능을 넘겨줄땐 코드 자체를 알려주지말고, 그 기능만 사용하게 하자 
// -> .Java파일 말고 .Jar파일

// JavaDoc
// JavaDoc의 역할 : 제품 설명서 ! 
// 우리가 만든 프로그램을 보기 쉽게 ~ 해석이 쉽게 HTML 형식으로 
// 우리가 알고있는 WEB 형식으로 만들어서 보기 편하게 문서화 시킨것

// JavaDoc의 특징
// - 주석은 /** 내용 */로 마무리
// - 주석의 안쪽은 크게 2가지
// - 1. 설명문
//     ㄴ 설명문은 HTML로 설명이 되기 때문에 단순하게 주석 다는 그 순간에 엔터를 쳐서 줄을 바꿨다고 하더라도 엔터효과 없이 그대로 쭉 출력
//		ㄴ 줄 바꿈 처리를 하고 싶다면 <P>작성하면 된다. 
// - 2. 태그 섹션
//		ㄴ 첫 문자가 '@'로 시작
//		ㄴ @author(자동) : 이 프로그램의 작성자 , 기본 값 : windows 계정 ID가 나옴 
//		ㄴ @version : 말 그대로 이 프로그램의 버전을 의미함 1.2.6-? 1.2.8 , 2.2.1 등등 바뀐다.
//		ㄴ @param : 파라미터에 대한 설명을 할때 사용
//		ㄴ @throws : 예외처리에 대한 설명 
//		ㄴ @return : method가 void가 아닌 값일 때 리턴타입에 대한 설명 

/**
 * 
 * @author gusto
 * @version 1.1.14
 * <p>
 * 게임 캐릭터의 정보를 가지고 있는 클래스
 * 
 */

public class Charater {
	
	String nickName;
	int level;
	String job;
	String	weapon;
	
	public Charater() {
		
	} 
	

	/**
	 * 게임 캐릭터 생성하는 부분입니다.
	 * <p> 기본무기는 나무막대기, 기본 직업은 초보자로 시작합니다.
	 * @param nickName 캐릭터의 이름 길이는 3자 이상 10자 이하 
	 * @throws IllegalArgumentException 닉네임 길이가 정해진 범위를 벗어나면 발생합니다.
	 */
	public Charater(String nickName) {
		this.level = 1;
		this.job = "초보자";
		this.weapon = "나무막대기";
		if (nickName.length() < 3 || nickName.length() > 10 ) {
			throw new IllegalArgumentException("닉네임은 3자 이상 10자 이하입니다");
		}
		this.nickName = nickName;
			}
	
	/**
	 * 캐릭터 레벨을 올려주는 메소드 입니다.
	 */
	
	public void levelUp() {
		this.level++;
	}
	
	/**
	 * 캐릭터의 직업을 변경하는 메소드입니다.
	 * @param job 변경할 직업
	 * @throws IllegalArgumentException 캐릭터 레벨이 5를 넘지 않으면 발생합니다. 
	 */
	
	
	public void setJob(String job) {
		if (this.level < 5) {
			throw new IllegalArgumentException("캐릭터 레벨이 5를 넘어야 합니다.");
		}
		this.job = job; //this job 맴버변수 , job 가장 가까운 파라미터
		
	}
	
	
	
	
	
	/**
	 * 만들어진 캐릭터의 상태를 보여주는 메소드입니다.
	 */

	public void printInfo() {
		System.out.println("닉네임 : " + nickName);
		System.out.println("레벨 : " + this.level);
		System.out.println("직업 : " + job);
		System.out.println("무기 : " + weapon);
	}

	
}
