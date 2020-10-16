package com.kh.oop.ch2_encapsulation.model.service;

import com.kh.oop.ch2_encapsulation.model.vo.Account;

public class EncapsulationService {

	public void example() {
		Account ac = new Account();
		
		// System.out.println(ac.name);
		// name 멤버 변수가 외부로 부터 직접 접근이 차단되어 있어
		// 값을 얻어올 수 없음 --> getter를 사용해 간접적으로 얻어와야 함
		
		System.out.println(ac.getName());
		// ac가 참고하고 있는 객체의 기능 중
		// getName()메소드의 반환값을 출력
		
		String name = ac.getName();
		System.out.println(name);
		
		// 잔액 조회
		System.out.println("잔액 : " + ac.getBalance());
		int balance = ac.getBalance(); // 100000
		
		balance -= 3000; // 97000
		
		// 계좌 잔액 수정
		ac.setBalance(balance);
		
		System.out.println("수정 후 잔액 : " + ac.getBalance());
		
	
		
	}
	
	// 여기까지가 캡슐화임
}
