import java.util.Scanner;

public class test {
	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);
		String job = "";
	
		a: while (true) {
			System.out.print("���� : ");
			job = k.next();
			switch (job) { 
			case "�Ŵ���":
				System.out.println("�ý��۰���");
			case "����":
				System.out.println("�л�����");
			case "�л�":
				System.out.println("��������");
				break;
			case "��":
				break a;
			}
		}
	}
}