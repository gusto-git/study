import java.util.Scanner;

//���ǹ�

public class CMain1 {
	// ������� ������ �Է��ؼ� �޾ƿ���(����) �Լ�
	// 100�� ���� �������� -�� ����! 
	// 0~100 ������ ������ �ƴ� ��� �ٽ� �ش� �Լ� ���ƿ���
	
	public static int getScore() {
		Scanner k = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int score = k.nextInt();
		return score >= 0 && score <= 100 ? score : getScore();
	}
	// ���ǹ�(Conditional Statement)
	//	�ۼ��� �ڵ带 ���ǿ� ���� �ڵ��� ���� �帧��
	// �ٸ��� �����ϵ��� �����ϴ� ����
	
	// if�� : ���ǽ��� ����� true, false�� ���๮�� ���ۿ��θ� ����
	
//	if(����A){
//		����A�� ����������(���� ��, true�� ��)�� �κ� ����
//	} else if(����B){
//	����B�� ����������(���� ��, true�� ��)�� �κ� ����
//  } else if(����C){
//	����C�� ����������(���� ��, true�� ��)�� �κ� ����
//  } else{
//		�´� ������ �ϳ��� ������ �� �κ� ����	
//  }
	
	// �Է��� ���� ������ 60�� �̸��̸� : ��
	// 60�� �̻� : �� / 70�� �̻� : �� / 80�� �̻� : �� / 90�� �̻� : �� 
	
	public static void main(String[] args) {
		int kor = getScore();
//		System.out.println(kor);
//		if (kor >= 60) {
//			System.out.println("��");
//		} else if (kor >= 70) {
//			System.out.println("��");
//		} else if (kor >= 80) {
//			System.out.println("��");
//		} else if (kor >= 90) {
//			System.out.println("��");
//		} else {
//			System.out.println("��");
//		}
		
		// ������ �̹� true�� ���Ա⶧���� ������ �������� �ʴ´�. ���� ��̿���� �ƴ� ����̾簡���� �ؾ��� 
		
		if (kor >= 90) {
			System.out.println("��");
		} else if (kor >= 80) {
			System.out.println("��");
		} else if (kor >= 70) {
			System.out.println("��");
		} else if (kor >= 60) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
		System.out.println("------------------------");
		// if�� �ȿ� if�� ��� ����
		// ���� ������ 50���� �ȵǸ� "��", ������ "Ī��" 
		// ������ 50�� �̻�, 60�� �̸��̸� "�ƽ��� �Ҹ�"
		// ������ 30�� �̸� "�� ����!"
		
		if (kor < 50) {
			System.out.println("��");
			if (kor < 30) {
				System.out.println("�� ����");
			}
		} else {// kor >= 60�� ���ԵǾ��ִ�.
			System.out.println("Ī��");
			if (kor < 60) {
				System.out.println("�ƽ���");
			}
		}
		
		
		// if - if �� if - else �� ����
		// if - if �� : ���� �ٸ� �������� �ؼ� -> ��ȿ����
		// if - else �� : �ϳ��� ������ �����Ǹ� ������ �κ� ���� x -> ȿ��
		
//		if (kor < 50) {
//			System.out.println("��");
//		} else {
//			System.out.println("Ī��");
//		} 
		
		
		
	}
}
