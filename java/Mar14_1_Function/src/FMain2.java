

// 재귀적 호출(recursive call)
// 함수 안에서 자기 자신(함수)를 또 호출 -> 반복
// 반복문이랑 다르다.

public class FMain2 {
	// 등차수열
	// 정수를 하나 넣으면 1부터 해당 정수까지 다 더한 값
	// 1 => 1 = 1
	// 2 => 1 + 2 = 3
	// 3 => 1 + 2 + 3 = 6 
	// 4 => 1 + 2 + 3 + 4 = 10
	// 5 => 1 + 2 + 3 + 4 + 5 = 15
	// ... 
	// 유일하게 1만 그대로 1 
	// 1을 제외한 다른 수는 계속 반복함
	
	// 재귀적 호출 예제 1 
	public static int add(int x) {
		int answer = (x == 1 ) ? 1 : (x + add(x -1));
		// 1일 경우(add 1) : 1
		// 2일 경우(add 2) : 2 + add(1) = 3 
		// 3일 경우(add 3) : 3 + add(2) ->> 2 + 1 = 6
		// 4일 경우(add 4) : 4 + add(3) ->> 3 + 2 + 1 = 10 
		return answer; // return을 넣으면 에러가 다 사라진다.
	}
	
	// 재귀적 호출 예제 2 
	// 정수 하나를 넣으면 factorial 값 구하는 함수
	// 3! = 3 * 2 * 1 = 6
	// 4! = 4 * 3 * 2 * 1 = 24
	
	public static int multi(int x) {
		int ans = (x == 1) ? 1 : (x * multi(x-1));
		// 1일 경우(multi 1) : 1
		// 2일 경우(multi 2) : 2 * multi(1) = 2 
		// 3일 경우(multi 3) : 3 * multi(2) = 6
		// 4일 경우(multi 4) : 4 * multi(3) = 24
		// 5일 경우(multi 5) : 5 * multi(4) = 120
		// 6일 경우(multi 6) : 6 * multi(5) = 720
		// ... 
		return ans;
	}
	
	// 재귀적 호출 예제3 
	// 피보나치 수열
	// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
	// 1일 경우(fibo 1) -> 조건 성립 -> 1
	// 2일 경우(fibo 2) -> 조건 성립 -> 1
	// 3일 경우(fibo 3) -> 조건 안성립 -> fibo(2) + fibo(1) -> 1+1 = 2
	// 4일 경우(fibo 4) -> 조건 안성립 -> fibo(3) + fibo(2) -> 2+1 = 3
	// 5일 경우(fibo 5) -> 조건 안성립 -> fibo(4) + fibo(3) -> 3+2 = 5
	// fibo x는 숫자가 아닌 순서라고 생각하면된다.
	
	
	// 앞에 두개 숫자를 더 해서 뒤 
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
