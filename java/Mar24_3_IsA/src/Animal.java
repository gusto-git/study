
public class Animal {
	// �Ӽ�(sort , age)
	String sort;
	int age;
	// �⺻������ (ctrl + space + enter)
	public Animal() {
	}
	// ������ �����ε� (ctrl + shift + space)
	public Animal(String sort, int age) {
		super();
		this.sort = sort;
		this.age = age;
	}
	// ������� method
	public void printInfo() {
		System.out.println(sort);
		System.out.println(age);
	}
}
