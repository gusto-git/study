
public class OMain2 {
	public static void main(String[] args) {
		int floor = 6;
		String weather = "sunny"; // sunny라는 데이터가 저장되는게 아니라 weather라는 번지수가 stack에 저장되는것
		// Java 한정
		String coffee = "500";
		System.out.println(weather + floor); // 합치는 순간 문자열이 됨
		System.out.println(floor + coffee); // 6500이 아니고 "6"과 "500"이 합쳐짐 string + string임
		// int + String = String
		
		String resulet = floor + coffee; // string = int(기본형) + string(참조형) 가능
//		int r2 = floor(정수) + coffee(문자열);  int = int + string 불가능
		
		
		
		
	}
}
