package com.kh.inherit.model.service;

import com.kh.inherit.model.vo.Child1;
import com.kh.inherit.model.vo.Child2;

public class InheritService {
	public void example1() {
		
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		
		// c1, c2가 부모 객체인 Parent의 멤버 변수를 사용할 수 있음
		c1.assets -= 100000000; // 첫째가 1억 씀
		
		c2.assets += 2500000; // 250만 추가
		
		// 같은 부모를 상속 받은 객체들은
		// 부모의 멤버 변수 값을 공유하는 것이 아닌
		// 각각 부모 멤버 변수값을 복사하는 것이다
		System.out.println("c1의 자산 : " + c1.assets);
		System.out.println("c2의 자산 : " + c2.assets);
		
		// 부모의 private 필드 또는 메소드는 상속은 되지만
		// 자식이 직접 접근할 수 없다
		// c1.goldBar
		
		// -> 부모 객체에 정의된 private 필드 접근 가능한 메소드를 사용하면 된다
		System.out.println("물려받은 골드바 개수 : " + c1.getgoldBar());
		
		// 자식 만의 고유한 필드 또는 메소드도 사용 가능함
		System.out.println("c1의 자동차 : " + c1.getMyCar());
		
		System.out.println("c2의 배민 등급 : " + c2.getMembership());
		
	}
}
