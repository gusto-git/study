// static > �������ҿ� ����� �� �־��
// �� �̰� �ٷ�°� ��ü�� ��ޱ���̴�.

class Number{
	static int num = 0; // static �ɹ� ���� : ��ü���� ����Ӽ�
	int num2 = 0;
}




public class SMain3 {

	public static void main(String[] args) {
		Number number1 = new Number();
		Number number2 = new Number();
		
		number1.num++;
		number1.num2++;
		
		System.out.println(number2.num);  // 1 -static o -> �� ������ �����ϴ�.
		System.out.println(number2.num2); // 0 -static x
		
		System.out.println(number1.num);  // 1 -static o 
		System.out.println(number1.num2); // 1 -static o
	}
	
}
