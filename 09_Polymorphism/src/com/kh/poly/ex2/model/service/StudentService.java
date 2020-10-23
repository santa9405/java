package com.kh.poly.ex2.model.service;

public interface StudentService {
	
	// 학생 관리 프로그램에 구현 되어야 하는 service 메소드 모음
	
	// 각자 원하는 크기의 String 배열을 상속받은 클래스의 멤버 변수로 선언 및 할당
	
	// 학생 추가 service
	// 해당 클래스 호출 시 전달받은 name을 배열에 추가
	public abstract void addStudent(String name);

}
