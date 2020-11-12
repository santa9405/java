package com.kh.eh.model.exception;

public class InputZeroException extends Exception{
	// 사용자 정의 예외를 만드는 방법!
	// -> 예외로 만들려고 하는 클래스에 Exception 관련 클래스를 상속시키면 됨
	
	
	// 생성자를 통해 예외 발생 시 동작을 지정함
	public InputZeroException() {
		System.out.println("0이 입력되었습니다.");
	}
	
	// 오버로딩 : 같은 클래스 내에서 같은 메소드명으로 여러 메소드를 작성하는 것
	// 메소드명 일치, 매개변수의 타입/순서/개수가 달라야 함
	public InputZeroException(String msg) {
		super(msg);
	}
	
	
}
