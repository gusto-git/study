
public class Animal {
	// 속성(sort , age)
	String sort;
	int age;
	// 기본생성자 (ctrl + space + enter)
	public Animal() {
	}
	// 생성자 오버로딩 (ctrl + shift + space)
	public Animal(String sort, int age) {
		super();
		this.sort = sort;
		this.age = age;
	}
	// 정보출력 method
	public void printInfo() {
		System.out.println(sort);
		System.out.println(age);
	}
}
