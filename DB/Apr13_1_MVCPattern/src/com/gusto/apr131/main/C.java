package com.gusto.apr131.main;
// Controller - ���� ������ ������
// 	��Ȳ�Ǵ� -> M or V�� ��ȯ
//	�������� -> 
public class C { // 3 : 
	public static void main(String[] args) { // ������ c�� ��� 
		// v���� �޾ƿ� ���ϰ� ������ ����ֱ� -> M���� �� �̵��� ����
		int x = V.getX();
		int y = V.getY();
		
		int add = M.add(x, y);
		
		V.printResult(add);
		
		
	}
}
