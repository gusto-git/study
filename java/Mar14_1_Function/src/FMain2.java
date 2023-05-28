

// ����� ȣ��(recursive call)
// �Լ� �ȿ��� �ڱ� �ڽ�(�Լ�)�� �� ȣ�� -> �ݺ�
// �ݺ����̶� �ٸ���.

public class FMain2 {
	// ��������
	// ������ �ϳ� ������ 1���� �ش� �������� �� ���� ��
	// 1 => 1 = 1
	// 2 => 1 + 2 = 3
	// 3 => 1 + 2 + 3 = 6 
	// 4 => 1 + 2 + 3 + 4 = 10
	// 5 => 1 + 2 + 3 + 4 + 5 = 15
	// ... 
	// �����ϰ� 1�� �״�� 1 
	// 1�� ������ �ٸ� ���� ��� �ݺ���
	
	// ����� ȣ�� ���� 1 
	public static int add(int x) {
		int answer = (x == 1 ) ? 1 : (x + add(x -1));
		// 1�� ���(add 1) : 1
		// 2�� ���(add 2) : 2 + add(1) = 3 
		// 3�� ���(add 3) : 3 + add(2) ->> 2 + 1 = 6
		// 4�� ���(add 4) : 4 + add(3) ->> 3 + 2 + 1 = 10 
		return answer; // return�� ������ ������ �� �������.
	}
	
	// ����� ȣ�� ���� 2 
	// ���� �ϳ��� ������ factorial �� ���ϴ� �Լ�
	// 3! = 3 * 2 * 1 = 6
	// 4! = 4 * 3 * 2 * 1 = 24
	
	public static int multi(int x) {
		int ans = (x == 1) ? 1 : (x * multi(x-1));
		// 1�� ���(multi 1) : 1
		// 2�� ���(multi 2) : 2 * multi(1) = 2 
		// 3�� ���(multi 3) : 3 * multi(2) = 6
		// 4�� ���(multi 4) : 4 * multi(3) = 24
		// 5�� ���(multi 5) : 5 * multi(4) = 120
		// 6�� ���(multi 6) : 6 * multi(5) = 720
		// ... 
		return ans;
	}
	
	// ����� ȣ�� ����3 
	// �Ǻ���ġ ����
	// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
	// 1�� ���(fibo 1) -> ���� ���� -> 1
	// 2�� ���(fibo 2) -> ���� ���� -> 1
	// 3�� ���(fibo 3) -> ���� �ȼ��� -> fibo(2) + fibo(1) -> 1+1 = 2
	// 4�� ���(fibo 4) -> ���� �ȼ��� -> fibo(3) + fibo(2) -> 2+1 = 3
	// 5�� ���(fibo 5) -> ���� �ȼ��� -> fibo(4) + fibo(3) -> 3+2 = 5
	// fibo x�� ���ڰ� �ƴ� ������� �����ϸ�ȴ�.
	
	
	// �տ� �ΰ� ���ڸ� �� �ؼ� �� 
	public static int fibo(int x) {
		return (x < 3) ? 1 : (fibo(x - 1) + fibo(x - 2));
//		return (x <= 1) ? 1 : (fibo(x - 1) + fibo(x - 2));
		
	}
	
	
	public static void main(String[] args) {
		int i = add(4);
		System.out.println(i);
		
		int ii = multi(6);
		System.out.println(ii);
		
		int iii = fibo(7);
		System.out.println(iii);
	}
}
