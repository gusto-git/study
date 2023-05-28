import java.util.Scanner;

// �񸸵� �˻� ���α׷� (�Լ�.ver)
// Ű, �����Դ� �Է� ���� ��
// ǥ��ü�� = (Ű - 100) * 0.9
// �񸸵� = (������ / ǥ��ü��) * 100
// �񸸵��� 120�� ������ '��' �׷��� ������ '�Ⱥ�'

// ctrl + shift + /(Numpad) : �Լ� �ݱ�(��ü�� ����)
// ctrl + shift + *(Numpad) : �Լ� ����(��ü�� ����)

// �Լ��� ���� ���� ���� ���� : ��ɺ��� �з��ؼ� ǥ�� -> ���� ������ ������
// ����, ǥ�� ü���� ���ϴ� ������ 0.9 -> 0.8�� �ٲ���ٰ� ����
// �پ��� ����� �Լ� �ϳ��� ���� �ھ� ���� ������� ���� ��û�� ������
// �ѹ��� ã�Ƽ� ������ ���� ��.

// �޸𸮸� �Ƴ� ���ΰ�? vs �������� ���� �� ���ΰ�?


public class FMain4 {
	// �Լ� ���� �� ���(�Ķ����)�� �ʿ�����(parameter)
	// ���� ���� �Լ����� ���� ���� �ٸ����� �ʿ�����?(return)
	
	
	// 1�� �Լ�) �񸸵� �˻� ���� ������ ����ϴ� �Լ�
	public static void startBimando() {
		System.out.println("****�񸸵��˻����!****");
	}
	
	// 3�� �Լ�) Ű�� �Է� �޴� �Լ�	-> �ٸ����� ���
	public static double getHeight() {
		Scanner k = new Scanner(System.in);
		System.out.println("Ű : ");
		double height = k.nextDouble();
		return height;
	}
	// 3�� �Լ�) �����Ը� �Է� �޴� �Լ�	-> �ٸ����� ���
	public static double getWeight() {
		Scanner k = new Scanner(System.in);
		System.out.println("������ :");
//		double weight = k.nextDouble();
//		return weight;
		return new Scanner(System.in).nextDouble();
	}
	// 4�� �Լ�) Ű�� ������ ǥ��ü���� ���ϴ� �Լ�
	public static double calStdWeright(double height) {
		double stdWeight = (height - 100) * 0.9;
		return stdWeight;
	    
	}
	// 4�� �Լ�) ���� ü��, ǥ��ü���� ������ �񸸵� ����ؼ� ���� ���ִ� �Լ�
		public static double calcBimando(double weight, double stdWeight) {
			double bimando = (weight / stdWeight) * 100;
			return bimando;
		}
	// 4�� �Լ�) ������ ���� �ƴ��� �������ִ� �Լ�
		public static String judgeBimando(double bimando) {
			String result = (bimando > 120) ? "��" : "�Ⱥ�";
			return result;
			
		}
	// 2�� �Լ�) ����� ������ִ� �Լ�
		public static void printResult(double h, double w, double s, double b, String r) {
			System.out.println("--------------------");
			System.out.printf("Ű : %.1fcm\n", h);
			System.out.printf("������ : %.1fkg\n", w);
			System.out.printf("ǥ��ü�� : %.1fkg\n", s);
			System.out.printf("�񸸵� : %.1f%%\n", b);
			System.out.printf("����� [%s]�Դϴ�.\n", r);
			System.out.println("--------------------");
		}
		
	public static void main(String[] args) {
		startBimando();
		double height = getHeight();
		double weight = getWeight();
		double stdWeight = calStdWeright(height);
		double bimando = calcBimando(weight, stdWeight);
		String result = judgeBimando(bimando);
		
		printResult(height, weight, stdWeight, bimando, result);
		// �̰� �ٽ� �����ؾ���;; ���ٷ� ��ġ�� ������ �ؾ��� ..
	}
}
