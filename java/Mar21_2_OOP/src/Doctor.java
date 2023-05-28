// ��������(Local Variable)
// 		method �ӿ��� ���� ����
// 		�� �޼ҵ尡 ����Ǵ� ���ȸ� �ʿ��� �ӽú���
// method parameter(�޼ҵ� �Ķ����)
// 		�޼ҵ尡 ����Ǵµ� �ʿ��� ���
// return��
// 		�޼ҵ尡 ������ ���� �����
// �������(Member Variable)
//		��ü�� �Ӽ�

public class Doctor {
	// �ɹ� ���� 
	// �ǻ� �̸� , ���� 
	String name;
	int age;
	
	public void printDoctor() {
		System.out.println(" < �ǻ� >");
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println("----===----");
	}
	// �մ� �θ��� �޼ҵ�-> ��ü ��ü�� ������
	public void callGuest(Guest g) { // ��ü�� ���� ������ ���� 
		System.out.printf("%s��, ��������\n", g.name);// �� �ȿ� �Ӽ��� ����´�.
	}
	
	// Ű�� ����� �޼ҵ� -> ��ᰡ �ʿ���(��������) // ��� : �մ� Ű 
	public double askHeight(Guest g) {
		
		System.out.print("Ű(cm) : ");
		double h = g.answerHeight();
		if (h >= 1 && h <= 300) {
			System.out.println("=============");
			System.out.printf("�� ~ Ű�� %.1fcm�̱���\n", h);
			System.out.println("=============");
		}else {
			System.out.println("=============");
			System.out.printf("�ٽ� �����ּ���");
			System.out.println("=============");
		}
		return (h >= 1 && h <= 300) ? h / 100 : askHeight(g);
	}
	// ������ ���� �޼ҵ� - > ��ᰡ �ʿ���(��������) // ��� : �մ� ������
	public double askWeight(Guest g) {
		
		System.out.print("������(kg) :");
		double w = g.answerWeight();
		if (w >= 1 ) {
			System.out.println("=============");
			System.out.printf("�� ~ �����԰� %.1fkg�̱���\n", w);
			System.out.println("=============");
		}else if (w < 1) {
			System.out.println("=============");
			System.out.printf("�ٽ� �����ּ���");
			System.out.println("=============");
		}
		return (w >= 1 ) ? w : askWeight(g);
	}
	// bmi ��� -> ��ᰡ �ʿ���(�մ��� Ű , ������) // ��� : bmi ��
	// ������ / (Űm * Űm)
	public double calcBMI(Guest g) {
		return g.weight / (g.height * g.height);
	} // �̴�� ����ϸ� �ȳ��´�. 
	
	// �����ؼ� ������� �޼ҵ� // 
	// 18.5 �̸� : ��ü�� / 18.5 �̻� ���� / 25 �̻� ��ü��
	// 30 �̻� �浵�� / 35�̻� �ߵ �� / 40�̻� ������
	public String checkBMI(Guest g) {
		if (g.bmi >= 40) {
			return "������";
		}else if (g.bmi >= 35) {
			return "�ߵ ��";
		}else if (g.bmi >= 30) {
			return "�浵 ��";
		}else if (g.bmi >= 25) {
			return "��ü��";
		}else if (g.bmi >= 18.5) {
			return "����";
		}else {
			return "��ü��";
		}
	
	}
	
	
	// ��� �˷��ִ� �޼ҵ� //
	
		// Ű�� 00cm�̰� �����Դ� 00kg�̰�
		// ü���� ������ 00%,
		// ����� �����Դϴ�.
	public void printResult(Guest g) {
		System.out.printf("Ű�� %.1fcm, �����Դ� %.1fkg ", g.height * 100, g.weight);
		System.out.printf("ü���� ����(BMI)�� %.1f%%",calcBMI(g));
		System.out.printf("������ %s���� %s�Դϴ�.", g.name, checkBMI(g));
	}
	
	
	
	// ������ �����ϴ� �κ�  // 
	
	public void start(Guest g) {
		callGuest(g);
		g.height = askHeight(g); // �Է��� ���� g.height�� �־����
		g.weight = askWeight(g); // �Է��� ���� g.weight�� �־����
		g.bmi = calcBMI(g);
		g.bmiResult = checkBMI(g);
		printResult(g);
	}


	
	// guest -> doctor -> OMain

	
	
	
	
}