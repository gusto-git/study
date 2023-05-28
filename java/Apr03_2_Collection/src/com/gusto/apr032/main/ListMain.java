package com.gusto.apr032.main;

import java.util.ArrayList;
import java.util.Comparator;

// ArrayList
//		��Ҹ� �ε����� ���, �迭�� ���� 
//		�迭 : ����� ���� ->  data ���� �迭 ũ�⺸�� Ŀ���� ������ �Ұ���!
//		ArrayList : ����Ǵ� ������ ���� ���� ũ�Ⱑ �ڵ������� ������ �ȴ�.
//		��Ұ� ��������, ArrayListũ�⸦ �������� ���� ��Ű��, �ݴ뵵 �����ϴ�.
//		�ڷ����� ��� �����͸� �ִ� ���� ����! -> ����? -> �۽�....

//		�ڷ����� �����ϰ� �ʹ�?
//		< > - generic
//			�ڷ����� �����ϴ� ����
//			Ŭ������<�ڷ����� ��ü��> ���� ������
//			

public class ListMain {
	public static void main(String[] args) {
		ArrayList test = new ArrayList();
		test.add("���ɽð�����");
		test.add(315);
		test.add(true);
		test.add(4.3);
		for (Object o : test) { // �ڷ����� ���ϵ��� �ʾ� Object ����
			System.out.println(o);
		}
		System.out.println("-----------------------------------");
		ArrayList<String> al = new ArrayList<String>();
		al.add("���ݸ�");
//		al.add(100); // String���� �����Ǿ� �ٸ� ���¸� ������ �����������.
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(new Integer(100));
		al2.add(50); // auto-boxing���� �׳� �ᵵ �ȴ�.
		System.out.println(al2.size()); // al2�� ��� ���� ���
		System.out.println(al2.get(0));
		System.out.println("-----------------------------------");
		for (int i = 0; i < al2.size(); i++) {
			System.out.println(al2.get(i));
		}
	
		al2.add(30);
		al2.add(1, 90); // 1�� �ڸ��� 90�� �ֱ�
		al2.set(0,0); // 0�� �ڸ��� 0���� �ٲ��
		al2.remove(0); // 0�� �ڸ��� �����϶�
		for (Integer ii : al2) {
			System.out.println(ii); // ��ü�� �ƴ϶� ���� 1���� �ڸ��� �ִ��� 2������ �и� 
		}
		System.out.println("-----------------------------------");
		al.add("����");
		al.add("�ؾ");
		al.add("����");
		al.add("���̽�ũ��");
		al.add("��");
		
		al2.add(132);
		al2.add(152);
		al2.add(387);
		al2.add(1234);
		al2.add(21574);
		al2.add(1);
		System.out.println("-----------------------------------");
//	���� ���
		Comparator<String> c = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
			
				return o1.compareTo(o2); // ������ ������ ����(��������)
			}
		};
		al.sort(c);
		for (String ss : al) {
			System.out.println(ss); 
		}
		System.out.println("-----------------------------------");
//	al2 ��������
		
		Comparator<Integer> c2 = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1); // �������� ����
			}
		};
		al2.sort(c2);
		for (Integer i : al2) {
			System.out.println(i);
		}
		
	}
}
