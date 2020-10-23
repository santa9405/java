package com.kh.poly.model.vo;

public class Fish extends Animal{
	private int fin; // 지느러미 개수
	
	@Override
	public void eat() {
		System.out.println("물고기는 밥을 뻐끔뻐끔 먹는다.");
	}
	
	@Override
	public void breath() {
		System.out.println("물고기는 아가미로 숨을 쉰다.");
	}
	
	public void swim() {
		System.out.println("물고기는 헤엄을 칠 수 있다.");
	}
	
}
