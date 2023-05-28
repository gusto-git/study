import java.util.Scanner;

// �� ������
// >(�ʰ�), >=(�̻�), ==(����), !=(�ٸ���), <(�̸�), <=(����)

public class OMain1 {
	public static void main(String[] args) {
		
		// ���� �������� ���̱ⱸ�� Ÿ�� �Ǵ����� �Ǵ����ִ� ���α׷�
		// Ű(�Ҽ���, cm), ���̸� �Է¹޴� ���α׷�
		// Ű�� 000cm�̰� ���̴� 00�� << �� ��µǰ�
				
		Scanner k = new Scanner(System.in);
		System.out.print("Ű : ");
		double height = k.nextDouble();
		System.out.print("���� : ");
		int age = k.nextInt();
		System.out.println("============================");
		System.out.printf("Ű�� %.1fcm�̰� ���̴� %2d��\n", height, age);
		
		// ���� Ű�� 135��ġ���͸� �ƴϸ� ���̱ⱸ Ż �� �ְ�
		boolean ride1 = (height != 135);
		System.out.printf("ride1 ž�� �� �� ����? : %b\n", ride1 );
		
		// ���� ���̰� ¦���� ����� Ż �� �ְ� 
		boolean ride2 = (age % 2 == 0);
		System.out.printf("ride2 ž�� �� �� ����? : %b\n", ride2 );
		
		// ����� ��
		// boolean ride1 = height != 135; ()���ĵ� ����� ������ ���Ⱑ ����
		// System.out.println(ride1);
		// boolean ride2 = age %2 == 0; 
		// System.out.println(ride2);
		
		// ���� 2�� �̻� �� ���
		// ~��, ~�鼭(AND)        : && 
		// ~�ų�(OR)              : ||
		// ����� ������ ��(NOT)  : ! (true�� false�� ��� ������)
		// eXclusive OR(XOR)      : ^ (�� �Է��� ���� �ٸ� ��, ��� ������ 1�� ���)
 		
		// OR      		AND			XOR
		// O , O > O    O , O > O	O , O > X
		// O , X > O	O , X > X	O , X > O
		// X , 0 > O	X , O > X	X , O > O
		// X , X > X    X , X > X	X , X > X
		
		// KKUL TIP 
		// A && B : A�� ����, B�� ���� > ���� OK!
		// ��������� Ȯ���� ���� ������ ���� ��ġ�ϴ� ���� ����
		// > ���̰� 3�� �̻��̰�, Ű�� 200 �̻� �̾�� �� ���
		// > ������ �ɶ� boolean ride3 = (height >= 200 && age >= 3); 
		// > ������ &&�� �Ѵ� ���� �ƴϸ� ������ �����̶� Ȯ���� ���� �� ���� �տ� ��ġ��
		
		// A || B : A�� �����ϰų�, B�� �����ϰų�, �Ѵ� �����ص� OK!
		// ��������� Ȯ���� ���� ������ ���� ��ġ�ϴ� ���� ����
		// > ���̰� 3�� �̻�ų� Ű�� 200 �̻� �̾�� �� ���
		// > ������ �ɶ� boolean ride3 = (age >= 3 || height >= 200)
		// > ������ || �� �� �ϳ��� ���̸� ���̶� Ȯ���� ���� �� ���� �տ� ��ġ��
		
		// ������ �̸� �����ؼ� ��� > ��ǻ�� �۾� Ƚ���� �پ��
		// -> �޸� ȿ���� ������
		// ��� : �̸� ������ ���� ���θ� ��ǻ�� ������ �پ��� ���α׷� ������ ������
		
		
		// ���� ���̰� 3�� �̻��̰� Ű�� 120 �̻��̾�� Ż �� �ִ�
		boolean ride3 = (age >= 3 && height >= 120); //�Ѵ� true �϶��� true ���
		System.out.println(ride3);
		// ���� ���̰� 3�� �̻��̰� Ű�� 2M �̻��̾�� Ż �� �ִ� cm > m(cm/100)
		boolean ride4 = ((height / 100) >= 2 && age >= 3); // &&�� Ȯ���� ���� height�� �տ� ��
		System.out.println(ride4);
		
		// ���� Ű�� 1.6m �� �Ѱų� ���̰� 70 ���ϸ� Ż �� ����
		boolean ride5 = ((height / 100) > 1.6 || age <= 70);
		System.out.println(ride5);
		// ���̰� 10�� ���� ���ų� 40�� ���� ������ Ż �� ����
		// �ǵ� 10 < age < 40 �̳�, Java������ �� ���� ���� �Ұ� 
		// age > 10 , age > 40 �� ���� ���� �ؾ���
		// age > 10 || age > 40  -> 100���̶� �ϸ� ���� true �ڴ� false -> ��� ���� true�� ������ ���� �߻�  
		// ** �߿��� ����
		boolean ride6 = (age > 10 && age < 40); // "�ų�" ������ ||�� �����ϴ� ��찡 �ִ�. ������ &&�� �´�.
		System.out.println(ride6);
		
		// ���̰� 11�� �̻��̴���, Ű�� 1.5m���� �� �� �ϳ��� �� �϶� ������  > xor
		boolean ride7 = (age >= 11 ^ (height / 100) == 1.5);
		System.out.println(ride7);
		
		// ride7�� Ż �� �ִ� ����� ��Ÿ��, ride7 ��Ÿ�� ����� Ż �� ���� > ! ����� 
		boolean ride8 = (ride7 == true != true); // ���� boolean ride8 = !ride7;
		System.out.println(ride8);
		
		
		// ���̰� 50�� ���ϰų� Ű�� 1m ������ ��츸 ���� 
		boolean ride9 = age <=50 || (height/100) <= 1; 
		System.out.println(ride9);
		
		// Ű�� 1m �ʰ��鼭 ���̰� 5�� �̸��̸� ���� 
		boolean ride10 = (height / 100) > 1 && age < 5 ;
		System.out.println(ride10);
		
		
		
		
		
		
	}
}
