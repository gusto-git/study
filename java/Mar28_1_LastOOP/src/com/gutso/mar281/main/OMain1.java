package com.gutso.mar281.main;

import com.gutso.mar281.avengers.Ironman;
import com.gutso.mar281.person.Person;
import com.gutso.mar281.planet.Planet;

//���� ������
	// �༺ (�̸�,ũ��,���̴��� ����)
	// ��� (�̸�)
	
public class OMain1 {
	public static void main(String[] args) {
	
	// �̸��� ������ �༺ ����
	Planet p = new Planet("����");
	// ���� �̸� ��� ����ϳ� ����
	Person p1 = new Person("������");
	
	// add��� �޼ҵ带 �̿��ؼ� ������ �������� ����
	// "������ �������� ����!" ��µǰ�
	p.add(p1);
	
	// ��� : interface
	// 		interface�� �λ�� �����
	//	attack();�� �ݵ�� ����
	// ���̾��- attack(); ����� �ݵ�� �ʿ�
	
	// ���̾�� ��ü�� ���� attack ����� ����
	Ironman i = new Ironman();
//	i.attack();
	
	
	// �������� ���̾���� ���� �������� ���ϴ� ��
	p1.pick(i);
	p1.heppp();
	
	// ������� �༺ ����� 1000���� ���� 
	p.setSize(1000);
	// ������� �༺�� ���̰� ����
	p.setVisible(true);
	
	

	
	
		
		
		
		
		
		
	}
}
