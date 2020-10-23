package com.kh.inherit.model.service2;

import com.kh.inherit.model.service.Calculator;

public class RectangleCalculator extends Calculator{ // 자식 클래스로 갈 수록 구체적임
								
	// 자식 만의 필드
	private double saveNum3;
	private double saveNum4;
	
	// 기본 생성자
	public RectangleCalculator() {
		// 자식 클래스의 생성자를 이용해서 자식 객체 생성 시
		// 내부에 부모 객체가 생성이 되어야 함
		// -> 부모 생성자 호출 == super() 생성자
		
		//super(); // 자식 객체 내부에 부모 객체를 생성 해주는 생성자
		
		// *** 생성자 코드 컴파일 시
		// super() 생성자가 누락되어 있다면
		// 생성자 내부 첫번째 줄에 super(); 생성자 코드를 자동 추가함
		// -> super(), this() 무조건 생성자 첫 번째 줄에 작성해야 함
		
	}
	
	// 매개변수 있는 생성자
	public RectangleCalculator(double saveNum1, double saveNum2, 
							   double saveNum3, double saveNum4) {
		
		// 객체 생성 시 모든 필드를 초기화 하고자 하는 경우
		// 부모로 부터 상속받은 saveNum1, saveNum2도 초기화를 진행해야 함
		
		// 부모 필드 초기화
		// 방법 1) setter 사용
		//setSaveNum1(saveNum1);
		//setSaveNum2(saveNum2);
		
		// 방법2) 부모 생성자 사용 --> super() 생성자 사용
		super(saveNum1, saveNum2);		
		
		// 자식 필드 초기화
		this.saveNum3 = saveNum3;
		this.saveNum4 = saveNum4;
		
	}
	
	public void example() {
		
		System.out.println(MAX_INT); // protected 
		// 다른 패키지 이지만 상속 관계(자식)를 맺고 있으므로
		// protected 접근제한자가 붙은 MAX_INT를 직접 접근 할 수 있다
		
		//System.out.println(MIN_INT); // (default)
		// default 접근 제한자는
		// 같은 패키지 내에서만 접근 가능하므로
		// 상속 관계에 있어도 다른 패키지일 경우 직접 접근 불가
		
	}

	// Calculator가 재정의 한 toString() 메소드를 또 재정의
	@Override
	public String toString() {
		// super 참조변수
		// 상속 관계를 가진 자식 객체 생성 시
		// 내부에 존재하는 부모객체의 시작 주소를 참조하는 참조 변수
		// (비슷한 역할을 하는 변수 : this 참조변수)
		// * 컴파일러에 의해 자동 추가됨
				
		return super.toString() + saveNum3 + " / " + saveNum4;
	}
	// 둘레
	public double perimeter(double num1, double num2) {
		return (num1 + num2) * 2;
	}
	// 넓이
	public double area(double num1, double num2) {
		return num1 * num2;
	}
	
	
	
}
