// ��ü���� ����
// A is a B : Dog is an Animal
public class IMain {
	public static void main(String[] args) {
		// ����(Animal) ��ü  -> sort, age;
		Cat c = new Cat();
		c.printInfo(); // Animal Ŭ���� ��� �޾Ƽ� ����! 
		System.out.println("=======================");
		Dog d = new Dog("��", 2, "������");
		d.printInfo();
	}
}
