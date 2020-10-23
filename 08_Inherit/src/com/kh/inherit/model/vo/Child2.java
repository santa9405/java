package com.kh.inherit.model.vo;

public final class Child2 extends Parent {
	// final class : 상속 불가능한 클래스
	// -> 다른 클래스에서 extends로 상속 관계를 만들 수 없음
	
	private String computer = "150만짜리 컴퓨터";
	private String membership = "천생연분";
	
	public String getComputer() {
		return computer;
	}
	public void setComputer(String computer) {
		this.computer = computer;
	}
	public String getMembership() {
		return membership;
	}
	public void setMembership(String membership) {
		this.membership = membership;
	}
	
	/* // final 메소드 오버라이딩 불가
	@Override
	public void hun_yug() {
		System.out.println("공부좀 할래?");
} */
	
	
}
