import java.util.Scanner;

// BMI �˻� ���α׷�(�Լ�.VER)

// �̸�, Ű(cm), ������(kg)
// �Է¹��� ��
// BMI(ü���� ����) = ������ / (Ű * Ű) >> Ű : m����
//	18.5 �̸��̸� : ��ü��
// 	18.5 �̻��̸� : ����
// 	25 �̻� : ��ü��
//  30 �̻� : �浵��
//  35 �̻� : ��������
//  40 �̻� : ����

public class CMain7 {
	// ��Ʈ : ���α׷� ������ �˸��� �Լ�
	// �̸� �Է��ϴ� �Լ�, Ű �Է��ϴ� �Լ�, ������ �Է��ϴ� �Լ�
	// BMI ������ִ� �Լ�
	// ��� �������ִ� �Լ� 
	// ��� ������ִ� �Լ�
	
	//���α׷� ������ �˸��� �Լ�//
	public static void bmiCheck() {  // 1�� �Լ�
		System.out.println("BMI �˻縦 �����մϴ�");
	}
	//�̸��� �Է��ϴ� �Լ�//
	public static String userName() {  // 3�� �Լ�
		Scanner k = new Scanner(System.in);
		System.out.print("�̸� :");
		String name = k.next();
		return name;
	}
	
	//Ű�� �Է��ϴ� �Լ�//
	public static double userHeight() {  // 3�� �Լ�
		Scanner k = new Scanner(System.in);
		System.out.print("Ű :");
		double height = k.nextDouble();
		return height / 100; // cm -> m������ ���� 
	}
	
	//�����Ը� �Է��ϴ� �Լ�//
	public static double userWeight() {  // 3�� �Լ�
		Scanner k = new Scanner(System.in);
		System.out.print("������ :");
		double weight = k.nextDouble();
		return weight; // return new Scanner(System.in).nextDouble();
	}
				
	//BMI ������ִ� �Լ�// BMI(ü���� ����) = ������ / (Ű * Ű) >> Ű : m���� // 4�� �Լ�
	public static double checkBmi(double h , double w) {
		double bmi = w / (h * h);
		return bmi; // return w / (h * h);
	}
	//��� �������ִ� �Լ�// // 4�� �Լ� -> ��� : bmi
	// ram�� �� ������ -> ���������̸�ȴ�
	// hdd�� �� ���°� = > �ڵ带 ���̸�ȴ�
	public static String userBmi(double a) { 
//		if (a >= 40) {
//			System.out.println("����");
//		}else if (a >= 35) {
//			System.out.println("��������");
//		}else if (a >= 30) {
//			System.out.println("�浵��");
//		}else if (a >= 25) {
//			System.out.println("��ü��");
//		}else if (a >= 18.5) {
//			System.out.println("����");
//		}else {
//			return "��ü��";
//		}
//		
		String result = "��ü��";
		if (a >= 40) {
			result = "����";
		}else if (a >= 35) {
			result = "�ߵ��";
		}else if (a >= 30) {
			result = "�浵��";	
		}else if (a >= 25) {
			result = "��ü��"; 	
		}else if (a >= 18.5) {
			result = "����";
		}
		return result;
		
		
	}
	
	//test//
	
	
	//��� ������ִ� �Լ�// 2���Լ�
	public static void userResult(String a,double b, double c, double d, String e ) {
		System.out.printf("�̸� : %s, Ű : %.1fcm, ������ : %.1fkg BMI��ġ : %.1f%%������ %s�Դϴ�. ", a,b*100,c,d,e);
		try {
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.println(".");
			Thread.sleep(1000);
			System.out.println(".");
			System.out.println("����� �� ���ɴϴ�.");
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		bmiCheck();
		String name = userName();
		Double height = userHeight();
		Double weight = userWeight();
		Double bmi = checkBmi(height, weight);
		String uBmi = userBmi(bmi);
		userResult(name, height, weight, bmi, uBmi);
		
		
		
		
		
	}
	
}
