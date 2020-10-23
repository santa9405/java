package com.kh.poly.model.vo;

public abstract class Test {
	// 미완성 메소드가 없어도 추상 클래스 선언이 가능하다
	// -> 해당 클래스를 이용하여 객체 생성을 못하게 하고 싶을 경우
	// 	     대신 상속을 통해서는 사용 가능함
	
	public void method1() {
		System.out.println("완성된 기능 1");
	}

	public void method2() {
		System.out.println("완성된 기능 2");
	}

	public void method3() {
		System.out.println("완성된 기능 3");
	}
	
	// 추상 메소드
	// public abstract void method4();
	
	
}