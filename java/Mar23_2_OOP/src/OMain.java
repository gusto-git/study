// 게임 캐릭터 하나 생성
// 속성 : 닉네임 / 레벨 / 직업 / 무기
// 출력하는 기능 
// main에서 객체 만들고 닉네임 값만 넣어서 출력
public class OMain {
	public static void main(String[] args) {
		
		// 기본생성자 안만들어서 아래 코드는 안됨
		// Charater c1 = new Charatrer();
		
		Charater c = new Charater("lee");
		c.printInfo();

	}
}
