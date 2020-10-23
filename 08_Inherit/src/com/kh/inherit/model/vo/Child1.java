package com.kh.inherit.model.vo;

public class Child1 extends Parent {
			 // 자식			    부모
	// extends 예약어
	// - 자식 클래스가 부모 클래스를 상속하는 경우 필드, 메소드의 양이 증가하므로
	//   확장한다하는 의미의 예약어를 사용한다
	
	/* 상속 : 다른 클래스(부모)가 가지고 있는 멤버(필드, 메소드)를
	 * 	새로 작성할 클래스(자식)에 직접 만들지 않고
	 *  새 클래스가 다른 클래스의 멤버를 자신의 멤버처럼 사용할 수 있는 기술(또는 기능)
	 *  
	 * 상속 목적 : 클래스의 재사용, 연관된 클래스들에 대한 공통적인 규약 정의
	 * 
	 * 상속 장점
	 * 1) 보다 적은 양의 코드로 새로운 클래스를 작성할 수 있다 -> 코드 중복 제거, 재사용성 증가
	 * 2) 코드를 공통적으로 관리하기 때문에 유지보수에 용이함 -> 유지보수성, 생산성 향상 */
	
	private String myCar = "마세라티";
	private String myHouse = "서울 어딘가에 반지하";
	
	public String getMyCar() {
		return myCar;
	}
	public void setMyCar(String myCar) {
		this.myCar = myCar;
	}
	public String getMyHouse() {
		return myHouse;
	}
	public void setMyHouse(String myHouse) {
		this.myHouse = myHouse;
	}
	
	
}
