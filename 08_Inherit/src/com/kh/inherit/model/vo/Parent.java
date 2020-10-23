package com.kh.inherit.model.vo;

public class Parent {
	public int assets = 1000000000;
	private int goldBar = 3;
	
	public int getgoldBar() {
		return goldBar;
	}
	
	public void setgoldBar(int goldBar) {
		this.goldBar = goldBar;
	}
	
	
	public final void hun_yug() {
		// final 메소드 : 오버라이딩 불가능한 메소드
		
		
		System.out.println("공부좀 해라!!!!");
	}
}
