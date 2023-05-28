package com.gusto.mar275.human;

public class Human {
	
	private String name;
	private int age;
	private String nickName;
	
	// ���ο��� ��ü �����
	private static final Human HUMAN = new Human("������", 29 , "maestro");
	
	private Human() { // �����ڵ��� �ܺο��� ������ ���ϰ� �����.
		// TODO Auto-generated constructor stub
	}

	private Human(String name, int age, String nickName) {
		super();
		this.name = name;
		this.age = age;
		this.nickName = nickName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickname(String nickname) {
		this.nickName = nickname;
	}
	
	// ���ο��� ���� ��ü�� �ۿ��� ������ �� �� �ְ�
	public static Human getHuman() {
		return HUMAN;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(nickName);
	}
	
}
