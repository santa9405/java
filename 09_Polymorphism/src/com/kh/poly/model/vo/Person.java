package com.kh.poly.model.vo;

public class Person extends Animal{
	
	private String name;
	
	// 아무런 생성자가 작성되지 않을 경우 기본생성자를 컴파일러가 추가해줌
	public Person() {
		//super(); // 상속관계에 있는 부모 객체를 자식 객체 생성 시 내부에 추가해야 하므로
				 // 자식 생성자 첫 번째 줄에 super() 생성자를 작성해야 한다.
				 // (미작성 시 컴파일러가 자동 추가)
	}
	
	@Override
	public void eat() {
		System.out.println("사람은 식기를 이용해서 음식을 먹는다.");
	}
	
	@Override
	public void breath() {
		System.out.println("사람은 코와 입으로 숨을 쉰다.");
	}
	
	public void studyJava() {
		System.out.println("사람은 누구나 자바를 공부할 수 있다. - by.혜윤");
	}
} 
