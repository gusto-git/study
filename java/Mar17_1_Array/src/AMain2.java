
// WORA(Write Once Run Anywhere) -> JVM
// JVM�� java�� �����ų �� -> main �Լ� ȣ��! 
public class AMain2 {
	// public / static : �� �� ���߿�
	// void : ����Ÿ�� -> �����Ұ� ����!
	// main : �Լ��� 
	// �Ķ���� : String[] args ..?
	// parameter : �ܺο��� ���� �޾ƿ��� ���� ����ϴ� �� (���)
	// args : ���ڿ��� �迭�� ����ϰڴ�
	// args�� �������̱� ������ �ٸ� �̸����� ����ص� ������
	// �Ķ���� ���� [String[] ������]�̶�� ������ �ٲٸ� �ȵȴ�. -> main �Լ� ����
	
	
	// pp: �������� oop: ��ü����
	// ���� jar���� ������ ����Ž���⿡�� cmd -> -jar aray.jar hello my name is lee
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		Thread.sleep(10000);
		
		
	}
}
