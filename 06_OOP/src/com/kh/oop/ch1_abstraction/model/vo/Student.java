package com.kh.oop.ch1_abstraction.model.vo;

public class Student { // 학생을 추상화 한 클래스

	// class : 객체를 만들기 위한 설계도
	//         객체의 특성(속성, 기능)이 정의 됨
	// ------ 속성 ------(멤버 변수)
	public String name; // 이름 , 메소드 안에 있는 지역변수가 아닌 클래스 안에 있는 전역변수
	public int age; // 나이
	public char gender; // 성별
	public String academy; // 학원
	public String className; // 반이름
	public double javaScore; // 자바 점수
	
	// ------ 기능 ------(method)
	public void attendance() { // 출석 기능
		System.out.println("삐빅. 정상 처리 되었습니다.");
	}

	public void study() { // 공부 기능
		System.out.println("수업 시간에 공부 합니다.");
		
	}

	public void test() {
		System.out.println("과락 되지 않게 열심히 볼게요.");
	}

	public void printInformation() { // 학생 정보 출력 기능
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("학원 : " + academy);
		System.out.println("반 : " + className);
		System.out.println("Java 점수 : " + javaScore);
	} // 클래스의 생성이 끝난 상태, 객체로 만들어야 함
	
	
	
	
	
	
	
}