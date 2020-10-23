package com.kh.poly.ex1.model.vo;

public interface Electronics {
	// 인터페이스
	// - 상수 필드와 추상 메소드만을 작성할 수 있는
	//	 추상클래스의 변형체
	
	// - 추상 클래스의 일종이므로 직접적인 객체 생성이 불가능
	//	 하지만, 부모 타입 참조 변수로는 사용 가능함(다형성)
	
	// - 상속받은 클래스들의 메소드 통일성 부여
	
	// 인터페이스의 필드
	// public static final int VOLT = 220;
	// public static final (생략가능)
	int VOLT = 220;
	
	// 인터페이스의 메소드
	// - 모든 메소드가 public abstract (추상 메소드)
	public abstract void powerOn();
	
	// 모든 메소드는 묵시적으로 public abstract (생략 가능)
	void powerOff();
	
	
	
	
	
	
	
	
}
