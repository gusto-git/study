// 라이브러리용 class(API : Application Program Interface)
// 다른 class에서 이용할 목적
// 프로그램에서 실행되는 class가 여러개, 단 하나를 빼고 전부 라이브러리용
// 제외됐던 단 하나의 class : 실행용(main)
public class Student {
	//멤버 변수(member variable) / 필드
	// 객체의 데이터가 저장되는곳
	// 변수랑 비슷하게 생겼다. -> 변수랑 다르다.
	
	// 변수 : 생성자, 메소드 안에서만 사용이 됨
	// 생성자, 메소드 실행이 종료되면 함께 자동으로 종료
	
	// 필드 : 생성자, 메소드 전체에서 사용 가능
	// 객체 자체가 소멸되지 않는 한 객체와 함께 공존
	
	// 초기값이 지정되지 않은 멤버변수는
	// 객체 생성시 자동으로 기본 초기값을 설정(예: 0, null, false 등)
	int idNumber;
	String name;
	String address;
	
	
	// method(메소드) : 객체의 동작에 해당하는 실행 블록
	// 블록 : {코드} >> 중괄호 안쪽을 블록이라 생각하면 된다.
	// 메소드를 호출시, 블록(영역 안)의 모든 코드를 일괄적으로 실행시킴.
	// 객체간의 데이터 전달 수단
	public void printinfo() {
		
		System.out.println("student name : " + name);
		
	}
}
