package com.gusto.apr032.main;

import java.util.HashMap;
import java.util.Set;

// Map �迭(Python : dict / Object-C : NSDictionary)
//	���� ������
//	<Key, Value>
//	Key���� �����������
//	���� ���� x
//	HashMap, HashTable.. 

public class MapMain {
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("�Ƹ޸�ī��", 3200);
		hm.put("ī���", 3800);
		hm.put("�����̵�", 7700);
		hm.put("������", 3900);
		hm.put("ī���", 4200);
		// ī��󶼴� key���� ������, HashMap�� �� ������ �����ؼ� ���� �������� ����� Value������ '����'��
		
		//Key���� ������ value���� ���
		System.out.println(hm.get("ī���"));  
		
//	key���� �����ϴ� ���
		Set<String> k = hm.keySet(); // set�� �ܼ� ����뵵, hashset�� ������ ����ϰڴ�.
		for (String s : k) {
			System.out.println(s); // key���� ����
			System.out.println(hm.get(s)); // �ش� key�� �´� value
			System.out.println("=================================");
		}
		
		
	}
}
