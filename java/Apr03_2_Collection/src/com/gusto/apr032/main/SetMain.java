package com.gusto.apr032.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

// Set�迭
//	����������
//	�ߺ������� �ڵ� ����
//		���� ��ü�� ������ ���� �ϳ��� ����
//	������ ����
//	HashSet, TreeSet, ... .
//		-> �������� �״� �������� ����

public class SetMain {
	public static void main(String[] args) {
//	HashSet �ڵ� �ߺ����� Ȯ��
		HashSet<String> hs = new HashSet<String>();
		hs.add("����");
		hs.add("����");
		hs.add("����");
		hs.add("����");
		hs.add("����");
		hs.add("����");
		System.out.println(hs.size()); // ��� : 3 / �ߺ� ���Ű� ��
		System.out.println("---------");
		for (String s : hs) { 
		// ���� ��Ұ� ���� �ִ����� �� �� ������, �ߺ� ��� �� ��� ���������� ���� ����
			System.out.println(s);
			System.out.println("---------");
		}
//	ArrayList�� �����͸� �޾ƿ��� -> ���� 10��(�ߺ����� �ֵ���)
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(101);
		al.add(102);
		al.add(101);
		al.add(101);
		al.add(103);
		al.add(104);
		al.add(105);
		al.add(100);
		al.add(101);
		al.add(104);
		System.out.println(al);
		
//	�ߺ����� : set�� list�� ��Ƽ� �ߺ� ����!
		HashSet<Integer> hs2 = new HashSet<Integer>(al);
		al = new ArrayList<Integer>(hs2); // �ߺ����� �� �ٽ� list�� �ֱ�
//	�ߺ����� �� ��������
		Comparator<Integer> c = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1.compareTo(o2);
			}
		};	
		al.sort(c);
		for (Integer integer : hs2) {
			System.out.println(integer);
		}
	}
}
