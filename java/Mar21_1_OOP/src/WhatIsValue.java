
public class WhatIsValue {
	// �˰� ���� �ڷ����� �⺻���� ��� ������

	
	// �⺻�� - ����
	byte byteFiled;
	short shortField;
	int intFiled;
	long longFiled;
	
	// �⺻�� - �Ǽ�
	float  floatField;
	double doubleField;
	
	// �⺻�� - ��, ����
	boolean booleanField;
	char charField;
	
	// ������ - ���ڿ�, �迭
	String stringField;
	int[] arrayField;
	
	// ����ϴ� �޼ҵ�
	public void printInfo() {
		System.out.println("byte : " + byteFiled);
		System.out.println("short : " + shortField);
		System.out.println("int : " + intFiled);
		System.out.println("long : " + longFiled);
		
		System.out.println("float : " + floatField);
		System.out.println("double : " + doubleField);
		
		System.out.println("boolean : " + booleanField);
		System.out.println("char : " + charField);
		
		System.out.println("string : " + stringField);
		System.out.println("int[] : " + arrayField);
	}
}
