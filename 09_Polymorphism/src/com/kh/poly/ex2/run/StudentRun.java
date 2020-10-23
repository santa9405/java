package com.kh.poly.ex2.run;

import com.kh.poly.ex2.model.service.StudentService;
import com.kh.poly.ex2.model.service.StudentServiceImpl;

public class StudentRun {
	public static void main(String[] args) {
		
		// 추상클래스는 객체로 만들지 못하게 할 때 사용
		// 인터페이스는 공통된 모양, 규칙을 부여할 때 사용
		
		// 인터페이스를 부모 참조변수로 활용, 다형성 - 업캐스팅
		StudentService service = new StudentServiceImpl(); // 속도를 빠르게 하고 싶으면 공간을 많이 만들어 놓기
		//StudentService service = new StdServiceImpl(); // 
		
		long start = System.nanoTime();
		
		service.addStudent("홍길동");
		service.addStudent("김철수");
		service.addStudent("박영희");
		service.addStudent("이순신");
		service.addStudent("유현재");
		service.addStudent("강수정");
		service.addStudent("이한솔");
		
		long end = System.nanoTime();
		
		System.out.println(end - start);
			
		System.out.println("정상 수행됨.");
		
	}
}
