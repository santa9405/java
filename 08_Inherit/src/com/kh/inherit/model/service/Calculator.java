package com.kh.inherit.model.service;

public class Calculator extends Object {
								//  -> 생략 될 경우 컴파일러가 Object 상속 구문을 자동 추가
	
	// ~ (default) : 같은 패키지 내부에서 접근 가능
	// # protected : 같은 패키지 + 다른 패키지 중 상속관계인 클래스에서 접근 가능
	
	final int MIN_INT = -2147483648;
	protected int MAX_INT = 2147483647;
	
	private double saveNum1; 
	private double saveNum2;
	
	// 기본 생성자
	public Calculator() { }
	
	// 매개변수 있는 생성자
	public Calculator(double saveNum1, double saveNum2) {
		this.saveNum1 = saveNum1;
		this.saveNum2 = saveNum2;
	}
	
	// getter/setter
	public double getSaveNum1() {
		return saveNum1;
	}
	
	public void setSaveNum1(double saveNum1) {
		this.saveNum1 = saveNum1;
	}
	
	public double getSaveNum2() {
		return saveNum2;
	}
	
	public void setSaveNum2(double saveNum2) {
		this.saveNum2 = saveNum2;
	}
	
	
	// 일반 산술 연산
	public String calculate(double num1, double num2, char op) {
		String result = null;
		
		if( num2 == 0 && (op == '/' || op == '%' ) ) {
			result = "0으로 나눌 수 없습니다.";
		}else {
			switch (op) {
			case '+' : result = num1 + " + " + num2 + " = " + (num1+num2); break;
			case '-' : result = num1 + " - " + num2 + " = " + (num1-num2); break;
			case 'x' : result = num1 + " x " + num2 + " = " + (num1*num2); break;
			case '/' : result = num1 + " / " + num2 + " = " + (num1/num2); break;
			case '%' : result = num1 + " % " + num2 + " = " + (num1%num2); break;
			
			default : result = op + " 연산자는 존재하지 않습니다.";
			}
 		}
		
		return result;
	}
	

	// 제곱 연산
	public double squared(double num) {
		return num * num;
	}
	
	// 팩토리얼 연산
	// 1부터 num까지 모든 정수의 곱
	// 5! -> 1 * 2 * 3 * 4 * 5 = 120
	public int factorial(int num) {
		int result = 1;
		
		for(int i=1; i<=num ; i++) {
			result *= i;
		}
		
		return result;
	}
	
	// Object toString() 오버라이딩
	// 오버라이딩 : 상속받은 부모 메소드를 자식이 재정의 하는것
	// ***** 오버라이딩 작성 조건!!
	// 1) 메소드명이 동일
	// 2) 반환형 동일
	// 3) 매개변수 순서, 개수, 타입 모두 동일
	// 4) 접근 제한자는 범위가 같거나 더 넓은 범위로 변경 가능
	// 5) (참고)예외처리의 범위도 같거나 더 구체적인 범위로 변경
	
	@Override // @Override Annotation : 컴파일러에게 오버라이딩이 된 메소드임을 명시하는 역할
	public String toString() {
		// toString() 메소드 용도 : 객체의 모든 필드값 반환
		return saveNum1 + " / " + saveNum2 + " / ";
	}
	
	
	
	
	
}
