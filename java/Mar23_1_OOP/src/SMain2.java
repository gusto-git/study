import java.util.Calendar;

public class SMain2 {
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		c.sum(10, 20); // static o > ������ �����ϳ� ��������  x
		c.sum(10, 20, 30);  // static x
		
		//
		Calculator.sum(10, 20); // static o > �޸� ������ �ذ� -> ���� c.sum�̶�� �� �ʿ䰡���ٴ� �ǹ� 
//		Calculator.sum(10, 20, 30);// static x
		
		// math ��� java ���� Ŭ����
		// ��ü�� ������ �ʰ� ����� ���
		// static ������ �̹� ����Ǿ��ִ� ���� Ŭ������ static�� �����ʰ� �ٷ� �����ִ�.
		System.out.println(Math.PI);
		double s = Math.sqrt(10); // ������ ���ϴ� �� 
		System.out.println(s);
		
		// ���� ���� �ٽú����ҵ� sum ���ڸ��� ���ڸ� ���� �����̾ȵ�
	}
}
