import java.util.Scanner;

// ���� ������ ������ִ� ���α׷�
// �ð��� �Է¹޾Ƽ�(24�ð� ����) -> �ش� �ð��� ���ϴ� ������ ���
// -> �Է��� �ð��� ���ϴ� ������ �ƴϸ� �ٽ� �Է� 

// ���� 9�� ~ ���� 6�� : �п����� ���� x
// ���� 9��, ���� 2��, ���� 6��, : QR ���x
// ���� 12 ~ ���� 1�� : ���ɽð�x
// ���� 6�� ���� ~ ���� 8�� : �������� �ð�x
// ���� 6�� ~ ���� 9�� ������ : ��� + �ı� �п����� �ð�x
// ���� 8�� ���� ~ ���� 6�� : �����ð� + ��ħx
// ���ǻ� �� �Է� X

// �Լ��� ����

public class YMain3 {
// �ð��� �޴� �Լ� // 
	public static int timeSchedule() {
		Scanner k = new Scanner(System.in);
		System.out.print("�ð��Է�(00~24) : ");
		int time = k.nextInt();
		return (time >= 0 && time <= 24) ? time : timeSchedule();
	}
// �ð��� ����ϴ� �Լ� // 
	public static void printHour(int a) {
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.printf("%02d��!\n", a); // �� �ڸ� �� �ð��� ��Ÿ �� �� ���� 
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-");
	}
// ��� ����ϴ� �Լ� //
	public static void printResult(int time) {
		if (time >= 9 && time <= 18) {
			System.out.println("�п� ���� ");
			if (time == 9 || time == 14 || time == 18) {
				System.out.println("QR");
			} else if (time >= 12 && time <=13) {
				System.out.println("���ɽð�");
			}
		} else if (time > 18 && time <= 20) {
			System.out.println("�Ͱ� �ð�");
		} else if (time >= 6 && time < 9) {
			System.out.println("��� + ���� + �п� ����");
		} else if (time >= 6 && time < 9) {
			System.out.println("��� + ���� + �п� ����");
	    } else { // 24�ð� �� �׿� ������ �̱� ����
	    	System.out.println("���� �ð� + ��ħ");
		}
	}
	// ū�� ���� �ۼ� �����ȿ� ���ӵǴ°� if�� �ȿ� if�� ���� �ۼ�
	public static void main(String[] args) {
		int time =timeSchedule();
		System.out.println(time);
		printHour(time);
		printResult(time);
		
	}
}

//��������//

//String answer = "";
//if (time >= 0 && time <9){
//	answer = "���� �ð�";
//} else if (time >= 6 && time <9)  { 
//	answer = "��� + �ı� + �п�����";
//} else if (time >= 9 && time <=18) {
//	answer = "�п� ����";
//} else if (time >= 12 && time <= 13  ) {
//	answer = "���� �ð�";
//} else if (time > 18 && time <= 20 ) {
//	answer = "�Ͱ� �ð�";
//} else if (time > 20 && time < 24 ) {
//	answer = "���� �ð�";
//} else if (time == 9 || time == 14 || time == 18 ) {
//	answer = "qr ���";
//} else {
//	return timeSchedule();
//}
//return answer;
