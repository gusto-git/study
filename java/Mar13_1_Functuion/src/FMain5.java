import java.util.Random;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

// Ȧ¦(�Լ�.ver)

public class FMain5 {
	// 1. ������ ���� ���� �������� �Լ� -> 3�� �Լ�
	public static int shakeCoin() {
		Random r = new Random();
		int coin = r.nextInt(10)+1;
		return coin; 
		// return new Random().nextInt(10)+1
	}
	
	// 2. ������ ���� �� �Է��ϴ� �Լ� (Ȧ? ¦? -> �� �Է�) -> 3�� �Լ�  3������ ����پ�
	public static String askserAns() {
		Scanner k = new Scanner(System.in);
		System.out.print("Ȧ? , ¦? : ");
		String userAns = k.next();
		return userAns;
		// return new Scanner(System.in).next();
	}	
	
	// 3.���� ������ Ȧ���� 'Ȧ', ¦���� '¦'��� ���� �Լ� -> 4�� �Լ� 
	public static String getAnser(int coin) {
		String anser = (coin % 2 == 0) ? "¦" : "Ȧ";
		System.out.println(anser);
		return anser;
		// return (coin % 2 == 0) ? "¦" : "Ȧ";
		
	}
	
	// 4. ����� �Ͱ� �� �Է��� ���� ��ġ�ϸ� '����', Ʋ���� '��'�˷��ִ� �Լ� -> 4�� �Լ�
	public static String getResult(String ua , String a) {
		String result = (ua.equals(a)) ? "����" : "��";
		return result;
	}
	
	// ����ϴ� �Լ�(������ 0������, ���� �Է��� ���� 00��, ����� 0�� �� or ����) -> 2�� �Լ�
	public static void printResult(int coin, String ua, String r, String a) {
		System.out.printf("������ %d��\n", coin);
		System.out.printf("���� �Է��� �� : %s!\n", ua);
		System.out.printf("����� %s�� %s!", a, r);
	}
	

	
	public static void main(String[] args) {
		int coin = shakeCoin();
		String userAns = askserAns();
		String anser = getAnser(coin);
		String result = getResult(userAns, anser);
		System.out.println(result);
		printResult(coin, userAns, anser, result);
		
	}
}
