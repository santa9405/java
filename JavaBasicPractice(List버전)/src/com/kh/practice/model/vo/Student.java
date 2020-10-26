package com.kh.practice.model.vo;

public class Student {

	private String name;
	private int age;
	private char gender;
	
	// 기본 생성자
	public Student() {}

	// 매개변수 있는 생성자
	public Student(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	
	// Object.toString() 메소드를 오버라이딩 하여 Student 객체의 필드 정보를 반환
	@Override
	public String toString() {
		return "이름 : " + name + " | 나이 : " + age + " | 성별 : " + gender ;
	}
	
	
	
	
	
}
