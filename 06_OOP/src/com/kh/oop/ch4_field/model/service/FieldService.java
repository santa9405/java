package com.kh.oop.ch4_field.model.service;

public class FieldService {
	
	// 필드(field)
	// 클래스 바로 아래 작성된 변수
	// 같은 클래스 내 어디서든 접근 가능(사용 가능)

	// <-> 지역 변수(Local variable)
	// - 클래스 외에 {}가 있는 코드 (메소드, 생성자, 제어문)
	// - 해당 영역 {} 안에서만 사용 가능한 변수
	
	
	
	// - 멤버 변수 (인스턴스 변수)
	// 생성 : new 연산자를 통해 Heap 영역에 메모리가 할당 될 때 생성
	// 소멸 : 객체 소멸 시 같이 소멸
    //		-> 객체는 어떠한 곳에서도 참조되지 않을 때
	//		        일정 시간 후 GC에 의해 소멸됨

	// - 클래스 변수(static 변수)
	// 생성 : 프로그램 실행 시 static 메모리 영역에 할당됨
	// 소멸 : 프로그램 종료 시 소멸
	
	public int num1; // 멤버 변수
	public static int num2; // 클래스 변수
	
	// static final 변수
	// 프로그램 내에서 어디서든 공유되는 상수
	// public static final을 작성하는 것이 규약
	public static final double PI = 3.141592;
	
	
	
	
	
	
	
	
	
	
	
	

}
