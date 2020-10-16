package com.kh.oop.ch2_encapsulation.model.vo;

public class Account {
	
	// VO(Value Object) : 값을 취급하는 객체
	
	// 속성 정의
	// 이름, 계좌번호, 비밀번호, 은행코드, 잔액
	
	// 캡슐화 : 속성과 기능을 묶고, (class의 {}가 속성, 기능을 묶어줌)
	//		    외부로 부처 멤버변수에 직접 접근하는 것을 차단
	// 		   -> 부가 효과로 정보 은닉이 나타남
	
	
	// 속성 정의
	// 멤버 변수
	// public : 누구나 어디서든 접근 가능
	// private : 같은 클래스(객체) 내에서만 접근 가능
	private String name = "강수정"; // 이름, 객체 어디서든 나오는 변수명
	private String accountNumber = "123-45-6789"; // 계좌번호
	private int password = 1234;
	private final String BANK_CODE = "002";
	private int balance = 100000;
	
	/* public static final double PI = 3.14; // static == 공용
	       누구나 공통적으로 사용할 수 있고 절대로 변하지 않는 값 */
	
	
	// 기능 정의
	// private으로 외부 직접 접근이 제한된 멤버 변수에
	// 간접 접근이 가능하도록 하는 메소드(기능) 생성
	// == setter/getter
	
	// setter 작성 규칙
	// public void set멤버변수명(멤버변수자료형 멤버변수명){
	//		this.멤버변수 = 매개변수;
	// }
	
	
	// name의 setter
	public void setName(String name) { // 외부 접근이 가능 하도록 public 사용
				// setter == 매개변수, 전달인자, 파라미터 == 외부로 부터 전달 받은 값을 내부로 전달 == 외부로 부터 받은 값을 전달 해주는 매개체
		this.name = name; // 현재 객체가 가지고 있는 name = 매개변수 name;
		// this : 현재 객체
	}
	
	// accountNumber의 setter
	public void setAccountNumber(String accountNumber) { 
		this.accountNumber = accountNumber; 
		// 외부로 부터 전달받은 계좌번호를
		// 현재 객체의 계좌번호에 저장해라
	}
	
	public void setPassword(int password) {
		this.password = password;
		
	}
	// BANK_CODE는 final(상수)이므로 값을 변경할 수 없음
	/* public void setBankCode(String bankcode) {
		this.bankCode = bankcode;
	}*/
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// getter 작성 규칙
	// public 멤버변수자료형 get멤버변수명() {
	// 	  return 멤버변수명 : 
	// }
	
	// name의 getter
	public String getName() {
			// 반환형 : 메소드가 호출된 후 호출된 곳으로 돌아갈 때 가지고갈 데이터의 자료형
		return name;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public int getPassword() {
		return password;
	}
	
	public String getBankCode() {
		return BANK_CODE;
	}
	
	public int getBalance() {
		return balance;
	}
}
