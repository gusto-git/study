// Coder : 개발자 
// Programmer : Coder + 설계 -> 우리의 목표

// OOD(Object Oriented Design) : 객체 지향 디자인
//	실생활을 디자인


public class OMain {
	// OOP로 BMI프로그램 만들기
	// 객체로 등장하는 등장인물 : Doctor / Guest
	public static void main(String[] args) {
		
		// 손님 객체 불러서 이름, 나이 -> printGusest()함수 호출
		
		Guest g = new Guest();
		g.name = "이현석";
		g.age = 72;
		g.printGuest();

		Doctor d = new Doctor();
		d.start(g);
		
		
	}
}
