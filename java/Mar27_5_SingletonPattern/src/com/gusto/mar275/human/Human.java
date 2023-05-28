package com.gusto.mar275.human;

public class Human {
	
	private String name;
	private int age;
	private String nickName;
	
	// 내부에서 객체 만들기
	private static final Human HUMAN = new Human("에릭센", 29 , "maestro");
	
	private Human() { // 생성자들을 외부에서 만들지 못하게 만든다.
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
	
	// 내부에서 만든 객체를 밖에서 빌려다 쓸 수 있게
	public static Human getHuman() {
		return HUMAN;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(nickName);
	}
	
}
