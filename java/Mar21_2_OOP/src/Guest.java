import java.util.Scanner;

// �ɹ� ����
// �̸� , ����, ��ĳ��, Ű, ������, bmi , ��� 
// �մ��� �θ��� method = �̸�, ���� ���
// Ű�� ���� ����ϴ� method 
// �����Կ� ���� ����ϴ� method
public class Guest {
	
	String name;
	int age;
	Scanner mouth = new Scanner(System.in);
	double height;
	double weight;
	double bmi;
	String bmiResult;
	// �մ��� �θ��� method = �̸�, ���� ���
	public void printGuest() {
		System.out.println(" < �մ� >");
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println("----===----");
	}
	// Ű�� ���� ����ϴ� method 
	public double answerHeight() {
		return mouth.nextDouble();
	}
	
	// �����Կ� ���� ����ϴ� method
	public double answerWeight() {
		return mouth.nextDouble();
	}
}
