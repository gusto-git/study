// 객체간의 관계
// A is a B : Dog is an Animal
public class IMain {
	public static void main(String[] args) {
		// 동물(Animal) 객체  -> sort, age;
		Cat c = new Cat();
		c.printInfo(); // Animal 클래스 상속 받아서 가능! 
		System.out.println("=======================");
		Dog d = new Dog("콩", 2, "누나집");
		d.printInfo();
	}
}
