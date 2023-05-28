import java.util.Scanner;

// BMI �˻� ���α׷�(�Լ�.ver)

// �̸�, Ű(cm), ������(kg) �Է�
// BMI(ü��������) = ������ / (Ű * Ű) >> Ű : m����
//		18.5 �̸� : ��ü��
//		18.5 �̻� : ����
//		25 �̻� : ��ü��
//		30 �̻� : �浵��
//		35 �̻� : ��������
//		40 �̻� : ����
public class CMain71 {
	// ���α׷� ������ �˸��� �Լ�
	public static void startBMI() {
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("BMI �˻縦 �����մϴ�~");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
	}
	// �̸� �Է��ϴ� �Լ�, 
	public static String getName() {
//		Scanner k = new Scanner(System.in);
		System.out.print("�̸� : ");
//		String name = k.next();
		return new Scanner(System.in).next();
	}
	// Ű �Է��ϴ� �Լ�, 
	public static double getHeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("Ű(cm) : ");
		double height = k.nextDouble();
		return height / 100;
	}
	// ������ �Է��ϴ� �Լ�
	public static double getWeight() {
		System.out.print("ü�� : ");
		return new Scanner(System.in).nextDouble();
	}
	// BMI ������ִ� �Լ� ������ / (Ű * Ű) >> Ű : m����
	public static double calcBMI(double h, double w) {
//		double bmi = w / (h * h);
//		return bmi;
		return w / (h * h);
	}
	// ��� �������ִ� �Լ� (��� : bmi)
	// RAM�� �� ������ -> ������ ���̸� �ȴ�!
	// HDD�� �� ������ -> �ڵ带 ���̸� �ȴ�!
	public static String judgeBMI(double bmi) {
//		if (bmi >= 40) {
//			return "����";
//		} else if (bmi >= 35) {
//			return "�ߵ��";
//		} else if (bmi >= 30) {
//			return "�浵��";
//		} else if (bmi >= 25) {
//			return "��ü��";
//		} else if (bmi >= 18.5) {
//			return "����";
//		} else {
//			return "��ü��";
//		}
		String result = "��ü��"; // else �ڸ��� ���� ���� �������� �� ����
		if (bmi >= 40) {
			result = "����";
		}else if (bmi >= 35) {
			result = "�ߵ��";
		} else if (bmi >= 30) {
			result = "�浵��";
		} else if (bmi >= 25) {
			result = "��ü��";
		} else if (bmi >= 18.5) {
			result = "����";
		}
		return result;
	}
	// ��� ������ִ� �Լ�
	public static void printResult(String n, double h, double w, double b, String r) {
		System.out.printf("%s]���� Ű�� %.1fcm, �����Դ� %.1fkg�̰�..\n", n, h*100, w);
		System.out.printf("ü���������� %.1f%% �Դϴ�\n", b);
		try {
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.println(".");
			System.out.println("����� �� ���ɴϴ�.");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("[%s]���� %s �Դϴ�!\n", n, r);
		switch (r) {
		case "��ü��":
			System.out.println("��ð���� �� �� �弼��");
			break;
		case "����":
			System.out.println("�� �����ϰ� ��ó׿�");
			break;
		case "��ü��":
			System.out.println("��� ���� �غ����?");
			break;
		case "�浵��":
			System.out.println("�Ϸ翡 �γ��� �弼��");
			break;
		case "�ߵ��":
			System.out.println("�Ϸ翡 �ѳ��� �弼��");
			break;
		case "����":
			System.out.println("�� �ʵ� �� �� �־�");
			break;
		}
		
	}
	public static void main(String[] args) {
		startBMI();
		String name = getName();
		double height = getHeight();
		double weight = getWeight();
//		System.out.println(name + ", " + height + ", " + weight);
		double bmi = calcBMI(height, weight);
//		System.out.println(bmi);
		String result = judgeBMI(bmi);
//		System.out.println(result);
		printResult(name, height, weight, bmi, result);
	}
}










