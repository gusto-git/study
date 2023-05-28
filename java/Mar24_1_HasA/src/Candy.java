// candy has a company : 제조사를 의미(현재는 이게 맞다)
// company has a candy : 제품을 의미 
public class Candy {

	String name;
	String taste;
	Company brand; // 이거 하나만 추가하면된다.
	
	// 기본생성자(ctrl + space + enter)
	private void Candy() {
		
	}
	// 생성자 오버로딩(ctrl + shift + space)
	public Candy(String name, String taste) {
		super();
		this.name = name;
		this.taste = taste;
	}
	
	// 정보출력
	public void printInfo() {
		System.out.println("이름 : " + name );
		System.out.println("맛 : " + taste );
	}
	
}
