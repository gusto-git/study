import java.util.Scanner;

import org.omg.CosNaming._NamingContextExtStub;

// �� ������
// ����� true, false >> boolean
//  >(�ʰ�), >=(�̻�) , ==(����), !=(�ٸ���), <(�̸�), <=(����)

public class OMain3 {
	public static void main(String[] args) {
		// ���� �������� ���̱ⱸ�� Ÿ�� �Ǵ����� �Ǵ����ִ� ���α׷�
		// Ű(�Ҽ���, cm), ���̸� �Է¹޴� ���α׷�
		// Ű�� 000cm�̰� ���̴� 00�� << �� ��µǰ�
		
		Scanner k = new Scanner(System.in);
		System.out.print("Ű : ");
		double cm = k.nextDouble();
		//double height = k.nextDouble(); > ����� ��
		System.out.print("���� : ");
		int age = k.nextInt();
		System.out.println("============================");
		System.out.printf("Ű�� %.1fcm�̰� ���̴� %2d��\n", cm, age);
		
		// ����) ���̰� 10���� �Ѵ� ����� Ż �� �ִ� ���̱ⱸ
		boolean ride1 = (age > 10);
		System.out.printf("ride1 ž�°���? : %b\n", ride1);
		
		// ����) ���̰� 5�� �̸��� Ż �� �ִ� ���̱ⱸ
		boolean ride2 = (age < 5);
		System.out.printf("ride2 ž�°���? : %b\n", ride2);
		// boolean ride2 = (age < 5); > ����� ��
		
		// ����) ���̰� 10�츸 �ƴϸ� Ż �� �ִ� ���̱ⱸ
		boolean ride3 = (age != 10);
		System.out.printf("ride3 ž�°���? : %b\n", ride3);
		// boolean ride3 = (age != 5); > ����� ��
		
		// ����) ���̰� Ȧ ���� ����� Ż �� �ִ� %Ȱ��
		boolean ride4 = (age % 2 != 0); // 2�� ���� �������� 0�� �� 
		System.out.printf("ride4 ž�°���? : %b\n", ride4);
		// boolean ride4 = (age % 2  == 1); > ����� �� 2�� ���� �������� 1�� �� 
		
		
	}
}
