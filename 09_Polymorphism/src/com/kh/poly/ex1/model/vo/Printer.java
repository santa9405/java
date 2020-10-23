package com.kh.poly.ex1.model.vo;

public interface Printer extends Electronics {
	// 부모 인터페이스 - 자식 인터페이스 : extends(확장)
	// -> 인터페이스는 추상 메소드만을 가지고 있을 수 있으므로
	// 	     부모로 부터 추상 메소드를 상속 받은 경우
	//	     오버라이딩을 할 수 없음 -> 상속 시 에러 없음
	
	public abstract void print();
	
}
