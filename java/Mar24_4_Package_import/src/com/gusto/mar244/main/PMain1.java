package com.gusto.mar244.main; //��Ű������ ���´�. -> ���θ� ��Ƶδ� �� 

import com.gusto.mar244.product.Computer; // �θ��� ����  �����. Computer�� Ŭ������ 
import com.gusto.mar244.product.Scanner;

public class PMain1 {
	// product��� class ����� -> main�� �ȳ��� 
	// �̸� , ���� �Ӽ� 
	public static void main(String[] args) {
	// ���������̼� , 800000��, i5-2134, 8gb, 500gb ��ǻ�� 	
	Computer com = new Computer("���������̼�", 800000, "i5-2134", 8, 500);
	com.printInfo();
	
	System.out.println("=========================");
	// ��Ƽ�ͽ�������, 500000�� ��ĳ�� ���
	Scanner sca = new Scanner("��Ƽ�ͽ�������", 500000); 
	// ���庯���� Scanner�� ���� ���� Scanner Ŭ������ �������� ����Ʈ �Ǿ���� 
	// ���ڰ� �Ʒ� ������  ��Ű����("��Ƽ�ͽ�������", 500000)�� �Է��ؾ��Ѵ�.
	sca.printInfo();
	
	
	}
}
