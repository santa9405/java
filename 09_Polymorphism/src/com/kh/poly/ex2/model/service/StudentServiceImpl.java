package com.kh.poly.ex2.model.service;

// StudentService 인터페이스를 상속 받아 구현한 클래스
public class StudentServiceImpl implements StudentService{

	private String[] students = new String[10000];
	private int currentIndex = 0; // 현재 배열에 데이터가 들어가 있는 마지막 인덱스 + 1
	
	@Override
	public void addStudent(String name) {
		// 현재 currentIndex가 가리키는 인덱스에 이름 저장 후
		students[currentIndex] = name; 
		
		// currentIndex 1 증가 == 다음 비어있는 인덱스를 가리킴
		currentIndex++;
	}

}
