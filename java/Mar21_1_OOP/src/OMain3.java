// 실행용 class : 프로그램 실행을 위한 main() method를 제공하는 역할

public class OMain3 {
	public static void main(String[] args) {
		// 학생 객체(학생id, 학생이름, 학생주소) -> 출력
		
		Student s = new Student();
		s.idNumber = 1373051009;
		s.name = "이현석";
		s.address = "김해대로 2326 102동 1101호";
		System.out.println("s가 Student 객체를 참조");
		System.out.println(s);
		s.printinfo();
		System.out.println("====");
		
		Student s1 = new Student();
		System.out.println(s1); // 번지값
		s1.idNumber = 2;
		s1.name = "홍";
		s1.address = "강남";
		System.out.println(s1); // 안의 값은 변해도 주소값은 같음
		
		Student s2 = s1;
		s1.address = "강북";
		
	}
	
}
