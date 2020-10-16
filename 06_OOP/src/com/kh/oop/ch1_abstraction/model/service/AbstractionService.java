package com.kh.oop.ch1_abstraction.model.service;

import com.kh.oop.ch1_abstraction.model.vo.Student;

public class AbstractionService {
	
	public void example() {
		
		Student std = new Student();
		// Student 객체를 생성하고, 생성된 객체의 시작 주소값을 std 참조 변수에 저장한 상태
		
		// . 연산자 : 하위, 내부 요소 접근 연산자
		std.attendance();
		std.study();
		std.test();
		std.printInformation();
		
		std.name = "강수정";
		std.age = 27;
		std.gender = '여';
		std.academy = "KH정보교육원";
		std.className = "A반";
		std.javaScore = 100;
		
		System.out.println(std.name);
		
		std.printInformation();
		
		
		
		
		
	}

}
