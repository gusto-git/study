import java.util.Scanner;

public class CMain5 {
	// ���� :
	// DBA(���� �����ͺ��̽� ������) / dba
		// DB ��������
		// ��� / ����
		// ���� CRUD
		// ���� Ȱ��
	// DBP(�����ͺ��̽� ���α׷���) / dbp
		// ��ɾ��  CRUD
		// ���� Ȱ��
	// DBU(�����) /dbu 
		// ���� Ȱ�� 
	// �� �� ���� ���о��� �˻��� �����ϵ��� ���� ��
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		System.out.print("���� : ");
		String job = k.next();
		
		switch (job) {
		case "DBA": // case "DBA": case "dba":�� ������ 
		case "dba":
			System.out.println("DB ��������");
			System.out.println("���/����");
			
		case "DBP":
		case "dbp":
			System.out.println("��ɾ�� CRUD");
			
		case "DBU":
		case "dbu":
			System.out.println("���� Ȱ��");
			break;		

		default:
			System.out.println("DB ���غ���");
			break;
			// break�� ����� ������ case�� �ι� ���� �ȴ�. -> ��ҹ��� �����ϱ� 
		}
	}
}
